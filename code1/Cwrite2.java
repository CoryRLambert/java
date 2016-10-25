class Cwrite2 {
	public static void main (String args[]){
		int i, j, n = 0;
		int adjust = (1);
		char c;
		for (i = 0; i<20000 ; i++){
				for(j = 0; j < 80; j++){
					//c = (char)(n+adjust);
					n++;
					if (n % 3 == 0) adjust = 0;
					if (n % 7 == 0) adjust = 1;
					if (n % 9 == 0) adjust = 0;
					if (n % 15 == 0) adjust = 1;
					if (n % 21 == 0) adjust = 0;
					if (n % 3 == 0) adjust = 1;
					if (n % 8 == 0) adjust = 1;
					
					c = (char) (48+adjust);
					
					System.out.print(c);
						if (n > 1000000)n = 0;
				}
				
				System.out.println();
		}
	}
}
