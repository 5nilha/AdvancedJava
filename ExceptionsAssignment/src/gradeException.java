
public class gradeException {

	public static double average(int[] grades) throws InvalidGradeException {

		int sum = 0;
		double result = 0;

		for (int i = 0; i < grades.length; i++) {

			if (grades[i] > 100) {
				throw new InvalidGradeException(
						"Grade at index " + i + " is greater than 100, " + " with a value of " + grades[i]);
			} else {
				sum += grades[i];
			}
		}
		result = sum / grades.length;
		return result;

	}

	public static int[] roundGrades(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 60) {
				grades[i] = 60;
			}
		}
		return grades;
	}

	public static void main(String[] args) {

		int[] grades = { 68, 70, 90, 99, 80, 55, 43, 39, 67, 72};

		try {
			System.out.println("Average : " + average(grades) + "\n");
		} catch (InvalidGradeException ge) {

			System.err.println(ge.getMessage() + "\n");
		} finally {
			roundGrades(grades);
			for (int grade : grades) {
				System.out.println(grade);
			}
		}

	}

}
