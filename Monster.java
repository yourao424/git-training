abstract class Monster extends Life{

	private String name;
	abstract void attack(Monster monster);

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
}
