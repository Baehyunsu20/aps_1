package swea1206;
import java.util.*;

public class 조망권 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int T =1 ; T<=10; T++) {
			int building = sc.nextInt();
			int[] list = new int[building];
			for(int j=0; j<building; j++) {
				list[j] = sc.nextInt();
			}//한줄의 리스트를 입력 받음
			
			int cnt =0;
			for(int k=2; k<building-2; k++) {
				
				//양옆 4개 중 가장 큰 값 = mm.
				int mm = 0;
				for(int m=k-2; m<=k+2; m++) {
					if(mm<list[m] && (m != k)) {
						mm=list[m];
					}
				}
				//근처 최댓값도다 일단 내가 커야함.
				if(mm<list[k]) {
					cnt += list[k]-mm;	
				}
			}
			
			System.out.printf("#%s %s\n", T, cnt);
			
			
		}
	sc.close();	
	}
	

}
