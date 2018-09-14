public class Zombie extends Monster implements Human{

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

	public Zombie() {
		this(100,"ゾンビッチ",0);
	}

	public Zombie(String name) {
		this(100,name,0);
	}

	public Zombie(int hp){
		this(hp,"ゾンビッチ",0);
	}

	public Zombie(int hp,String name) {
		this(hp,name,0);
	}

	public Zombie(int hp,String name, int exp) {
		this.setHp(hp);
		this.setName(name);
		this.setExp(exp);
	}
}
