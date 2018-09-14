public class Hagetaka extends Monster implements Bird {
	/**
	* 引数なしのコンストラクタ
	*/
	public Hagetaka() {
		super.setHp(100);
		super.setName("ななし");
		super.setExp(50);
	}

	/**
	* 名前を設定するコンストラクタ
	* @param name 設定する名前
	*/
	public Hagetaka(String name) {
		super.setName(name);
		super.setHp(100);
		super.setExp(50);
	}

	/**
	* 攻撃するメソッド
	*
	* @param enemy 攻撃対象
	*/
	public void attack(Life enemy) {
		System.out.println(super.getName() + "の攻撃");
		enemy.setHp(enemy.getHp() - 100);
		return;
	}

	/**
	* 逃げる
	*/
	public void run() {
		System.out.println(super.getName() + "は走った！");
		return;
	}

	/**
	* 飛ぶ
	*/
	public void fry() {
		System.out.println(super.getName() + "飛翔！");
		return;
	}

	/**
	* 死ぬ
	*/
	public void dead() {
		System.out.println(super.getName() + "は死んだ");
		return;
	}

	/**
	* 死亡判定
	*
	* @return 死んだ場合はtrue
	*/
	public boolean isDead() {
		if (super.getHp() <= 0) {
			return true;
		} else {
			return false;
		}
	}
}
