import java.util.regex.Pattern;
import java.util.regex.Matcher;
class test 

{
	public static void main(String[]args)
	{
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("abfgabtyabjuab");
		while(m.find())
		{
			System.out.print(m.start()+" "+m.end()+"  "+m.group());
		}
	}
}

