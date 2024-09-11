package ExampleFile.File.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ExampleFile.File.Model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
