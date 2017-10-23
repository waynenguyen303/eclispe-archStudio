package wordlist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class word {

		public static void main(String[] args)
		{
			System.out.println("Please Enter a Message");
			int i = 0;
			do {
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			String inputstring= null;
			try {
				inputstring = inputReader.readLine();
				System.out.println("#" + inputstring);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (inputstring == "bye") {i = 1;}
			}while (i==0);
			
			System.out.println("application done, thanks");
		}
}
