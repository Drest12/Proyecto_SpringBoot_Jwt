package pe.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.company.entity.Role;
import pe.company.repository.RoleRepository;


@Service
public class RoleService implements IRoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> obtenerTodosRoles() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role buscarRolePorId(Integer idRole) {
        return roleRepository.findById(idRole).orElse(null);
    }
}