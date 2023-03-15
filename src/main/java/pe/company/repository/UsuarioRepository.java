package pe.company.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.company.entity.Usuario;


/**
 * Este repositorio extiende de {@link JpaRepository} que permite usar los metodos
 * para las operaciones basicas de un CRUD que se haran hacia la tabla de usuarios.
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
	 /**
     * Genera una consulta personalizada que permita obtener el registro de un
     * usuario atraves de su username.
     * @param username
     * @return Optional (usuario) o null
     */
	
	@Query("SELECT u FROM Usuario u WHERE u.username = ?1")
    Optional<Usuario> buscarUsuarioPorUsername(String username);
	/**
     * Genera una consulta personalizada que permita obtener el registro de un
     *usuario atraves de su correo.
     * @param correo
     * @return Optional
     */
	  @Query("SELECT u FROM Usuario u WHERE u.correo = ?1")
	    Optional<Usuario> buscarUsuarioPorCorreo(String correo);
}
