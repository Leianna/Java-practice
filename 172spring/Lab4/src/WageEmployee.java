public class WageEmployee {
    String empFirLastName;
    String ID;
    String StreetAddr;
    String City;
    String State;
    String PhoneNum;
    double hours;
    double wages;
    double weekPay;
    public void WageEmployee(String empFirLastName, String ID, String StreetAddr, String City, String State, String PhoneNum, double hours, double wages){
        this.empFirLastName = empFirLastName;
        this.ID = ID;
        this.StreetAddr = StreetAddr;
        this.City = City;
        this.State = State;
        this.PhoneNum = PhoneNum;
        this.hours = hours;
        this.wages = wages;
        this.weekPay = 0;
    }
    public void calcWeekPay(){
        if (hours > 40){
            weekPay = ((hours-(hours - 40)) * wages) + ((hours - 40) * wages *1.5);
        }
        else{
            weekPay = hours * wages;
        }
    }

    public double getWeekPay() {
        return weekPay;
    }
}
