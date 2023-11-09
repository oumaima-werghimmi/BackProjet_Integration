package projet.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projet.integration.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
