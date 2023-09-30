package org.daiict.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class ConfigProperties {

    @Value("${alphavantage.api.key}")
    private String alphaVantageApiKey;

}
