
public class car {
	String color;
	int horsePower;
	double engineSize;
	String make;
	/**
	 initialize values of car's instance variables or aattributtes
	 */
	public car(){
		color = "white";
		horsePower=250;
		engineSize=4.0;
		make="Toyata";
	}
	public car(String color,int horsePower, double engineSize, String make){
		 this.color=color;
		 this.horsePower=horsePower;
		 this.engineSize=engineSize;
		 this.make=make;
		 }
	
	public void setColor(String color){
		this.color=color;
	}
	public void setHorsePower(int horsePower){
		this.horsePower=horsePower;
	}
	public void setEngineSize(double engineSize){
		this.engineSize=engineSize;
	}
	public void setMake(String make){
		this.make=make;
	}
	public String getColor(){
		return color;
	}
	public int getHorsePower(){
		return horsePower;
	}
	public double getEngineSize(){
		return engineSize;
	}
	public String getMake(){
		return make;
	}
	public String toString(){
		return this.color+" "+ this.horsePower+" "+this.engineSize+" "+this.make;
	}
}