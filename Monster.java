abstract class Monster extends Life{

	private String name;
	abstract void attack(Life monster);

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public boolean isDead() {
		
	}
}
