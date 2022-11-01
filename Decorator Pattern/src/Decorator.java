public class Decorator {

    static void printDrink(Drink drink) {
        System.out.println("Drink: " + drink.getDescription()
                + ", Cost: " + drink.cost());
    }

    public static void main(String[] args) {

        Drink houseblend = new HouseBlend();
        Drink dark = new DarkRoast();
        Drink mocha = new HouseBlend();
        Drink dark2 = new DarkRoast();


        printDrink(houseblend);
        DecoratorFactory decoratorFactory = new DecoratorFactory();

        dark = decoratorFactory.addMocha(dark);
        printDrink(dark);

        mocha = decoratorFactory.addWhip(mocha);
        printDrink(mocha);

        dark2 = decoratorFactory.addWhip(dark2);
        dark2 = decoratorFactory.addMocha(dark2);
        printDrink(dark2);





    }
}
