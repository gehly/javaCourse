public class StringOperations{
	public static void main(String[] args){
		
		// Manipulate strings
		String name = "Steve";
		System.out.println(name);
		
		int length = name.length();
		System.out.println(length);
		
		String test = name.substring(0,1);
		System.out.println(test);
		
		name = "A" + name.substring(1,length-1) + "Z";
		System.out.println(name);
		
		// Index and retrieve substring
		String website = "www.gatech.edu";
		System.out.println(website);
		
		length = website.length();
		String output = website.substring(4,length-4) + "1331";
		System.out.println(output);
		
	}
}
