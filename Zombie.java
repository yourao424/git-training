
public class Zombie extends Monster implements Human{

	//パラメータ
	int at;

	//逃げる
	public void run(){
		System.out.print("走って逃げました");
	}

	//攻撃
	public void attack(){
		System.out.print("攻撃しました");
	}

	//やられる
	public void dead(){
		System.out.print("やられました");
	}

	//コンストラクタ
	public Zombie(){
		this.hp = 30;
		this.at = 10;
	}

	//getter,setter
	public int getAt(){return at;}
	public int setAt(int at){this.at = at;}
}
