public class main{
	public static void main(){
		Yatagarasu yatagarasuA = new Yatagarasu();
		Yatagarasu yatagarasuB = new Yatagarasu();
		Zombie zombieA = new Zombie();

		while(yatagarasuB.getHp() < 0){
			zombieA.attack(yatagarasuA);
		}
		System.out.println("Yatagarasu B is dead");

	}
}
