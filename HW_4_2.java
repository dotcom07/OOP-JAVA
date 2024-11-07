public class HW_4_2 {

	public static void main(String[] args) {
        // 첫 번째 학생 생성 - 이름과 ID를 사용하는 생성자
        Student student1 = new Student("John", 1234);
		Subject st1_1 = new Subject("Math",95);
		Subject st1_2 = new Subject("English",85);
		Subject st1_3 = new Subject("Science",90);
		student1.addSubject(st1_1 ,st1_2, st1_3);
		student1.delSubject("Science");

		Student student2 = new Student();
		Subject st2_1 = new Subject("History",80);
		Subject st2_2 = new Subject("Geography",88);
		student2.addSubject(st2_1 ,st2_2);
		student2.delSubject("History");
    }
}


class Student {
	private String name;
    private int id=0;
	private int Subject_n =0;
	private Subject sub[];

	public Student() {
		this("Alice", 5678);
		sub = new Subject[10];
	}
	public Student(String name, int id) {
		this.name=name;
		this.id=id;
		sub = new Subject[10];
	}

	public String get_name(){
		return name;
	}

	public int get_id(){
		return id;
	}


	public void addSubject(Subject... subjects) {
		System.out.println("Adding subjects for Student: "+name+ ", ID: "+ id);
		for (Subject one_subject : subjects) {
			sub[Subject_n++] = one_subject;
			System.out.println(this);
			for (int i = 0; i < Subject_n - 1; i++) {
				for (int j = i + 1; j < Subject_n; j++) {
					if (sub[i].getScore() < sub[j].getScore()) {
						Subject dummy;
						dummy = sub[i];
						sub[i] =sub[j];
						sub[j] = dummy;
					}
				}
		}
		for (int i=0; i<=Subject_n-1;i++ ){
			System.out.println(sub[i].toString());
		}
		System.out.println();
		
	}
	}

	public void delSubject(String subject) {
		System.out.println("Deleting subject: "+ subject);
		System.out.println(this);
		for (int i = 0; i < Subject_n; i++) {
			if ( subject.equals( sub[i].getSubject() ) && (i == Subject_n - 1) ) {
				sub[Subject_n - 1] = null ;
				Subject_n--;
				break;
			}
			else if (subject.equals( sub[i].getSubject() )) {
				for (int j = i; j < Subject_n - 1; j++) {
					sub[j]=sub[j+1];
				}
				sub[Subject_n - 1] = null ;
				Subject_n--;
				break;
			}
		}

		for (int i=0; i<=Subject_n-1;i++ ){
			System.out.println(sub[i].toString());
		}
		System.out.println();
	}

	public String toString() {
			String st = "Student: "+ name + ", ID: "+id+"\nSubjects:";
			return st;
	}

}

class Subject {
	private String subject; 
    private int score;

	public Subject(String  subject, int score) {
        this.subject =  subject;
        this.score = score;

    }

	public String getSubject() { 
		return subject; 
	}

    public int getScore() { 
		return score; 
	}

	public String toString() {
        return subject + ": " + score;
    }
}