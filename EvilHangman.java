import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.HTML;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvilHangman{
  public int wordLength;
  public int totalGuessRemaining;
  public int correctGuess;
  public int incorrect;
  public boolean foundLetter;
  public String[]wordFamilies = new String[250000];
  public ArrayList<String>correctGuess1;
  public ArrayList<String>allGuess;
  public static int count;
  
  public static void main(String[]args){
   EvilHangman a = new EvilHangman();
   a.lengthOfWord();
   a.setWordFamilies();
   //a.print();
  }
  public EvilHangman(){
   wordLength = 0;
   totalGuessRemaining = 0;
   correctGuess = 0;
   incorrect = 0;
  }
  public void lengthOfWord(){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter word length: ");
   int Length = sc.nextInt();
   wordLength = Length;
  }
  public void setWordFamilies(){
   String thisLine = "C:\\Users\\USER\\Desktop\\Code\\New folder\\EvilHangmanGroup9\\dictionary.txt";
   File file = new File(thisLine);
   try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String KeepWord;
     while((KeepWord = br.readLine()) != null ){//add word into array
       if(KeepWord.length() == wordLength){
        wordFamilies[count] = KeepWord;
        count++;
       }
     }
     System.out.println("Words with length " + wordLength + " have " + count + " words");
   }
   catch(FileNotFoundException ex){
     Logger.getLogger(EvilHangman.class.getName()).log(Level.SEVERE,null,ex);
   }
   catch(IOException ex){
     Logger.getLogger(EvilHangman.class.getName()).log(Level.SEVERE,null,ex); 
   }
  }
  public int decreaseGuess(){
    
    return totalGuessRemaining;
  }
  public boolean compareLetter(){
    
    return foundLetter;
  }
  public int increaseIncorrectGuess(){
    if(totalGuessRemaining == incorrect){
     //game over 
    }
    return incorrect; 
  }
  public void fillPositionLetter(){
    
  }
  public int checkNumberBlankPosition(){
    
    return wordLength;
  }
  public void updateScreen(){
    
  }
  /*public void print(){
      System.out.println(count); 
  }*/
}