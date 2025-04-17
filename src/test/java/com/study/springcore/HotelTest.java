package com.study.springcore;

/**
 * @solution
 * - 객체 생성의 제어권을 이 클래스에서
 *   다른 클래스로 이전한다. (AppConfig)
 *   ex) new 생성자(); -> 이 문법을 담당 클래스를 정해서 몰아서 수행시킴
 *   만약 필요로 하는 의존객체가 있다면 미리 주입을 시켜놓는 로직까지 작성.
 *
 *   제어의 역전(IoC): 객체 생성의 제어권을 외부에서 처리하는 것.
 *   의존성 주입(DI): 외부에서 생성된 객체를 주입받는 개념.
 *
 * @problem - 추상화를 했지만 여전히 의존 객체를 바꾸려면
 *            코드를 직접 변경해야 한다.
 */

import com.study.springcore.chap03.Hotel;
import com.study.springcore.chap03.config.AppConfig;
import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    void hotelTest() {
        AppConfig config = new AppConfig();
        Hotel hotel = config.hotel();

        hotel.inform();
    }
}
