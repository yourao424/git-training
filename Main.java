public class Main{
	public static void main(String[] args){
		Yatagarasu yataA = new Yatagarasu(100,"hamanoA");
		Yatagarasu yataB = new Yatagarasu(100,"hamanoB");
		Zombie zomA = new Zombie(9999,"hamanoC");
		Hero fujii = new Hero("fujii",99,5000);
		Wizard ito = new Wizard("ito",99,9999);
		Sword sword = new Sword("口トの検");
		Wand wand = new Wand();

		while(yataB.getHp() > 0){
			zomA.attack(yataB);
		}

		if(yataB.getHp() <= 0){
			yataB.dead();
		}

		do{
			fujii.attack(yataB);
			fujii.setWeapon(sword);
			fujii.attack(yataB);
			yataB.attack(ito);
		}while(ito.getHp() >= 0);
		ito.dead();
	}
}
