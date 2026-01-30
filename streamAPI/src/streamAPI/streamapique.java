package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class streamapique {

	//Find even numbers from a list
	public static void main(String args[]) {
	List<Integer> numlist=List.of(1,2,3,4,5,20,40);
	
	List<Integer> evenno=numlist.stream()
			.filter(n->n%2==0)
			.collect(Collectors.toList());
	System.out.println(evenno);
	
	//Find sum of all numbers
	int sum=numlist.stream().mapToInt(Integer::intValue).sum();
	
	System.out.println(sum);
	
	int sum1=numlist.stream().reduce(0,Integer::sum);
	
	//Find maximum number
	int maxnum=numlist.stream().max(Integer::compare).get();
	System.out.println(maxnum);
	
	//Count elements greater than 10
	System.out.println("Count elements greater than 10");
	long count=numlist.stream().filter(n->n>10).count();
	System.out.println(count);
	
	//Find strings starting with "A"
	List<String> ls=List.of("Awantika","anagha","akshay","astha","tina","mina","rina");
	List<String> Alist=ls.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
	System.out.println(Alist);
	
	//Convert list of strings to uppercase
	List<String> uplist=ls.stream().map(String::toUpperCase).toList();
	System.out.println(uplist);
	
	
	
	
	
}
}