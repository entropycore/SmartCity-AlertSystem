package ma.connection;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleImp implements CRUD<Article,Integer>{
    @Override
    public boolean create(Article art) {
        Connection MyCon = DBConnection.getInstance().getConnection();
        String requete = "INSERT INTO article VALUES (?,?,?)";
        try {
            PreparedStatement pst=MyCon.prepareStatement(requete);
            pst.setInt(1,art.getCode());
            pst.setString(2,art.getDesignation());
            pst.setFloat(3,art.getPrix());
            return pst.executeUpdate()>0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return  false;
    }

    @Override
    public boolean deletebyId(Integer id) {
        Connection MyCon = DBConnection.getInstance().getConnection();
        String requete = "DELETE FROM article WHERE code = ?";  // ✅ SQL corrigé aussi ("dele" → "DELETE")
        try {
            PreparedStatement pst = MyCon.prepareStatement(requete);
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;  // ✅ Exécution réelle → peut lancer SQLException
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean dlete(Article object) {
        return false;
    }

    @Override
    public List<Article> findAll() {
        Connection MyCon = DBConnection.getInstance().getConnection();
        String requete = "SELECT * FROM article";
        List<Article> articles = new ArrayList<>();
        ResultSet rs = null;
        Statement st = null;
        try
        {
            st = MyCon.createStatement();
            rs=st.executeQuery(requete);
            while(rs.next())
            {
                Article art= new Article();
                art.setCode(rs.getInt("code"));
                art.setDesignation(rs.getString(2));
                art.setPrix(rs.getFloat("prix"));
                articles.add(art);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return articles;
    }
    @Override
    public Article findById(Integer id) {
        Connection MyCon = DBConnection.getInstance().getConnection();
        String requete = "select * from article where code = ?";
        Article article = new Article();
        ResultSet rs = null;
        PreparedStatement pst = null;
        try{
            pst=MyCon.prepareStatement(requete);
            pst.setInt(1,id);
            rs=pst.executeQuery();
            while(rs.next())
            {
                article.setCode(rs.getInt("code"));
                article.setDesignation(rs.getString(2));
                article.setPrix(rs.getFloat("prix"));
                return article;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }


}
