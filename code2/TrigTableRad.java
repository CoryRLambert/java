class TrigTableRad {
	
	public static void main (String arg[]){
			double c,s,t;
			int d = 0;
			double r = 0, rround = 0;
			double pi=3.141592654;
			double i = (pi/12);
			String un = "UN";
			System.out.println("radian measurement is represented as rad");
			System.out.println("\t\t rad \t\t| cos(radian) \t\t| sin(rad) \t\t| tan(rad)");
			while (r<= (2*pi)){
				c=Math.round(Math.cos(r*1000.0))/1000.0;
				s=Math.round(Math.sin(r*1000.0))/1000.0;
				t=Math.round(Math.tan(r*1000.0))/1000.0;
				rround = (Math.round(r*1000.0))/1000.0;
				System.out.println("\t\t"+rround+ "\t\t | "+s+ "\t\t " +t);
				r=r+i;
				}
			}
		}
