public class Animal {
	
	private String name;
	private double height;
	private double speed;
	private String sound;
	public Flys flyingType;
	
	public void setName(String newName){ name = newName; }
	public String getName(){ return name; }
	
	public void setHeight(double newHeight){ height = newHeight; }
	public double getHeight(){ return height; }
	
	public void setSpeed(double newSpeed){ speed = newSpeed; }
	public double getSpeed(){ return speed; }
	
	public void setSound(String newSound){ sound = newSound; }
	public String getSound(){ return sound; }
    
	public String tryToFly(){
		
		return flyingType.fly();
		
	}
	
	public void setFlyingAbility(Flys newFlyType){
		
		flyingType = newFlyType;
		
	}
	
}