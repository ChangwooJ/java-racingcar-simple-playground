package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.NumberGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaceTest {
    @Test
    @DisplayName("랜덤 숫자가 기준치(4)보다 클 때 자동차가 움직이는지 확인한다.")
    public void playRace_overThreshold() {
        NumberGenerator fixedNumberGenerator = new FixedNumberGenerator(4);
        Race race = new Race(fixedNumberGenerator);
        Car car = new Car("테스트 자동차");

        race.playRound(car);
        assertEquals(1, car.getPosition());
    }

    @Test
    @DisplayName("랜덤 숫자가 기준치(4)보다 작을 때 자동차가 움직이지 않는지 확인한다.")
    public void playRace_underThreshold() {
        NumberGenerator fixedNumberGenerator = new FixedNumberGenerator(3);
        Race race = new Race(fixedNumberGenerator);
        Car car = new Car("테스트 자동차");

        race.playRound(car);
        assertEquals(0, car.getPosition());
    }
}
