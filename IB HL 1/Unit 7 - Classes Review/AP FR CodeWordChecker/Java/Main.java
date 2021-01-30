public class Main
{
    public static void main(String[] args)
    {
        CodeWordChecker sc1 = new CodeWordChecker(5, 8, "$");
        
        System.out.println("String = \"$\"");
        System.out.println("sc1.isValid(\"happy\") \t\t= " +  sc1.isValid("happy"));
        System.out.println("sc1.isValid(\"happy$\") \t\t= " +  sc1.isValid("happy$"));
        System.out.println("sc1.isValid(\"Code\") \t\t= " +  sc1.isValid("Code"));
        System.out.println("sc1.isValid(\"happyCode\") \t= " +  sc1.isValid("happyCode"));
        
        CodeWordChecker sc2 = new CodeWordChecker("pass");
        
        System.out.println();
        System.out.println("String = \"pass\"");
        System.out.println("sc2.isValid(\"MyPass\") \t\t\t\t\t\t= " +  sc2.isValid("MyPass"));
        System.out.println("sc2.isValid(\"Mypassport\") \t\t\t\t\t= " +  sc2.isValid("MypassPort"));
        System.out.println("sc2.isValid(\"happy\") \t\t\t\t\t\t= " +  sc2.isValid("happy"));
        System.out.println("sc2.isValid(\"1,000,000,000,000,000\") \t\t= " +  sc2.isValid("1,000,000,000,000,000"));
    }
}
