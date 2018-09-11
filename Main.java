public class Main{
	public static void main(String[] args){
		Yatagarasu yataA = new Yatagarasu(100,"ヤタガラスA");
		Yatagarasu yataB = new Yatagarasu(100,"ヤタガラスB");
		Zombie zomA = new Zombie(9999,"ゾンビA");
		Hero fujii = new Hero("藤井",99,3000);
		Wizard ito = new Wizard("伊藤",99,500);
		Sword sword = new Sword("口トの検");
		Hagetaka hageA = new Hagetaka();
		Wand wand = new Wand();

		fujii.setWeapon(sword);
		System.out.println("藤井は"+sword.getName()+"を装備した。");

		do{
			fujii.attack(yataA);
			yataB.attack(ito);
		}while(ito.getHp() >= 0);
		ito.dead();
	}
}
