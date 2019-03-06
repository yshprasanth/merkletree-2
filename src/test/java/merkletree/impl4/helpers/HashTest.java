package merkletree.impl4.helpers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HashTest {

	@Test
	public void test() {
		
		String hash = SHA256.generateHash("TEST String");
		System.out.println(hash);
		assertEquals(64, hash.length());
		assertEquals( "48ec9ab2710338d58ac4328ea9d47cf483d91082271541e5da43b0b583061183", hash);
	}

}
