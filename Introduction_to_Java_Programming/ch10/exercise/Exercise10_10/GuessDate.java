public class GuessDate {
	private static int[][] set1 =
       {{ 1,  3,  5,  7},
     	{ 9, 11, 13, 15},
     	{17, 19, 21, 23},
     	{25, 27, 29, 31}};

  	private static int[][] set2 =
       {{ 2,  3,  6,  7},
     	{10, 11, 14, 15},
     	{18, 19, 22, 23},
     	{26, 27, 30, 31}};

  	private static int[][] set3 =
       {{ 4,  5,  6,  7},
     	{12, 13, 14, 15},
     	{20, 21, 22, 23},
     	{28, 29, 30, 31}};

  	private static int[][] set4 =
       {{ 8,  9, 10, 11},
     	{12, 13, 14, 15},
     	{24, 25, 26, 27},
     	{28, 29, 30, 31}};

  	private static int[][] set5 =
       {{16, 17, 18, 19},
     	{20, 21, 22, 23},
     	{24, 25, 26, 27},
     	{28, 29, 30, 31}};

	private GuessDate() {
	}

	public static int getValue(int setNo, int k, int j) {
		switch (setNo) {
			case 0: return set1[k][j];
			case 1: return set2[k][j];
			case 2: return set3[k][j];
			case 3: return set4[k][j];
			case 4: return set5[k][j];
		}
		return 0;
	}
}