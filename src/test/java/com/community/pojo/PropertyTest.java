package com.community.pojo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class PropertyTest {
    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void Test() {
        List<Fruit> fruitData = fruitProperty.getList();

        assertThat(fruitData.get(0).getName()).isEqualTo("banana");
        assertThat(fruitData.get(0).getColor()).isEqualTo("yellow");
    }
}
