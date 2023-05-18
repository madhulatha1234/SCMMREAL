package Practice;

public class Newwwwwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"valu","tesaiut","naw"};
		for(int i=0;i<str.length-1;i++) {
			String st=str[i];
			char[] ch = st.toCharArray();
			for(int j=0;j<ch.length;j++) {
			if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u') {
				System.out.println(ch[j]);
			}
		}
	}
	}
}
