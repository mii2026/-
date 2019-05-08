package calcul;

//import java.io.*;

public class SimpleCalculator {
	int result;
	
	SimpleCalculator(){
		result=0;
	}
	
	void add(int a, int b) throws AddZeroException {
		if(a!=0&&b!=0) {
			result=a+b;
		}
		else {
			throw new AddZeroException();
		}
	}
	void subtract(int a, int b) throws SubtractZeroException {
		if(b!=0) {
			result=a-b;
		}
		else {
			throw new SubtractZeroException();
		}
	}
	int print() {
		return result;
	}
	void reset() {
		result=0;
	}
	void getResult() throws OutOfRangeException{
		if(result>=0&&result<=1000) {
			System.out.print(result);
		}
		else {
			throw new OutOfRangeException();
		}
	}
	int setResult() {
		return result;
	}
}
