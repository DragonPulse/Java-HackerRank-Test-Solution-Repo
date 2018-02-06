package org.vj.hktest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {
    
    
    public static Map<Integer,List<String>> buildParaMap(LinkedList<String> lines){
        Map<Integer,List<String>> paraWordMap = new HashMap<Integer,List<String>>();
        for(int i=1;i<lines.size();i++){
            List<String> wordsList = new ArrayList<String>();
            StringTokenizer st = new StringTokenizer(lines.get(i)," ");
            while(st.hasMoreTokens()){
                wordsList.add((String)st.nextElement());
            }
            paraWordMap.put(i,wordsList);  
        }
        return paraWordMap;
    }
        public static String[] breakIntoLines(String inputString){
            return inputString.split("\n");
        }
    
        
        public static String decodeString(String encodedString, Map<Integer,List<String>> paraWordMap) {
        	StringBuilder sbuild = new StringBuilder("");
        	StringTokenizer sb = new StringTokenizer(encodedString, " ");
        	while (sb.hasMoreElements()) {
				String str = (String) sb.nextElement();
				String[] eachCode = str.split("-");
				List<String> wordsList = paraWordMap.get(Integer.parseInt(eachCode[0]));
				String word = wordsList.get(Integer.parseInt(eachCode[1])-1);
				System.out.println(wordsList.get(Integer.parseInt(eachCode[1])-1));
				sbuild.append(word.charAt(Integer.parseInt(eachCode[2])-1));
			}
        	
        	return sbuild.toString();
        }
        
    public static void main(String args[] ) throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8); 
        BufferedReader in = new BufferedReader(reader);
        String line;
        String encodedData;
        LinkedList<String> linesList = new LinkedList<String>();
       
        String paragraph="1-3-4 1-2-5 1-7-3 2-2-4 2-7-8 1-18-3 2-5-1\n" + 
        		"The Paragraph-Word-Letter code refers to specific pieces of text within a single page of any document. Each triple of numbers indicates which numbered paragraph, word, and letter to use in substitution.\n" + 
        		"In using this explanation as the reference text, 1-3-4 represents the first paragraph (above), third word (\"code\"), and fourth letter of the word ('e'). Continuing this example, \"1-3-4 1-2-5 1-7-3 2-2-4 2-7-8 1-18-3 2-5-1\" = EGENCIA\n" + 
        		"Write a program that reads from stdin. The first line of input is the encoded message. Following ordered lines of input each represent a paragraph. Your program should print the decoded message, converted to uppercase, to stdout.";
       
        String[] lines = breakIntoLines(paragraph);
        LinkedList<String> linesList1 = new LinkedList<String>();
        for(int i=0;i<lines.length;i++){
            System.out.println("Line "+i+ "::"+lines[i]);
            linesList1.add(lines[i]);
        }
        
        Map<Integer,List<String>> mapObject = buildParaMap(linesList1);
        System.out.println(mapObject);
        String decodeString = decodeString(linesList1.get(0),mapObject);
        System.out.println(decodeString.toUpperCase());
    }
}