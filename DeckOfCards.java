import java.util.*;
public class DeckCards {

public static void main (String[] args) {

String[] suit= ("S","D","C","H");
String[] rank= ("2","3","4","5","6","7","8","9","10","J","Q","K","A");
String [] deck= new String[52];

for (int i=0; i<deck.length; i++) {
     deck(i) = rank(i%13) + suit(i/13);
     System.out,println(deck(i));
}//End for loop
   for (int i=0;i<deck.length; i++){
   int index = (int) (Math.random()*deck.length);

String temp = deck(i);
deck (i)= deck(index);
deck(index)=temp;
}
for (String u: deck) {
   System.out.println(u);
}

