package in.nit.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.entity.Gender;
import in.nit.entity.Student;
import in.nit.entity.StudentProfile;
import in.nit.repository.StudentProfileRepository;
import in.nit.repository.StudentRepository;

@Component
public class StudentDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentProfileRepository studentProfileRepository;
	
	@Override
	public void run(String... args) throws Exception {

      Student s = new Student();
      s.setName("ROHIT");
      s.setEmail("kumarrohit5744@gmail.com");
      
      
      StudentProfile sp = new StudentProfile();
      sp.setAddress("Hyderabad");
      sp.setDateOfBirth(LocalDate.of(1997, 10, 03));
      sp.setGender(Gender.MALE);
      sp.setPhoneNumber("9074846282");
      
      s.setStudentProfile(sp);
      sp.setStudent(s);
      
      studentRepository.save(s); 
	}
	
	

}
