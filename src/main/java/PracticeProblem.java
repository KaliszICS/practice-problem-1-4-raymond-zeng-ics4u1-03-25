import java.io.*;
import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {
		String name = getName(2, "file.txt");
		System.out.println(name);
	}

	public static String getName(int Line, String file){
		String name = "";
		Scanner s = null;
		int i = 1;
		try{
			s = new Scanner(new BufferedReader(new FileReader(file)));
			while(i < Line && s.hasNextLine()){
				s.nextLine();
				i++;
			}
			if (i == Line && s.hasNext()){
				name += s.next() + " " + s.next();
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			if(s != null){
				s.close();
			}
		}
		return name;
	}

	public static int getAge(int Line, String file){
		int num = -1;
		Scanner s = null;
		int i = 1;
		try{
			s = new Scanner(new BufferedReader(new FileReader(file)));
			while(i < Line && s.hasNextLine()){
				s.nextLine();
				i++;
			}
			if (i == Line && s.hasNext()){
				s.next();
				s.next();
				num = s.nextInt();
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			if(s != null){
				s.close();
			}
		}
		return num;
	}
	public static int getNumber(int Line, String file){
		int num = -1;
		Scanner s = null;
		int i = 1;
		try{
			s = new Scanner(new BufferedReader(new FileReader(file)));
			while(i < Line && s.hasNextLine()){
				s.nextLine();
				i++;
			}
			if (i == Line && s.hasNext()){
				s.next();
				s.next();
				s.next();
				num = s.nextInt();
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			if(s != null){
				s.close();
			}
		}
		return num;
	}

	public static void fileAppend(String output, String filename){
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter(filename, true));
			bw.write(output);
		}
		catch (IOException e){
			System.out.println(e);

		}
		finally{
			try{
				if(bw != null){
					bw.close();
				}
			}
			catch(IOException e){
				System.out.println(e);
			}
		}
	}

}