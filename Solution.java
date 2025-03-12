import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//this is for how to count a given user String in order

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner =  new Scanner(System.in);
        int lineCount = 0;
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            lineCount++;
            
            System.out.println(lineCount+" "+line);
        }
    }
}
