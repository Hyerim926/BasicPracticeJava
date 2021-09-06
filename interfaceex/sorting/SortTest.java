package _0830.interfaceex.sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
//		char ch = (char)System.in.read(); // char형으로 다운캐스팅 가능
		Sort sort = null; // 새 인스턴스 변수를 일단 빈 값으로 지정하고 if문 이용해 각 케이스에 맞는 메서드 호출할 수 있게끔
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}
		else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		// 정렬 방식과 상관없이 Sort에 선언된 메서드 호출
		int [] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();

	}

}
