public class Hero extends Character implements Human{

	//逃げる
	public void run(){
		System.out.println("勇者" + super.getName() + "は走って逃げた");
	}
	//しゃべる
	public void talk(){
		System.out.print("my name is HAMANO");
	}

	//攻撃
	public void attack(Life monster){
		if(super.getWeapon() == null){
			System.out.println("勇者" + super.getName() + "のパンチ");
			monster.setHp(monster.getHp() - 10);
		}else{
			System.out.println("勇者" + super.getName() + "の攻撃");
			super.getWeapon().attack(this, monster);
		}
	}

	//やられる
	public void dead(){
		System.out.println(getName()+"は死んだ");
	}

	//コンストラクタ
	public Hero() {
		this("ななし", 100, 5);
	}

	public Hero(String name){
		this(name,100,5);
	}

	public Hero(int hp){
		this("ななし",hp,5);
	}

	public Hero(String name,int hp){
		this(name,hp,5);
	}

	public Hero(String name, int hp, int power){
		super.setName(name);
		super.setHp(hp);
		super.setPower(power);
	}

	public boolean isDead() {
		if(this.getHp() <= 0) {
			return true;
		}else{
			return false;
		}
	}
}
