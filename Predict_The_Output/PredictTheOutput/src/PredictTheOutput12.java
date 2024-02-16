import java.util.List;
import java.util.stream.Collectors;

public class PredictTheOutput12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = List.of(1,2,3,4,5,6);
        List<Integer> result = list.stream().filter(number -> number %2 == 0)
        .collect(Collectors.toUnmodifiableList());
        result.add(10);
        
	}

}
