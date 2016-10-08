package homework10;

public class Page {
	private String title;
	private String text;
	
	Page(String title, String text) {
		if (title != null) {
			this.title = title;
		}
		if (text != null) {
			this.text = text;
		}
	}
	
	void setTitle (String title) {
		if (title != null) {
			this.title = title;
		}
	}
	
	void addText(String newText) {
		if (newText != null) {
			this.text = this.text + newText;
		}
	}
	
	void deleteText() {
		this.text = "";
	}
	
	String view() {
		return this.title + "\n" + this.text;
	}
	
	boolean searchWord(String word) {
		if (this.text.contains(word)) {
			return true;
		}
		return false;
	}
	
	boolean containsDigits() {
		boolean doesContain = false;
		for (int index = 0; index < this.text.length(); index++) {
			if (this.text.charAt(index) >= '0' && this.text.charAt(index) <= '9') {
				doesContain = true;
			}
		}
		return doesContain;
	}
}