public class Test {
    public static void main(String[] args) {
        TDAList<Integer> intList = new ListLinked<Integer>();

        intList.insertFirst(20);
        intList.insertFirst(10);
        intList.insertFirst(30);
        intList.insertFirst(26);
        intList.insertFirst(7);
        System.out.println(intList);

        TDAList<String> stringList = new ListLinked<String>();
        stringList.insertFirst("Cristian");
        stringList.insertFirst("Amezquita");
        stringList.insertFirst("Edison");
        stringList.insertFirst("Soto");
        System.out.println(stringList);
    }
}
