import java.util.List;

public class EmpioyeeDB {
    List<Employee> db;

    public EmpioyeeDB(List<Employee> db) {
        this.db = db;
    }

    public void saveEmployee(Employee employee) {
        db.add(employee);
// Сохранение данных сотрудника в базу данных
    }
}
