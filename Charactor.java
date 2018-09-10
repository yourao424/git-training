public abstract class Charactor extends Life{

private int lv;
private String name;
private Weapon weapon;

//Attackメソッド
public void Attack(){

};

//lvのgetterとsetter
public int getLv(){
	return this.lv;
}
public void setLv(int lv){
	this.lv = lv;
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

}
