package pe.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.company.entity.Role;
/**
 * Este repositorio extiende de {@link JpaRepository} que permite usar los metodos
 * para las operaciones basicas de un CRUD que se haran hacia la tabla de roles.
 */
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
