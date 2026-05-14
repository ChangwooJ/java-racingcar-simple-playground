package racingcar.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputNumberOfCars() {
        System.out.println("출전시킬 자동차의 대수를 입력해주세요: ");

        int numberOfCars = scanner.nextInt();
        scanner.nextLine();

        return numberOfCars;
    }

    public static String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        return scanner.nextLine();
    }

    public static int inputRoundNumber() {
        System.out.println("반복할 라운드 수를 입력해주세요: ");
        return scanner.nextInt();
    }
}
