
public class LoanCalc {
	
	static double epsilon = 0.001;  
	static int iterationCounter;    
	static int iterationCounter1;   
  
	public static void main(String[] args) {		
		
		double loan = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		System.out.println("Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);
		
		
		System.out.print("Periodical payment, using brute force: ");
		System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter1);

	
		System.out.print("Periodical payment, using bi-section search: ");
		System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
		System.out.println();
		System.out.println("number of iterations: " + iterationCounter);
	}

     public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {
        double g = loan / n;
		while (endBalance(loan, rate, n, g)>0){
			g = g + epsilon;
			iterationCounter1++;

		}
		return g;
    }

    

    public static double bisectionSolver(double loan, double rate, int n, double epsilon) {  
             iterationCounter = 0;
        double h = loan;
        double l = 0; 
        double g = (h + l) / 2;

        while ((h - l) > epsilon) {
            if ((endBalance(loan, rate, n, l) * endBalance(loan, rate, n, g)) > 0) {
                l = g;
            } else {
                h = g;
            }

            g = (l + h) / 2;
            iterationCounter++;
        }

        return g;
    }
	
	
private static double endBalance(double loan, double rate, int n, double payment) {
    double balance = 0;

    for (int i = 0; i < n; i++) {
        balance = (loan - payment) * ((rate/100)+1);
        loan = balance;
    }

    return balance;
}
}