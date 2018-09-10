public class Main{
	public static void main(String[] args){
		Yatagarasu yataA = new Yatagarasu(100,"hamanoA");
		Yatagarasu yataB = new Yatagarasu(100,"hamanoB");
		Zombie zomA = new Zombie(9999,"hamanoC");

		while(yataB.getHp() > 0){
			zomA.attack(yataB);
		}

		if(yataB.getHp() <= 0){
			yataB.dead();
		}
	}
}
