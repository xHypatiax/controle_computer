package ma.xproce.ds_graphql.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import ma.xproce.ds_graphql.dao.entities.Computer;
import ma.xproce.ds_graphql.dao.repositories.ComputerRepository;
import ma.xproce.ds_graphql.dto.ComputerDTO;
import ma.xproce.ds_graphql.mapper.ComputerMapper;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return computerDto;

    }


    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }



}