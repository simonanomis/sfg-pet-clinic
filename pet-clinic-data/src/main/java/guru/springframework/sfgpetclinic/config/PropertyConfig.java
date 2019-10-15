package guru.springframework.sfgpetclinic.config;

import guru.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import guru.springframework.sfgpetclinic.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

    //@Autowired
    //Environment env;

    //set properties from property file in resources
    @Value("${guru.username}")
    String username;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsusername;
    @Value("${guru.jms.password}")
    String jmspassword;
    @Value("${guru.jms.dburl}")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        //fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsusername);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
