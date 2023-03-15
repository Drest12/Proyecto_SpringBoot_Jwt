package pe.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.company.entity.Usuario;
import pe.company.repository.UsuarioRepository;

import java.util.List;

/**
 * Clase que implementa los metodos de la interfaz {@link IUsuarioService} del
 * servicio para usuarios.
 */
@Service
public class UsuarioService implements IUsuarioService {

	/**
	 * Inyeccion para acceder a los metodos del repositorio
	 */
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> buscarTodosUsuarios() {
		return (List<Usuario>) usuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario buscarUsuarioPorId(Integer idUsuario) {
		return usuarioRepository.findById(idUsuario).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario buscarUsuarioPorUsername(String username) {
		return usuarioRepository.buscarUsuarioPorUsername(username).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario buscarUsuarioPorCorreo(String correo) {
		return usuarioRepository.buscarUsuarioPorCorreo(correo).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void guardarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	@Transactional(readOnly = false)
	public void eliminarUsuarioPorId(Integer idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}

} // fin de la implementacion de los servicios