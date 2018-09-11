
public class SuperHero extends Hero{

	public SuperHero(String name, int lv, int hp) {
		super(name, lv, hp);
	}

	public SuperHero(String name, int lv) {
		super(name, lv, 100);
	}

	public SuperHero(String name) {
		super(name, 1, 100);
	}

	public SuperHero() {
		super("ななしさん", 1, 100);
	}

	public void attack(Life monster) {
		super.attack(monster);
		super.attack(monster);
	}
}
