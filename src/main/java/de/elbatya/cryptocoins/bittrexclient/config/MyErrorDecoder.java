package de.elbatya.cryptocoins.bittrexclient.config;

import de.elbatya.cryptocoins.bittrexclient.exceptions.RateLimiterClientException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class MyErrorDecoder implements ErrorDecoder {

	private final ErrorDecoder defaultErrorDecoder = new Default();

	@Override
	public Exception decode(String methodKey, Response response) {
		if (response.status() == 429) {
			return new RateLimiterClientException();
		}
		return defaultErrorDecoder.decode(methodKey, response);
	}
}