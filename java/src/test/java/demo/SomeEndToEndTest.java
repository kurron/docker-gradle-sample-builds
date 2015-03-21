package demo;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.kurron.categories.EndToEndTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Category( EndToEndTest.class )
@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration( classes = Application.class )
@WebIntegrationTest( randomPort = true )
public class SomeEndToEndTest {

	@Test
	public void contextLoads() {
        System.out.println( "an end-to-end test ran!" );
	}

}
