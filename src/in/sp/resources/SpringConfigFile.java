package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean("stObj1")
	public Student stdId1() {
		Student std = new Student();
		
		std.setName("Nadeem");
		std.setEmail("Nadeem@nadeem.com");
		std.setRollno(111);
		
		return std;
	}
}