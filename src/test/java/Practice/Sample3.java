package Practice;

public class Sample3 {

	public static void main(String[] args) {
		String str="Iam from bangalore";
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++) {
			String stt=st[i];
			for (int j = stt.length()-1; j>=0; j--) {
				System.out.print(stt.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
