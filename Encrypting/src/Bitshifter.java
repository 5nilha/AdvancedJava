
public class Bitshifter {

	private static final int[] chain = { 9124, 2897, 90122, 8911, 901, 222, 9066, 8905 };

	public static String encrypt(String key) {
		String result = "";
		int keySize = key.length();
		char ch;
		int ck = 0;

		for (int i = 0; i < keySize; i++) {
			if (ck >= chain.length - 1) {
				ck = 0;
			}
			ch = key.charAt(i);
			ch += chain[ck];
			result += ch;
			ck++;
		}

		return result;
	}

	public static String decrypt(String key) {
		String result = "";
		int keySize = key.length();
		char ch;
		int ck = 0;

		for (int i = 0; i < keySize; i++) {
			if (ck >= chain.length - 1) {
				ck = 0;
			}
			ch = key.charAt(i);
			ch -= chain[ck];
			result += ch;
			ck++;
		}

		return result;

	}

}