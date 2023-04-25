
public class Desktop implements Hardware, Software {

	public void desktopModel() {
		System.out.println("Desktop/OS Model :- LZO");
	}

	public static void main(String[] args) {
		Desktop D = new Desktop();
		D.desktopModel();
		D.softwareResources();
		D.hardwareResources();
	}

	@Override
	public void softwareResources() {
		System.out.println("Software Resources in given model :- ");
		System.out.println("xyz office");
		System.out.println("xyz Image Manager");
		System.out.println("xyz Appearance");
		System.out.println("xyz Connect");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources in given model :- ");
		System.out.println("Monitor");
		System.out.println("Webcam");
		System.out.println("touchpad,keyboard");
		System.out.println("Camera Flash");
		System.out.println("xyz model");
		System.out.println("xyz care z0");

	}

}
