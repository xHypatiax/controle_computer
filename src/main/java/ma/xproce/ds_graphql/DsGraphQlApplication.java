package ma.xproce.ds_graphql;

import ma.xproce.ds_graphql.dao.entities.Computer;
import ma.xproce.ds_graphql.dto.ComputerDTO;
import ma.xproce.ds_graphql.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsGraphQlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return args -> {
            List<ComputerDTO> computers = List.of(
                    ComputerDTO.builder().proce("HP").ram("12 Go").hardDrive("1TB HDD").price(3500.0).macAdress("00:14:22:01:23:45").build(),
                    ComputerDTO.builder().proce("Dell").ram("8 Go").hardDrive("512GB SSD").price(3500.0).macAdress("00:14:22:01:23:46").build(),
                    ComputerDTO.builder().proce("Acer").ram("16 Go").hardDrive("1TB SSD").price(3500.0).macAdress("00:14:22:01:23:47").build(),
                    ComputerDTO.builder().proce("Apple").ram("16 Go").hardDrive("512GB SSD").price(3500.0).macAdress("00:14:22:01:23:48").build()
            );

            computers.forEach(computerService::saveComputer);
        };

    }
}





