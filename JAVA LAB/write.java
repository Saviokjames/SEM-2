import java.io.*;
class write
{
	public static void main(String[] args)
	{
		try
		{
			InputStreamReader r=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("ENTER THE STRING  ");
			String str = br.readLine();
			FileWriter f= new FileWriter("/home/user/Downloads/Data/linear search.txt")	;
			BufferedWriter wr = new BufferedWriter(f);
			wr.write(str);
			wr.append("       existing file use append    ");
			wr.close();
			System.out.println("SUCESSFULLY WRITTEN");
		}
		catch(IOException w)
		{
		System.out.println(w);
		}
	}
}
