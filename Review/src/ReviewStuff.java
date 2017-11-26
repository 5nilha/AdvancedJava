
public class ReviewStuff {

	public static void main(String[] args) {
		byte b; // 1 byte
		short s; // 3 bytes
		int i; // 4 bytes
		long myL; // 8 bytes

		float f; // 4 bytes
		double d; // 8 bytes

		boolean bool; // 1 bytes
		char ch; // 2 bytes

		b = 127;
		s = 32566;
		i = 1234;
		myL = 123456678901234567L;

		i = 017; // Octal decimal Number
		i = 0XA04; // Hexadecimal Number
		i = 0b1001; // Binary Number

		System.out.println(i);

		f = 2.5f;
		d = 3.4;

		f = -1.5e-6f;
		System.out.println(f);
		d = 1.5e6; // Scientific Notation
		System.out.println(d);

		bool = true;
		ch = 'k';

		int myIntVariable;

		final int MY_CONSTANT = 345;

		// + - * / % Arithmetic
		// > < >= <= == != Relational
		// && & || | ! Logical ^ XOR
		// >> >>> << ~ & | Bitwise

		System.out.println(15 & 6);
		System.out.println(15 | 6);

		// ++ -- pre/ post
		// += -= *= %= /= Combined Assignment

		// unary + -
		i = 56;
		System.out.println(+i);
		System.out.println(-i);

		// (type) (int) Cast
		// mixed type expressions

		int aA = 10, bB = 6, cC;
		double dD = 1.6, d2;

		cC = aA / bB;
		cC = (int) 1.9;

		d2 = (double) aA / bB;

		System.out.println(cC);
		System.out.println(d2);

		// byte and Short

		byte b1 = 12, b2 = 5, b3;

		b3 = (byte) (b1 + b2); // Should cast because Java has no operation defined for Byte and short.
		// The addition is converted to int.

		boolean result = 10 > 13;
		System.out.println(result);

		// +=

		cC = cC + 10;
		cC += 10;

		b1 += b2; // b1 = (byte) (b1 + b2);

		result = true && true;
		System.out.println(result);

		result = true & true;
		System.out.println(result);

		aA = 10;
		result = false & ++aA > 11;
		System.out.println(result);
		System.out.println(aA);

		result = !true && true;
		System.out.println(result);

		result = !(10 > 34) && true;
		System.out.println(result);

	}

}
