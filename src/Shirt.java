
public class Shirt {
	
	public int shirtID = 10; // стандартне значення номера моделі сорочки
	public String description = "default description"; // стандартний опис сорочки
	public char colorCode = 'u'; // R=червоний, B=синій, G=зелений, U=невідомо
	public String color = "unset";
	public double price = 10.5; // стандартна вартість сорочки
	public int quantityInStock = 0; // стандартна кількість на складі
	
	/**
	 * виводить всю інформацію про сорочку на екран
	 */
	public void displayShirtInformation() {
		System.out.println("Shirt ID: " + shirtID);
		System.out.println("Shirt description:" + description);
		System.out.println("Color Code: " + colorCode);
		System.out.println("Color: " + color);
		System.out.println("Shirt price: $" + price);
		System.out.println("Quantity in stock: " + quantityInStock);
	}
}