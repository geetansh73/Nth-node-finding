import java.util.Scanner;
public class linkedlist
{
Node head=null;
class Node
{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}

void print()
{
Node d=head;
while(d!=null)
{
System.out.print(d.data+" ");
d=d.next;
}
}
void nthvalue(int n)
{

    int count=1;
    int length=0;
    Node d=head;
    while(d!=null)
    {
    length++;
    d=d.next;
    }
    if (n>length||n<=0)
    {
        System.out.println("\n n cannot be larger or smaller than linkedlist length");
    }
     int e=length-n+1;
Node f=head;
while(f!=null)
{
   if (count==e)
    {
    System.out.println("\n" +f.data);
    break;
    }
    else
    {
    f=f.next;
    count++;
}
}
}
void push(int data)
{
Node o=new Node(data);
o.next=head;
head=o;
}
public static void main(String g[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
linkedlist obj=new linkedlist();
obj.push(1);
obj.push(2);
obj.push(1);
obj.push(2);
obj.push(1);
obj.push(3);
obj.push(1);
obj.print();
obj.nthvalue(n);
}
}