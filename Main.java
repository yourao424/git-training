public class Main{
	public static void main(String[] args){
		Yatagarasu yataA = new Yatagarasu();
		Yatagarasu yataB = new Yatagarasu();
		Zombie zomA = new Zombie();
		Zombie zomB = new Zombie();

		while(yataB.getHp() > 0){
			zomA.attack(yataB);
		}

		if(yataB.getHp() <= 0){
			yataB.dead();
		}
	}
}