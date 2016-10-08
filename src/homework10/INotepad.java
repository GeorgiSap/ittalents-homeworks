package homework10;

public interface INotepad {
	
	void addTextToPage(String text, int pageNumber);
	void replaceTextOnPage(String text, int pageNumber);
	void deleteTextFromPage(int pageNumber);
	String viewPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();	
}
