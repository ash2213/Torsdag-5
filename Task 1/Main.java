class Main{
	
	public static void main(String [] args){

		Team a= new Team("astralis");
		Team b= new Team("g2");
		Team c= new Team("Vitality");
		Team d= new Team("Mad lions");
		Team e= new Team("STK T1");


		a.setRank(5);
		b.setRank(4);
		c.setRank(3);
		d.setRank(2);
		e.setRank(1);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);


	}

}