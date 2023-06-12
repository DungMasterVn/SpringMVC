package com.example.demo.Repository;

import com.example.demo.Entity.SpringMVCEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SpringMVCRepository extends JpaRepository<SpringMVCEntity,Long> {
    Optional<SpringMVCEntity> findById(Long id);
    List<SpringMVCEntity> findAll();
}
