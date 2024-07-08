package model.map.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private Map<String, String> words;

	public Dictionary() {
		words = new HashMap<>();
	}

	public void addWord(String word, String definition) {
		words.put(word, definition);
	}

	public void removeWord(String word) {
		if (!words.isEmpty())
			if (words.containsKey(word))
				words.remove(word);
	}

	public void displayWords() {
		System.out.println(words);
	}

	public String findByWord(String word) {
		if (!words.isEmpty())
			if (words.containsKey(word))
				return words.get(word);

		return null;
	}
}
