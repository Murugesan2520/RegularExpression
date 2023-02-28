package nov.Regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadContacts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file= new File("/home/arun/eclipse-workspace/oct5/Contacts.txt");
FileReader reading=new FileReader(file);
BufferedReader line=new BufferedReader(reading);
String name =line.readLine();
//System.out.println(name);
while(line!=null)
{
	Pattern pattern=Pattern.compile("(0|91)?[6-9][0-9]{9}");
	Matcher matcher=pattern.matcher(name);
	if(matcher.find())
	{
		System.out.println(matcher.group());
		name =line.readLine();
	}
}

	}

}
