public class zad4 {

 public void KodPocztowy(String kod) {
     boolean check = false;
     String kod_poprawny = "(\\d{2}-)?\\d{3}";  // dorobić https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
     check=kod.matches(kod_poprawny);
     if (!check)
         System.out.println("nie poprawny kod pocztowy");
    else{
             System.out.println("poprawny kod poctowy");
         }

     }
 }


