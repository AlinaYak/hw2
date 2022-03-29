package ru.netology.sqr;

public class SQRService {
    public int rootOfNumber(int minNumber, int maxNumber) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int multi = i * i;
            if (multi >= minNumber && multi <= maxNumber) {
                count = count + 1;

            }
        }
        return count;
    }
}