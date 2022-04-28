package edu.handong.csee.java.hw2.math;
/**
 * MathCalculator has many functions and private variables name.
 */
public class MathCalculator {
    /**
     * we will get name by args which is user write
     */
    private String name=" ";
    /**
    * put input to name
    */
    public void setName(String name){
        this.name = name;
    }
    /**
     * return name
     */
    public String getName(){
        return name;
    }
    /**
     * use if to find which one is bigger and return max
     */
    public int getMax(int n1, int n2){
        int max=0;
        if(n1>=n2) max = n1;
        else max = n2;
        return max;
    }
    /**
     * use if to find which one is smaller and return min
     */
    public int getMin(int n1, int n2){
        int min=0;
        if(n1<=n2) min = n1;
        else min = n2;
        return min;
    }
    /**
     * use if to check that number is + or - and if input is -, multiple - to make it +. if input is +, just return 
     */
    public int getAbs(int n){
        int abs=0;
        if(n>=0) abs=n;
        else abs=-n;
        return abs;    
    }
    /**
     * sum two inputs and return
     */
    public int getSum(int n1, int n2){
        int sum=n1+n2;
        return sum;
    }
    /**
     * diff two inputs and return
     */
    public int getDiff(int n1, int n2){
        int diff = n1-n2;
        return diff;
    }
    /**
     * multiply two inputs and return.
     */
    public int getProduct(int n1, int n2){
        int product=n1*n2;
        return product;
    }
    /**
     * devide two inputs and return quotient
     */
    public int getQuotient(int n1, int n2){
        int quotient = n1 / n2;
        return quotient;
    }
    /**
     * devide two inputs and return remainder
     */
    public int getRemainder(int n1, int n2){
        int remainder = n1 % n2;
        return remainder; 
    }
    /**
     * use for and mutiply n1 , n2 times and return
     */
    public int getPower(int n1, int n2){
        int power=1;
        if(n2<0) power=0;
        else{
            for(int i=0; i<n2; i++){
                power*=n1;
            }
        }
        return power;
    }
    /**
     * use for and multiply 1 to n and return
     */
    public int getFactorial(int n){
        int factorial=1;
        if(n<0) factorial=0;
        else {
            for(int i=1; i<=n; i++){
                factorial*=i;
            }
        }
        return factorial;
    }
    /**
     * inputs could be minus so use getAbs to make plus
     * use while to find Gcd
     * if n1 is bigger than n2, n1=n1-n2 and loop this during n1 and n2 be same
     */
    public int getGcd(int n1, int n2){
        int gcd=1;
        n1=getAbs(n1);
        n2=getAbs(n2);
        while(n1!=n2){
            if(n1>n2) n1-=n2;
            else n2-=n1;
        }
        gcd = n1;
        return gcd;
    }
    /**
     * Lcm is multiple two inputs and devide with two inputs' Gcd
     */
    public int getLcm(int n1, int n2){
        int lcm;
        lcm=(n1*n2)/getGcd(n1, n2);
        return lcm;
    }
    /**
     * multiply n 2 times and return
     */
    public int getSquare(int n){
        int square=n*n;
        return square;
    }
}
