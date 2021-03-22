package com.oheia.design.state;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        // 用户初始状态为普通用户
        User user = new User();
        // 输出：模拟面试是 Plus 会员专享功能
        user.mockInterview();

        // 用户购买 Plus 会员，状态改变
        user.purchasePlus();
        // 输出：开始模拟面试
        user.mockInterview();

        // Plus 会员过期，变成普通用户，状态改变
        user.expire();
        // 输出：模拟面试是 Plus 会员专享功能
        user.mockInterview();
    }
}
