
public class StringBufferTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("dog");
		for(int i=0;i<10;i++){
			s.append("100");
			s.append("\n");
		}
		System.out.println(s);
	}

}
