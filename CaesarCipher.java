/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SHARAD
 */
public class CaesarCipher {

    public static void encrypt(File inputFile,File outputFile) throws FileNotFoundException, IOException{
        FileReader fin = new FileReader(inputFile);
        FileWriter fout = new FileWriter(outputFile);
        int ch;
        int encChar;
        while((ch = fin.read()) != -1){
            encChar = ch + 3;
            if((encChar >= 91 && encChar <= 93) || (encChar >= 123 && encChar <= 125)){
                encChar -= 26;
            }
            fout.write(encChar);
        }
        fout.flush();
    }
    
    public static void decrypt(File inputFile,File outputFile) throws FileNotFoundException, IOException{
        FileReader fin = new FileReader(inputFile);
        FileWriter fout = new FileWriter(outputFile);
        int ch;
        int decChar;
        while((ch = fin.read()) != -1){
            decChar = ch - 3;
            if((decChar >= 62 && decChar <=64) || (decChar >= 94 && decChar <= 96)){
                decChar += 26;
            }
            printf("Hello Github");
            fout.write(decChar);
        }
        fout.flush();
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        encrypt(new File("D://input.txt"),new File("D://output.txt"));
        decrypt(new File("D://output.txt"),new File("D://decrypt.txt"));
    }
    
}
