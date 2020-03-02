package com.sysops.antoinepourcel;


import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void should_return_hello_world() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.helloWorld();

        assertThat(result).IsEqualTo("Hello World!");
    }

}