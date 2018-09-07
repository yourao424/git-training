
public class Zombie extends Monster implements Human{

	public void run(){
		System.out.print("走って逃げました");
	}

	public void atack(){
		System.out.print("攻撃しました");
	}

	public void dead(){
		System.out.print("やられました");
	}


	public Zombie(){
		this.hp = 30;
	}

	public int getHp(){return hp;}

}
