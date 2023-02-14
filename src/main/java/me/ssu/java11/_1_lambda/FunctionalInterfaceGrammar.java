package me.ssu.java11._1_lambda;

/**
 * 함수형 인터페이스
 *  추상 메소드가 하나만 정의 할 수 있다.
 *  다른 메소드는 따로 구현이 가능하다.
 */
@FunctionalInterface // 추상 메소드를 2개 구현할 경우 컴파일 에러가 난다.
public interface FunctionalInterfaceGrammar {

	void doIt(); // abstract 생략 가능

	/**
	 * 자바 8의 특별한 기능
	 *  1) 자바 8부터 인터페이스 임에도 public(생략 가능)
	 *      static 메소드 안에 정의 가능하다.
	 */
	static void printName() {
		System.out.println("Ssu");
	}

	/**
	 * 자바 8의 특별한 기능
	 *  2) 디폴트 메소드를 만들 수 있다.
	 */
	default void printAge() {
		System.out.println("35");
	}
}
