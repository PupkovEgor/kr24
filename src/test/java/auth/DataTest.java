package auth;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void test() {
		UserPut bus = new UserPut();
		assertNull(bus.store);
	}

}
