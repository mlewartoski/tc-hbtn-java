import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog(){
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<>();
        for(Post post:posts) {
           autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> map = new TreeMap<>();
        for(Post post:posts) {
            if (map.get(post.getCategoria()) == null) {
                map.put(post.getCategoria(),1);
            } else {
                int qtd = map.get(post.getCategoria());
                map.put(post.getCategoria(),qtd+1);
            }
        }
        return map;
    }
}
