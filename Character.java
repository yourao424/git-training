public abstract class Character extends Life{

	private int lv;
	private int maxhp;
	private int hp;
	private int power;
	private String name;
	private Weapon weapon;



	//Attackメソッド
	abstract void attack(Life life);

	//lvのgetterとsetter
	public int getLv(){
		return this.lv;
	}
	public void setLv(int lv){
		this.lv = lv;
	}

	//hpのgetterとsetter
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		this.hp = hp;
	}

	//maxhpのgetterとsetter
	public int getMaxHp(){
		return this.hp;
	}
	public void setMaxHp(int hp){
		this.hp = hp;
	}

	//nameのgetterとsetter
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	//weaponのgetterとsetter
	public Weapon getWeapon(){
		return this.weapon;
	}

	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}


	public boolean isDead() {

	}
}
