*import java.io.*;

public class Account{

private int accNo;
private String custName;

    public void setAccount(int accNo,String custName)
    {
     this.accNo=accNo;
     this.custName=custName;
    }
	
	
     public int getAccno()
    {
     return accNo;
    }

     public String getcustName()
    {
        return custName;
    }
	
public static void main(String args[])
{
 Account a1=new Account();
 
 a1.setAccount(101,"Yogesh");
 
 System.out.println("Account no is:"+a1.getAccno());
 System.out.println("Account no is:"+a1.getcustName());
}
}