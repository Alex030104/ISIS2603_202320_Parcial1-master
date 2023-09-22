package co.edu.uniandes.dse.parcial1.services;
import java.util.List;
import java.util.Optional;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcial1.entities.DinosaurioEntity;
import co.edu.uniandes.dse.parcial1.entities.CuidadorEntity;
import co.edu.uniandes.dse.parcial1.exceptions.EntityNotFoundException;
import co.edu.uniandes.dse.parcial1.exceptions.ErrorMessage;
import co.edu.uniandes.dse.parcial1.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcial1.repositories.DinosaurioRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DinosaurioServive {
    @Autowired
	DinosaurioRepository DinosaurioRepository;
	
	@Transactional
	public DinosaurioEntity createDinosaurio(DinosaurioEntity dinosaurio) throws IllegalArgumentException {
		log.info("Inicia proceso de creación del dinosaurio");
		Name name= Name.getlength(); 
		if (name.getlength() < 5 || name.getlength() > 15) {
            throw new IllegalArgumentException("El nombre debe tener más de 5 caracteres y menos de 15 caracteres.");;
	    }
		return DinosaurioRepository.save(dinosaurio);
	}
    /*log.info("Inicia proceso de creación del dinosaurio");
		if (!DinosaurioRepository.findByName(DinosaurioEntity.getName()).isEmpty()) {
	}*/
}
