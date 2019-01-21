package com.huylam98it.springwebsocketannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.huylam98it.springwebsocketannotation.controller.MySocketHandler;

@Configuration
@EnableWebSocket
public class SocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(myHandler(), "/myhandler");// dang ky xem class nao se xu ly socket url nay
	}

	@Bean
	public WebSocketHandler myHandler() {
		return new MySocketHandler();
	}

}
