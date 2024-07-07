package model.set.word;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {

	private Set<String> words;

	public UniqueWordsSet() {
		words = new HashSet<>();
	}

	public void addWord(String word) {
		words.add(word);
	}

	public void removeWord(String word) {
		words.remove(word);
	}

	public boolean checkWord(String word) {
		return words.contains(word);
	}

	public void displayUniqueWords() {
		System.out.println(words);
	}
}
