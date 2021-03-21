package org.problems.example7;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Example7_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String s = bf.readLine();
		
		for(int i=0; i<arr.length; i++) {
			arr[i]--;
		}
		
		int l = s.length();
		
		for (int i = 0; i < l; i++) {
			switch(s.charAt(i)) {
			case 'a': arr[0] = i; break;
			case 'b': arr[1] = i; break;
			case 'c': arr[2] = i; break;
			case 'd': arr[3] = i; break;
			case 'e': arr[4] = i; break;
			case 'f': arr[5] = i; break;
			case 'g': arr[6] = i; break;
			case 'h': arr[7] = i; break;
			case 'i': arr[8] = i; break;
			case 'j': arr[9] = i; break;
			case 'k': arr[10] = i; break;
			case 'l': arr[11] = i; break;
			case 'm': arr[12] = i; break;
			case 'n': arr[13] = i; break;
			case 'o': arr[14] = i; break;
			case 'p': arr[15] = i; break;
			case 'q': arr[16] = i; break;
			case 'r': arr[17] = i; break;
			case 's': arr[18] = i; break;
			case 't': arr[19] = i; break;
			case 'u': arr[20] = i; break;
			case 'v': arr[21] = i; break;
			case 'w': arr[22] = i; break;
			case 'x': arr[23] = i; break;
			case 'y': arr[24] = i; break;
			case 'z': arr[25] = i; break;
			
			
		}
	
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
