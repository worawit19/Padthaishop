
	public class Padthaisauce extends Sauce {
	    List List;
		
		public Padthaisauce(List List){
			 this.List = List;
		}
		

		public String getDescription() {

			return  List.getDescription()+", Padthaisauce";
		}
		public double cost(){
			return 5 + List.cost();
		}
		 
	}
