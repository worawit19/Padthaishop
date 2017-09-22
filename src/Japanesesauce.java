
public class Japanesesauce extends Sauce {
	    List List;
		
		public Japanesesauce(List List){
			 this.List = List;
		}
		

		public String getDescription() {

			return  List.getDescription()+", Japanesesauce";
		}
		public double cost(){
			return 5 + List.cost();
		}
		 
	}
