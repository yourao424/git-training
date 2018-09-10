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

	public void attack(Character character, Monster monster) {
		System.out.println(character.getName() + "は" + this.getName() + "を振りかざした！");
		monster.setHp(monster.getHp() - this.getPower());
		System.out.println(monster.getName() + "に" + this.getPower() + "ダメージ！");
	}

	public void Throw(Character character, Monster monster) {
		System.out.println(character.getName() + "は" + this.getName() + "を投げた！");
		monster.setHp(monster.getHp() - this.getPower() * 2);
		System.out.println(monster.getName() + "に" + this.getPower() + "ダメージ！");

	}
}
