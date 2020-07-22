package Task1;

public class Main {

    public static void main(String[] args) {

        Box<String> sample1 = new Box<>("Netology");
        System.out.println(sample1);

        //Ошибка была здесь - было String надо Integer
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);

        Box<Boolean> sample3 = new Box<>(Boolean.FALSE);
        System.out.println(sample3);
    }
}
