package co.edu.uniandes.dse.parcial1.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class DinosaurioEntity extends BaseEntity{
    enum ALIMENTACION {
		CARNIVORO, HERBIVORO, INSECTIVORO
	}
    private String name;
    private String especie;
    private Long id;
	private ALIMENTACION tipo;

    @PodamExclude
    @OneToMany(mappedBy = "dinosaurio")
	private List<CuidadorEntity> cuidadores = new ArrayList<>();
}
