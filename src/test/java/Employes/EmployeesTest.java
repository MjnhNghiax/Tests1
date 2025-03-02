package Employes;

import SinhVien.SinhVien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeesTest {
    EmployeesService service;

    @BeforeEach
    public void setup(){
        service = new EmployeesService();
    }

    @Test
    public void testAddEm(){
        Employees em = new Employees(1, "Kieu", "Nghiax", "@gmail.com");
        service.addEmployee(em);
        Assertions.assertEquals(1,service.getAll().size());
    }

    @Test
    public void testUpdateEm(){
        Employees em = new Employees(1, "Kieu", "Nghiax", "@gmail.com");
        service.addEmployee(em);
        Employees em1 = new Employees(1, "Kieu", "Nghiax A", "@gmail.com");
        service.updateEmployee(em1, 1);
        Assertions.assertEquals(1, service.getAll().get(0).getId());

    }
    @Test
    public void deleteValid() {
        Employees em = new Employees(1, "Kieu", "Nghiax", "@gmail.com");
        service.addEmployee(em);
        int sizeBefore = service.getAll().size();
        service.deleteEmployee(1);
        int sizeAfter = service.getAll().size();
        Assertions.assertEquals(sizeBefore - 1, sizeAfter);
    }
}
