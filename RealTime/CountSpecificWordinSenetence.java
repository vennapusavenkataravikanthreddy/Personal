package RealTime;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class CountSpecificWordinSenetence {
	
	
	    public static void main(String[] args) {

	        String sentence = "India is my country. my country is india.";

	        // Normalize: remove punctuation and convert to lowercase
	        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase(); 

	        Map<String, Long> wordCount =  // Using Java Streams to count word occurrences
	                Arrays.stream(sentence.split("\\s+")) // Split sentence into words
	                      .collect(Collectors.groupingBy(word -> word, Collectors.counting()));// Group by word and count occurrences

	        System.out.println(wordCount);// Print the word count map
	    }
	}

//Output:{country=2, is=2, my=2, india=2}