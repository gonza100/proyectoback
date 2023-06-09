package com.portfolio.mar.repository;

import com.portfolio.mar.entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByTituloEd(String tituloEd);
    public boolean existsByTituloEd(String tituloEd);
}