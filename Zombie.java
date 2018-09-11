
public class Zombie extends Monster implements Human{

	public Zombie(int hp,String name) {
		this.setHp(hp);
		this.setName(name);
	}

	public Zombie() {
		this.setHp(100);
		this.setName("ゾンビッチ");
		this.setExp(50);
	}
	//逃げる
	public void run(){
		System.out.print("走って逃げました");
	}
	//しゃべる
	public void talk(){
		System.out.print("ぼくははまのっていうんだよろしくね");
	}

	//攻撃
	public void attack(Life monster){
		System.out.println(getName()+"の攻撃");
		monster.setHp(monster.getHp() - 10);
	}

	//やられる
	public void dead(){
		System.out.println(getName()+"は死んだ");
	}

	public boolean isDead() {
        if(super.getHp() <= -100) {
            return true;
        } else {
            return false;
        }
    }
}
