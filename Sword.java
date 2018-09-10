public class Sword extends Weapon {

	Sword(String name, int power){
		this.setName(name);
		this.setPower(power);
	}

	Sword(String name){
		this.setName(name);
		this.setPower(500);
	}

	Sword(){
		this.setName("がり〇りくんのあたり棒");
		this.setPower(500);
	}

	public void attack(Character character, Monster monster) {
		System.out.println(character.getName() + "は" + this.getName() + "で攻撃");
		monster.setHp(monster.getHp() -500);
		System.out.println(monster.getName() + "に" + this.getPower() + "のダメージ");
	}

	public void Throw(Character character, Monster monster) {
		System.out.println(character.getName() + "は" + this.getName() + "を投げた");
		monster.setHp(monster.getHp() -750);
		System.out.println(monster.getName() + "に" + this.getPower() + "のダメージ");

	}
}
