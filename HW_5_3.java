public class HW_5_3 {

	public static void main(String[] args) {
		// Original Student object creation
		int[] grades = {85, 90, 78};
		Address originalAddress = new Address("123 Main St", "New York");
		Student originalStudent = new Student("Alice", grades, originalAddress);
		
		// Student object copy
		Student copiedStudent = new Student(originalStudent);
		
		// Output the original and copied Student objects
		System.out.println("Original Student: " + originalStudent);
		System.out.println("Copied Student: " + copiedStudent);
		
		// Modifying copied student's data
		System.out.println("Modifying copied student's data");
		copiedStudent.setAddress("456 Elm St", "Los Angeles");
		copiedStudent.setGrade(1, 76);
		copiedStudent.setGrade(2, 45);
		
		// Output again
		System.out.println("Original Student: " + originalStudent);
		System.out.println("Copied Student: " + copiedStudent);
	  }
}

class Address {
	private String street;
	private String city;
	Address() {}
  
	public Address(String street, String city){
	  this.street = street;
	  this.city = city;
	}
  
  
	public Address deepcopy(Address address) {
	  return new Address(address.street, address.city);
	}
  
	public String getStreet() {
	  return street;
	}
  
	public String getCity() {
	  return city;
	}
  
	public void setAddress(String street, String city) {
	  this.street = street;
	  this.city = city;
	}
  
  }
  
  class Student {
	private String name;
	private int[] grades;
	private Address address;
  
	Student() {}
  
	public Student(String name, int[] grades, Address address) {
	  this.name = name;
	  this.grades = grades;
	  this.address = address;
	}
  
	public Student(Student student) {
	  this.name = student.name;
  
	  this.grades = new int[student.grades.length]; 
	  for (int i = 0; i < student.grades.length; i++) {
		this.grades[i] = student.grades[i];
	  }
	  
	  this.address = student.address.deepcopy(student.address);
	}
  
	public void setGrade(int inedex, int score) {
	  this.grades[inedex]=score;
	}
  
	public void setAddress(String street, String city) {
	  address.setAddress(street,city);
	}
  
	@Override
	public String toString() {
		return  ("Name = "+this.name+", Grades = "+ "["+ this.grades[0] + ", " + this.grades[1] + ", " + this.grades[2] + "]" + 
		", Address = "+this.address.getStreet()+ ", "+this.address.getCity());
	}
  }
  