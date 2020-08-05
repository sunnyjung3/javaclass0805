import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		int[] ids = new int[3]; // 게시물 번호 저장소 [1,2,3]
		String[] titles = new String[3]; // 게시물 제목 저장소[제목1,제목2,제목3]
		String[] bodies = new String[3]; // 게시물 내용 저장소
		
		int lastIndex = 0;// 가장마지막에 저장된 저장소 index
		int lastId = 0;// 가장 마지막에 추가된 게시물의 게시물번호

		while(true) {
			System.out.println("명령어를 입력하세요");
			String s = sc.nextLine();
			System.out.println(s);

			if (s.equals("exit")) {
				System.out.println("프로그램 종료!");
				break;
			} else if(s.equals("help")) {

				System.out.println("add : 게시물 등록 ");
				System.out.println("list : 게시물 목록 ");
				System.out.println("exit : 프로그램종료");
				
			} else if(s.equals("add")) {

				lastId++;
				int id = lastId;
				ids[lastIndex] = id;

				System.out.println("제목을 입력해주세요");
				titles[lastIndex] = sc.nextLine();

				System.out.println("내용을 입력해주세요");
				bodies[lastIndex] = sc.nextLine();

				lastIndex++;
				

			} else if(s.equals("list")) {

				for(int i = 0; i < lastIndex; i++) {
					System.out.println("번호 : " + ids[i]);
					System.out.println("제목 : " + titles[i]);
					System.out.println("내용 : " + bodies[i]);
					System.out.println("======================");
				}

			} else if(s.equals("update")) {

				System.out.println("게시물 번호 선택");
				String target = sc.nextLine();
				int targetNo = Integer.parseInt(target);

				int targetIndex = -1; // 찾는게 없을 때 -1

				for(int i = 0; i < lastIndex; i++) {
					if(ids[i] == targetNo) {
						targetIndex = i;
						break;
					}
				}
				
				if(targetIndex == -1) {
					System.out.println("잘못된 게시물 번호");
				} else {
					System.out.println("제목");
					String title = sc.nextLine();
					System.out.println("내용");
					String body = sc.nextLine();

					titles[targetIndex] = title;
					bodies[targetIndex] = body;
				}
			
			} else if(s.equals("delete")) {
				System.out.println("게시물 번호 선택");
				String target = sc.nextLine();
				int targetNo = Integer.parseInt(target);

				int targetIndex = -1; // 찾는게 없을 때 -1

				for(int i = 0; i < lastIndex; i++) {
					if(ids[i] == targetNo) {
						targetIndex = i;
						break;
					}
				}
				
				if(targetIndex == -1) {
					System.out.println("잘못된 게시물 번호");
				} else {
					for(int j = 1; j < lastIndex - 1; j++) {
						ids[j] = ids[j+1];
						titles[j] = titles[j+1];
						bodies[j] = bodies[j+1];
					}
					lastIndex--;
				}
			} else {
				System.out.println("올바른 명령어가 아닙니다.");

			}
		}

	}

} 

