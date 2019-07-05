package org.apache.mytest;

/**
 * Created by xulh on 2019/7/5.
 */
public interface PayPaymentMapper {

    public PayPaymentDO selectByPrimaryKey(String id);
    public PayPaymentDO update(PayPaymentDO payment);
//    public int deleteRole(Long id);
    public int insert(PayPaymentDO payment);
}
