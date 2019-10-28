package exercise1;

public class ExceptionCatcher {
	private final ExceptionThrower exceptionThrower;
	public ExceptionCatcher(ExceptionThrower exceptionThrower) {
		this.exceptionThrower = exceptionThrower;
	}

	void executeExceptionThrowerSafely(int value) throws ExceptionWhenValueIs42 {
		try {
			exceptionThrower.throwACustomExceptionWhenValueIs42(value);
		}
		catch(RuntimeException e){
			System.out.print("je suis dans le catch");
		}

	}
}
