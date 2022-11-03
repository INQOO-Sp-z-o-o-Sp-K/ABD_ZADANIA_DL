
public class Zad5 {
    //
    public void tabdwa() {
        int arr[][] = {{6,2},{6,2}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
              sum=sum+arr[i][j];
            }
            System.out.println();
        }
        System.out.printf("Suma tablicy to: "+sum);
    }
}
//
//        int Tab2[][] = new int[2][2];
//        int wynik = 0;
//        int l = 1;
//        for (int i = 0; i <= Tab2.length; i++) {
//            //Tab2[]=i;
//            //
//            System.out.println(" ");
//            //Tab2[i][j] = l;
//            for (int j = 0; j <= Tab2[i].length; j++) {
//                System.out.print(Tab2[i][j]);
//            }
//        }
//    }
//}
