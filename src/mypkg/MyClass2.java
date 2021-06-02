package mypkg;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class MyClass2 {
  public static void main(String args[]) {
    try {
      File f = new File("C:\\Users\\takem\\OneDrive\\デスクトップ\\java.txt");
      BufferedReader br = new BufferedReader(new FileReader(f));
 
      String line;
      while ((line = br.readLine()) != null) {
        String[] data = line.split(",", 0);
        System.out.println(data[9]);
        System.out.println(data[10]);
        System.out.println(data[11]);
 
//        for (int i = 0; i < data.length; i++) {
//        	if (data[i] == "10" ) {
//        		System.out.println(data[i]);
//        	}
//        }
        
      }
      br.close();
 
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}