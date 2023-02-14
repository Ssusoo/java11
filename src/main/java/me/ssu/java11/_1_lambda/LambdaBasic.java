package me.ssu.java11._1_lambda;

public class LambdaBasic {

	public static void main(String[] args) {
		/**
		 * 자바 8 이전
		 *  익명 내부 클래스로 구현했다.
		 *  AnonymousFunctions[=람다(Lambda)]
		 */
		FunctionalInterfaceGrammar functionalInterfaceGrammar = new FunctionalInterfaceGrammar() {
			@Override
			public void doIt() {
				System.out.println("Hello");
			}
		};

		/**
		 * 메소드 구현부가 1줄일 경우
		 *  위의 식을 람다로 줄여서 사용이 가능하다.
		 */
		FunctionalInterfaceGrammar anonymousFunctionsOne = () -> System.out.println("In case of 1 line." );

		/**
		 * 메소드 구현부가 2줄일 경우
		 */
		FunctionalInterfaceGrammar anonymousFunctionsTwo = () -> {
			System.out.println("In case of 2 line.");
			System.out.println("In case of 2 line.");
		};
	}
}