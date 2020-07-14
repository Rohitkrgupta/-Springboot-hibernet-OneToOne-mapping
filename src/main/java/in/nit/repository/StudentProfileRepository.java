package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.entity.StudentProfile;

@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile,Long> {

}
