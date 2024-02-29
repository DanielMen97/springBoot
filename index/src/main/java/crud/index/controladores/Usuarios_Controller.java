package crud.index.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import crud.index.modelos.Usuario;
import crud.index.repositorio.Repository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Usuarios_Controller {

    @Autowired
    private Repository repo;

    @GetMapping("")
    public String inicio() {
        return "Conectado";
    }

    @GetMapping("/users")
    public List<Usuario> getusuarios() {
        return repo.findAll();
    }

    @PostMapping("/creauser")
    public String creauser(@RequestBody Usuario us) {
        repo.save(us);
        return "usuario guardado";
    }

    @PutMapping("/edit/{id}")
    public String actualizarPersona(@PathVariable Integer id, @RequestBody Usuario us) {
        Usuario actualizaUsuario = repo.findById(id).get();
        actualizaUsuario.setNombre(us.getNombre());
        actualizaUsuario.setApellido(us.getApellido());
        actualizaUsuario.setCedula(us.getCedula());
        actualizaUsuario.setTelefono(us.getTelefono());
        actualizaUsuario.setDireccion(us.getDireccion());
        repo.save(actualizaUsuario);
        return "Usuario Actualizado";
    }

    @DeleteMapping("delete/{id}")
    public String eliminar (@PathVariable Integer id) {
        Usuario borraus = repo.findById(id).get();
        repo.delete(borraus);
        return "Usuario Eliminado";


    }

}
