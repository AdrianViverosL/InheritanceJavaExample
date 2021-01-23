abstract class Product{
	protected String name;
	protected int price;

}

class Liquid extends Product{
	double totalAvailable;

	public Liquid(String pName, int pPrice, double pTotalAvailable){
		name = pName;
		price = pPrice;
		totalAvailable = pTotalAvailable;
		namesArr.add(pName);
	}
}

class Vegetable extends Product{
	String unitMeasure; 

	public Vegetable(String pName, int pPrice, String unit){
		name = pName;
		price = pPrice;
		unitMeasure = unit;
	}
}

class Egg extends Product{
	int pkgContent; 

	public Egg(String pName, int pPrice, int pContent){
		name = pName;
		price = pPrice;
		pkgContent = pContent;
	}
}