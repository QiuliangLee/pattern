package com.lql.facade;

/**
 * 用户服务
 */
public class reportSys {
    public static void main(String[] args) {
        OrderSys orderSys = new OrderSys();
        PaymentSys paymentSys = new PaymentSys(orderSys);
        DeliverySys deliverySys = new DeliverySys();

        final String orderNum = orderSys.getOrderNum();
        System.out.println(String.format("\n报表\n--------------------------------------------\n" +
                        "订单号：%s | 金额：%s元 | 配送耗时：%s分钟",
                orderNum,
                paymentSys.getOrderAccount(orderNum).toPlainString(),
                String.valueOf(deliverySys.getDeliveryTime() / 60))
        );
    }
}
