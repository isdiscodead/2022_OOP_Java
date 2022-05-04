import java.util.Formatter;

public class Chap4Program4 {

	public static void main(String[] args) {
		Formatter formatter = new Formatter(System.out);
		formatter.format("%6.3f", 2.333333); // 줄바꿈 X 
		
		Formatter formatter2 = new Formatter(); // System.out 안넣어주면 직접 출력해야 함 !! 
		System.out.println(formatter2.format("%6.3f", 2.333333));
		formatter2.close();
	}

}
