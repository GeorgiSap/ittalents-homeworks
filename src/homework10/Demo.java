package homework10;

public class Demo {

	public static void main(String[] args) {
		INotepad sampleNotepad = new ElectronicSecuredNotepad(2);
		sampleNotepad.addTextToPage("sample text", 1);
		sampleNotepad.addTextToPage("another sample text", 2);
		System.out.println(sampleNotepad.viewPages());
		((ElectronicSecuredNotepad) sampleNotepad).stop();
		System.out.println(((ElectronicSecuredNotepad) sampleNotepad).isStarted());
		sampleNotepad.replaceTextOnPage("try to replace text when stopped", 1);
		((ElectronicSecuredNotepad) sampleNotepad).start();
		sampleNotepad.replaceTextOnPage("try to replace text when started", 2);
		System.out.println(sampleNotepad.viewPages());
	}

}