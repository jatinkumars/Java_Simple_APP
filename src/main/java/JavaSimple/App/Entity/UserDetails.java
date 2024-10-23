package JavaSimple.App.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "userdetails")
public class UserDetails {

    @Id
    //  @GeneratedValue(strategy = GenerationType.AUTO)  not incrementing as mentioned in doc.
    private Long id;
    private String username;
    private String hometown;
    private String country;


}
