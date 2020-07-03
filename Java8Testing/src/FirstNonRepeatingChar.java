
public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String s="xxyyzz";
		System.out.println(getFirstNonRepeatingLtr(s));
	}

	public static char getFirstNonRepeatingLtr(String s){
		
		
		int count=0;
		char c = 0;
		for(int i=0; i<s.length(); i++){
			String s1="";
			s1=s.replaceAll(s.charAt(i)+"", "");
			if(s.length()-s1.length()>1){
				continue;
			}else{
				return s.charAt(i);
			}
		}
		return c;
	}
}
