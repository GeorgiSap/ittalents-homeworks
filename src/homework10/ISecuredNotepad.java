package homework10;

public interface ISecuredNotepad {

	public static final int MIN_PASS_LENGHT = 5;

	boolean setPassword();

	boolean isPasswordStrong(String password);

	boolean requirePassword();

	boolean isPasswordCorrect(String password);

	default boolean containsCharsBetween(String password, char firstChar, char lastChar) {
		for (int index = 0; index < password.length(); index++) {
			if (password.charAt(index) >= firstChar && password.charAt(index) <= lastChar) {
				return true;
			}
		}
		return false;
	}
}
