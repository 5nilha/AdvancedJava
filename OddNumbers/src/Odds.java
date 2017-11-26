
public class Odds {

	public static int countOdds(int[][] table1) {

		int count = 0;

		for (int i = 0; i < table1.length; i++) {
			for (int j = 0; j < table1[i].length; j++) {
				if (table1[i][j] % 2 != 0) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] table1 = { { 13, 12, 53, 19 }, { 1, 9, 6, 25, 18, 17 }, { 7, 28, 4 } };

		int[][] table2 = { { 13, 13, -85 }, { 11, 19 }, { 31, -89, 47, 26, +895 } };

		int[][] table3 = { { 10, 11, 15, 19 }, { 9, 21, 25, 33, }, { 20, 22, 24, 27, 29, 30, 37 } };

		System.out.println("Table1 Odds : " + countOdds(table1));
		System.out.println("Table2 Odds : " + countOdds(table2));
		System.out.println("Table3 Odds : " + countOdds(table3));

	}

}
