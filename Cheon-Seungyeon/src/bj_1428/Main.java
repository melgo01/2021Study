package bj_1428;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = br.readLine();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n.length();i++) {
			list.add(Integer.parseInt(String.valueOf(n.charAt(i))));
		}
		Collections.sort(list);
		
		for(int i=n.length()-1;i>-1;i--) {
			bw.write(Integer.toString(list.get(i)));
		}
		bw.flush();
		bw.close();
		
	}

}
