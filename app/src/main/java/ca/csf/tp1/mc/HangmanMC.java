package ca.csf.tp1.mc;

import static ca.csf.tp1.enumerations.GameStatus.WORD_NOT_FOUND_YET;

import java.util.ArrayList;
import java.util.List;

import ca.csf.tp1.enumerations.GameStatus;

public class HangmanMC {
    private String wordToFind;
    private String discoveredWord;
    private GameStatus status;
    List<Character> usedLetters = new ArrayList<Character>();
    private int nbErrors;
    private boolean updateCalled;

    public HangmanMC() {
        this.wordToFind = "";
        this.discoveredWord = "";
        this.status  = WORD_NOT_FOUND_YET;
        this.usedLetters = new ArrayList<Character>();
        this.nbErrors = 0;
        this.updateCalled = false;
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public void setWordToFind(String wordToFind) {
        this.wordToFind = wordToFind;
    }

    public String getDiscoveredWord() {
        return discoveredWord;
    }

    public void setDiscoveredWord(String discoveredWord) {
        this.discoveredWord = discoveredWord;
    }

    public void initDiscoveredWord() {

    }

    public GameStatus getGameStatus() {
        return status;
    }

    public List<Character> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(List<Character> usedLetters) {
        this.usedLetters = usedLetters;
    }

    public int getNbErrors() {
        return nbErrors;
    }

    public boolean isUpdateCalled() {
        return updateCalled;
    }

    public void playLetter(){

    }


}
