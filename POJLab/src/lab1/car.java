package lab1;

public class car {
	
			String marka;
			Boolean isNew;
			int milleage;
			double price;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World!");
			
		
			car Car = new car();
			Car.marka="BMW";
			Car.isNew=true;
			Car.milleage=0;
			Car.price=100000.99;
			
			System.out.println("Marka: "+ Car.marka);
			System.out.println("Nowy: "+ Car.isNew);
			System.out.println("Przebieg: " + Car.milleage);
			System.out.println("Cena: "+ Car.price);
			
}
}
