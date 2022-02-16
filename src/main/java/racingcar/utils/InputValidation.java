package racingcar.utils;

import java.util.regex.Pattern;

public class InputValidation {

	private final static int MAX_NAME_LENGTH = 5;
	private final static String NUMBER_PATTERN = "^[0-9]*$";
	private final static Pattern COMPILED_NUMBER_PATTERN = Pattern.compile(NUMBER_PATTERN);

	public static void validateName(final String names) {
		final String[] carNames = names.split(RacingGameMessage.CAR_NAME_DISTRIBUTOR);
		for (String carName : carNames) {
			checkNameLength(carName);
		}
	}

	private static void checkNameLength(final String carName) {
		if (carName.length() > MAX_NAME_LENGTH) {
			throw new IllegalArgumentException(RacingGameMessage.NAME_LENGTH_ERROR);
		}
	}

	public static void validateRepeats(final String repeats) {
		if (!COMPILED_NUMBER_PATTERN.matcher(repeats).matches()) {
			throw new IllegalArgumentException(RacingGameMessage.REPEATS_ERROR);
		}
	}
}
