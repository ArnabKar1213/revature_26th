
public class StringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello hi good noon hope we got thread safety";
		//LC(s);
		//Mid(s);
		Pal(s);
	
	}
	public static void LC(String s) {
		String s1[] =s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s2:s1) {
			sb.append(s2.substring(0,s2.length()-1)).append(Character.toUpperCase(s2.charAt(s2.length()-1))).append(" ");
		}
		System.out.println(sb);
	}
	public static void Mid(String s) {
		String s1[] =s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s2:s1) {
			if(s2.length()%2==0)
				sb.append(Character.toUpperCase(s2.charAt(0))).append(s2.substring(1)).append(" ");
			else { 
				int m= s2.length()/2;
				sb.append(s2.substring(0,m)).append(Character.toUpperCase(s2.charAt(m))).append(s2.substring(m+1,
						s2.length())).append(" ");
			}
		}
		System.out.println(sb);
	}
	public static void Pal(String s) {
		String s1[] =s.split(" ");
		int p=0;
		StringBuilder sb = new StringBuilder();
		for (String s2:s1) {
			StringBuilder sb1=new StringBuilder(s2);
			sb1.reverse().toString();
			if(s2.equals(sb1)) {
				 p++;
			}
		}
		if (p==0) {
			StringBuilder sb2=new StringBuilder();
			for (String s2:s1) {
				StringBuilder sb1=new StringBuilder(s2);
		
				sb2.append(sb1.reverse()).append(" ");
				
			}
			System.out.println(sb2);
		}
		
  }
}