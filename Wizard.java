public class Wizard extends Character implements Human {
	/**
	* コンストラクタ
	*
	* @param name キャラクターの名前
	* @param lv   キャラクターのレベル
	* @param hp   キャラクターの体力
	*/
	Wizard(String name, int lv, int hp) {
		super.setName(name);
		super.setLv(lv);
		super.setHp(hp);
		super.setMaxHp(hp);

	}

	/**
	 * 引数なしのコンストラクタ
	 */
	Wizard() {
		super.setHp(100);
		super.setMaxHp(100);
		super.setLv(1);
		super.setName("ななし");
	}

	/**
	* 引数で与えたインスタンスに攻撃する Weaponを持っている場合、その攻撃力で攻撃する
	*
	* @param monster 攻撃対象のインスタンス
	*/
	public void attack(Life monster) {
		//武器を持っている場合、武器で攻撃
		if (super.getWeapon() != null) {
			super.getWeapon().attack(this,monster);
			return;
		}

		System.out.println(super.getName() + "の攻撃、" + super.getName() + "に10の攻撃");
		monster.setHp(monster.getHp() - 10);
		return;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
	}

	//しゃべる
	public void talk(){
		System.out.print("my name is HAMANO");
	}

	public void dead() {
		System.out.println(super.getName() + "は倒れた！");
	}

	/**
	 * 死亡判定
	 * @return 死んだらture
	 */
	public boolean isDead() {
		if(this.getHp() <= 0) {
			return true;
		}else{
			return false;
		}
	}
}
