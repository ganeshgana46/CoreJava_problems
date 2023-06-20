package com.gana.BasicPrograms;



public class ReverseEachWord {

	public static void main(String[] args) {
		
        String input = "java code";
        
        String output = "";
        
        String[] words = input.split(" ");
        
        for(String word : words){
            String rev = "";
            for(int i=word.length()-1;i>=0;i--){
                rev = rev + word.charAt(i);
            }
            output = output + rev + " ";
        }
        System.out.println(output);

	}

}
