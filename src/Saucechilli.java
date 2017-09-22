public class Saucechilli extends Sauce {
	    List List;
		
		public Saucechilli(List List){
			 this.List = List;
		}
		

		public String getDescription() {

			return  List.getDescription()+", Saucechilli";
		}
		public double cost(){
			return 5 + List.cost();
		}
		 
	}

