package Guru99loginpage;

import java.io.*;

public class filewriting {
    public static void main(String[] args) throws IOException {
        String location="D:/filewriting.txt";
      //  String content="file writing process";
        //FileWriter filewriter=new FileWriter(location);
      //  BufferedWriter bufferedWriter=new BufferedWriter(filewriter);

        //bufferedWriter.write(content);
       // bufferedWriter.close();
        FileReader filereader=new FileReader(location);

        BufferedReader bufferedReader=new BufferedReader(filereader);
        String getinputs;
        while( (getinputs=bufferedReader.readLine())!= null)
        {
            System.out.println(getinputs);
        }

    }

}
