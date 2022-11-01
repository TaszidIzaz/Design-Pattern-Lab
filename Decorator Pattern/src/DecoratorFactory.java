public class DecoratorFactory {
    public Drink addMocha(Drink drink){
        return new Mocha(drink);
    }
    public Drink addWhip(Drink drink){
        return new Whip(drink);
    }
}
