import java.util .*;
class Interest
{
    public static void main (String argu[ ])
{
    double p, rate, t, SimpleInterest,CompoundInterest;
    Scanner sc=new Scanner(System. in);
    System.out.println("Enter the amount:");
    p=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    SimpleInterest=(p * t * rate)/100;
    CompoundInterest =p * Math.pow(1.0+rate/100.0,t) - p;
    System.out.println("Simple Interest="+SimpleInterest);
    System.out. println("Compound Interest="+CompoundInterest);
   }
}