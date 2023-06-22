package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                counter++;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return counter;
    }
}
