package pe.company.service;

import java.util.List;

import pe.company.entity.Role;

public interface IRoleService {

    List<Role> obtenerTodosRoles();

    Role buscarRolePorId(Integer idRole);

} 