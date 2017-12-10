/*******************************************************************************
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2016年12月20日 下午2:18:27
 *******************************************************************************/


package com.boot.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * TODO zipkin配置
 *
 * @author wangzhao (mailto:wangzhao@primeton.com)
 */
@Configuration
public class ZipkinConfig {

    @Autowired
    private ZipkinProperties properties;

//    @Bean
//    public SpanCollector spanCollector() {
//        HttpSpanCollector.Config config = HttpSpanCollector.Config.builder().connectTimeout(properties.getConnectTimeout()).readTimeout(properties.getReadTimeout())
//                .compressionEnabled(properties.isCompressionEnabled()).flushInterval(properties.getFlushInterval()).build();
//        return HttpSpanCollector.create(properties.getUrl(), config, new EmptySpanCollectorMetricsHandler());
//    }
//
//    @Bean
//    public Brave brave(SpanCollector spanCollector){
//        Brave.Builder builder = new Brave.Builder(properties.getServiceName());  //指定state
//        builder.spanCollector(spanCollector);
//        builder.traceSampler(Sampler.ALWAYS_SAMPLE);
//        Brave brave = builder.build();
//        return brave;
//    }
//
//    @Bean
//    public BraveServletFilter braveServletFilter(Brave brave){
//        BraveServletFilter filter = new BraveServletFilter(brave.serverRequestInterceptor(),brave.serverResponseInterceptor(),new DefaultSpanNameProvider());
//        return filter;
//    }
//
//    @Bean
//    public OkHttpClient okHttpClient(Brave brave){
//        OkHttpClient client = new OkHttpClient.Builder()
//                .addInterceptor(new BraveOkHttpRequestResponseInterceptor(brave.clientRequestInterceptor(), brave.clientResponseInterceptor(), new DefaultSpanNameProvider()))
//                .build();
//        return client;
//    }
}
