
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<LiteracyDemographic> literacyDemographicList = readDemographicsFile("literacy.csv");

        literacyDemographicList.stream()
                .forEach(demographic -> System.out.println(demographic));
    }

    public static List<LiteracyDemographic> readDemographicsFile(String file) {
        List<LiteracyDemographic> returnList = new ArrayList<>();

        try {
            returnList = Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(lineParts -> lineParts.length >= 6)
                    .map(lineParts -> new LiteracyDemographic(lineParts[0].trim(), lineParts[1].trim(), lineParts[2].replace("(%)", "").trim(), lineParts[3].trim(), Integer.valueOf(lineParts[4]), Double.valueOf(lineParts[5])))
                    .sorted()
                    /* alternate
                    .sorted((t1, t2) -> {
                        if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                            return 1;
                        }
                        if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                            return -1;
                        }
                        return 0;
                    })
                    */
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return returnList;
    }
}
