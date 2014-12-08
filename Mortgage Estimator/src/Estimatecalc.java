
public class Estimatecalc {
	 int term, income, monthlydebt; 
     float interest_rate; 
     private int period = 12; 

    
public void Calculate() throws InterruptedException 
{

     monthlydebt = (int) (income * Math.pow(1 + interest_rate / period, term * period) * (interest_rate / period) / (Math.pow(1 + interest_rate / period, term * period) - 1));


}

}
