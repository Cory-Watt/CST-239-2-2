package application;

public abstract class Weapon {
   public void fireWeapon(int power)
   {
       System.out.println("In Weapon.firepower() with power of " + power);
   }
   public abstract void activate(boolean enable);
}