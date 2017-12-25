import java.util.*;
class SmithNumber{
    
    //Checking that the number is composite or not.
    public boolean isComposite(int x){
        for(int i=2; i<x; i++){
            if(x%i==0)
                return true;
        }
        return false;
    }
    
    //Getting the sum of digits
    public int getSum(int x){
        int k = x;
        int sum=0;
        while(k>0){
            int rem = k%10;
            sum = sum+rem;
            k=k/10;
        }
        return sum;
    }
    
    //The main() function
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SmithNumber obj = new SmithNumber();
        System.out.println("Enter the number");
        int a = in.nextInt();
        int factSum = 0;
        if(obj.isComposite(a)==false){
            System.out.println("Not a Composite Number");
            System.exit(0);
        }
        System.out.println("The Prime factors are ");
        for(int i=2; i<a; i++){
            if(a%i==0&&obj.isComposite(i)==false){
                System.out.print(i+" ");
                factSum = factSum+obj.getSum(i);
            }
        }
        int digSum = obj.getSum(a);
        System.out.println("Sum of digits is : "+digSum);
        System.out.println("Sum of Prime Factor's Digits is : "+factSum);
        if(digSum==factSum)
            System.out.println("Smith Number");
        else
            System.out.println("Not a Smith Number");
    }
}