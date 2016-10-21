package main;

public class Pokemon {

	private String name;
	private String type1;
	private String type2;
	private int hp;
	private int atk;
	private int def;
	private int sAtk;
	private int sDef;
	private int spd;

	public Pokemon() {
		super();
	}

	public Pokemon(String name, String type1, String type2, int hp, int atk,
			int def, int sAtk, int sDef, int spd) {
		super();
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.sAtk = sAtk;
		this.sDef = sDef;
		this.spd = spd;
	}
	
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type1=" + type1 + ", type2="
				+ type2 + ", hp=" + hp + ", atk=" + atk + ", def=" + def
				+ ", sAtk=" + sAtk + ", sDef=" + sDef + ", spd=" + spd + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSAtk() {
		return sAtk;
	}
	public void setSAtk(int sAtk) {
		this.sAtk = sAtk;
	}
	public int getSDef() {
		return sDef;
	}
	public void setSDef(int sDef) {
		this.sDef = sDef;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	
	
}
