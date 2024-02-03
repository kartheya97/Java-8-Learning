package customclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RetieveOnlyFileDirectories {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        List<Path> directoriesInProjectStructure =   Files.list(Paths.get("."))
        												  .filter(Files::isDirectory)
        												  .collect(Collectors.toList());
        System.out.println(directoriesInProjectStructure);
	}

}
