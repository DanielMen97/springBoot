package crud.index.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer Id;

    @Column
    @Getter
    @Setter
    private String Cedula;

    @Column
    @Getter
    @Setter
    private String Nombre;

    @Column
    @Getter
    @Setter
    private String Apellido;

    @Column
    @Getter
    @Setter
    private String Telefono;

    @Column
    @Getter
    @Setter
    private String Direccion;


}
