import java.util.Scanner;

import racingcar.controller.RacingGame;
import racingcar.views.Input;
import racingcar.views.Output;

public class Application {

	public static void main(String[] args) {
		final Input input = new Input(new Scanner(System.in));
		final RacingGame racingGame = new RacingGame(input, new Output());
		racingGame.startGame();
	}
}
