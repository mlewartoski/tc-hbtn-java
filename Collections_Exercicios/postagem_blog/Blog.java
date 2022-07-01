import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog(){
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        if (this.posts.contains(post)){
            throw new IllegalArgumentException("Postagem jah existente");
        }
        this.posts.add(post);
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<>();
        for(Post post:posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> map = new TreeMap<>();
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

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postagens = new TreeSet<>();
        for(Post post:posts){
            if (post.getAutor().equals(autor)) {
                postagens.add(post);
            }
        }
        return postagens;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> postagens = new TreeSet<>();
        for(Post post:posts){
            if (post.getCategoria().equals(categoria)) {
                postagens.add(post);
            }
        }
        return postagens;
    }

    public  Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> postagens = new TreeMap<>();
        for(Post post:posts){
            postagens.put(post.getAutor(), this.obterPostsPorAutor(post.getAutor()));
        }
        return postagens;
    }

    public  Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> postagens = new TreeMap<>();
        for(Post post:posts){
            postagens.put(post.getCategoria(), this.obterPostsPorCategoria(post.getCategoria()));
        }
        return postagens;
    }
}
