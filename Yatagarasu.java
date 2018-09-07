public class Yatagarasu extends Monster implements Briad {
    
    Yatagarasu(int hp) {
        this.hp = hp;
    }

    public void attack(Monster monster) {
        System.out.println("ヤタガラスの攻撃");
        monster.setHp(monster.getHp() - 100);

        return;
    }

    public void dead() {
        System.out.println("ヤタガラスは死んだ");
    }

    public void run() {
        System.out.print("ヤタガラスは走った！");
        return;
    }
}