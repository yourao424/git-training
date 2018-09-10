
public class Hero extends Character implements Human{

	//逃げる
	public void run(){
		System.out.println("勇者" + super.getName() + "は走って逃げた");
	}

	//攻撃
	public void attack(Life monster){
		if(super.getWeapon() == null){
			System.out.println("勇者" + super.getName() + "のパンチ");
			super.setHp(super.getHp() - 10);
		}else{
			System.out.println("勇者" + super.getName() + "の攻撃");
			super.getWeapon().attack(this, monster);
		}
	}

	//コンストラクタ
	public Hero(String name, int lv, int hp){
		super.setName(name);
		super.setLv(lv);
		super.setHp(hp);
	}

}
