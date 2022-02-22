/*
 * Calculate the cost per page and total cost
 * @author Lei Chen
 * @date 04/23/2019
 */
abstract class Printer {
    int numPage;
    double costPerPage;
    double totalCost;

    public Printer(int numPage){
        this.numPage = numPage;
        this.totalCost = 0;
        this.costPerPage = 0;
    }
    public abstract void determineCostPerPage();
    public abstract void determineTotalCost();

    public double getTotalCost(){
        return totalCost;
    }
    public double getCostPerPage(){
        return costPerPage;
    }

}
