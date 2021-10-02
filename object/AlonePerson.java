package javaCh11.object;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AlonePerson {

	public static void main(String[] args) {
		
		Class personTest = Person.class;
		
		Constructor[] cons = personTest.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("======================");
		
		Field [] fields = personTest.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}

		System.out.println("======================");
		
		Method [] methods = personTest.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
