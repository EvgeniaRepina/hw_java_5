package ru.netology.sqr;

public class SQRService {
    public int calculateSquareNumber(int minSquare, int maxSquare) {

        int squareNumber = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= minSquare) {
                if (i * i <= maxSquare) {
                    squareNumber = squareNumber + 1;

                }
            }
        }
        return squareNumber;
    }
}
