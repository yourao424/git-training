abstract class Monster extends Life{

	private String name;	//複数体の判別のため
	private int exp;	//モンスターごとに経験値を割り振る

	abstract void attack(Life monster);

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		if(name.equals("")) {
			name = "ななし";
		}
		this.name = name;
	}

	abstract public boolean isDead();

	public int getExp() {
		return this.exp;
	}

	public void setExp(int exp) {
		if(exp < 0) {
			exp = 0;
		}
		this.exp = exp;
	}
}
