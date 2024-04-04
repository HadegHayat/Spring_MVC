package ma.emsi.hopital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@Entity

@Data @NoArgsConstructor @AllArgsConstructor @Builder

public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String nom ;
    private Date DateNaissance ;
    private boolean malade ;
    private int score ;

}
