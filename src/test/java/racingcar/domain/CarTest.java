package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    @DisplayName("자동차를 생성하고 move 메서드를 통해 위치가 1 증가한다.")
    public void play_moveMethod() {
        Car car = new Car("테스트 자동차");
        car.move();

        assertEquals(1, car.getPosition());
    }
}
