package de.elbatya.cryptocoins.bittrexclient.api;

import java.util.List;

import de.elbatya.cryptocoins.bittrexclient.api.model.common.ApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.TickBittrex;
import feign.Param;
import feign.RequestLine;

/**
 * @author contact@elbatya.de
 */
public interface BittrexPublicApiV2 {

	@RequestLine("GET /pub/market/GetTicks?marketName={marketName}&tickInterval={tickInterval}")
	ApiResult<List<TickBittrex>> getMarkets(@Param("marketName") String market,
			@Param("tickInterval") String tickInterval);

}
