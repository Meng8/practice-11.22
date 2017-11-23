package Steam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) throws IOException {
		
		List<String> lines = Files.lines(Paths.get("a.txt"))
		  //转成流，并用空格切割开
	      .flatMap(Pattern.compile(" ")::splitAsStream)
	      //单词长度为8的
		  .filter(s->s.length()==4)
		  //所有字母大写
		  .map(String::toUpperCase)
		  //去除重复
		  .distinct()
		  //排序
		  .sorted()
		  //筛选结果转成List集合
		  .collect(Collectors.toList());
		System.out.println(lines);
		lines.forEach(System.out::println);
		
		String [] str= {"hello","word","man","nice"};
		List<Integer> inta= Arrays.asList(1,2,3,5,8,9,4,1);
		List<String> collect = Arrays.stream(str).collect(Collectors.toList());
		
		Integer [] ing=inta.stream().toArray(Integer[]::new);

		
		
		
		
		
		
		
		

	}

}
