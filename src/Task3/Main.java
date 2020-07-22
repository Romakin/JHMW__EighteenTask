package Task3;

public class Main {
    public static void main(String a[]) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        /*
        Был создан один абстрактный класс Organic и от него унаследованы
            классы Fruit и Vegetable, а также параметр V в классе Box.
        Альтернативный вариант решения - не создавать один абстрактный класс,
            а создать новый класс VegetableBox и унаследовать параметр V от класса Vegetable.
         */
        Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}
