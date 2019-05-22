package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
public class Market {

	private String marketCurrency;
	private String marketCurrencyLong;

	private String baseCurrency;
	private String baseCurrencyLong;

	private Double minTradeSize;

	private String marketName;

	private Boolean isActive;
	private Boolean IsRestricted;

	private LocalDateTime created;

	private String notice;

	private Boolean isSponsored;

	private String logoUrl;

	public String getMarketCurrency() {
		return marketCurrency;
	}

	public void setMarketCurrency(String marketCurrency) {
		this.marketCurrency = marketCurrency;
	}

	public String getMarketCurrencyLong() {
		return marketCurrencyLong;
	}

	public void setMarketCurrencyLong(String marketCurrencyLong) {
		this.marketCurrencyLong = marketCurrencyLong;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getBaseCurrencyLong() {
		return baseCurrencyLong;
	}

	public void setBaseCurrencyLong(String baseCurrencyLong) {
		this.baseCurrencyLong = baseCurrencyLong;
	}

	public Double getMinTradeSize() {
		return minTradeSize;
	}

	public void setMinTradeSize(Double minTradeSize) {
		this.minTradeSize = minTradeSize;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean active) {
		isActive = active;
	}

	public Boolean getIsRestricted() {
		return IsRestricted;
	}

	public void setIsRestricted(Boolean restricted) {
		IsRestricted = restricted;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Boolean getIsSponsored() {
		return isSponsored;
	}

	public void setIsSponsored(Boolean sponsored) {
		isSponsored = sponsored;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
}
