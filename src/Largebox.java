
	public class Largebox extends Sizebox {
		
		List List;
			
			public Largebox(List List){
				 this.List = List;
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return  List.getDescription()+", Size Large ";
			}
			public double cost(){
				return 30 + List.cost();
			}
		}
