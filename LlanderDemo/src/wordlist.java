import java.io.*;
public class wordlist 
{
	
	public static void main(String[] args)
	{
		System.out.println("Please Enter a Message");
		int i = 0;
		do {
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String inputstring = inputReader.readLine();
			System.out.println("#" + inputstring);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (inputReader.toString() == "#bye") {i = 1;}
		}while (i==0);
		
		System.out.println("application done, thanks");
	}
	

}
