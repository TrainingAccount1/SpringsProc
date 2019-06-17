package com.pack;

public class TextEditor {

	private SpellChecker word;
	
	/*public TextEditor(SpellChecker word)
	{
		this.word=word;
		System.out.println("This in textEditor class");
	}*//* Constructor method based DI */
	
	
	
	public void textcheck() {
		System.out.println("value "+word);
		word.checking();
	}

	
	public void setWord(SpellChecker word) { /* Setter method based DI */
		this.word = word;
		System.out.println("This in textEditor class");
	}
	
}
