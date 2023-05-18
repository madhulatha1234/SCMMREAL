package Practice;

public class newwwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]= {"value","test","new"};
for(int i=0;i<str.length;i++) {
	String st = str[i];
	String rev="";
	for(int j=st.length()-1;j>=0;j--) {
		rev=rev+st.charAt(j);
		//System.out.println(rev);
	}
	System.out.println(rev);
}
	}

}
