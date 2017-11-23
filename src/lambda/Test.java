package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		
		Person p1 = new Person(1, "小红", 3000.0);
		Person p2 = new Person(2, "小明", 6000.0);
		Person p3 = new Person(3, "小港", 5000.0);
		Person p4 = new Person(4, "小爷爷", 4000.0);
		
		List<Person> li=new ArrayList<Person>();
		
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		
		Predicate<Person> flag=p->p.getId()==4;
		
		System.out.println(flag.test(p4));
		List<Person> findMatchPerson = findMatchPerson(li, p->p.getId()==3);
		List<Person> fi = findMatchPerson(li, p->p.getId()==2);
		List<Person> fil=findMatchPerson(li,p->p.getPrice()>=4000.0);
		List<Person> fi2=findMatchPerson(li,p->p.getName().length()>=3);
		
		System.out.println(fi2);
		
		
	}
	
	
	public static List<Person> findMatchPerson(List<Person> li,Predicate<Person> flag) {
		
		List<Person> lis= new ArrayList<Person>();
		for (Person per : li) {
			if(flag.test(per)) {
				lis.add(per);
			}
			
		}
		return lis;
	}
		
}
