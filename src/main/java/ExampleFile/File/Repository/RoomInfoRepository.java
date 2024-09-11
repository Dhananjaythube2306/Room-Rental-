package ExampleFile.File.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ExampleFile.File.Model.RoomInfo;

public interface RoomInfoRepository extends JpaRepository<RoomInfo, Long> {
}