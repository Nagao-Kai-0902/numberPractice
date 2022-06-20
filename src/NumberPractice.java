import java.util.Scanner;

public class NumberPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("何人かを入力して下さい");
		int line = sc.nextInt();
		
		System.out.println("1つ目の倍数を入力してください");
		int numberLine = sc.nextInt();
		
		System.out.println("2つ目の倍数を入力してください");
		int numberLine2 = sc.nextInt();
		
		System.out.println(line + " " + numberLine + " " + numberLine2);
		
		for (int i = 1; i<line+1;i++) {
			if(i%numberLine == 0 && i%numberLine2 == 0) {
				System.out.println("AB");
			}else if(i%numberLine == 0) {
				System.out.println("A");
			}else if(i%numberLine2 == 0)  {
				System.out.println("B");
			}else {
				System.out.println("N");
			}
		}
	}

}
