import java.io.*;
import java.util.*;

class create{
public void creating_account(){
Scanner sc=new Scanner(System.in);

try{
FileWriter fw=new FileWriter("password.txt",true);
String a1,b1;
int n,i;
System.out.println("Enter the No. Of Account ");
n=sc.nextInt();
for(i=0;i<n;i++){
System.out.println("Enter the Username Name: ");
a1=sc.next();
System.out.println("Enter the Password: ");
b1=sc.next();
fw.write(a1+" ");
fw.write("\n");
fw.write(b1+" ");
fw.write("\n");
}
fw.close();
System.out.println("Your Accounts Created Successful");
}
catch(Exception e){
System.out.println(e);
System.out.println("Your Account Creation Failed");
}
}

}

class login{
public void login_account(){
String a2,b2,c,d;
System.out.println("It Will Accept only Strings Only Please");
try{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Username Name: ");
a2=sc.next();
System.out.println("Enter the Password: ");
b2=sc.next();
File file=new File("password.txt");
Scanner input=new Scanner(file);

while(sc.hasNextLine()){
c=input.nextLine();
d=input.nextLine();
if(c.contains(a2) && d.contains(b2)){
 System.out.println("Authentication Successful");
	}
}

while(sc.hasNextLine()){
c=input.nextLine();
d=input.nextLine();
if(!c.contains(a2) && !d.contains(b2)){
 System.out.println("Authentication Failed");
	}
}

}

catch(Exception e){
}

}
}



class skills{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
create crea=new create();
login log=new login();
System.out.println("+------------------------------------------------------------------+");
System.out.println("     	     	WELCOME TO LOGIN  IN  PAGE	           ");
System.out.println("+------------------------------------------------------------------+");
System.out.println("Please Select Any One Option");
System.out.println("1.Create New Account");
System.out.println("2.Existing Account");
int n=sc.nextInt();
switch(n){
	case 1:
	System.out.println("Welcome to Creating Account");
	crea.creating_account();
	break;
	case 2:
	System.out.println("Welcome to Login page");
	log.login_account();
	break;
	default:
	System.out.println(" Please select a corrct option");
}
}
}