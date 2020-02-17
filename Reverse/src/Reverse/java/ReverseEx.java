package Reverse.java;

public class ReverseEx {

public static void main(String[] args) {
String [] a = {"binnu","Shresta","Lally","Vandana","Bhargavi"};
System.out.println("BEFORE SORTING");
for(int i = 0;i<a.length;i++)
{
 System.out.println(a[i]);
}
System.out.println("-----------------------------------------------------------------");
Arrays.sort(a);
System.out.println("AFTER SORTING  :");
for(int i = 0;i<a.length;i++)
{
 System.out.println(a[i]);
}
System.out.println("-----------------------------------------------------------------");
int lenght=a.length;
int l=(lenght/2);
System.out.println("captial ");
for(int i=0;i<=l;i++)
{
System.out.println(a[i]);
}


}

}