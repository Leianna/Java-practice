public class Test {
    public static void main(String[] args) {
        WageEmployee employee1 = new WageEmployee();
        employee1.WageEmployee("Lei","2018","ABC","NY","NY","123",40,20);
        employee1.calcWeekPay();
        System.out.println("Should be 800: " + employee1.getWeekPay());

        employee1.WageEmployee("Lei","2018","ABC","NY","NY","123",50,20);
        employee1.calcWeekPay();
        System.out.println("Should be 1100: " + employee1.getWeekPay());

        SalariEmployee employee2 = new SalariEmployee();
        employee2.SalariEmployee("Lei","2018","ABC","NY","NY","123", 52000);
        employee2.calcWeekPay();
        System.out.println("Should be 1000: " + employee2.getWeekPay());

        CommiEmployee employee3 = new CommiEmployee();
        employee3.CommiEmployee("Lei","2018","ABC","NY","NY","123", 0.10,28000);
        employee3.calcWeekPay();
        System.out.println("Should be 2800: " + employee3.getWeekPay());
    }
}
