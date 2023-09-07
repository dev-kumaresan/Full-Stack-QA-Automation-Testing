package testngen.hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {

	@Before
	public void beforeScenerio() {
		System.out.println("Scenerio Started");
	}

	@After
	public void afterScenerio() {
		System.out.println("Scenerio Finished");
	}

}
