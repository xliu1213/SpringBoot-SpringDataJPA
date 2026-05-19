package com.alibou.example;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file-2.properties")
})
public class MyFirstService {
    private final MyFirstClass myFirstClass;

    @Value("Hello Alibou students")
    private String customProperty;

    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;

    @Value("123")
    private Integer customPropertyInt;

    @Value("${my.prop.2}")
    private String customPropertyFromAnotherFile2;

    public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String getCustomPropertyFromAnotherFile2() {
        return customPropertyFromAnotherFile2;
    }

    public String tellAStory() {
        return "the dependency is saying: " + myFirstClass.sayHello();
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }

    public Integer getCustomPropertyInt() {
        return customPropertyInt;
    }
}
