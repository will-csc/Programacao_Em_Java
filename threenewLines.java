public class NewLine{	
	public static void main(String[] args){
		System.out.println("First line.");
		newLine();
		System.out.println("Second line.");
		threeLine();
		System.out.println("Third line.");
	}
	public static void newLine(){
		System.out.println();
	}
	public static void threeLine(){
		newLine();
		newLine();
		newLine();
	}
}
