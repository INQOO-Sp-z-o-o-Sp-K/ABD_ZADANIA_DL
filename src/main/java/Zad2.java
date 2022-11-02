public class Zad2 {
    public void potegi(int zakres, int stopien_potegi,double zmienna) {
        double wynik =0;
        long potega =1;

        System.out.println("Stopień potęgi  |  Wartość Dec  | Wartość OCT ");
        for (int i = 0; i <= zakres; i++) {
            wynik = Math.pow(zmienna,i);   //prawie dziala
             //potega<<=1;//przesunięcie bita słabo działa

            System.out.println( i+"                 "+Math.round(wynik)+"                 "+Integer.toString((int) wynik,8));
            //System.out.println( i+"    "+potega+" "+Integer.toString((int) potega, 8));
        }
    }
}