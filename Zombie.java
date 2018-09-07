
public class Zombie extends Monster implements Human{

	//パラメータ
	String name;
	int at;

	//逃げる
	public void run(){
		System.out.print("走って逃げました");
	}

	//攻撃
	public void atack(){
		System.out.print("攻撃しました");
	}

	//やられる
	public void dead(){
		System.out.print("やられました");
	}

	//コンストラクタ
	public Zombie(String name){
		this.hp = 30;
		this.name = name;
		this.at = 10;
	}

	//getter,setter
	public int getHp(){return hp;}
	public int setHp(int hp){this.hp = hp;}
	public String getName(){return name}
	public String setName(String name){this.name = name;}
	public int getAt(){return at;}
	public int setAt(int at){this.at = at;}
}
