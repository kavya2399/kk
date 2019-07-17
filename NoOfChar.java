package com.cap.lab8;

import java.io.FileInputStream;

public class NoOfChar {
	public static void main(String args[]) throws Exception{
		int lines = 0, chars=0, words = 0;
		int code =0;
		FileInputStream fis = new FileInputStream("C:\\Users\\prishg\\workspace\\Assignments\\src\\com\\cap\\lab8\\file.txt");

		while(fis.available()!=0) {
			code = fis.read();
			if(code!=10) {
				chars++;
			}
			if(code ==32)
			{
				words++;
			}
			if(code==13)
			{
				lines++;
				words++;
				
			}
		}
				System.out.println("No of character=" + chars);
				System.out.println("No of words=" + (words+ 1));
				System.out.println("No of line="+ (lines+ 1));
				fis.close();
				
	}	
				
				
				
				
	}

