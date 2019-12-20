package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ���� N(1 �� N �� 10,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. �� ���� 10,000���� �۰ų� ���� �ڿ����̴�.*/

public class P10989 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] count = new int[10000];
		
		//syso�� Scanner ����ϸ� 2���̻�ɸ� 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 
		int size = Integer.valueOf(br.readLine());
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf(br.readLine());
			
			count[array[i] - 1]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] != 0) {
				
				for(int j = 1; j <= count[i]; j++ ) {
					bw.write(i + 1 + " \n");
				}
				
			}
		}
		
		br.close();
		bw.close();
		
		
	}

}
