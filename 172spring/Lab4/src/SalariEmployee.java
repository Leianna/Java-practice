public class SalariEmployee {
    String empFirLastName;
    String ID;
    String StreetAddr;
    String City;
    String State;
    String PhoneNum;
    double yearlyWage;
    double weekPay;
    public void SalariEmployee(String empFirLastName, String ID, String StreetAddr, String City, String State, String PhoneNum, double yearlyWage){
        this.empFirLastName = empFirLastName;
        this.ID = ID;
        this.StreetAddr = StreetAddr;
        this.City = City;
        this.State = State;
        this.PhoneNum = PhoneNum;
        this.yearlyWage = yearlyWage;
        this.weekPay = 0;
    }
    public void calcWeekPay(){
        weekPay = (yearlyWage / 364)*7;
    }

    public double getWeekPay() {
        return weekPay;
    }
}
