package day2.inheritance;

class LaptopInh extends LaptopCreation{
	public LaptopInh(String Name,String Price,String Processor,String Ram,String HDD) {
		
			super(Name,Price,Processor,Ram,HDD);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaptopCreation lap1=new LaptopCreation("Lenovo", "$1000", "i3","2GB","500GB");
        System.out.println("Name:"+lap1.Name+ "\nPrice : "+lap1.Price+ "\nProcessor : "+lap1.Processor+"\nRam : "+lap1.Ram+"\nHDD : "+lap1.HDD);
        System.out.println("***********************************");


        LaptopCreation lap2=new LaptopCreation("Dell", "$1500", "i5","4GB","1TB");
        System.out.println("Name : "+lap2.Name+"\nPrice : "+lap2.Price+"\nProcessor : "+lap2.Processor+"\nRam : "+lap2.Ram+"\nHDD : "+lap2.HDD);
        System.out.println("***********************************");


        LaptopCreation lap3=new LaptopCreation("Sony", "$2000", "i9","8GB","1TB");
        System.out.println("Name : "+lap3.Name+"\nPrice : "+lap3.Price+"\nProcessor : "+lap3.Processor+"\nRam : "+lap3.Ram+"\nHDD : "+lap3.HDD);
        System.out.println("***********************************");



	}	
}