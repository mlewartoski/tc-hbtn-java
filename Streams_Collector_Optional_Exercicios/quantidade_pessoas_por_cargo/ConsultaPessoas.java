import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){
        Map<String, Long> map = pessoas.stream().collect(
                Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.counting()));
        return map;
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        TreeMap<String, TreeSet<Pessoa>> map = pessoas.stream().collect(
                Collectors.groupingBy(Pessoa::getCargo,
                () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));
        return map;
    }
}
