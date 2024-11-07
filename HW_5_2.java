import java.util.*;

public class HW_5_2 {

	public static void main(String[] args) {
		// 5개의 수업을 미리 정의
		Classroom[] classrooms = {
		  new Classroom("Math", 1),
		  new Classroom("Science", 2),
		  new Classroom("History", 3),
		  new Classroom("Art", 4),
		  new Classroom("Music", 5)
		  };
		
		// 모든 수업이 완료될 때까지 반복
		while (!Classroom.allClassesCompleted()) {
		  int nextClassIndex = Classroom.getNextClass();  // 다음 진행할 수업을 랜덤하게 선택
		  classrooms[nextClassIndex].startClass();  // 선택된 수업 진행
		}
	  }
}

class Classroom {

	private String roomName;
	private int roomNum;
	static boolean[] classStatus = new boolean[5];
	static int classAmount=0;
	static int randomNumber;
	static Random random = new Random(42);
  
	Classroom() {}
  
	public Classroom(String roomName,int roomNum) {
	  this.roomName = roomName;
	  this.roomNum = roomNum;
	  }
  
	public String getName() {
	  return roomName;
	}
  
	public int getNum() {
	  return roomNum;
	}
  
	public static boolean allClassesCompleted() {
	  if (classAmount==5) {
		  return true;
	  }
	  else {
		  return false;
	  }
	}
  
	public static int getNextClass() {
	  randomNumber = random.nextInt(5);
	  return randomNumber;
	}
  
	public void startClass() {
	  if (classStatus[randomNumber] == true) {
	  }
	  else {
		  classStatus[randomNumber] = true;
		  classAmount++;
		  System.out.println("Classroom "+roomName+" is in session.");
	  }
	  }
  }
  