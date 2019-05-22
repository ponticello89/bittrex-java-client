package de.elbatya.cryptocoins.bittrexclient;

import de.elbatya.cryptocoins.bittrexclient.api.BittrexPublicApiV2;
import de.elbatya.cryptocoins.bittrexclient.config.ApiBuilderFactory;
import de.elbatya.cryptocoins.bittrexclient.config.MyErrorDecoder;
import feign.Feign;

/**
 * @author contact@elbatya.de
 */
public class BittrexClientV2 {

	public static final String DEFAULT_BASE_URL = "https://international.bittrex.com/Api/v2.0";

	private BittrexPublicApiV2 publicApiV2;

	public BittrexClientV2() {
		ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(DEFAULT_BASE_URL);
		Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(null);
		publicApiV2 = apiBuilder.errorDecoder(new MyErrorDecoder()).target(BittrexPublicApiV2.class, DEFAULT_BASE_URL);
	}

	public BittrexPublicApiV2 getPublicApiV2() {
		return publicApiV2;
	}

}
