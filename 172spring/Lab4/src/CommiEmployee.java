public class CommiEmployee {
    String empFirLastName;
    String ID;
    String StreetAddr;
    String City;
    String State;
    String PhoneNum;
    double totalsalePWeek;
    double interest;
    double weekPay;
    public void CommiEmployee(String empFirLastName, String ID, String StreetAddr, String City, String State, String PhoneNum, double interest, double totalsalePWeek){
        this.empFirLastName = empFirLastName;
        this.ID = ID;
        this.StreetAddr = StreetAddr;
        this.City = City;
        this.State = State;
        this.PhoneNum = PhoneNum;
        this.totalsalePWeek = totalsalePWeek;
        this.interest = interest;
        this.weekPay = 0;
    }
    public void calcWeekPay(){
        weekPay = totalsalePWeek * interest;
    }

    public double getWeekPay() {
        return weekPay;
    }
}
