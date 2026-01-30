package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEmp {

	public static void main(String[] args) {
		List<employee> emp=new ArrayList<>();
		List<String> ITskills= List.of("java","spring","sql");
		List<String> HRskills=List.of("comm","recruit");
		emp.add(new employee(1,"Mina",90000.0,"IT",5.5,ITskills));
		emp.add(new employee(1,"Tina",90000.0,"comp",5.5,ITskills));
		emp.add(new employee(1,"Rina",90000.0,"civil",5.5,ITskills));
		emp.add(new employee(1,"Vina",90000.0,"agri",5.5,HRskills));
		emp.add(new employee(1,"Lina",90000.0,"IT",5.5,HRskills));
		emp.add(new employee(1,"Hina",90000.0,"IT",5.5,HRskills));
		
		//System.out.println(emp);
		
		emp.stream()
		.filter(e1->e1.getDept().equals("IT"))
		.forEach(e1-> System.out.println(e1.getName()+" "+e1.getDept()));
		
		
		Map<String,Double> avgSalary=emp.stream()
				.collect(Collectors.groupingBy(
						employee::getDept,
						Collectors.averagingDouble(employee::getSalary)));
				        //.forEach((dept,avg) -> System.out.println(dept+" : "+avg));
		
		avgSalary.forEach((dept,avg)-> System.out.println(dept+ ": "+avg));
		
		
		Map<String, List<employee>> empmap=emp.stream()
				.collect(Collectors.groupingBy(e->e.getExp()>=6? "Senior": "Junior"));
		
//		System.out.println("Emp by exp:");
//		empmap.forEach((exp,emplist)-> System.out.println("exp : "+exp);
//		emplist.forEach);
		
		List<List<String>> skills=emp.stream()
		.map(employee::getSkills)
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("allskills" +skills);
		
		
		//List<String> flatskills
		
	}
}
