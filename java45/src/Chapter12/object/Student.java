package Chapter12.object;

import java.util.Objects;

public class Student {
	String name;
	int stdNum;
	
	Student(){}
	Student(String name, int stdNum){
		this.name = name;
		this.stdNum = stdNum;
	}
	@Override
	public int hashCode() {
		return this.stdNum;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if(this.stdNum != other.stdNum) {
			return false;
		}
		return true;
	}
}
