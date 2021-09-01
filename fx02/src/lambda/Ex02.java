package lambda;

interface Lamdba02 {
	public void lam(Object o);
}

public class Ex02 {
	public static void main(String[] args) {
		Lamdba02 lam01 = (aaa)-> {
			System.out.println(aaa + " 출력");
			System.out.println("여러 줄 사용가능");
		};
		lam01.lam("안녕하세요");
	}
}
