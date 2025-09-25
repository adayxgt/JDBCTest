package test;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.security.PublicKey;

import jdk.internal.org.jline.reader.impl.history.DefaultHistory;
import model.User;

public class Test {

	public static void main(String[] args) {
			Planet planet = new Planet();
			System.out.println(planet.age);
		
		
		User user1 = new User(2, "Aday");
		User user2 = new User(1, "Alejandro");
		System.out.println(user1.name);
		
		System.out.println(1);
		System.out.println("Manoli, la custodia");
		

	}

}
