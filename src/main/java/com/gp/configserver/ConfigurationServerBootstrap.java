/**
 * 
 */
package com.gp.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Bootstrap for starting configuration server
 * 
 * @author ganeshp
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigurationServerBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServerBootstrap.class, args);
	}
}
