package work;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) throws IOException {

			//创建集合
		List<Student> stuli = new ArrayList<>();
		//通过循环来更快捷的得到50名学生信息
		for(int i=1;i<=50;i++) {
			Student student = new Student(i++, "student"+i, 5*(int)(Math.random()*9)+60);
			stuli.add(student);
		}
		
		Map<Double, List<Student>> collect = stuli.stream().collect(Collectors.groupingBy(Student::getGrede));
		//迭代器对象信息一直出不来 有空再做
//		Iterator<Entry<Double, List<Student>>> it = collect.entrySet().iterator();
//		 while (it.hasNext()) {
//	           Entry<Double, List<Student>> entry = it.next();
//	           System.out.println(entry);
//	           System.out.println("分数为： " +entry.getKey() +"的有"+collect.get(entry.getKey()).size()+"人"+ "信息分别是：" + entry.getValue());
//	           Student next = entry.getValue().iterator().next();
//	           System.out.println(next);
//	      }
		//遍历集合并输出到控制台
		for (Map.Entry<Double, List<Student>> entry : collect.entrySet()) {
			System.out.println("===========================");
			System.out.println("分数为"+entry.getKey());
			for (Student student : entry.getValue()) {
				System.out.println("学生编号："+student.getSid()+",姓名："+student.getSname());
				System.out.println("---------------------------");
			}
			System.out.println("该成绩的总人数："+entry.getValue().size());
	
		}
		
     }

}


