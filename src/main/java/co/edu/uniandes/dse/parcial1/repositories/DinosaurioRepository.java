package co.edu.uniandes.dse.parcial1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import co.edu.uniandes.dse.parcial1.entities.DinosaurioEntity;

@Repository
public interface DinosaurioRepository extends JpaRepository<DinosaurioEntity, Long> {
    List<DinosaurioEntity> findByName(String name);
    }
