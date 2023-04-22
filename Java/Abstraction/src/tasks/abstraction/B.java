package tasks.abstraction;

public interface B {
	void stud3();

	public default void DefaultOverride() {
		System.out.println("Default method Override");
	}
}
