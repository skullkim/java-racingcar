package racingcar.views;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import racingcar.utils.InputValidation;
import racingcar.utils.RacingGameMessage;

public class Input {

	private static final Scanner scanner = new Scanner(System.in);

	public static List<String> inputValidNames() {
		final String names = inputNames();
		return Arrays.stream(names.split(RacingGameMessage.CAR_NAME_DISTRIBUTOR))
			.collect(Collectors.toList());
	}

	private static String inputNames() {
		try {
			System.out.println(RacingGameMessage.INPUT_CAR_NAME);
			final String names = scanner.next();
			InputValidation.validateName(names);
			return names;
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage() + "\n");
			return inputNames();
		}
	}

	public static int inputValidRepeats() {
		return Integer.parseInt(inputRepeats());
	}

	private static String inputRepeats() {
		try {
			System.out.println(RacingGameMessage.INPUT_REPEATS);
			final String repeats = scanner.next();
			InputValidation.validateRepeats(repeats);
			return repeats;
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage() + "\n");
			return inputRepeats();
		}
	}
}
