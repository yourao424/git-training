public class Main{
	public static void main(String[] args){
		Yatagarasu yataA = new Yatagarasu(100,"ヤタガラスA");
		Yatagarasu yataB = new Yatagarasu(100,"ヤタガラスB");
		Zombie zomA = new Zombie(100,"ゾンビA");
		Hero fujii = new Hero("藤井",1,100);
		Wizard ito = new Wizard("伊藤",1,100);
		SuperHero hujiawara = new SuperHero("藤原");
		Sword sword = new Sword("口トの検");
		Hagetaka hageA = new Hagetaka();
		Wand wand = new Wand();

		fujii.setWeapon(sword);
		System.out.println(fujii.getName()+"は"+sword.getName()+"を装備した。");
		do{
			fujii.attack(yataA);
			ito.attack(zomA);
		}while(zomA.getHp() >= -100);

		if(zomA.isDead()){
			zomA.dead();
			ito.grow(zomA);
		}

	}
}
