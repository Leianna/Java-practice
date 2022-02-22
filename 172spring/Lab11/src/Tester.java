public class Tester {

    public static void main(String[] args) {

        System.out.println("\nTesting print order service");
        PrintOrder o1 = new PrintOrder("grayscale", "Matte", "One", 2);
        o1.determineCostPerPage();
        o1.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .15 got:" + o1.getCostPerPage());
        System.out.println("total cost expecting .30 got: " + o1.getTotalCost());

        PrintOrder o2 = new PrintOrder("P1", "Matte", "One", 2);
        o2.determineCostPerPage();
        o2.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .35 got:" + o2.getCostPerPage());
        System.out.println("total cost expecting .7 got: " + o2.getTotalCost());

        PrintOrder o3 = new PrintOrder("P2", "Matte", "One", 2);
        o3.determineCostPerPage();
        o3.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .50 got: " + o3.getCostPerPage());
        System.out.println("total cost expecting 1.0 got: " + o3.getTotalCost());

        PrintOrder o4 = new PrintOrder("P3", "Matte", "One", 2);
        o4.determineCostPerPage();
        o4.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .70 got:" + o4.getCostPerPage());
        System.out.println("total cost expecting 1.4 got: " + o4.getTotalCost());

        PrintOrder o5 = new PrintOrder("grayscale", "Glossy", "One", 2);
        o5.determineCostPerPage();
        o5.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .20 got:" + o5.getCostPerPage());
        System.out.println("total cost expecting .40 got: " + o5.getTotalCost());

        PrintOrder o6 = new PrintOrder("grayscale", "Matte", "Both", 2);
        o6.determineCostPerPage();
        o6.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .125 got:" + o6.getCostPerPage());
        System.out.println("total cost expecting .25 got: " + o6.getTotalCost());

        System.out.println("\nTesting scan order service");
        ScanOrder s1 = new ScanOrder(2,"email");
        s1.determineCostPerPage();
        s1.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .45 got: " + s1.getCostPerPage());
        System.out.println("total cost expecting .90 got: " + s1.getTotalCost());

        ScanOrder s2 = new ScanOrder(2,"DVD");
        s2.determineCostPerPage();
        s2.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .60 got: " + s2.getCostPerPage());
        System.out.println("total cost expecting 1.20 got: " + s2.getTotalCost());

        ScanOrder s3 = new ScanOrder(2,"USB");
        s3.determineCostPerPage();
        s3.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting .90 got: " + s3.getCostPerPage());
        System.out.println("total cost expecting 1.80 got: " + s3.getTotalCost());


        System.out.println("\nTesting fax service order");
        FaxOrder f1 = new FaxOrder("single", "local", 1);
        f1.determineCostPerPage();
        f1.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting 1.50 got: " + f1.getCostPerPage());
        System.out.println("total cost expecting 1.50 got: " + f1.getTotalCost());

        FaxOrder f2 = new FaxOrder("single", "longDistance", 2);
        f2.determineCostPerPage();
        f2.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting 2.00 got: " + f2.getCostPerPage());
        System.out.println("total cost expecting 4.00 got: " + f2.getTotalCost());

        FaxOrder f3 = new FaxOrder("double", "international", 2);
        f3.determineCostPerPage();
        f3.determineTotalCost();
        System.out.println();
        System.out.println("costPerPage expecting 2.5 got: " + f3.getCostPerPage());
        System.out.println("total cost expecting 5.00 got: " + f3.getTotalCost());
    }
}
