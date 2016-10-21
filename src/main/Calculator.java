package main;

public class Calculator {
	
	private int level;
	private int iv;
	private double[][] typeTable;
	
	public Calculator() {
		this.level = 50;
		this.iv = 31;
		typeTable = new double[18][18];
		for (int i=0; i<18; i++) {
			for (int j=0; j<18; j++) {
				typeTable[i][j] = 1.0;
			}
		}
		typeTable[0][5] = 0.5;
		typeTable[0][7] = 0;
		typeTable[0][8] = 0.5;
		typeTable[1][0] = 2;
		typeTable[1][2] = 0.5;
		typeTable[1][3] = 0.5;
		typeTable[1][5] = 2;
		typeTable[1][6] = 0.5;
		typeTable[1][7] = 0;
		typeTable[1][8] = 2;
		typeTable[1][13] = 0.5;
		typeTable[1][14] = 2;
		typeTable[1][16] = 2;
		typeTable[1][17] = 0.5;
		typeTable[2][1] = 2;
		typeTable[2][5] = 0.5;
		typeTable[2][6] = 2;
		typeTable[2][8] = 0.5;
		typeTable[2][11] = 2;
		typeTable[2][12] = 0.5;
		typeTable[3][3] = 0.5;
		typeTable[3][4] = 0.5;
		typeTable[3][5] = 0.5;
		typeTable[3][7] = 0.5;
		typeTable[3][8] = 0;
		typeTable[3][11] = 2;
		typeTable[3][17] = 2;
		typeTable[4][2] = 0;
		typeTable[4][3] = 2;
		typeTable[4][5] = 2;
		typeTable[4][6] = 0.5;
		typeTable[4][8] = 2;
		typeTable[4][9] = 2;
		typeTable[4][11] = 0.5;
		typeTable[4][12] = 2;
		typeTable[5][1] = 0.5;
		typeTable[5][2] = 2;
		typeTable[5][4] = 0.5;
		typeTable[5][6] = 2;
		typeTable[5][8] = 0.5;
		typeTable[5][9] = 2;
		typeTable[5][14] = 2;
		typeTable[6][1] = 0.5;
		typeTable[6][2] = 0.5;
		typeTable[6][3] = 0.5;
		typeTable[6][7] = 0.5;
		typeTable[6][8] = 0.5;
		typeTable[6][9] = 0.5;
		typeTable[6][11] = 2;
		typeTable[6][13] = 2;
		typeTable[6][16] = 2;
		typeTable[6][17] = 0.5;
		typeTable[7][0] = 0;
		typeTable[7][7] = 2;
		typeTable[7][13] = 2;
		typeTable[7][16] = 0.5;
		typeTable[8][5] = 2;
		typeTable[8][8] = 0.5;
		typeTable[8][9] = 0.5;
		typeTable[8][10] = 0.5;
		typeTable[8][12] = 0.5;
		typeTable[8][14] = 2;
		typeTable[8][17] = 2;
		typeTable[9][5] = 0.5;
		typeTable[9][6] = 2;
		typeTable[9][8] = 2;
		typeTable[9][9] = 0.5;
		typeTable[9][10] = 0.5;
		typeTable[9][11] = 2;
		typeTable[9][14] = 2;
		typeTable[9][15] = 0.5;
		typeTable[10][4] = 2;
		typeTable[10][5] = 2;
		typeTable[10][9] = 2;
		typeTable[10][10] = 0.5;
		typeTable[10][11] = 0.5;
		typeTable[10][15] = 0.5;
		typeTable[11][2] = 0.5;
		typeTable[11][3] = 0.5;
		typeTable[11][4] = 2;
		typeTable[11][5] = 2;
		typeTable[11][6] = 0.5;
		typeTable[11][8] = 0.5;
		typeTable[11][9] = 0.5;
		typeTable[11][10] = 2;
		typeTable[11][11] = 0.5;
		typeTable[11][15] = 0.5;
		typeTable[12][2] = 2;
		typeTable[12][4] = 0;
		typeTable[12][10] = 2;
		typeTable[12][11] = 0.5;
		typeTable[12][12] = 0.5;
		typeTable[12][15] = 0.5;
		typeTable[13][1] = 2;
		typeTable[13][3] = 2;
		typeTable[13][8] = 0.5;
		typeTable[13][13] = 0.5;
		typeTable[13][16] = 0;
		typeTable[14][2] = 2;
		typeTable[14][4] = 2;
		typeTable[14][8] = 0.5;
		typeTable[14][9] = 0.5;
		typeTable[14][10] = 0.5;
		typeTable[14][11] = 2;
		typeTable[14][14] = 0.5;
		typeTable[14][15] = 2;
		typeTable[15][8] = 0.5;
		typeTable[15][15] = 2;
		typeTable[15][17] = 0;
		typeTable[16][1] = 0.5;
		typeTable[16][7] = 2;
		typeTable[16][13] = 2;
		typeTable[16][16] = 0.5;
		typeTable[16][17] = 0.5;
		typeTable[17][1] = 2;
		typeTable[17][3] = 0.5;
		typeTable[17][8] = 0.5;
		typeTable[17][9] = 0.5;
		typeTable[17][15] = 2;
		typeTable[17][16] = 2;
	}

	public int getHp(int bs, int ev) {
		return (int) ((2*bs+iv+ev/4)*level/100+level+10);
	}

	public int getOtherStat(int bs, int ev) {
		return (int) ((2*bs+iv+ev/4)*level/100+5);
	}
	
	public double getDamage(double ap, double atk, double def) {
		//return (double) ((double)(2*level+10)/250*(double)(atk/def)*ap+2);
		System.out.println(ap + " " + atk + " " +def);
		return Math.floor(Math.floor((Math.floor((2 * level) / 5 + 2) * ap * atk) / def) / 50 + 2);
	}
	
	public double getTypeC(String atkType, String pmType1) {
		int atkTypeNumber = getTypeNumber(atkType);
		int pmType1Number = getTypeNumber(pmType1);
		if (atkTypeNumber>17||pmType1Number>17)
			return 0;
		return typeTable[atkTypeNumber][pmType1Number];
	}
	
	public double getTypeC(String atkType, String pmType1, String pmType2) {
		int atkTypeNumber = getTypeNumber(atkType);
		int pmType1Number = getTypeNumber(pmType1);
		int pmType2Number = getTypeNumber(pmType2);
		if (atkTypeNumber>17||pmType1Number>17||pmType2Number>17)
			return 0;
		return typeTable[atkTypeNumber][pmType1Number]*typeTable[atkTypeNumber][pmType2Number];
	}
	
	private int getTypeNumber(String type) {
		if (type.equals("ÆÕ"))
			return 0;
		else if (type.equals("¸ñ"))
			return 1;
		else if (type.equals("·É"))
			return 2;
		else if (type.equals("¶¾"))
			return 3;
		else if (type.equals("µØ"))
			return 4;
		else if (type.equals("ÑÒ"))
			return 5;
		else if (type.equals("³æ"))
			return 6;
		else if (type.equals("¹í"))
			return 7;
		else if (type.equals("¸Ö"))
			return 8;
		else if (type.equals("»ð"))
			return 9;
		else if (type.equals("Ë®"))
			return 10;
		else if (type.equals("²Ý"))
			return 11;
		else if (type.equals("µç"))
			return 12;
		else if (type.equals("³¬"))
			return 13;
		else if (type.equals("±ù"))
			return 14;
		else if (type.equals("Áú"))
			return 15;
		else if (type.equals("¶ñ"))
			return 16;
		else if (type.equals("ÏÉ"))
			return 17;
		
		return 18;
	}
}
 