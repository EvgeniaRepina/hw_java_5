public class Main {
    public static void main(String[] args) {
        int minSquare = 200;
        int maxSquare = 300;
        int squareNumber = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= minSquare && i * i <= maxSquare) {

                squareNumber++;
//                squareNumber++ =  squareNumber +1
            }
        }
        System.out.println(squareNumber + " квадратов между " + minSquare + " и " + maxSquare);
    }
}



