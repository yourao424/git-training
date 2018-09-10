
public class Hero extends Character implements Human{

	//逃げる
	public void run(){
		System.out.println("勇者" + super.getName() + "は走って逃げた");
	}

	//攻撃
	public void attack(Life life){
		if(super.weapon != null){
			System.out.println("勇者" + super.getName() + "のパンチ");
			life.setHp(life.getHp() - 10);
		}else{
			System.out.println("勇者" + super.getName() + "の攻撃");
			super.weapon.attack(Character character, Monster monster);
		}
	}

	//コンストラクタ
	public Hero(String name, int lv, int hp){
		super.setName(name));
		super.setLv(lv);
		super.setHp(hp);
	}

}
