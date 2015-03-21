package demo;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.kurron.categories.UnitTest;

@Category(UnitTest.class )
public class SomeUnitTest {

	@Test
	public void contextLoads() {
        System.out.println( "a unit test ran!" );
	}

}
