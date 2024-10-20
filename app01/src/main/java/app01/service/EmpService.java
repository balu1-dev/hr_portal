package app01.service;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import app01.Employee;
import app01.repository.EmpRepository;
@Service
public class EmpService {
	@Autowired
	private EmpRepository empRepository;
	public void getEmployee() {
//		Employee emp = new Employee();
//		emp.setEname("Ram");
//		emp.setEsal(1000.0);
//		
//		Example<Employee> of = Example.of(emp);
//		List<Employee> all = empRepository.findAll(of);
//		all.forEach(System.out :: println);
		
		empRepository.save(new Employee(110, "Balu", 7000.0));
	}
}