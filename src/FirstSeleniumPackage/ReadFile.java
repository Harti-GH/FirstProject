package FirstSeleniumPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	public static void main(String args[]) throws IOException {
	FileReader fileReader = new FileReader("D:\\readfile.txt"); 
    /*BufferedReader reads text from a character-input stream, buffering characters 
    so as to provide for the efficient reading of characters, arrays, and lines. */
    BufferedReader bufferReader = new BufferedReader(fileReader);
    String textfromfile=null; 
    // Using while loop to read the file until there are no more lines
    while((textfromfile= bufferReader.readLine()) != null){
        System.out.println(textfromfile);
    }
    fileReader.close();
    // Close the BufferedReader object to prevent memory leak
    bufferReader.close();
    String textToWrite = "I am learning Java from SoftwareTestingMaterial";
    // Import BufferedWriter and FileWriter classes
    /* BufferedWriter writes text to a character-output stream, buffering characters 
    so as to provide for the efficient writing of single characters, arrays, and strings. */
    //Import FileWriter and BufferedWriter class
    BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\WriteToFile.txt"));
    writer.write(textToWrite);
        // Close the BufferedWriter object to prevent memory leak
    writer.close();
}
}

