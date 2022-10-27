public class zad4 {

 public void KodPocztowy(String kod) {
     boolean check = false;
     String kod_poprawny = "(\\dX{2}-)?\\dX{3}";
     check=kod.matches(kod_poprawny);
     if (!check)
         System.out.println("poprawny kod pocztowy");
    else{
             System.out.println("niepoprawny kod poctowy");
         }

     }
 }


