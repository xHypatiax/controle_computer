package ma.xproce.ds_graphql.mapper;

import ma.xproce.ds_graphql.dao.entities.Computer;
import ma.xproce.ds_graphql.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDTO computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public ComputerDTO fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDTO.class);
    }
}
