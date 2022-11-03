import java.util.Arrays;

public class Zad6 {

    public void tablicekopia(int z) {
        int[] oryginal = {1, 2, 3, 4,5,6,7,8,9};
        int[] kopia = new int[oryginal.length];
        for (int i = z-1; i < oryginal.length; i=i+z) {
            kopia[i] = oryginal[i];
        }
        System.out.println("Oryginalna: " + Arrays.toString(oryginal));
        System.out.println("Kopia co "+z+" element: "+ Arrays.toString(kopia));

    }
}