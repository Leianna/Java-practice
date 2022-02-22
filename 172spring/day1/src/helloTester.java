public class helloTester {
    public static void main(String[] args) {
        List<String> newList;
        newList.add("qwer");
        newList.add("asdf");
        newList.add("zxcv");
        newList.add("tyui");
        String history =newList.toString().replace(",","\n").replace("[","").replace("]","");

    }
}
