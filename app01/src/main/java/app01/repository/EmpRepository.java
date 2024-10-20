package app01.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import app01.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	@Query(value = "From Employee where eid = :id")
	public List<Employee> getAllEmps(@Param("id") Integer id);
}