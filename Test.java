public class Test {
    public static void main(String[] args) {
        TDAList<Integer> intList = new ListLinked<Integer>();

        intList.insertFirst(20);
        System.out.println(intList);
        intList.insertFirst(10);
        System.out.println(intList);
        intList.insertFirst(30);
        System.out.println(intList);
        intList.insertFirst(26);
        System.out.println(intList);
        intList.insertFirst(7);
        System.out.println(intList);
        intList.remove(7);
        System.out.println(intList);
        intList.remove(30);
        System.out.println(intList);
        intList.remove(20);
        System.out.println(intList);

        /* TDAList<String> stringList = new ListLinked<String>();
        stringList.insertFirst("Cristian");
        stringList.insertFirst("Amezquita");
        stringList.insertFirst("Edison");
        stringList.insertFirst("");
        System.out.println(stringList); */
    }
}
