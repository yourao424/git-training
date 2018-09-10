public class Yatagarasu extends Monster implements Bird {

    /**
     * コンストラクタ
     * @param hp ヤタガラスのHP
     */
    Yatagarasu(int hp,String name) {
        this.setHp(hp);
				this.setName(name);
    }


    /**
     * ヤタガラスの攻撃
     * @param monster 攻撃対象のインスタンス
     */
    public void attack(Monster monster) {
        System.out.println(getName()+"の攻撃");
        monster.setHp(monster.getHp() - 100);

        return;
    }

    /**
     * ヤタガラスの死
     */
    public void dead() {
        System.out.println(getName()+"は死んだ");
    }

    /**
     * ヤタガラスの疾走
     */
    public void run() {
        System.out.print("ヤタガラスは走った！");
        return;
    }
}
