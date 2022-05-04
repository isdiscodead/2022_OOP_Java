
public class Chap1Mission1 {

	public static void main(String[] args) {
		// Integer.parseInt()는 main문 실행 시 들어오는 인자를 Int로 받아옴 
		// .java 파일 우클릭 후 Run Config -> Arguments에서 인자 추가 가능 !! 
		// 그냥 실행 시 인자 값이 없기 때문에 0번째 args가 없어 인덱스 오류 발생 
		int n = Integer.parseInt(args[0]);
        for (int i = -3*n/2; i <= n; i++) {
            for (int j = -3*n/2; j <= 3*n/2; j++) {

                // inside either diamond or two circles
                if ((Math.abs(i) + Math.abs(j) < n)
                    || ((-n/2-i) * (-n/2-i) + ( n/2-j) * ( n/2-j) <= n*n/2)
                    || ((-n/2-i) * (-n/2-i) + (-n/2-j) * (-n/2-j) <= n*n/2)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
	}

}
