package Practice;

public class Nnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name madhu";
	      String[] rr=str.split(" ");
	      for(int i=0;i<rr.length;i++){
	          if(i==0||i==1){
	              System.out.println(rr[i]);
	          }
	          else
	          {
	              String ss=rr[i];
	              String rev="";
	              for(int i1=ss.length();i1>=0;i1--){
	                  rev=rev+ss.charAt(i);
	              }
	              System.out.println(rev);
	          }
	      
	      }
	}

}
