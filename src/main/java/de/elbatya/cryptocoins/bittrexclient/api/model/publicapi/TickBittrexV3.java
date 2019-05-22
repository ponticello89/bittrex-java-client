package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
public class TickBittrexV3 {

	private LocalDateTime startsAt;

	private Double open;
	private Double high;
	private Double low;
	private Double close;
	private Double volume;
	private Double baseVolume;

	public LocalDateTime getStartsAt() {
		return startsAt;
	}

	public void setStartsAt(LocalDateTime startsAt) {
		this.startsAt = startsAt;
	}

	public Double getOpen() {
		return open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Double getClose() {
		return close;
	}

	public void setClose(Double close) {
		this.close = close;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getBaseVolume() {
		return baseVolume;
	}

	public void setBaseVolume(Double baseVolume) {
		this.baseVolume = baseVolume;
	}

}
