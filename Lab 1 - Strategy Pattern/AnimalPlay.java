public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal spike = new Dog();
		Animal tweeny = new Bird();
		
		System.out.println("Dog: " + spike.tryToFly());
		
		System.out.println("Bird: " + tweeny.tryToFly());
		
		 spike.setFlyingAbility(new ItFlys());
		// tweeny.setFlyingAbility(new CantFly());
		
		System.out.println("Dog: " + spike.tryToFly());
		
		System.out.println("Bird: " + tweeny.tryToFly());
	}
	
}