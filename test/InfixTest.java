import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfixTest {

	@Test
	void test() {
		String infix = "(1+2)*9";
		String expectedPostifx = "12+9*";
		InfixToPostfixConverter iF = new InfixToPostfixConverter(new StackVector<Character>());
		assertEquals(expectedPostifx, iF.convertToPostfix(infix));
	}

}
