package ma.xproce.ds_graphql.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDTO {
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
    private String macAdress;

}
