class Mocha extends CondimentDecorator {

    private Drink drink;

    Mocha(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return drink.cost() + 1.5;
    }
}