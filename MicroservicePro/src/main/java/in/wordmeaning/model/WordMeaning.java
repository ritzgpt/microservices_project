package in.wordmeaning.model;

public class WordMeaning {
	int wid;
	String word;
	String meaning;
	
	public WordMeaning() {
	}
	public WordMeaning(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}


	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public String getMeaning() {
		return meaning;
	}


	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}


	@Override
	public String toString() {
		return "WordMeaning [word=" + word + ", meaning=" + meaning + "]";
	}
	
}
