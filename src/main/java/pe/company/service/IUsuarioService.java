package pe.company.service;

import java.util.List;

import pe.company.entity.Usuario;

/**
 * Permite envolver los metodos del la interfaz del repositorio que extiende
 * de {@link org.springframework.data.jpa.repository.JpaRepository} renombrando
 * estos metodos a unos mas comodos, ademas de no trabajar directamente sobre el
 * repositorio.
 */
public interface IUsuarioService {
	/**
     * Envuelve al metodo findAll de JpaRepository
     * el cual devuelve todos los registros de la tabla usuarios
     * @return List(Usuario)
     */
    List<Usuario> buscarTodosUsuarios();

    /**
     * Envuelve al metodo findById de JpaRepository
     * el cual retorna el registro buscado por su id.
     * @param idUsuario
     * @return Usuario
     */
    Usuario buscarUsuarioPorId(Integer idUsuario);

    /**
     * Envuelve el metodo de la consulta personalizada en el repositorio {@link com.auth.jwt.app.repository.UsuarioRepository}
     *buscarUsuarioPorUsername que retorna un registro de la BD por su username.
     * @param username
     * @return Usuario
     */
    Usuario buscarUsuarioPorUsername(String username);

    /**
     * Envuelve el metodo de la consulta personalizada en el repositorio {@link com.auth.jwt.app.repository.UsuarioRepository}
     * buscarUsuarioPorCorreo que retorna un registro de la BD por su correo.
     * @param correo
     * @return Usuario
     */
    Usuario buscarUsuarioPorCorreo(String correo);

    /**
     * Envuelve al metodo save de JpaRepository
     * que guarda en la BD al usuario que se pasa atraves del su parametro
     * @param usuario
     */
    void guardarUsuario(Usuario usuario);

    /**
     * Envuelve al metodo deleteById de JpaRepository
     * este elimina un registro de la BD por medio de su id.
     * @param idUsuario
     */
    void eliminarUsuarioPorId(Integer idUsuario);
}
