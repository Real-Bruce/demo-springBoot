package cn.bruce.springboot.dao;

import cn.bruce.springboot.entities.Department;
import cn.bruce.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruce
 * @create 2020-10-23 14:00
 */
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employeeMap = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employeeMap = new HashMap<Integer, Employee>();
        employeeMap.put(1007, new Employee(1007, "E-GGG", "ggg@gmail.com", 1, new Department(101, "D-AAA")));
        employeeMap.put(1006, new Employee(1006, "E-FFF", "fff@gmail.com", 1, new Department(102, "D-BBB")));
        employeeMap.put(1005, new Employee(1005, "E-EEE", "eee@gmail.com", 0, new Department(103, "D-CCC")));
        employeeMap.put(1004, new Employee(1004, "E-DDD", "ddd@gmail.com", 1, new Department(104, "D-DDD")));
        employeeMap.put(1003, new Employee(1003, "E-CCC", "ccc@gmail.com", 0, new Department(105, "D-EEE")));
        employeeMap.put(1002, new Employee(1002, "E-BBB", "bbb@gmail.com", 1, new Department(106, "D-FFF")));
        employeeMap.put(1001, new Employee(1001, "E-AAA", "aaa@gmail.com", 0, new Department(107, "D-GGG")));
    }

    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId ++);
        }

        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employeeMap.put(employee.getId(), employee);
    }

    /**
     * 查询全部员工
     * @return 全部员工
     */
    public Collection<Employee> getEmployees() {
        return employeeMap.values();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeMap.get(id);
    }

    public void delete(Integer id) {
        employeeMap.remove(id);
    }
}
