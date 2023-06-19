// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> listHelper = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list1.add(new Random().nextInt(101));
        }
        System.out.println("Это исходный список " + list1);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) listHelper.add(list1.get(i));
        }
        System.out.println("Это список из четных чисел предыдущего списка " + listHelper);
        list1.removeAll(listHelper);
        System.out.println("Это очищенный от четных чисел исходный список " + list1);

        int minn = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i) < minn) minn = list1.get(i);
        }
        System.out.println("Минимальное значение очищенного списка " + minn);

        int maxx = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i) > maxx) maxx = list1.get(i);
        }
        System.out.println("Максимальное значение очищенного списка " + maxx);

        double summ = 0;
        for (int i = 0; i < list1.size(); i++) {
            summ += list1.get(i);
        }

        double average = Math.round(summ / list1.size());
        System.out.println("Среднее значение очищенного списка примерно " + average);

    }
}