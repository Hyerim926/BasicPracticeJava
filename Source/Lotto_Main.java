package _0729.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

interface Fun_Info{
public void Num_compare(); // lotto 생성번호 중복체크함수
public void Num_output(); // 로또번호 출력함수
public void User_input(); // 사용자 번호 입력 함수
public void Num_check(); // 번호 확인 함수
public void Win_output(); // 맞은 번호 출력 함수
public void Rank(); // 등수 출력 함수
public void MainMenu(); // 메인메뉴함수
public void Question(); // 처음으로 돌아가는 함수
}

class Lotto{
	List<Integer> lotto_num = new ArrayList<Integer>(7); // lotto번호를 7개 뽑아서 담을 리스트 선언
	List<Integer> user_input = new ArrayList<Integer>(7); // user가 입력한 번호를 담을 리스트 선언
	List<Integer> list  = new ArrayList<Integer>(7); // 추첨된 로또 번호(정렬된)가 담겨있는 ArrayList
	List<Integer> win_number  = new ArrayList<Integer>(7); // 맞은 번호가 담길 리스트
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 숫자 입력값 받기 
	int count = 0; // 추첨된 로또 번호 갯수
	int win_count = 0; // 맞은 번호 개수
	int sel = 0; // 메뉴 선택 변수
	Random ran = new Random();
	Boolean check = true; // 중복체크 변수
	
	// Num_compare() 시작
	public void Num_compare() { // lotto 생성번호 중복체크함수
		while (count < 7) { // 번호를 7개를 뽑기 위해
			int random = ran.nextInt(45) + 1;
			//1~45 번호 random 생성 입력 [0번부터 시작+1해줌]
			for (int i = 0; i < count; i++) { // 0부터 count까지 반복하면서
				if (lotto_num.get(i) == random) {
					// lotto_num의 i번째 수랑, random에 저장되어있는 수랑 같다면
						check = false; // check에 false를 저장하고 반복문 종료
				}
				
			}
			if (check == true) { // check가 true면
			/* check가 true라는 것은 위에 반복문에 해당되지 않는다는것
			(반복문을 거치면 check는 false가 됨)이므로 lotto_num에 저장되어있는 수랑,
			random에 저장 되어 있는 수는 다르다는 것이 됨 */
				lotto_num.add(random); // lotto_num에 random에 저장되어있는 수 저장
				count++; // count를 1증가시킴
			}
			check = true; // check를 true로 다시 초기화
		}
	}
	
	// Num_output() 시작
	public void Num_output() {
		Num_compare();
		// Num_compare() 호출(Num_compare()가 각각의 리스트에 수를 저장하는 함수이므로)
		for (int i = 0; i < lotto_num.size(); i++) {
			// lotto_num의 크기만큼 반복문 돌림
			list.add(lotto_num.get(i));
			// lotto_num에 들어있는 수를 가져와서, 새로운 리스트인 list에 저장(정렬을 위해)
		}
		Collections.sort(list); // list를 오름차순으로 정렬
		lotto_num.clear(); // 재추첨했을 때 값이 중복되는 것 방지
		System.out.println("======== 당첨 번호 ========");
		System.out.println(list); // list에 저장되어있는 수 출력
		System.out.println("=======================");
		System.out.println("\t번호 추첨 완료\n");
		Question(); // 초기 메뉴로 돌아가는지 묻는 함수 호출
	}
	
	// User_input() 시작
	public void User_input() {
		int num = 0;
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.println("[" + (i+1) + "]번째 운명의 번호 입력 : ");
			
			try { // BufferedReader를 썼기 때문에 예외처리 
				num = Integer.parseInt(br.readLine());
				// 위 Num_compare()에서와 마찬가지로 새로운 Integer변수를 선언하고 저장
				if (user_input.contains(num)) { // user_input 리스트에 num과 같은 수가 들어있다면
					System.out.println("중복 입력할 수 없습니다.");
					i--; // 다시 입력하기 위해 ex. 2번째 중복 입력 -> 두 번째에 재입력하게끔
				} else if (num < 1 || num > 45) { // 1~45까지만 입력가능하게하기 위한 else if문
					System.out.println("1부터 45까지만 입력 가능합니다.");
					i--;
				} else {
					user_input.add(num); // 위의 if조건에 모두 해당하지 않으면, user_input리스트에 변수 저장
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println();
		Question();
	}
	
	// Num_check() 시작 , 아래의 중복 for문은 list의 i번째 수와 user_input의 j번째 수를 모두 비교하는 것
	public void Num_check() {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < user_input.get(i); j++) {
				if (list.get(i) == user_input.get(j)) {
					win_count++; // win_count 1증가
					win_number.add(user_input.get(j));
					// list의 i번째 수와 user_input의 j번째 수가 같으므로(당첨번호) win_number에 그 수 저장
				}
			}
		}
	}
	
