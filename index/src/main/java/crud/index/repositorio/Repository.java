package crud.index.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import crud.index.modelos.Usuario;

public interface Repository extends JpaRepository<Usuario, Integer> {

    @Query (value = "{call lista_procedure ()}", nativeQuery = true)
    List<Usuario> lista_procedure ();

}
