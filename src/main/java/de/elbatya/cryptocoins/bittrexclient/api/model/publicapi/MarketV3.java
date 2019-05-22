package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
public class MarketV3 {

	private String symbol;
	private String baseCurrencySymbol;
	private String quoteCurrencySymbol;
	private Double minTradeSize;
	private Integer precision;
	private String status;
	private LocalDateTime createdAt;
	private String notice;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getBaseCurrencySymbol() {
		return baseCurrencySymbol;
	}

	public void setBaseCurrencySymbol(String baseCurrencySymbol) {
		this.baseCurrencySymbol = baseCurrencySymbol;
	}

	public String getQuoteCurrencySymbol() {
		return quoteCurrencySymbol;
	}

	public void setQuoteCurrencySymbol(String quoteCurrencySymbol) {
		this.quoteCurrencySymbol = quoteCurrencySymbol;
	}

	public Double getMinTradeSize() {
		return minTradeSize;
	}

	public void setMinTradeSize(Double minTradeSize) {
		this.minTradeSize = minTradeSize;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

}
