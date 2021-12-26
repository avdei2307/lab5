import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class num2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Z = 0;
        try {
            System.out.println("введите количество элементов в списке");
            Z = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("количество элементов списка может быть задано только целым числом");
            System.exit(1);
        }
        if (Z >= 1) {
            ArrayList<Integer> A = new ArrayList<>();
            try {
                System.out.println("введите элементы списка");
                for (int i = 0; i < Z; i++) {
                    A.add(i, in.nextInt());
                }
            } catch (InputMismatchException e) {
                System.out.println("элементами списка могут быть только целыми числами");
                System.exit(1);
            }
            LinkedList<Integer> Aa = new LinkedList<>();
            Aa.addAll(A);
            int X = 0;
            try {
                System.out.println("введите значение которое нужно удалить");
                X = in.nextInt();
                in.close();
            } catch (InputMismatchException e) {
                System.out.println("элементы списка  могут быть только целымм числами");
                System.exit(1);
            }
            for (int j = 0; j < Z; j++) {
                if (A.get(j) == X) {
                    A.remove(j);
                    Z--;
                    j--;
                }
            }
            int size = Aa.size();
            if (size >= 1) {
                System.out.println("исходный список");
                System.out.println(Aa);
                System.out.println("список после удаления элементов");
                System.out.println(A);
            }

        } else {
            System.out.println("введите минимум 1 значение в списке");
        }
    }
}


//zxc
//zxc
//zxc