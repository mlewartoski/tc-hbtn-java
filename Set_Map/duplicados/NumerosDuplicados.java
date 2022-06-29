import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] inteiros){
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : inteiros) {
            if (!hashSet.add(i)) {
                treeSet.add(i);
            }
        }
        return treeSet;
    }
}
