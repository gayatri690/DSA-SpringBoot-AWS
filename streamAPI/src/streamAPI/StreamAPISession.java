package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPISession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=List.of("kokan","kerala","karnataka","kashmir","manali","mumbai","Gujarat");
		
		List<String>lists=names.stream()
				.filter(name->name.startsWith("k"))
				.collect(Collectors.toList());
		
		System.out.println(lists);
		
		
		int []num= {1,2,3,4,5};
		Arrays.stream(num)
		.map(n->n*n)
		.forEach(n->System.out.println(n));
	}

}
