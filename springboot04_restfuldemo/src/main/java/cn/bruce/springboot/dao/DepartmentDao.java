package cn.bruce.springboot.dao;

import cn.bruce.springboot.entities.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruce
 * @create 2020-10-23 13:44
 */
@Repository
public class DepartmentDao {

    private static Map<Integer, Department> departmentMap = null;

    static {
        departmentMap = new HashMap<Integer, Department>();

        departmentMap.put(101, new Department(101, "D-AAA"));
        departmentMap.put(102, new Department(102, "D-BBB"));
        departmentMap.put(103, new Department(103, "D-CCC"));
        departmentMap.put(104, new Department(104, "D-DDD"));
        departmentMap.put(105, new Department(105, "D-EEE"));
        departmentMap.put(106, new Department(106, "D-FFF"));
        departmentMap.put(107, new Department(107, "D-GGG"));
    }

    public Collection<Department> getDepartments() {
        return departmentMap.values();
    }

    public Department getDepartment(Integer id) {
        return departmentMap.get(id);
    }

}
