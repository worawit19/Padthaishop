public class Test {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List p1 = new Mama();
			p1 = new Besicbox(p1);
			p1 = new Saucechilli(p1);
			p1 = new Japanesesauce(p1);
			p1 = new Padthaisauce(p1);
	        System.out.println(p1.getDescription()+ " $ = "+ p1.cost() );
			
			List p2 = new Noodle();
			p2 = new Besicbox(p2);
			p2 = new Saucechilli(p2);
			p2 = new Japanesesauce(p2);
			p2 = new Padthaisauce(p2);
	        System.out.println(p2.getDescription()+ " $ = "+ p2.cost() );
			
			List p3 = new Vermicelli();
			p3 = new Besicbox(p3);
			p3 = new Saucechilli(p3);
			p3 = new Japanesesauce(p3);
			p3 = new Padthaisauce(p3);
	        System.out.println(p3.getDescription()+ " $ = "+ p3.cost() );
			
			List p4 = new Spaghetti();
			p4 = new Besicbox(p4);
			p4 = new Saucechilli(p4);
			p4 = new Japanesesauce(p4);
			p4 = new Padthaisauce(p4);
	        System.out.println(p4.getDescription()+ " $ = "+ p4.cost() );
	        
	        List p5 = new Mama();
			p5 = new Largebox(p5);
			p5 = new Saucechilli(p5);
			p5 = new Japanesesauce(p5);
			p5 = new Padthaisauce(p5);
	        System.out.println(p5.getDescription()+ " $ = "+ p5.cost() );
			
			List p6 = new Noodle();
			p6 = new Largebox(p6);
			p6 = new Saucechilli(p6);
			p6 = new Japanesesauce(p6);
			p6 = new Padthaisauce(p6);
	        System.out.println(p6.getDescription()+ " $ = "+ p6.cost() );
			
			List p7 = new Vermicelli();
			p7 = new Largebox(p7);
			p7 = new Saucechilli(p7);
			p7 = new Japanesesauce(p7);
			p7 = new Padthaisauce(p7);
	        System.out.println(p7.getDescription()+ " $ = "+ p7.cost() );
			
			List p8 = new Spaghetti();
			p8 = new Largebox(p8);
			p8 = new Saucechilli(p8);
			p8 = new Japanesesauce(p8);
			p8 = new Padthaisauce(p8);
	        System.out.println(p8.getDescription()+ " $ = "+ p8.cost() );
			
		}
	}

