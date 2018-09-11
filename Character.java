public abstract class Character extends Life{

	private int lv;
	private int maxHp;
	private int hp;
	private int power;
	private int maxExp;
	private int exp;
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

	//maxHpのgetterとsetter
	public int getMaxHp(){
		return this.maxHp;
	}
	protected void setMaxHp(int maxHp){
		this.maxHp = maxHp;
	}

	//expのgetterとsetter
	public int getExp(){
		return this.exp;
	}
	public void setExp(int exp){
		this.exp = exp;
	}

	//maxExpのgetterとsetter
	protected int getMaxExp(){
		return this.maxExp;
	}
	void setMaxExp(int maxExp){
		this.maxExp = maxExp;
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

	 abstract public boolean isDead();
}
