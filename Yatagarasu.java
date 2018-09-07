public class Yatagarasu extends Monster implements Briad {
    
    Yatagarasu(int hp) {
        this.hp = hp;
    }

    public void attack() {
        System.out.println("ヤタガラスの攻撃");

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