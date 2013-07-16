import java.io.*;


public class code1 {

  public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
//	        String[] lineArray = line.split("\\s");
//	        if (lineArray.length > 0) {            
//	        }
	    	if(line.length()>0)
	    	{
	    		System.out.println(Pangrams(line));
	    	}
	    }
		
	}
	public static String Pangrams(String s)
	{
		boolean [] check=new boolean[26];
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)<='Z'&& s.charAt(i)>='A')
			{
				check[s.charAt(i)-'A']=true; 
			}else if(s.charAt(i)<='z'&& s.charAt(i)>='a')
			{
				check[s.charAt(i)-'a']=true; 
			}
		}
		String result=""; 
		for(int i=0; i<26; i++)
		{
			if(!check[i])
			{
				result+=  (char) ('a'+i);
			}
		}
		if(result.isEmpty()) return "NULL"; 
		return result; 
	}

}
