package ma.connection;



import java.util.List;
// T pour type de l'Entité
// PK type de l'identifiant de l'entité  T
public interface CRUD<T,PK> {
    boolean create(T object);
    boolean deletebyId(PK id);
    boolean dlete(T object);
    // void update(T object);
    // void delete(T object);


    T findById(PK id);
    List<T> findAll();
}