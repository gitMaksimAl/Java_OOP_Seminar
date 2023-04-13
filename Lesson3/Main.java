package Lesson3;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShellter  abbyshellter = new CatShellter(List.of(
            new Cat("Murzik"),
            new Cat("Barsik"),
            new Cat("Tuman")
            )
        );

        Iterator<Cat> it = new CatIterator(abbyshellter.getCats());

        while (it.hasNext()) System.out.printf("%s\t", it.next());
    }
}
