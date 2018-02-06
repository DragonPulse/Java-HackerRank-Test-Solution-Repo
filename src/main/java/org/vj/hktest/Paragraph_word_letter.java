package org.vj.hktest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Paragraph_word_letter {
	
	public static String[] breakIntoLines(String inputString){
	    return inputString.split("\n");
	}
	
	public Map<Integer,Map<Integer,List<String>>> buildMapOfParaWord(){
		Map<Integer,Map<Integer,List<String>>> paraMapWord = new HashMap<Integer,Map<Integer,List<String>>>();
		return null;
		
	}
	
	public static void main(String args[] ) throws Exception {
	        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8); 
	        BufferedReader in = new BufferedReader(reader);
	        String line;
	     
	        String paragraph="1-3-4 1-2-5 1-7-3 2-2-4 2-7-8 1-18-3 2-5-1\n" + 
	        		"The Paragraph-Word-Letter code refers to specific pieces of text within a single page of any document. Each triple of numbers indicates which numbered paragraph, word, and letter to use in substitution.\n" + 
	        		"In using this explanation as the reference text, 1-3-4 represents the first paragraph (above), third word (\"code\"), and fourth letter of the word ('e'). Continuing this example, \"1-3-4 1-2-5 1-7-3 2-2-4 2-7-8 1-18-3 2-5-1\" = EGENCIA\n" + 
	        		"Write a program that reads from stdin. The first line of input is the encoded message. Following ordered lines of input each represent a paragraph. Your program should print the decoded message, converted to uppercase, to stdout.";
	       
	       String[] lines = breakIntoLines(paragraph);
	       for (int i=0;i<lines.length;i++) {
			System.out.println("Line-"+i+":: "+lines[i]);
	       }
	       String encodedString = lines[0];
	       
	        
	       
	        
	    }
}
