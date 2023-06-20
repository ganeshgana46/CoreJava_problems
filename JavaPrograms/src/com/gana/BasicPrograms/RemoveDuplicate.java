package com.gana.BasicPrograms;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i+1);
            if(idx==-1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

	}

}
