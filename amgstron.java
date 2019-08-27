import java.lang.Math;
class amgstron 
{
 public static void main(String args[])
{
int number=371,org,r,result=0;
org=number;
int a=1;	
while(a<=3)
{
r=org%10;
r=r*r*r;
result=result + r;

//System.out.println(result);

org=org/10;
//System.out.println(org);
a+=1;
}
if(result==number){
System.out.println("number is armstron");

}
else
System.out.println("number is not armstron");

}
}