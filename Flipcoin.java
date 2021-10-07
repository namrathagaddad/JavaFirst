package Java;
import Utility;
public class Flipcoin {
   public static void main(String[] args) {
          int n, h=0, t=0;
          double heads, tails;
          Utility u = new Utility();
    System.out.println("Enter number of times you want to flip  coin");
    n= u.inputInteger ();
    for (int i = 0; i < n; i++) {
        double random = Math.random();
             if (random < 0.5)
                h++;
     else
              t++;
}
heads = h/ (double) n * 100;
tails = t/ (double) n * 100;
system.out.println("Percentage of heads" + head +"%");
system.out.println("Percentage of tails" + tails +"%");
}
}


