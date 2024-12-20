package ma.xproce.ds_graphql.service;

import ma.xproce.ds_graphql.dao.entities.Computer;
import ma.xproce.ds_graphql.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {

    public ComputerDTO saveComputer(ComputerDTO computerDto);

    public List<ComputerDTO> getComputerByProce(String proce);



}