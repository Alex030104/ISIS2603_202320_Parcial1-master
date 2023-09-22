package co.edu.uniandes.dse.parcial1.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class CuidadorEntity extends BaseEntity{
    enum ESPECIALIDAD  {
		CARNIVORO, HERBIVORO, INSECTIVORO
	}
    private String name;
    private int edad;
    private Long id;
    private ESPECIALIDAD tipo;
	
    @PodamExclude
	@OneToMany(mappedBy = "cuidador")
	private List<DinosaurioEntity> dinosaurios = new ArrayList<>();
}
