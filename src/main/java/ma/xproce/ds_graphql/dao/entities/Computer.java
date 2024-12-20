package ma.xproce.ds_graphql.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "Computer")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
    private String macAdress;
}

