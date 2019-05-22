package de.elbatya.cryptocoins.bittrexclient.api;

import java.util.List;

import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.MarketV3;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.TickBittrexV3;
import feign.Param;
import feign.RequestLine;

/**
 * @author contact@elbatya.de
 */
public interface BittrexPublicApiV3 {

	@RequestLine("GET /markets")
	List<MarketV3> getMarkets();

	@RequestLine("GET /markets/{marketName}/candles?candleInterval=HOUR_1")
	List<TickBittrexV3> getMarkets(@Param("marketName") String market);

}
