package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		// 저그의 공격
		Zerg zerg = new Zerg();
		zerg.attack();
		
		// 테란의 공격
		Terran terran = new Terran();
		terran.attack();
		
		// 프로토스의 공격
		Protoss protoss = new Protoss();
		protoss.attack();
	
		// 다른 방법. star 하나로 다 해결할 수 있다.
		/*Starcraft star = new Starcraft();
		
		System.out.println("=======================");
		
		star = new Zerg();
		star.attack();
		
		star = new Terran();
		star.attack();
		
		star = new Protoss();
		star.attack();
		
		*/
		
		// 만약 스타크래프트가 일반 클래스라면 인스턴스 생성이 가능
		// 허나 Starcraft 는 상속 관계를 만들기 위해 만든 클래스지 인스턴스를 생성하여 사용하고자 만든 클래스가 아닙니다.
		// 따라서 class 앞에 abstract 를 추가하여 Starcraft 클래스가 인스턴스를 만들지 못하도록 해야 합니다. 
		// abstract 클래스의 객체를 생성하라고 하면 '해당 타입을 인스턴스화 할 수 없음' 에러 발생 
		// star = new Starcraft(); 에러
		
	}

}

