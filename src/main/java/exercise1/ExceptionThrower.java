package exercise1;

public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value) throws ExceptionWhenValueIs42 {
			if (value == 42) {
				throw new ExceptionWhenValueIs42();
			}
		}

}
