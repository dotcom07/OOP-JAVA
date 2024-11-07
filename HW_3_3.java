public class HW_3_3 {

    public static void main(String[] args) {
    	String[] inputs = {
          		"8 3 2 5 4 7 1 6 9",
          		"1 2 3 4 5 4 3 2 1",
          		"5 5 5 5 5 5 5 5 5",
          		"1 2 1 2 1 2 1 2 1",
				"9 8 7 6 5 4 3 2 1"
          };
      
      	for (int i=0; i < inputs.length; i++) {
			String[] lines = inputs[i].split(" ");
			int[] line= new int[lines.length];
			int count = 0;
			for (int j=0;j<lines.length;j++) {	 
				line[j] = Integer.parseInt(lines[j]) ;
			}
			for (int n=1;n<lines.length-1;n++){
				if (line[n-1]<line[n] && line[n]>line[n+1]){
					count ++;
				}

			}
		System.out.printf("Input: %s the number of mountain elements: %d\n", inputs[i] ,count);
		}
	}
}
