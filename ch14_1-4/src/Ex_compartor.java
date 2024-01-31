import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex_compartor {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("""
    
    abc, aaa, bbb, ddd, aaa

    """);

        Collections.sort(list, (String s1, String s2) -> {
            return s2.compareTo(s1);
        });
    }
}


