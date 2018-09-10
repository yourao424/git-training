public class Main{
	public static void main(String[] args){
		Yatagarasu yataA = new Yatagarasu(100);
		Yatagarasu yataB = new Yatagarasu(100);
		Zombie zomA = new Zombie();

		while(yataB.getHp() > 0){
			zomA.attack(yataB);
		}

		if(yataB.getHp() <= 0){
			yataB.dead();
		}
	}
}