
public class Chap11Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("Minimum Damage: " + weapon.fire());
		
		weapon = new WidowWeaponSniper();
		System.out.println("Widow's Damage: " + weapon.fire());
		
		weapon = new DoomfistWeapon();
		System.out.println("Doomfist's Damage: " + weapon.fire());

	}

}