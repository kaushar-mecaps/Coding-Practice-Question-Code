public class SalarySlipGenerator {
    public static void main(String[] args) {
        
        // Local Variable 
        String name = "Kaushar Ali";
        int basicSalary = 20000;
        float hra = 2500.50f;
        double pf = 1200.75;

        // Total Salary Calculate
        double totalSalary = (basicSalary + hra) - pf;

        // Final Print All Salary Slip
        System.out.println("Employ Name = " + name);
        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Hra = " + hra);
        System.out.println("Pf = " +pf);
        System.out.println("Total Salary = " +totalSalary);
    }
}
