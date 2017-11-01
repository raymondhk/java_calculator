
public class Calculator {
	private double OperandOne;
	private double OperandTwo;
	private String Operation;
	private double Results;
	
	public Calculator() {
		
	}
	
	public void performOperation() {
		if(this.Operation == "+") {
			this.Results = this.OperandOne + this.OperandTwo;
		} else {
			this.Results = this.OperandOne - this.OperandTwo;
		}
	}
	
	public double getOperandOne() {
		return OperandOne;
	}
	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}
	public double getOperandTwo() {
		return OperandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}

	public double getResults() {
		System.out.println(Results);
		return Results;
	}

	public void setResults(double results) {
		Results = results;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResults();
	}
}
