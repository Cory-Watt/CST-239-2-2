package application;

public class Bomb extends Weapon {
	   @Override
	   public void fireWeapon(int power) {
	       System.out.println("In Bomb.fireWeapon() with a power of " + power);
	   }
	   public void fireWeapon() {
	       System.out.println("In overloaded Bomb.fireWeapon()");
	       super.fireWeapon(5);
	   }
	   @Override
	   public void activate(boolean enable) {
	       System.out.println("In the Bomb.activate() with enable of " + enable);
	   }
	}