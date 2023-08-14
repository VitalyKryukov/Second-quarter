package Seminar1;

import java.util.Arrays;

class Answer2 {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int aLen = a.length;
        if (aLen != b.length)
            return new int[1];

        int[] c = new int[aLen];

        for (int i = 0; i < aLen; i ++)
            c[i] = a[i] - b[i];

        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task_1_2{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer2 ans = new Answer2();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
