public class Wizard extends Character implements Human {
    /**
     * コンストラクタ
     * @param name キャラクターの名前
     * @param lv キャラクターのレベル
     * @param hp キャラクターの体力
     */
    public Wizard(String name, int lv, int hp) {
        super.setName(name);
        super.setLv(lv);
        super.setHp(hp);
    }
    /**
     * 引数で与えたインスタンスに攻撃する
     * Weaponを持っている場合、その攻撃力で攻撃する
     * @param monster 攻撃対象のインスタンス
     */
    public void attack(Life monster) {
        if (super.getWeapon() == null ) {
            System.out.println(super.getName() + "の攻撃、" + monster.getName() + "に100の攻撃");
            monster.setHp(monster.getHp() - 100);
            return;
        }

        System.out.println(super.getName() + "の" + super.getWeapon().getName() + "での攻撃、" + monster.getName() + "に" + super.getWeapon().getPower() + "の攻撃");
        monster.setHp(monster.getHp() - super.getWeapon().getPower());
        return;
    }
}