package com.alibou.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private MyFirstClass myFirstClass;
    private Environment environment;

    @Autowired
    public void setMyFirstClass(@Qualifier("bean1") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    @Autowired
    public void setEnvironment(Environment environment){
        this.environment = environment;
    }

    public String tellAStory() {
        return "the dependency is saying: " + myFirstClass.sayHello();
    }

    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }

    public String getOSName() {
        return environment.getProperty("os.name");
    }

    public String readProp() {
        return environment.getProperty("my.custom.property");
    }
}
