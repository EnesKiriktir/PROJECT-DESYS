
public class Student {
	private int studentnumber,c1,c2,c3;
	private String name,surname;
	private double schooldiplomagrade;
	SingleLinkedList answers=new SingleLinkedList();
	Student(int studentnumber,String name,String surname,double schooldiplomagrade,int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8,int a9,
			int a10,int a11,int a12,int a13,int a14,int a15,int a16,int a17,int a18,int a19,int a20){
		this.studentnumber=studentnumber;
		this.name=name;
		this.surname=surname;
		this.schooldiplomagrade=schooldiplomagrade;
		answers.add(a1);answers.add(a2);answers.add(a3);answers.add(a4);answers.add(a5);answers.add(a6);answers.add(a7);answers.add(a8);answers.add(a9);
		answers.add(a10);answers.add(a11);answers.add(a12);answers.add(a13);answers.add(a14);answers.add(a15);answers.add(a16);answers.add(a17);answers.add(a18);answers.add(a19);answers.add(a20);
	}
	public int getStudentnumber() {
		return studentnumber;
	}
	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
	}
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public int getC2() {
		return c2;
	}
	public void setC2(int c2) {
		this.c2 = c2;
	}
	public int getC3() {
		return c3;
	}
	public void setC3(int c3) {
		this.c3 = c3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getSchooldiplomagrade() {
		return schooldiplomagrade;
	}
	public void setSchooldiplomagrade(double schooldiplomagrade) {
		this.schooldiplomagrade = schooldiplomagrade;
	}
	public SingleLinkedList getAnswers() {
		return answers;
	}
	public void setAnswers(SingleLinkedList answers) {
		this.answers = answers;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
