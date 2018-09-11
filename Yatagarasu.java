public class Yatagarasu extends Monster implements Bird {

    /**
     * コンストラクタ
     * @param hp ヤタガラスのHP
     */
    public Yatagarasu(int hp,String name) {
        this.setHp(hp);
	    this.setName(name);
    }

    /**
     * 引数なしのコンストラクタ
     */
    public Yatagarasu() {
        super.setHp(100);
        super.setName("八咫烏");
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
        System.out.println(getName()+"は死んだ");
    }

    /**
     * ヤタガラスの疾走
     */
    public void run() {
        System.out.print("ヤタガラスは走った！");
        return;
    }

    public void fry(){
    	System.out.print("ヤタガラス飛翔！");
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
