package factoryPartten;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class factory {
	public static void main(String[] args) {
		Student s = new Student();
		
		
		
	}
	
	public List<String> languge(Student[] a){
		List<String> stuList = new CopyOnWriteArrayList<>();
		for (Student student : a) {
			if(student.getLang() == "Eng"||student.getGenderr()=="Female");
			stuList.add(student.getName());
			if(stuList.size()==5) break;
		}
		
		return stuList;
	}
	
}
class Student{
	private String genderr;
	private String lang;
	private String name;
	public String getGenderr() {
		return genderr;
	}
	public void setGenderr(String genderr) {
		this.genderr = genderr;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}