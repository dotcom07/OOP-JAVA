public class HW_4_1 {

	public static void main(String[] args) {
        // 다섯 개의 좌표 객체를 배열로 생성
		// Point 1: (1, 2) Point 2: (3, 4) Point 3: (5, 6) Point 4: (1, 2) Point 5: (7, 8)
        Point[] points = new Point[5];
        points[0] = new Point(1, 2);
		points[1] = new Point(3, 4);
		points[2] = new Point(5, 6);
		points[3] = new Point(1, 2);
		points[4] = new Point(7, 8);
		for (int i = 0; i < points.length ; i++){
			System.out.println("Point "+(i+1)+": " + points[i].toString());
		}
		Comparing(points);
    }

    public static void Comparing(Point[] p) {
		for (int i = 0; i < p.length ; i++){
			for (int j = i+1 ; j < p.length ; j++) {
				if( p[i].equals(p[j]) ) {
					System.out.println("Comparing Point "+ (i+1) + " and Point " + (j+1) + ": Equal");
				}
				else {
					System.out.println("Comparing Point "+ (i+1) + " and Point " + (j+1) + ": Not Equal");
				}
			}
		}
	
	}
}

class Point {
	int x = 0;
	int y = 0;
  
	public Point(int x, int y) {
	  this.x = x;
	  this.y = y;
	}
  
	public boolean equals(Point other) {
	  if (this == other) {
		  return true;
	  }
	  return x == other.x && y== other.y;
	}  
  
	public String toString() {
	  return "(" + x +", " + y + ")";
	}
  }
  