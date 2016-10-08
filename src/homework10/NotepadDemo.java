package homework10;

public class NotepadDemo {

	public static void main(String[] args) {

		SimpleNotepad oopPrinciplesNotepad = new SimpleNotepad(4);
		oopPrinciplesNotepad.setTitleToPage("Encapsulation", 1);
		oopPrinciplesNotepad.addTextToPage(
				"- The ability of an object to be a container (or capsule) for related properties (fields) and behaviours (methods).\n",
				1);
		oopPrinciplesNotepad.addTextToPage("- It gives maintainability, flexibility and extensibility.", 1);
		oopPrinciplesNotepad.setTitleToPage("Inheritance", 2);
		oopPrinciplesNotepad.addTextToPage("Inheritance builds a relationship between classes ", 2);
		oopPrinciplesNotepad.deleteTextFromPage(2);
		oopPrinciplesNotepad.addTextToPage(
				"- Inheritance is the ability of a class to implicitly gain some(or all) members of another class.\n",
				2);
		oopPrinciplesNotepad.addTextToPage("- The main purpose of inheritance is reusability of the code.", 2);
		oopPrinciplesNotepad.setTitleToPage("Abstraction", 3);
		oopPrinciplesNotepad.addTextToPage(
				"- Abstraction is to represent essential features of a system without getting involved in the complexity of the entire system.\n",
				3);
		oopPrinciplesNotepad.addTextToPage(
				"- It allows only to show the essential features of the object to the end user(programmer).", 3);
		oopPrinciplesNotepad.setTitleToPage("Polymorphism", 4);
		oopPrinciplesNotepad.addTextToPage("Polymorphism is a generic term that means 'many shapes'.", 4);
		oopPrinciplesNotepad.replaceTextOnPage(
				"- Polymorphism is the characteristic of being able to assign a different meaning or usage to something in different contexts.\n",
				4);
		oopPrinciplesNotepad.addTextToPage("- In java polymorphism is achieved by overriding methods in the subclass.",
				4);
		System.out.println(oopPrinciplesNotepad.viewPages());

		ISecuredNotepad securedNotepad = new SecuredNotepad(2);
		System.out.println(securedNotepad.isPasswordStrong("Passw0rd"));
		SecuredNotepad sampleSecuredNotepad = (SecuredNotepad) securedNotepad;
		sampleSecuredNotepad.addTextToPage("1234", 1);
		sampleSecuredNotepad.addTextToPage("text", 2);
		System.out.println("Is word found? " + sampleSecuredNotepad.searchWord("text"));
		sampleSecuredNotepad.printAllPagesWithDigits();

	}

}
