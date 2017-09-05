package cn.binux;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@EnableApolloConfig
@ComponentScan(basePackages = {"com.piggsoft.beetl.spring.boot.autoconfigue"})
@SpringBootApplication
public class XbinStoreWebSSOApplication  {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreWebSSOApplication.class, args);
	}
}
