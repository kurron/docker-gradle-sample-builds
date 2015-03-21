package demo;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.kurron.categories.ComponentTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Category( ComponentTest.class )
@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration( classes = Application.class )
public class SomeComponentTest {

	@Test
	public void contextLoads() {
        System.out.println( "a component test ran!" );
	}

}
