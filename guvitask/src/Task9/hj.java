package Task9;

public class hj {
	
	public static void main(String[] args) {
		
		
		StringBuffer s1 = new StringBuffer("Complete");
		s1.setCharAt(1,'i');
		s1.setCharAt(7,'d');
		System.out.println(s1);
		
		if(true){
			System.out.println("If condition true");
			}
		
		int a = 5;
		int b = 10;
		if(a>b && a<b){
			System.out.println("A greater than B OR A less than B");
			}else{
			System.out.println("Valid Condition");
	}
		
		int arr[][] = new int[3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		int sum = 0;
		for (int i = 0; i < 3; ++i)
		for (int j = 0; j < i + 1; ++j)
		arr[i][j] = j + 1;
		for (int i = 0; i < 3; ++i)
		for (int j = 0; j < i + 1; ++j)
		sum += arr[i][j];
		System.out.print(sum);
		
//		int values[] = {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0;i<=values; ++i)
//			System.out.println(values[i]);
//		
		int count = 1;
		while (count <= 15) {
		System.out.println(count % 2 == 1 ? "***" : "+++++");
		++count;
		}
		
		
		int i = 1, j = 10;
		do
		{ if(i > j)
		{
		break;
		}
		j--;
		} while (++i < 5);
		System.out.println("i = " + i + " and j = " + j);

}}
