import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This Class represents a phone number When a user create an object phone
 * number, the methods in the class validate a telephone number The class
 * methods validates the telephone passed by the user, whatever style is used.
 * If a Phone number is equal to 11 numbers in length and starts with the
 * country digit code "1", the class method handle it. However, if the phone
 * number is equal to 11 numbers in length but does not starts with "1", an
 * exception will be thrown Also, if a phone number is greater than 11, an
 * exception will be thrown. The Class Throws an Exception that should be
 * handled when an object of the class is created
 * 
 * Some sample format of Phones accepted: (888)888-888, 1 (888).888-8888, 888.888.8888, 1 888-888.8888, 888.888.8888
 * 
 * @author fabioquintanilha
 *
 */

public class Telephone {

	private String telephoneNumber;
	private String areaCode;
	private String exchange;
	private String localNumber;
	private String regexPhone = "\\d";

	/**
	 * The constructor builds a Telephone Whatever style of phone number is passed,
	 * it is handled by the class methods
	 * 
	 * @param telephoneNumber
	 * @throws InvalidTelephoneException
	 */
	public Telephone(String telephoneNumber) throws InvalidTelephoneException {
		setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Return the Telephone number
	 * 
	 * @return
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * Set the telephone number validating if the phone number is a valid phone
	 * number, and if it is in according with the phone number requisites. The
	 * method Throws an exception to be handled when a user creates an object of
	 * this class. The method also set the Area Code, the Exchange and the local
	 * number getting the information from the telephone number
	 * 
	 * @param telephoneNumber
	 * @throws InvalidTelephoneException
	 */
	public void setTelephoneNumber(String telephoneNumber) throws InvalidTelephoneException {

		Pattern pattern = Pattern.compile(regexPhone);
		Matcher regexMatcher = pattern.matcher(telephoneNumber);
		String phone = "";
		int count = 0;

		while (regexMatcher.find()) {
			phone += regexMatcher.group();
			count++;
		}

		if (count < 11) {
			this.areaCode = phone.substring(0, 3);
			this.exchange = phone.substring(3, 6);
			this.localNumber = phone.substring(6, 10);
		} else if (count > 10 && count < 12 && phone.substring(0) == "1") {
			this.areaCode = phone.substring(1, 4);
			this.exchange = phone.substring(4, 7);
			this.localNumber = phone.substring(7, 11);
		} else {
			throw new InvalidTelephoneException("Invalid Telephone number");
		}

		this.telephoneNumber = phone;
	}

	/**
	 * The method will present the number in a canonical form: (xxx) xxx-xxxx
	 */
	public String toString() {
		return "(" + areaCode + ")" + " " + exchange + "-" + localNumber;
	}

	/**
	 * Returns the Area Code of the telephone number
	 * 
	 * @return
	 */
	public String getAreaCode() {
		return this.areaCode;
	}

	/**
	 * Returns the local number of the telephone number
	 * 
	 * @return
	 */
	public String getLocalNumber() {
		return this.localNumber;
	}

	/**
	 * Return the Exchange number of the telephone number
	 * 
	 * @return
	 */
	public String getExchange() {
		return this.exchange;
	}

}
