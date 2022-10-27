import java.util.Arrays;

public class Zad1 {
// nie działa tak jak bym chciał ....
    public void zad12(int zmienna) {

        int[] tablica = new int[zmienna];
        int wynik = 0;
        for (int i = 1; i <= tablica.length;i++ ) {
            tablica[wynik]=i;
            wynik++;

            System.out.println(Arrays.toString(tablica));
            //System.out.print(j);
            //System.out.print(k);
        }
//            for (int j = 1; j < zmienna - i; j++) System.out.println(i);
//                for (int j = 0; j < (i * 2) - 1; j++) System.out.print(i);
    }
}

