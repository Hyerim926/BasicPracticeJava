package _0706.array.objectArray;

public class ObjectDeepCopy {

	public static void main(String[] args) {
		
		// 각 배열 선언
		Book[] bookArray1 = new Book[3]; 
		Book[] bookArray2 = new Book[3]; 
		
		// bookArray1에 배열요소값 설정
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		// bookArray2 인스턴스 생성
		bookArray2[0] = new Book(); // Book 클래스에 public으로 생성자 만들어야함
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// bookArray1 요소를 새로 생성한 Array2 인스턴스에 복사, set으로 array1의 값 받음
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// 인스턴스로 복사했을 떄 나오는 Array2 요소들
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfoBook();
		}
		
		// array1의 첫번째 값 재설정
		bookArray1[0].setBookName("토지");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==== bookArray1 ====");
		// array1 요소값들(bookArray[i]) 출력
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showInfoBook();
		}
		
		System.out.println("==== bookArray2 ===="); 
		// array2의 기존 요소값들 출력, 깊은 복사는 기존 배열의 변경값에 영향받지 않음
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfoBook();	

			}
		}
	}
	
