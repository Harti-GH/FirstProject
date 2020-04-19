package FirstSeleniumPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//Scanner userInput=new Scanner(System.in);
		//String mySite=userInput.nextLine();
		//userInput.close();
		BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
		String mySite=userInput.readLine();
		
		System.out.println("User input:" +mySite);
	}

}
