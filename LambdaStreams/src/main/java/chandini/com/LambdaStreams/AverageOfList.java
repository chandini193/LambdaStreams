package chandini.com.LambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());
		}
		double Average = average(al);
		System.out.println(Average);
	}
	public static Double average(List<Integer> list) {
		return list.stream().mapToInt(i->i).average().getAsDouble();
	}
}
