package lesson10.labs.prob2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class NewFileIO {

    private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
    public final static String FILE_LOCATION = "output.txt";
    public final static String TO_PRINT = "This is the string to print to file.";

    void writeText(String filename, String text) {
        System.out.println("File name "+ filename);
        try(PrintWriter writer = new PrintWriter(new FileWriter(new File(filename)))){
            writer.print(text);
        }catch(Exception e){
            LOG.warning("IOException attempting to write a file: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        NewFileIO newFile = new NewFileIO();
        newFile.writeText(newFile.getFileLocation(FILE_LOCATION), TO_PRINT);
    }

    private  String getFileLocation(String name) {
     return packageToFileDirectory(getClass().getName(), name);
    }

    private String packageToFileDirectory(String location, String name) {
        return location.replace(".", "/")+"/"+name;
    }
}
