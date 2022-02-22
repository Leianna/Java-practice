public class PrintOrder extends Printer{
    String color;
    String typePaper;
    String isDouble;

    /**
     * set initial value
     * @param color for the paper
     * @param typePaper
     * @param isDouble
     * @param numPage how many paper
     */
    public PrintOrder(String color, String typePaper,String isDouble, int numPage){
        super(numPage);
        this.isDouble = isDouble;
        this.color = color;
        this.typePaper = typePaper;
    }

    /**
     * calculating the cost per page
     */
    public void determineCostPerPage(){
        if (color == "grayscale"){
            costPerPage = 0.10;
        }
        else if (color == "P1"){
            costPerPage = 0.30;
        }
        else if (color == "P2"){
            costPerPage = 0.45;
        }
        else if (color == "P3"){
            costPerPage = 0.65;
        }

        if (typePaper == "Matte" && isDouble == "Both"){
            costPerPage = costPerPage + (0.05/2);
        }
        else if (typePaper == "Matte" && isDouble == "One"){
            costPerPage = costPerPage + 0.05;
        }
        else if (typePaper == "Glossy" && isDouble=="Both"){
            costPerPage = costPerPage + (0.10/2);
        }
        else if (typePaper == "Glossy" && isDouble=="One"){
            costPerPage = costPerPage + 0.10;
        }

    }

    /**
     * calculate the cost per page
     */
    public void determineTotalCost(){

        totalCost = costPerPage * numPage;

    }

    /**
     *
     * @return color; typePaper
     */
    public String getColor(){
        return color;
    }
    public String getTypePaper(){
        return typePaper;
    }


}
