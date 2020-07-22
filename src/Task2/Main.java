package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Box<String, String> sample1 = new Box<>("name", "netology");
        System.out.println(sample1);

        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();

        /*
         Попытка вывести ошибку с уровня компиляции не удалась.
         Ошибка происходит по причине различия декларированного типа элементов массива и добавляемых элементов
        */
//        try {
//            list1.add((Box<String, Integer>) sample1);
//        } catch (Exception e) {
//            System.out.println(" Ожидаемо получили " + e.getMessage());
//        }
//        try {
//            list1.add((Box<String, Integer>) sample2);
//        } catch (Exception e) {
//            System.out.println(" Ожидаемо получили " + e.getMessage());
//        }

        ArrayList<Box> normalList = new ArrayList<>();
        normalList.add(sample1);
        normalList.add(sample2);

        System.out.println(normalList);

    }
}
