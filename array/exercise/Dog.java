package _0706.array.exercise;

public class Dog {
	private String name;
	private String type;
	
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String showDogInfo() { // return������ ��ȯ�Ϸ��� void�� �����ϸ� �ȵ�. void�� ���ϰ�����
		return name + ", " + type;
	}
	
	

	
}
