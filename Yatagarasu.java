public class Yatagarasu extends Monster implements Briad {
    
    Yatagarasu(int hp) {
        this.hp = hp;
    }

    public void attack() {
        System.out.println("八咫烏の攻撃");
        return;
    }

    public void dead() {
        System.out.println("八咫烏は死んだ");
    }

    public void run() {
        System.out.print("八咫烏は走った！");
        return;
    }
}