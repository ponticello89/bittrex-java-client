package de.elbatya.cryptocoins.bittrexclient;

import de.elbatya.cryptocoins.bittrexclient.api.BittrexPublicApiV3;
import de.elbatya.cryptocoins.bittrexclient.config.ApiBuilderFactory;
import de.elbatya.cryptocoins.bittrexclient.config.MyErrorDecoder;
import feign.Feign;

/**
 * @author contact@elbatya.de
 */
public class BittrexClientV3 {

	public static final String DEFAULT_BASE_URL = "https://api.bittrex.com/v3";

	private BittrexPublicApiV3 publicApiV3;

	public BittrexClientV3() {
		ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(DEFAULT_BASE_URL);
		Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(null);
		publicApiV3 = apiBuilder.errorDecoder(new MyErrorDecoder()).target(BittrexPublicApiV3.class, DEFAULT_BASE_URL);
	}

	public BittrexPublicApiV3 getPublicApiV3() {
		return publicApiV3;
	}

}
