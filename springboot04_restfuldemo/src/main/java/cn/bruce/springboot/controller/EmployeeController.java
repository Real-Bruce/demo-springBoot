package cn.bruce.springboot.controller;

import cn.bruce.springboot.dao.DepartmentDao;
import cn.bruce.springboot.dao.EmployeeDao;
import cn.bruce.springboot.entities.Department;
import cn.bruce.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collection;

/**
 * @author Bruce
 * @create 2020-10-26 17:15
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    /**
     * 查询全部员工信息，返回列表
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String getEmployees(Model model) {
        Collection<Employee> employees = employeeDao.getEmployees();

        // 放在请求作用域中
        model.addAttribute("emps", employees);
        // thymeleaf默认就会拼串
        // classpath:/templates/xxxx.html
        return "emp/list";
    }

    /**
     * 进入员工添加页面
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String toAddPage(Model model) {
        // 进入添加页面，查询所有的部门，在页面显示
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    /**
     * 员工添加
     * SpringMVC自动将请求参数和入参对象的属性进行一一绑定；
     * 要求请求参数的名字和javaBean入参的对象里面的属性名是一样的
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String addEmployee(Employee employee) {
        // 进入员工列表页面
        System.out.println("保存的员工信息为：" + employee);
        // 保存员工信息
        employeeDao.save(employee);
        // redirect: 表示重定向到一个地址  /代表当前项目路径
        // forward: 表示转发到一个地址
        return "redirect:/emps";
    }

    /**
     * 进入修改页面，查出当前员工信息，并在页面中显示
     * @param id 用户id
     * @param model
     * @return
     */
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("emp", employee);

        // 页面需要显示的所有的部门列表
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        // 回到修改页面（add是修改和添加二合一的页面）
        return "emp/add";
    }

    /**
     * 员工信息修改，需要通过员工id查询
     * @param employee
     * @return
     */
    @PutMapping("/emp")
    public String updateEmployee(Employee employee) {
        System.out.println("修改的员工数据：" + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 员工删除操作
     * @param id
     * @return
     */
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
