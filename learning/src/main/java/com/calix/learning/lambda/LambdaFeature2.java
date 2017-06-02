import java.util.List;
import java.util.ArrayList;

public class LambdaFeature2 {
	
	public static void main(String[] args) {
		List<String> names = ArrayList<String>::new;
		names.add("calix");
		names.add("xiechao");

		names.forEach(System.out::println);
	}
}
