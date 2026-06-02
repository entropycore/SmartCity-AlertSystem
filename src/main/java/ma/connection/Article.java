package ma.connection;


import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Article {
    private Integer code;
    private String designation ;
    private float prix;

}
