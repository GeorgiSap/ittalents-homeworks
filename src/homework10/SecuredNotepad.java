package homework10;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {

	private String password;

	SecuredNotepad(int numberOfPages) {
		super(numberOfPages);
		boolean result = false;
		do {
			result = setPassword();
		} while (!result);
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (requirePassword()) {
			super.addTextToPage(text, pageNumber);
		}
	}

	@Override
	public void replaceTextOnPage(String text, int pageNumber) {
		if (requirePassword()) {
			super.replaceTextOnPage(text, pageNumber);
		}
	}

	@Override
	public void deleteTextFromPage(int pageNumber) {
		if (requirePassword()) {
			super.deleteTextFromPage(pageNumber);
		}
	}

	@Override
	public String viewPages() {
		if (requirePassword()) {
			return super.viewPages();
		}
		return "Wrong password";
	}

	@Override
	public boolean searchWord(String word) {
		if (requirePassword()) {
			return super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (requirePassword()) {
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public boolean setPassword() {
		System.out.println("Set password:");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		if (isPasswordStrong(password)) {
			this.password = password;
			return true;
		} else {
			System.out.println("Weak password.");
			return false;
		}
	}

	@Override
	public boolean isPasswordStrong(String password) {
		if (password == null || password.length() < MIN_PASS_LENGHT || !(containsCharsBetween(password, '0', '9'))
				|| !(containsCharsBetween(password, 'A', 'Z')) || !(containsCharsBetween(password, 'a', 'z'))) {
			return false;
		}
		return true;
	}

	@Override
	public boolean requirePassword() {
		System.out.println("Enter password:");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		if (isPasswordCorrect(password)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isPasswordCorrect(String password) {
		if (password != null && this.password.equals(password)) {
			return true;
		}
		return false;
	}

}
