import java.util.*;

public class Main{

	public static void main(String[] args){

		ArrayList<Product> pArray = new ArrayList<Product>();
		ArrayList<String> namesArray = new ArrayList<String>();

		pArray.add(new Liquid("Agua", 24, 5.5));
		pArray.add(new Liquid("Leche", 29, 1.5));
		pArray.add(new Vegetable("Papa", 24, "kg"));
		pArray.add(new Egg("Huevo", 27, 12));
		/**
		Liquid water = new Liquid("Agua", 24, 5.5);
		Liquid milk = new Liquid("Leche", 29, 1.5);
		Vegetable potato = new Vegetable("Papa", 24, "kg");
		Egg huevos = new Egg("Huevo", 27, 12);

		System.out.println(water.name + " Precio: $" + water.price + " Litros: " + water.totalAvailable );
		System.out.println(milk.name + " Precio: $" + milk.price + " Litros: " + milk.totalAvailable );
		System.out.println(potato.name + " Precio: $" + potato.price + " Unidad de venta: " + potato.unitMeasure);
		System.out.println(huevos.name + " Precio: $" + huevos.price + " Contenido: " + huevos.pkgContent);
		**/

		//System.out.println(pArray);
		//Collections.sort(pArray);
		for (Product i : pArray){
			namesArray.add(i.name);
			//System.out.println(i.name);
		}

		System.out.println(namesArray);
		Collections.sort(namesArray);

		for (String i : namesArray){
			System.out.println(i);
		}
	}
}
