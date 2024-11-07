import java.util.Scanner;

public class HW_3_2 {

    public static void main(String[] args) {
    	String inputStr = "3\n4 78 95 83 89\n3 100 98 96\n5 65 72 85 79 91";
		Scanner keyboard = new Scanner(inputStr);
		
      	int numClasses = keyboard.nextInt();
		String dummy = keyboard.nextLine();
		int[][] StudentScore = {
			{0,0,0,0,0},
			{0,0,0,0},
			{0,0,0,0,0,0}
		};
		int max=0;
		for (int i = 0; i < numClasses; i++) {
			String all_Classes_Score = keyboard.nextLine();
			String[] Classes_Score = all_Classes_Score.split(" ");
			int sum=0;
			for (int j = 0 ; j < Classes_Score.length ;j++ ) {
				StudentScore[i][j] = Integer.parseInt(Classes_Score[j]);
				sum += StudentScore[i][j];
			}
			sum -= StudentScore[i][0];
			double average = (double)sum/StudentScore[i][0];
			int n=i+1;
			System.out.printf("Class "+ n +" average: %.2f\n", average);
			for (int j = 1 ; j < Classes_Score.length ;j++ ){
				if (max < StudentScore[i][j]) {
				max = StudentScore[i][j];
				}
		}
		}
		System.out.println("highest score: "+ max);

    }
  
}
