package cn.bruce.starter;

/**
 * @author Bruce
 * @create 2020-11-10 15:30
 */
public class TestService {
    TestProperties testProperties;

    public TestProperties getTestProperties() {
        return testProperties;
    }

    public void setTestProperties(TestProperties testProperties) {
        this.testProperties = testProperties;
    }

    public String testPrintString(String name) {
        return testProperties.getPrefix() + "-" + name + testProperties.getSuffix();
    }
}
