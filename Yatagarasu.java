public class Yatagarasu extends Monster implements Briad {
    
    /**
     * コンストラクタ
     * @param hp ヤタガラスのHP
     */
    Yatagarasu(int hp) {
        this.hp = hp;
    }

    /**
     * ヤタガラスの攻撃
     * @param monster 攻撃対象のインスタンス
     */
    public void attack(Monster monster) {
        System.out.println("ヤタガラスの攻撃");
        monster.setHp(monster.getHp() - 100);

        return;
    }

    /**
     * ヤタガラスの死
     */
    public void dead() {
        System.out.println("ヤタガラスは死んだ");
    }

    /**
     * ヤタガラスの疾走
     */
    public void run() {
        System.out.print("ヤタガラスは走った！");
        return;
    }
}