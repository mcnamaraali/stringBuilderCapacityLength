
public class StringBuilderCapLen {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder ("Hello, how are you");
		
		System.out.printf("buffer = %s%n length = %d%n capacity = %d%n", 
				buffer.toString(), buffer.length(), buffer.capacity());
		
		buffer.ensureCapacity(75); //ensures minimum capacity
		System.out.printf("capacity = %d%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("length = %d%n string = %s%n", 
				buffer.length(), buffer.toString());

	}

}
