
public class Zombie extends Monster implements Human{

	//逃げる
	public void run(){
		System.out.print("走って逃げました");
	}

	//攻撃
	public void attack(Monster monster){
		System.out.println("ゾンビの攻撃");
		monster.setHp(monster.getHp() - 10);
	}

	//やられる
	public void dead(){
		System.out.println("ゾンビはやられました");
	}

	//コンストラクタ
	public Zombie(){
		super.setHp(9999);
	}

}
