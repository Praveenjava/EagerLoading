package in.praveenit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.praveenit.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}