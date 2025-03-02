package Employes;

import java.util.ArrayList;
import java.util.List;

public class EmployeesService {
    private List<Employees> employeesList;

    public EmployeesService() {
        employeesList = new ArrayList<>();
    }
    public List<Employees> getAll(){
        return employeesList;
    }

    // Thêm nhân viên mới vào danh sách
    public void addEmployee(Employees emp) {
        employeesList.add(emp);
    }

    // Cập nhật thông tin nhân viên theo ID
    public boolean updateEmployee(Employees updatedEmp, int id) {
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).getId().equals(id)) {
                employeesList.set(i, updatedEmp);
                return true;
            }
        }
        return false;
    }

    // Xóa nhân viên theo ID
    public boolean deleteEmployee(int id) {
        return employeesList.removeIf(emp -> emp.getId().equals(id));
    }

    // Lấy danh sách tất cả nhân viên
    public List<Employees> getAllEmployees() {
        return employeesList;
    }
}
