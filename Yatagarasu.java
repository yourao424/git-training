public class Yatagarasu extends Monster implements Bird {

	/**
	* コンストラクタ
	* @param hp ヤタガラスのHP
	*/
	public Yatagarasu(int hp,String name) {
		this.setHp(hp);
		this.setName(name);
		super.setExp(50);
	}

	/**
	* 引数なしのコンストラクタ
	*/
	public Yatagarasu() {
		super.setHp(100);
		super.setName("ななし");
		super.setExp(50);
	}


	/**
	* ヤタガラスの攻撃
	* @param life 攻撃対象のインスタンス
	*/
	public void attack(Life life) {
		System.out.println(getName()+"の攻撃");
		life.setHp(life.getHp() - 100);

		return;
	}

	/**
	* ヤタガラスの死
	*/
	public void dead() {
		System.out.println(this.getName()+"は死んだ");
	}

	/**
	* ヤタガラスの疾走
	*/
	public void run() {
		System.out.println(this.getName() + "は走った！");
		return;
	}

	public void fry(){
		System.out.println(this.getName() + "飛翔！");
		return;
	}

	public boolean isDead() {
		if(super.getHp() <= 0) {
			return true;
		} else {
			return false;
		}
	}


}
