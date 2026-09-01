package QuestionBank;

import java.io.*;
public class Nineteen {
    public static void main(String[] args){
        int wordCount = 0;
        try{
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;;

            while ((line = br.readLine()) != null){
                if(!line.trim().isEmpty()){
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            br.close();

            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Total words: " + wordCount);
        }
            catch(IOException e){
                System.out.println(e.getMessage());
        }
    }
}