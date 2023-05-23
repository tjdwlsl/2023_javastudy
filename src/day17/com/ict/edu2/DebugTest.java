package day17.com.ict.edu2;

import java.util.ArrayList; 
import java.util.List; 
public class DebugTest {
	       public static void main(String[] args) { 
	              List<Person> personList = new ArrayList<Person>();                                 
	              personList.add(new Person(10, "kim")); 
	              personList.add(new Person(20, "lee")); 
	              personList.add(new Person(30, "park")); 
	              
	              print(personList); 
	              
	       }
	       
	       
	       public static void print(List<Person> personList) { 
	              System.out.println("print start"); 
	              
	              for(Person person : personList) { 
	                     System.out.println(person); 
	              }
	       }
	       
	}
	 
	 
	class Person { 
	       private Integer age; 
	       private String name; 
	       
	       public Person(Integer age, String name) { 
	              this.age = age; 
	              this.name = name; 
	       }
	       
	       public Integer getAge() { 
	              return age; 
	       }
	       
	       public String getName() { 
	              return name; 
	       }
	       
	       @Override 
	       public String toString() { 
	              return "Person [age=" + age + ", name=" + name + "]"; 
	       }
	       
	}
	 
	