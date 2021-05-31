package auth;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void test() {
		DataBase bus = new DataBase();
		assertNull(bus.useres);
	}

}
