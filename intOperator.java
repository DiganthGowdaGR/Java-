class  intOperator{
    public static void main(String[] args) {
        
        int a=4;
        int b=7;

        //AND operator (&)
        System.err.println("AND Operation");
        System.err.println("4 & 7:"+(a&b));
        System.err.println("Binary :"+Integer.toBinaryString(a&b));

        //OR oprator (|)
        System.err.println("OR Operation");
        System.err.println("4 & 7:"+(a|b));
        System.err.println("Binary :"+Integer.toBinaryString(a|b));


    }
}
