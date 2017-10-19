package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
public class TickBittrex {

	private Double o;
	private Double h;
	private Double l;
	private Double c;
	private Double v;
	private LocalDateTime t;
	private Double bv;

	public Double getO() {
		return o;
	}

	public void setO(Double o) {
		this.o = o;
	}

	public Double getH() {
		return h;
	}

	public void setH(Double h) {
		this.h = h;
	}

	public Double getL() {
		return l;
	}

	public void setL(Double l) {
		this.l = l;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}

	public Double getV() {
		return v;
	}

	public void setV(Double v) {
		this.v = v;
	}

	public LocalDateTime getT() {
		return t;
	}

	public void setT(LocalDateTime t) {
		this.t = t;
	}

	public Double getBv() {
		return bv;
	}

	public void setBv(Double bv) {
		this.bv = bv;
	}

}
