package homework10;

import java.util.Scanner;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted = true;

	ElectronicSecuredNotepad(int numberOfPages) {
		super(numberOfPages);
	}

	@Override
	public void start() {
		if (requirePassword()) {
			this.isStarted = true;
		}
	}

	@Override
	public void stop() {
		this.isStarted = false;

	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (isStarted()) {
			super.addTextToPage(text, pageNumber);
		}
	}

	@Override
	public void replaceTextOnPage(String text, int pageNumber) {
		if (isStarted()) {
			super.replaceTextOnPage(text, pageNumber);
		}
	}

	@Override
	public void deleteTextFromPage(int pageNumber) {
		if (isStarted()) {
			super.deleteTextFromPage(pageNumber);
		}
	}

	@Override
	public String viewPages() {
		if (isStarted()) {
			return super.viewPages();
		}
		return null;
	}
}
