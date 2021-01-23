import java.util.*;

public class Main{

	public static void main(String[] args){

		ArrayList<Product> pArray = new ArrayList<Product>();
		ArrayList<String> namesArray = new ArrayList<String>();

		pArray.add(new Liquid("Agua", 22, 5.5));
		pArray.add(new Liquid("Leche", 29, 1.5));
		pArray.add(new Vegetable("Papa", 24, "kg"));
		pArray.add(new Egg("Huevo", 27, 12));

		for (Product i : pArray){
			namesArray.add(i.name);
			//System.out.println(i.name);
		}

		Collections.sort(namesArray);

		for (String i : namesArray){
			for(Product j : pArray){
				if ( i == j.name){
					System.out.println(" - Nombre: " + i + " /// Precio: $" + j.price);
				}
			}
			
			
		}
	}
}
