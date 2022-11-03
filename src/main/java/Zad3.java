import java.util.Arrays;
import java.util.Random;

public class Zad3 {
    private int i;

    public void szukanie(int x) {

        Random randewu = new Random();
        int[] tablica = new int[x];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = randewu.nextInt(15);
        }
        int z=0;
        int min = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
                z=i;
            }

        }

        System.out.println("najmniejsza wartość " + min + "jej index to" + z);
        System.out.println(Arrays.toString(tablica));
        //
      //  System.out.println("najmniejsza wartość " + min + "jej index to" + tablica[i]);
    }
}

