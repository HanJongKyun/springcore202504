package com.study.springcore.chap03;

public class Hotel {

    // 레스토랑
    private Restaurant restaurant;

    // 헤드쉐프
    private Chef headChef;

    // 호텔이 의존객체를 생성하는 게 아니라, 외부에서 생성잘르 통해 전달할 예정.
    public Hotel(Restaurant restaurant, Chef headChef)  {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    // 호텔을 소개하는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s 입니다. 그리고 헤드 쉐프는 %s입니다.\n"
                , restaurant.getClass().getSimpleName(),
                headChef.getClass().getSimpleName()); // 단순 클래스명 뽑아오기

        restaurant.order();
    }

}