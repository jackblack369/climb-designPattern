package brook.example.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

//����ʽ(��̬����)

class Singleton {
	
	//1. ������˽�л�, �ⲿ��new
	private Singleton() {
		
	}
	
	//2.�����ڲ���������ʵ��
	private final static Singleton instance = new Singleton();
	
	//3. �ṩһ�����еľ�̬����������ʵ������
	public static Singleton getInstance() {
		return instance;
	}
	
}