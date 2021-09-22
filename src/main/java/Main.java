public class Main {
    public static void main(String[] args) {
        int minSquare = 200;
        int maxSquare = 300;
        int squareNumber = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= minSquare) {
                if (i * i <= maxSquare) {
                    squareNumber = squareNumber + 1;

                }
            }
             }
        System.out.println(squareNumber + " квадратов между " + minSquare + " и " + maxSquare );}
}
   //        for (int i = 10; i < 99; i++) {
//        if (i * i >= 100) {
//            if (i * i <= 300) {
//                System.out.println("квадрат " + i + " между 200 и 300");
//            }
//        }
//        }



