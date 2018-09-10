public class Wand extends Weapon{

	Wand(String name,int power){
		this.setName(name);
		this.setPower(power);
	}

	Wand(String name){
		this.setName(name);
		this.setPower((int) (Math.random() * 10));
	}

	Wand(){
		this.setName("杖杖杖杖");
		this.setPower(1);
	}

	public void Throw(Wizard wizard,Monster monster) {
		System.out.println(wizard.getName() + "は" + this.getName() + "を投げた！");
		monster.setHp(monster.getHp() - this.getPower() * 1.5);
		System.out.println(monster.getName() + "に" this.getPower() + "ダメージ！");
	}

	public void Attack(Wizard wizard,Monster monster) {
		System.out.println(wizard.getName() + "は" + this.getName() + "を振りかざした！");
		monster.setHp(monster.getHp() - this.getPower());
		System.out.println(monster.getName() + "に" this.getPower() + "ダメージ！");
	}
}
