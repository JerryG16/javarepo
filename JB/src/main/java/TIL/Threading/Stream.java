package TIL.Threading;
import java.util.*;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String arg[])
	{
		/*ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("A");
		nameList.add("B");
		nameList.add("C");*/
		
		List<String> nameList = Arrays.asList(new String[] {"B","A","C","D","E","F"});
		//nameList.stream().sorted().forEach(System.out::println);
		List<String> filteredwithMappedList = nameList.stream()
														.filter((x)->!x.equals("D"))
														.map((y)->y+"AA")
														.collect(Collectors.toList());
		
		System.out.println(nameList);
		System.out.println(filteredwithMappedList);
		
	}
}
