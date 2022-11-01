class Whip extends CondimentDecorator {

    private Drink drink;

    Whip(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return drink.cost() + 1.0;
    }
}