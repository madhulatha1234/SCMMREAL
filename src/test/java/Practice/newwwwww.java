package Practice;

public class newwwwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="my name is xyz";
String[] ch = str.split(" ");
System.out.println("my  ");
for(int i=1;i<ch.length;i++) {
	String chh=ch[i];
	for(int j=chh.length()-1;j>=0;j--) {
		System.out.print(chh.charAt(j));
	}
	System.out.println(" ");
	}
	}

}
