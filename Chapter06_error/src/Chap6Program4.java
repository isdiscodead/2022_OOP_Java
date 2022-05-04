
public class Chap6Program4 {

	// main 메소드의 args는 Run - Run Configurations - Arguments에서 적용 가능 
	// 이 args는 무조건 String으로 들어옴 -> 연산 필요시 parse 
	// 타입이 String[]으로 되어있는 이유는 system 상에서 커맨드 라인으로 input 받기 위함 
	
	// 디렉토리 옮긴 후 java 파일명 매개변수 명령어로 cmd에서 실행 가능 ... 
	
	public static void main(String[] args) {
		
		int[] inputNum = new int[args.length];
		int sum = 0;
		
		for ( int i=0 ; i < args.length ; i++ ) {
			inputNum[i] = Integer.parseInt(args[i]);
			sum += inputNum[i];
		}
		
		System.out.println("Sum of all input values: " + sum);

	}

}
