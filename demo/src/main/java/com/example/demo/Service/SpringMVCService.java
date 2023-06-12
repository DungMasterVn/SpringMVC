package com.example.demo.Service;

import com.example.demo.Dto.SpringMVCDTO;
import com.example.demo.Entity.SpringMVCEntity;
import com.example.demo.Repository.SpringMVCRepository;
import jakarta.persistence.metamodel.IdentifiableType;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
@Builder
public class SpringMVCService {
    @Autowired
    public SpringMVCRepository springMVCRepository;

    //    public List<SpringMVCEntity> findAll() {
//        List<SpringMVCEntity> springMVCentityfindall = springMVCRepository.findAll();
//        return springMVCentityfindall;
//    }
    public List<SpringMVCDTO> showAllUser() {
        List<SpringMVCEntity> springmvcentities = springMVCRepository.findAll();
        return springmvcentities.stream().map((springmvcentity) -> maptoDTO(springmvcentity)).collect(Collectors.toList());
    }

    private SpringMVCDTO maptoDTO(SpringMVCEntity springmvcentity) {
        SpringMVCDTO springMVCDto = SpringMVCDTO.builder()
                .id(springmvcentity.getId())
                .name(springmvcentity.getName())
                .email(springmvcentity.getEmail())
                .build();
        return springMVCDto;
    }
}

