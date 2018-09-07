
public class Zombie extends Monster implements Human{

	//逃げる
	public void run(){
		System.out.print("走って逃げました");
	}

	//攻撃
	public void attack(Monster monster){
		System.out.print("ゾンビの攻撃");
		monster.setHp(monster.getHp() - 100);
	}

	//やられる
	public void dead(){
		System.out.print("やられました");
	}

	//コンストラクタ
	public Zombie(){
		this.hp = 9999;
	}

}
