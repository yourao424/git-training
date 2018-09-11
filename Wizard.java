public class Wizard extends Character implements Human {
	/**
	* コンストラクタ
	*
	* @param name キャラクターの名前
	* @param lv   キャラクターのレベル
	* @param hp   キャラクターの体力
	*/
	public Wizard(String name, int lv, int hp) {
		super.setName(name);
		super.setLv(lv);
		super.setHp(hp);
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

		System.out.println(super.getName() + "の攻撃、" + ((Character) monster).getName() + "に100の攻撃");
		monster.setHp(monster.getHp() - 100);
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

    public boolean isDead() {
        if(super.getHp() <= 0) {
            return true;
        } else {
            return false;
        }
    }
}

