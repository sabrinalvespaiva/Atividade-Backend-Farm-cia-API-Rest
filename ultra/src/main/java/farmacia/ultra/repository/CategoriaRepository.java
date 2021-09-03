package farmacia.ultra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import farmacia.ultra.model.Categoria;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List <Categoria> findAllByTipoContainingIgnoreCase (String tipo);
	
	public List <Categoria> findAllByDisponibilidadeContainingIgnoreCase (String disponibilidade);

}
