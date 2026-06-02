package ma.connection;



import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //     Article article = Article.builder()
        //             .code(100)
        //             .designation("CAFE AU LAIT")
        //             .prix(18)
        //             .build();
        //     ArticleImp dao = new ArticleImp();
        // if(dao.create(article))
        //     System.out.println("article has been created with success.");
        // else
        //     System.out.println("article has been created with failed.");
        //
        // List<Article> articles = dao.findAll();
        // for(Article art : articles)
        //     System.out.println(art);
// Search By id
        ArticleImp dao = new ArticleImp();
        Article article = dao.findById(10);
        if(article!=null){
            System.out.println("Found : "+article);
        }
        else {
            System.out.println("No article found");
        }
    }
}