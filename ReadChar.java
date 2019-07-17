package com.cap.lab8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class ReadChar {
	public static void main(String args[]) throws Exception {
		int c = 0;
	String k = "kkk\n rrr\n";
		char buffer[] = new char[k.length()];
		k.getChars(0,k.length(),buffer,0);
		FileWriter f1 = new FileWriter("C:\\Users\\prishg\\workspace\\Assignments\\src\\com\\cap\\lab8\\text.txt");
		f1.write(buffer);
		f1.close();
		FileReader fr = new FileReader("C:\\Users\\prishg\\workspace\\Assignments\\src\\com\\cap\\lab8\\text.txt");
		BufferedReader br = new BufferedReader(fr);
		String t;
		while((t = br.readLine())!= null)
		{
			c++;
			System.out.println(c+t);
		}
		fr.close();
		}
		
		
		
	}


