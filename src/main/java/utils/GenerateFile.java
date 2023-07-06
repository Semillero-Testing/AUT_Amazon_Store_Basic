package utils;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;

public class GenerateFile implements Interaction {


    private static String txt;

    public GenerateFile (String txt){
        this.txt = txt;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            File f = new File("../src/test/resources/doc.txt");
            if (!f.exists()) {
                f.createNewFile();
            }

            FileWriter file = new FileWriter("../src/test/resources/"+DataFakeGenerate.docName()+".txt");
            file.write(txt);
            file.close();

        }  catch (Exception e){
            JOptionPane.showMessageDialog(null,"error is this one part"+e);
        }
    }

    public static GenerateFile file(String txt){
        return Tasks.instrumented(GenerateFile.class, txt);
    }
}
