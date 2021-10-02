package javaCh11.object;

class MyDog {
	String name;
	String type;

	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}

//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

}

public class Exercise4 {

	public static void main(String[] args) {

		MyDog dog = new MyDog("∏€∏€¿Ã", "¡¯µæ∞≥");
		System.out.println(dog);

	}

}
