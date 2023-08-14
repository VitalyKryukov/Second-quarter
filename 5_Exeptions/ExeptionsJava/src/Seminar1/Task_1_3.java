package Seminar1;

import java.util.Arrays;

class Answer3 {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int aLen = a.length;
        if (aLen != b.length)
            return new int[1];

        int[] c = new int[aLen];

        for (int i = 0; i < aLen; i ++) {

            if (b[i] == 0)
                throw new RuntimeException("Делить на 0 нельзя");

            c[i] = a[i] / b[i];
        }

        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task_1_3{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer3 ans = new Answer3();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
