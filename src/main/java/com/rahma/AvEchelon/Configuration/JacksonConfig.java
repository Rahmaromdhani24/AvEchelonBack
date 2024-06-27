package com.rahma.AvEchelon.Configuration;

import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.SerializationFeature;
@Configuration
public class JacksonConfig {

  /* @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.getFactory().setStreamWriteConstraints(
                StreamWriteConstraints.builder().maxNestingDepth(2000).build()
        );
        return objectMapper;
    }
	*/
	/* @Bean
	    public ObjectMapper objectMapper() {
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.registerModule(new Hibernate5Module());
	        //mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	        return mapper;
	    }*/
	@Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.getFactory().setStreamWriteConstraints(
                StreamWriteConstraints.builder().maxNestingDepth(2000).build()  );
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        return mapper;
    }
}
