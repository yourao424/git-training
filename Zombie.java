
public class Zombie extends Monster implements Human{

	//逃げる


	Zombie(int hp,String name) {
			this.setHp(hp);
			this.setName(name);
	}
	public void run(){
		System.out.print("走って逃げました");
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


}
