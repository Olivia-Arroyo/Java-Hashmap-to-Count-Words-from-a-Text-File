import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountHashMap {
    public static void main(String[] args) throws Exception {
        Map<String,Integer> wordCount = new HashMap<String,Integer>();

        File file = new File("/Users/admin/IdeaProjects/wordcounthashmap/Assignment4TextFile.txt");
        Scanner doc = new Scanner(file).useDelimiter("[^a-zA-Z]+");

        while (doc.hasNext()){
            String word = doc.next().toLowerCase();
            Integer count = wordCount.get(word);
            if (count == null){
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, count + 1);
            }
        }

        System.out.println(wordCount);
    }
}
