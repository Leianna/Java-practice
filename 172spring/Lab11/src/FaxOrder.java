public class FaxOrder extends Printer{
    String destination;
    String isDouble;

    /**
     * set initial value
     * @param isDouble
     * @param destination
     * @param numPage
     */
    public FaxOrder(String isDouble, String destination, int numPage){
        super(numPage);
        this.isDouble = isDouble;
        this.destination = destination;
    }

    /**
     * calculate the total cost by determine if it's one or more page and destination
     */
    public void determineCostPerPage(){
        if (isDouble == "single"){
            if (destination == "local"){
                costPerPage = 1.5;
            }
            else if (destination == "international"){
                costPerPage =3.5;
            }
            else if (destination == "longDistance"){
                costPerPage =2.0;
            }
        }
        else{
            if (destination == "local"){
                costPerPage = 1.10;
            }
            else if (destination == "international"){
                costPerPage =2.50;
            }
            else if (destination == "longDistance"){
                costPerPage =1.50;
            }
        }

    }

    /**
     * calculate the total cost
     */
    public void determineTotalCost(){
        totalCost = costPerPage * numPage;
    }

    /**
     *
     * @return destination
     */
    public String getDestination(){
        return destination;
    }
}
