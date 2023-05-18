package Practice;

public class newwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="3a&1bc#*2";
String alp="";
String Spe="";
String num=" ";
char[] ch=str.toCharArray();
for (int i = 0; i < ch.length; i++) {
	if(ch[i]>='A'&&ch[i]>='Z'||ch[i]>='a'&&ch[i]>='z'){
		
		
		// st = str.charAt(i);
System.out.print(ch[i]);
	}}
System.out.println();
for (int i = 0; i < ch.length; i++) {
	 if(ch[i]>='1'&&ch[i]<='9') {
		System.out.print(ch[i]);
	}}
System.out.println();

for (int i = 0; i < ch.length; i++) {
	if(ch[i]=='&'||ch[i]=='#'||ch[i]=='*')
		System.out.print(ch[i]);
	}
	}

}



