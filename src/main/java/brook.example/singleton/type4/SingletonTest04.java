package brook.example.singleton.type4;


public class SingletonTest04 {

	public static void main(String[] args) {
		System.out.println("����ʽ2 �� �̰߳�ȫ~");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

// ����ʽ(�̰߳�ȫ��ͬ������)
class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	//�ṩһ����̬�Ĺ��з���������ͬ������Ĵ��룬����̰߳�ȫ����
	//������ʽ
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}