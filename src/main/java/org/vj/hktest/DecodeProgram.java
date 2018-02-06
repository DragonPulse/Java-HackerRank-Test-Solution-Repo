package org.vj.hktest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DecodeProgram{
	public static void main(String args[]) {
		String inputData ="The quick brown fox jumped over the lazy dog.\n" + 
				"Hello World. The fox is quick today.This is another sentence that exceeds 80 characters.\n" + 
				"I beleive the weather is nice.";
		List<String> paragraphs = new LinkedList<String>();
		String[] lines = inputData.split("\n");
		boolean inputFlag = true;
		String inputForDecode = null;
		for (String string : lines) {
			if(inputFlag) {
				inputForDecode=string;
				inputFlag=false;
			}else {
				paragraphs.add(string);
			}
		}
		Map<String, List<String>> mapObj = Cypher.createRepo(paragraphs);
		System.out.print(Cypher.createCodex(mapObj, inputForDecode));
	}
}
class Cypher {

    public static Map<String, List<String>> createRepo(List<String> paragraphs) {
        Map<String, List<String>> tokenRepo = new HashMap<>();

        for (int i = 0; i < paragraphs.size(); i++) {
            List<String> lines = splitToLines(paragraphs.get(i), 80);

            for (int lineNumber = 0; lineNumber < lines.size(); lineNumber++)
                addToBucket(tokenRepo, i + 1, lineNumber + 1, lines.get(lineNumber));
        }
        return tokenRepo;
    }

    private static void addToBucket(Map<String, List<String>> tokenRepo, int paragraphNumber, int lineNumber, String line) {
        String[] words = line.toUpperCase().split("\\s+");

        for (int wordNumber = 0; wordNumber < words.length; wordNumber++) {
            List<String> bucket = tokenRepo.get(words[wordNumber]);
            if (bucket == null) {
                tokenRepo.put(words[wordNumber], new ArrayList<String>());
                bucket = tokenRepo.get(words[wordNumber]);
            }
            bucket.add(paragraphNumber + "-" + lineNumber + "-" + (wordNumber + 1));
        }
    }

    public static List<String> splitToLines(String paragraph, int lineLength) {

        List<String> lines = new ArrayList<>();
        int start = 0;

        int end = lineLength;
        while (start != lineLength) {

            if (paragraph.length() >= end) {
                while (paragraph.substring(start, end).charAt(end - 1) != ' ') {
                    end--;
                }

                lines.add(paragraph.substring(start, end));
                start = end;
                end = start + lineLength - 1;
            } else {
                lines.add(paragraph.substring(start));
                break;
            }

        }
        return lines;
    }

    public static String createCodex(Map<String, List<String>> cyperRepo, String message) {
        StringBuilder builder = new StringBuilder();

        String[] originalWords = message.split("\\s+");

        String[] words = message.toUpperCase().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            List<String> available = cyperRepo.get(word);
            if (available == null || available.size() == 0)
                builder.append(originalWords[i]).append(" ");
            else {
                builder.append(available.get(0)).append(" ");
                available.remove(0);
            }
        }
        return builder.toString();
    }

}

