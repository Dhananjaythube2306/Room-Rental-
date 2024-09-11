package ExampleFile.File.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ExampleFile.File.Model.Owner;

public interface OwnRepository extends JpaRepository<Owner,Long> {
	Owner findByEmail(String email);
}
