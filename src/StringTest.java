
public class StringTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = StringPrint("Bye",2);
		System.out.print(message);
	}
	public static String StringPrint(String str, int n){
		String concat = "";
		String blank = "";
		if(n>0){
		for(int i=0;i<n;i++){
			concat+=str;
		}
		}
		else{
			return blank;
		}
		return concat;
	}
}

