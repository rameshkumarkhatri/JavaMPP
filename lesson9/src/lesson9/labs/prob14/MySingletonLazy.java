package lesson9.labs.prob14;

import java.util.Optional;

public class MySingletonLazy {

	private static MySingletonLazy instance = null;
	private MySingletonLazy() {
		// TODO Auto-generated constructor stub
	}

	public static MySingletonLazy getInstance() {
		return Optional.ofNullable(instance).orElseGet(MySingletonLazy::getOptionalInstance);
	}
	
	public static MySingletonLazy getOptionalInstance() {
		System.out.println("Singletone instantiated");
		instance = new MySingletonLazy();
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 50; ++i) {
			MySingletonLazy.getInstance();
		}
	}
}
