
public class cardrive {
		public static void main(String []args){
			car car1 = new car();
			car car2 = new car("black",459, 4.0,"Somepeople");
			car car3 = new car("red",222, 1.5,"herself");
			System.out.println(car1);
			System.out.println(car2);
			System.out.println(car3);
			
			System.out.println(car1.getColor()+" "+ car1.getHorsePower()+" "+ car1.getEngineSize()+" "+car1.getMake());
			System.out.println(car2.getColor()+" "+ car2.getHorsePower()+" "+ car2.getEngineSize()+" "+car2.getMake());
			System.out.println(car3.getColor()+" "+ car3.getHorsePower()+" "+ car3.getEngineSize()+" "+car3.getMake());
		}
		
}