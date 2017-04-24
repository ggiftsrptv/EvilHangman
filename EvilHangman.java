import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EvilHangman{
  public int wordLength;
  public int totalGuessRemaining;
  public int correctGuess;
  public int incorrect;
  public boolean foundLetter;
  public String[]wordFamilies = new String[235000];
  public ArrayList<String>correctGuess1;
  public ArrayList<String>allGuess;
  
  public EvilHangman(){
  
  }
  public void lengthOfWord(int length,int guess){
    wordLength = length;
    totalGuessRemaining = guess;
  }
  public void setWordFamilies(){
    Scanner s = null;
    try{
      s = new Scanner(new File("C:\\Users\\USER\\Desktop\\Code\\New folder\\EvilHangmanGroup9\\dictionary.txt")); 
    }catch(Exception e ){
      throw new RuntimeException(e);
    }
    int i = 0;
    while(s.hasNext()){//keep word dictionary into temp
     String temp = s.nextLine();
     if(temp.length() == wordLength){
      wordFamilies[i] = temp;
      i++;
     }
    }
    s.close();
  }
  public int decreaseGuess(){
    return totalGuessRemaining;
  }
  public boolean compareLetter(){
    return foundLetter;
  }
  public int increaseIncorrectGuess(){
    return incorrect; 
  }
  public void fillPositionLetter(){
    
  }
  public int checkNumberBlankPosition(){
    return wordLength;
  }
  public void updateScreen(){
    
  }
  public void print(){
    for(String a : wordFamilies){
      System.out.println(a); 
    }
  }
}