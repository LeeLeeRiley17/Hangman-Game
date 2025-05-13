//Leeanna Salicup Brandon Martinez
public class HangmanGame {
private String answerWord;
private StringBuffer partiallyFilledString;
private StringBuffer guessedLetters;
public HangmanGame(String answerWord) {
this.answerWord = answerWord;
this.partiallyFilledString = new StringBuffer(answerWord.replaceAll(".", "-"));
this.guessedLetters = new StringBuffer();
}

public String getWord() {
return answerWord;
}

public String getGuessed() {
return partiallyFilledString.toString();
}

public String getTried() {
return guessedLetters.toString();
}

public int tryLetter(char letter) {
if (guessedLetters.indexOf(String.valueOf(letter)) != -1) {
return 0;
}
guessedLetters.append(letter);
int index = answerWord.indexOf(letter);
if (index == -1) {
return -1;
} else {
while (index != -1) {
partiallyFilledString.setCharAt(index, letter);
index = answerWord.indexOf(letter, index + 1);
}
return 1;
}
}
}