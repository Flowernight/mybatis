package org.apache.mytest;

import java.math.BigDecimal;

public class PayPaymentDO {
	private String paySerialNo;

	private BigDecimal amount;

	private String payStatus;

	private String payMethod;

	private String cardNo;

	private String bankId;

	private String bankType;

	private String createTime;

	private String modifyTime;

	private String tradePayId;

	private String memo;

	private String authId;

	private String payType;

	private String oriPayNo;

	private String accSerialNo;

	private BigDecimal refundAmount;

	private String channelType;

	private String cardType;

	private BigDecimal totalAmount;

	private String batchId;

	/**
	 * 系统环境区分标识
	 */
	private String systemEnvFlag;
	/**
	 * 产品码
	 */
	private String proCode;
	/**
	 * 支付产品码
	 */
	private String payCode;
	/**
	 * 退款模式 1-特定模式，0-普通模式
	 */
	private String refundType;

	public String getPaySerialNo() {
		return paySerialNo;
	}

	public void setPaySerialNo(String paySerialNo) {
		this.paySerialNo = paySerialNo == null ? null : paySerialNo.trim();
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus == null ? null : payStatus.trim();
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod == null ? null : payMethod.trim();
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo == null ? null : cardNo.trim();
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId == null ? null : bankId.trim();
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType == null ? null : bankType.trim();
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getTradePayId() {
		return tradePayId;
	}

	public void setTradePayId(String tradePayId) {
		this.tradePayId = tradePayId == null ? null : tradePayId.trim();
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo == null ? null : memo.trim();
	}

	public String getAuthId() {
		return authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId == null ? null : authId.trim();
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType == null ? null : payType.trim();
	}

	public String getOriPayNo() {
		return oriPayNo;
	}

	public void setOriPayNo(String oriPayNo) {
		this.oriPayNo = oriPayNo == null ? null : oriPayNo.trim();
	}

	public String getAccSerialNo() {
		return accSerialNo;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setAccSerialNo(String accSerialNo) {
		this.accSerialNo = accSerialNo == null ? null : accSerialNo.trim();
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType == null ? null : channelType.trim();
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType == null ? null : cardType.trim();
	}

	public String getSystemEnvFlag() {
		return systemEnvFlag;
	}

	public void setSystemEnvFlag(String systemEnvFlag) {
		this.systemEnvFlag = systemEnvFlag;
	}

	public String getProCode() {
		return proCode;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	/**
	 * 获取支付产品码
	 *
	 * @return 支付产品码
	 */
	public String getPayCode() {
		return payCode;
	}

	/**
	 * 设置支付产品码
	 * 
	 * @param payCode
	 *            要设置的支付产品码
	 */
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	
	

}