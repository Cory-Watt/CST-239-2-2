package application;

public class Gun extends Weapon {
	   @Override
	   public void fireWeapon(int power) {
	       System.out.println("In gun.fireWeapon() with a power of " + power);
	   }
	   public void fireWeapon() {
	       System.out.println("In overloaded Gun.fireWeapon()");
	       super.fireWeapon(6);
	   }
	   @Override
	   public void activate(boolean enable) {
	       System.out.println("In the Gun.activate() with enable of " + enable);
	   }
	}