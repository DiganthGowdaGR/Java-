class strings{

public static void main(String[] args) {

    //Cheking 2 strings are equale or not
    String str1= "hello";
    String str2 ="hello";
    System.err.println(str1.equals(str2));

   //lower - upper case / String Immutability 
    String a="sharath";
    String b=a.toUpperCase();
    System.err.println("lower-case:"+a);
    System.err.println("Upper-case:"+b);
    System.err.println("Length:"+a.length());
    System.err.println("charAt:"+a.charAt(3) );
    System.err.println("SubString:"+a.substring(0,4));
    System.err.println("Contains:"+a.contains("ra"));
    System.err.println("Replace :"+a.replace("sharath", "java"));
}

}
