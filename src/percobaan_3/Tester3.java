package percobaan_3;

import percobaan_1.ElectricityBill;
import percobaan_1.Employee;
import percobaan_1.InternshipEmployee;
import percobaan_1.Payable;
import percobaan_1.PermanentEmployee;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e[] = { pEmp, iEmp };
        Payable p[] = { pEmp, eBill };
        Employee e2[] = { pEmp, iEmp, eBill };
    }
}
