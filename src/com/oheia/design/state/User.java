package com.oheia.design.state;

public class User implements IUser,ISwitchState {
    private State state = State.NORMAL;

    @Override
    public void purchasePlus() {
        state = State.PLUS;
    }

    @Override
    public void expire() {
        state = State.NORMAL;
    }

    @Override
    public void mockInterview() {
        if(state == State.NORMAL){
            System.out.println("模拟面试是Plus会员专享功能");
        }else {
            System.out.println("开始模拟面试");
        }
    }
}
