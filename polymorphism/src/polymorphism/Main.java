package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		// ������ ����
		Zerg zerg = new Zerg();
		zerg.attack();
		
		// �׶��� ����
		Terran terran = new Terran();
		terran.attack();
		
		// �����佺�� ����
		Protoss protoss = new Protoss();
		protoss.attack();
	
		// �ٸ� ���. star �ϳ��� �� �ذ��� �� �ִ�.
		/*Starcraft star = new Starcraft();
		
		System.out.println("=======================");
		
		star = new Zerg();
		star.attack();
		
		star = new Terran();
		star.attack();
		
		star = new Protoss();
		star.attack();
		
		*/
		
		// ���� ��Ÿũ����Ʈ�� �Ϲ� Ŭ������� �ν��Ͻ� ������ ����
		// �㳪 Starcraft �� ��� ���踦 ����� ���� ���� Ŭ������ �ν��Ͻ��� �����Ͽ� ����ϰ��� ���� Ŭ������ �ƴմϴ�.
		// ���� class �տ� abstract �� �߰��Ͽ� Starcraft Ŭ������ �ν��Ͻ��� ������ ���ϵ��� �ؾ� �մϴ�. 
		// abstract Ŭ������ ��ü�� �����϶�� �ϸ� '�ش� Ÿ���� �ν��Ͻ�ȭ �� �� ����' ���� �߻� 
		// star = new Starcraft(); ����
		
	}

}

