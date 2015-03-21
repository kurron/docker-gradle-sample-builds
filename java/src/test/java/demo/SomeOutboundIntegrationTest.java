package demo;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.kurron.categories.InboundIntegrationTest;
import org.kurron.categories.OutboundIntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Category( OutboundIntegrationTest.class )
@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration( classes = Application.class )
public class SomeOutboundIntegrationTest {

	@Test
	public void contextLoads() {
        System.out.println( "an outbound integration test ran!" );
	}

}
