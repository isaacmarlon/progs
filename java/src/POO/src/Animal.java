import java.util.Scanner;

public class Animal {

	// Attributes

	public static final double FAVNUMBER = 3.14;

	private String name;
	private byte age;
	private double weight;
	private double height;
	private double speed;
	private boolean owner;
	private long uniqueID;
	private char favoriteChar;

	protected static int numberOfAnimals = 0; // Only access in your package.

	static Scanner userInput = new Scanner(System.in);

	public Animal() {

		++numberOfAnimals;

		// setName

		System.out.print("Enter the name: ");

		if (userInput.hasNextLine()) { // Just if the user enter a String value

			this.setName(userInput.nextLine());

		}

		// setAge

		System.out.print("Enter the age: ");

		if (userInput.hasNextByte()) {

			this.setAge(userInput.nextByte());

		}

		// setWeight

		System.out.print("Enter the weight: ");

		if (userInput.hasNextDouble()) {

			this.setWeight(userInput.nextDouble());

		}

		// setHeight

		System.out.print("Enter the weight: ");

		if (userInput.hasNextDouble()) {

			this.setHeight(userInput.nextDouble());

		}

		// setSpeed

		System.out.print("Enter it's speed: ");

		if (userInput.hasNextDouble()) {

			this.setSpeed(userInput.nextDouble());

		}

		// setOwner

		System.out.print("Has it a owner: ");

		if (userInput.hasNextBoolean()) {

			this.setOwner(userInput.nextBoolean());

		}

		// setFavoriteChar

		System.out.print("Favorite char: ");

		if (userInput.hasNext()) {

			this.setFavoriteChar(userInput.next().charAt(0));

		}
		
		this.setUniqueID();
		
		System.out.println();
		System.out.println("The animal has been created!\n");
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Weight: " + this.getWeight());
		System.out.println("Height: " + this.getHeight());
		System.out.println("Speed: " + this.getSpeed());
		System.out.println("Owner: " + this.isOwner());
		System.out.println("UniqueID: " + this.getUniqueID());
		System.out.println("Favorite char: " + this.getFavoriteChar());

		System.out.printf("\nAmount of animals = %d\n", numberOfAnimals);

	}

	// Setters and Getters

	// name

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// weight

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// isOwner

	public boolean isOwner() { // Interesting method to boolean! :D
		return owner;
	}

	public void setOwner(boolean owner) {
		this.owner = owner;
	}

	// age

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	// uniqueID

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("uniqueID has setted up by paraments: " + this.uniqueID);
	}
	
	public void setUniqueID() {
		int min = 0, max = 100;
		this.uniqueID = min + (long) (Math.random() * ((max - min) + 1 ));
		System.out.println("uniqueID has setted up by a random number: " + this.uniqueID);
	}

	// favoriteChar

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}

	// speed

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	// height

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/** main **/

	public static void main(String[] args) {

		Animal theAnimal = new Animal();

	}

}
