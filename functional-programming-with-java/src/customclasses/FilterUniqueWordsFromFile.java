package customclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterUniqueWordsFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> uniqueWords =   Files.lines(Paths.get("TextFileWithDuplicateContent.txt"))
										  .map(string -> string.split(" "))
										  .flatMap(Arrays::stream)
										  .distinct()
										  .sorted(String.CASE_INSENSITIVE_ORDER)
										  .collect(Collectors.toList());
		System.out.println("Unique Words = "+uniqueWords);
	}

}