	// Win_output() 시작
	public void Win_output() {
		Num_check();
		System.out.println("\n결과를 출력하겠습니다.");
		System.out.println("5 ");
		for (int i = 4; i >= 1; i--) {
			for (int j = 0; j < 500000000; j++) {
				;
			}
			System.out.println(i + " ");
				
			}
		System.out.println();
		System.out.println("\n======= 당첨 번호 =======");
		System.out.println(list); // list에 저장되어있는 수를 출력
		System.out.println("=======================");
		System.out.println("-----------------");
		System.out.println("입력번호 => ");
		for (int i = 0; i < user_input.size(); i++) {
			System.out.println(user_input.get(i) + " ");
		}
		System.out.println("\n---------------");
		for (int i = 0; i < 500000000; i++) { // 500000000의 크기만큼 반복문 돌림
			;
		}
		System.out.println("맞은 번호 : ");
		System.out.println(win_number.toString());
		System.out.println("맞은 개수 : ");
		System.out.println(win_count);
		Rank();
		Question();
		}
	
		// Rank() 시작
		public void Rank() {
			System.out.println();
			switch (win_count) {
			case 7 :
				System.out.println("1등 : 로또 번호 7개를 맞추었습니다");
				break;
			case 6 :
				System.out.println("2등 : 로또 번호 6개를 맞추었습니다");
				break;
			case 5 :
				System.out.println("3등 : 로또 번호 5개를 맞추었습니다");
				break;
			case 4 :
				System.out.println("4등 : 로또 번호 4개를 맞추었습니다");
				break;
			case 3 :
				System.out.println("5등 : 로또 번호 3개를 맞추었습니다");
				break;
			default:
				System.out.println("아쉽습니다. 다음 기회를 이용해 주세요.");
				break;
			}
			System.out.println();
		}
		
		//MainMenu() 시작
		public void MainMenu() {
			System.out.println("\t################");
			System.out.println("\t#    1.번호추첨       #");
			System.out.println("\t#    2.번호입력       #");
			System.out.println("\t#    3.결과보기       #");
			System.out.println("\t#    0.종료            #");
			System.out.println("\t################");
			System.out.print("\t메뉴 선택 => ");
			
			try {
				sel = Integer.parseInt(br.readLine()); // user로부터 번호 입력 받기
			} catch (IOException ie) {
				ie.printStackTrace();
			} // 0~3 중 입력했을 때의 조건
			switch (sel) {
			case 1 :
				Num_output();
				break;
			case 2 :
				User_input();
				break;
			case 3 :
				Win_output();
				break;
			case 0 :
				System.out.println("\nLotto프로그램을 종료합니다. 감사합니다");
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력하였습니다. 초기 메뉴로 돌아갑니다.");
				MainMenu();
				break;
			}
		}
		
		// Question() 시작
		public void Question() {
			String choice = "";
			System.out.println("초기화면으로 돌아가겠습니까? Y/N : ");
			
			try {
				choice = br.readLine(); // user로부터 y/n 입력 받기
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			// 대소문자 모두 받아서 처리할 수 있도록 조건
			if (choice.equals("Y") || choice.equals("y")) {
				MainMenu();
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못 입력했습니다.");
				Question();
			}
		}
	}
	
	
public class Lotto_Main {

	public static void main(String[] args) {
		Lotto lt = new Lotto(); // Lotto 객체 생성
		
		System.out.println(" #     ####   #####   #####   #### ");
		System.out.println(" #    #    #    #       #    #    #");
		System.out.println(" #    #    #    #       #    #    #");
		System.out.println(" ####  ####     #       #     #### ");
		System.out.println("       HI~ NICE TO MEET YOU !      ");
		lt.MainMenu(); // MainMenu() 호출
	}

}
