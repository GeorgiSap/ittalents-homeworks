package homework10;

public class SimpleNotepad implements INotepad {

	private Page[] pages;
	private int numberOfPages;

	SimpleNotepad(int numberOfPages) {
		if (numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
			this.pages = new Page[numberOfPages];
			for (int index = 0; index < pages.length; index++) {
				pages[index] = new Page("Title Page -" + (index + 1) + "-", "");
			}
		} else {
			System.out.println("Invalid number of pages");
		}
	}

	public void setTitleToPage(String title, int pageNumber) {
		if (title != null && pageNumber > 0 && pageNumber <= this.pages.length) {
			this.pages[pageNumber - 1].setTitle(title);
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (text != null && pageNumber > 0 && pageNumber <= this.pages.length) {
			this.pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void replaceTextOnPage(String text, int pageNumber) {
		deleteTextFromPage(pageNumber);
		addTextToPage(text, pageNumber);
	}

	@Override
	public void deleteTextFromPage(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= this.pages.length) {
			this.pages[pageNumber - 1].deleteText();
		}
	}

	@Override
	public String viewPages() {
		String textToView = "";
		for (int index = 0; index < this.pages.length; index++) {
			textToView = textToView + "Page -" + (index + 1) + "-\n" + this.pages[index].view() + "\n\n";
		}
		return textToView;
	}

	@Override
	public boolean searchWord(String word) {
		if (word != null) {
			boolean wordExists = false;
			for (int index = 0; index < pages.length; index++) {
				if (pages[index].searchWord(word)) {
					wordExists = true;
				}
			}
			return wordExists;
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int index = 0; index < pages.length; index++) {
			if (pages[index].containsDigits()) {
				System.out.println(pages[index].view());
			}
		}
	}
}
