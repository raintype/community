package com.community.community;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
//import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CommunityApplicationTests {

    @Value("${property.test.name}")
    private String propertyTestName;

    @Value("${propertyTest}")
    private String propertyTest;

    @Value("${nokey:default value}")
    private String defaultValue;

    @Value("${propertyTestList}")
    private String[] propertyTestArray;

    @Value("#{'${propertyTestList}'.split(',')}")
    private List<String> propertyTestList;

    @Test
    public void testValue() {

        assertThat(propertyTestName).isEqualTo("property depth test");
        assertThat(propertyTest).isEqualTo("test");
        assertThat(defaultValue).isEqualTo("default value");

        assertThat(propertyTestArray[0]).isEqualTo("a");
        assertThat(propertyTestArray[1]).isEqualTo("b");
        assertThat(propertyTestArray[2]).isEqualTo("c");

        assertThat(propertyTestList.get(0)).isEqualTo("a");
        assertThat(propertyTestList.get(1)).isEqualTo("b");
        assertThat(propertyTestList.get(2)).isEqualTo("c");

    }

}
