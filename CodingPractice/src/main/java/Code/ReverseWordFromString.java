package Code;

import java.util.Arrays;

public class ReverseWordFromString {

	public static void main(String[] args) {
		
		String input = "Hello world from java" ;
		
		if(input ==null||input.isEmpty())
		{
			System.out.println("Reverse cannot possible");
		}
		
		String stringArray[] = input.split(" "); 
		/*
		 * To reverse first word of string use input.spli(" ",2)  output = Hello  & world from java
		 */
		
		int wordToReverse = 2;
		
		char charArray[] = stringArray[wordToReverse-1].toCharArray();
		
		int left = 0;
		int right = charArray.length-1;
		
		
		
		while(left<right)
		{
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
			
		}
		
		System.out.println(Arrays.toString(charArray));
		String reversedWord = new String(charArray);
		
		stringArray[wordToReverse-1] = reversedWord;
		String finalOuput = String.join(" ", stringArray);
		
		System.out.println(finalOuput);
		
		
		
	}

}
