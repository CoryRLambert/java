class DecBin2{
	public static void main (String a[]){
	
	int n;
	String bin; String hex;
	for (n = 0; n <= 255; n ++){
			System.out.print(n);
			bin = Integer.toBinaryString(n);
			hex = Integer.toHexString(n);
			
				if(bin.length() == 8){
					bin = "  "+bin+"  "+hex;}
			
				if(bin.length() == 7){
					bin = "  0"+bin+"  "+hex;}
					
				if(bin.length() == 6){
					bin = "  00"+bin+"  "+hex;}
								
				if(bin.length() == 5){
					bin = "  000"+bin+"  "+hex;}
					
				if(bin.length() == 4){
					bin = "  0000"+bin+"  "+hex;}
					
				if(bin.length() == 3){
					bin = "  00000"+bin+"  "+hex;}
					
				if(bin.length() == 2){
					bin = "  000000"+bin+"  "+hex;}
					
				if(bin.length() == 1){
					bin = "  0000000"+bin+"  "+hex;}
					
			System.out.println(bin);

			
		}
		
	}
}
