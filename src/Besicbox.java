
public class Besicbox extends Sizebox {
		
		List List;
			
			public Besicbox(List List){
				 this.List = List;
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return  List.getDescription()+", Besic Size ";
			}
			public double cost(){
				return 20 + List.cost();
			}
		}
