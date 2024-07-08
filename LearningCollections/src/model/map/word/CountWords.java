package model.map.word;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	private Map<String, Integer> words;

	public CountWords() {
		this.words = new HashMap<>();
	}

	public void addWord(String word, Integer count) {
		words.put(word, count);
	}

	public void removeWord(String word) {
		if (!words.isEmpty()) {
			if (words.containsKey(word))
				words.remove(word);
		}
	}

	public void displayWords() {
		System.out.println(words);
	}

	public Map.Entry<String, Integer> getMostFrequentWord() {
		Map.Entry<String, Integer> mostFrequentWord = null;

		if (!words.isEmpty()) {
			for (Map.Entry<String, Integer> entry : words.entrySet()) {
				if (mostFrequentWord == null || mostFrequentWord.getValue() < entry.getValue())
					mostFrequentWord = entry;
			}
		}

		return mostFrequentWord;
	}
}
