public class ScanOrder extends Printer{
    String saveDoc;

    /**
     * set initial value
     * @param numPage
     * @param saveDoc sve to what kind of document
     */
    public ScanOrder(int numPage, String saveDoc){
        super(numPage);
        this.saveDoc = saveDoc;
    }

    /**
     * calculate cost per page by save different document
     */
    public void determineCostPerPage(){
        if (saveDoc == "email"){
            costPerPage = 0.45;
        }
        else if (saveDoc == "DVD"){
            costPerPage =0.60;
        }
        else if (saveDoc == "USB"){
            costPerPage =0.90;
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
     * @return type document
     */
    public String getSaveDoc(){
        return saveDoc;
    }
}
