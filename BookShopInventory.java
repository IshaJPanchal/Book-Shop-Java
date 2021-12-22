import java.util.Scanner;
class Study {
protected String name,auther;
protected float price;
protected int no;

public Study(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of Book And Auther:");
name=sc.nextLine();
auther=sc.nextLine();
System.out.print("Enter numbre of books in Stock:");
no=sc.nextInt();
}

public void edit_stock() {
int choice,t;
Scanner sc=new Scanner(System.in);
System.out.print("1.Enter new Stock\n2.Enter sold books\nEnter youe choice:");
choice=sc.nextInt();
if(choice==1) {
System.out.print("Enter number of books added:");
t=sc.nextInt();
no=no+t;
System.out.println("Books available in stock ="+no);
}
else {
System.out.print("Enter number of books sold:");
t=sc.nextInt();
no=no-t;
System.out.println("Books available in stock ="+no);}
}

public void view_stock() {
System.out.println("Number of books available:"+no);}
}

class Entertainment {
protected String name,auther;
protected float price;
protected int no;
public Entertainment(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of Book And Auther:");
name=sc.nextLine();
auther=sc.nextLine();
System.out.print("Enter numbre of books in Stock:");
no=sc.nextInt();}

public void edit_stock() {
int choice,t;
Scanner sc=new Scanner(System.in);
System.out.print("1.Enter new Stock\n2.Enter sold books\nEnter youe choice:");
choice=sc.nextInt();
if(choice==1) {
System.out.print("Enter number of books added:");
t=sc.nextInt();
no=no+t;
System.out.println("Books available in stock ="+no);}
else {
System.out.print("Enter number of books sold:");
t=sc.nextInt();
no=no-t;
System.out.println("Books available in stock ="+no);}
}

public void view_stock() {
System.out.println("Number of books available:"+no);}
}

public class BookShopInventory{
public static void main(String[] args) {
int i=0,j=0,k,l,t1,t2,choice,ch,srno;
Study s[]=new Study[100];
Entertainment e[]=new Entertainment[100];
Scanner sc=new Scanner(System.in);
do {
System.out.print("1.Study Books\n2.Entertainment Books\n3Exit\nEnter your choice:");
ch=sc.nextInt();
switch(ch) {
case 1: do {
System.out.println("1.Enter new Book\n2Edit stock\n3View Stock\n4.Delet Book\n5.View all books\n6.Exit\nEnter your choice:");
choice=sc.nextInt();
switch(choice) {
case 1: s[i]=new Study();
	System.out.println("Sr.No.="+i);
	srno=i++;
	break;
case 2: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	s[srno].edit_stock();
	break;
case 3: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	s[srno].view_stock();
	break;
case 4: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	for(i=0;i<=t1;i++) {
	if(srno==i) {
	for(k=i;k<t1;k++) {
	s[k]=s[k+1];}
	}
	}
	i--;
	t1--;
case 5: System.out.println("Sr.No\t\t\tBook Name");
	for(i=0;i<t1;i++) {
	System.out.println(i+"\t\t\t"+s[i].name);}
	break;
	case 6: break;
default:System.out.println("Invalid choice!!");
	break;}
}while(choice!=4);
case 2: do {
System.out.println("1.Enter new Book\n2.Edit stock\n3.View Stock\n4.Delet Book\n5.View all books\n6.Exit\nEnter your choice:");
choice=sc.nextInt();
switch(choice) {
case 1: e[j]=new Entertainment();
	System.out.println("Sr.No.="+j);
	srno=j++;
	break;
case 2: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	e[srno].edit_stock();
	break;
case 3: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	e[srno].view_stock();
	break;
case 4: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	for(j=0;j<=t2;j++) {
	if(srno==j) {
	for(l=j;l<t2;l++) {
	e[l]=e[l+1];}
	}
	}
	j--;
	t2--;
case 5: System.out.println("Sr.No\t\t\tBook Name");
	for(j=0;j<t2;j++) {
	System.out.println(j+"\t\t\t"+e[j].name);}
	break;
case 6: break;
default:System.out.println("Invalid choice!!");
	break;}
}while(choice!=4);}
}while(ch!=3);}
}