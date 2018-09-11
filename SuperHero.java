
public class SuperHero extends Hero{

	public SuperHero(String name, int lv, int hp) {
		super(name, lv, hp);
	}

	public void attack(Life monster) {
		if(super.getWeapon() == null){
			System.out.println("スーパー勇者" + super.getName() + "のパンチ");
			super.setHp(super.getHp() - 10);
			System.out.println("スーパー勇者" + super.getName() + "のパンチ");
			super.setHp(super.getHp() - 10);
		}else{
			System.out.println("スーパー勇者" + super.getName() + "の攻撃");
			super.getWeapon().attack(this, monster);
			System.out.println("スーパー勇者" + super.getName() + "の攻撃");
			super.getWeapon().attack(this, monster);

		}
	}
}
