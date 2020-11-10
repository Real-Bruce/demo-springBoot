package cn.bruce.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Bruce
 * @create 2020-11-10 15:21
 */
@ConfigurationProperties(prefix = "demo.test")
public class TestProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
