class DecBin{
	public static void main (String a[]){
	
	int n;
	String bin; String hex;
	for (n = 0; n <= 255; n ++){
			System.out.print(n);
			bin = Integer.toHexString(n);
			hex= Integer.toBinaryString(n);
			System.out.println("    "+hex+"    "+bin);

			
		}
		
	}
}
