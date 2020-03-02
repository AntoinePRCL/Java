package com.sysops.antoinepourcel;


import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public void should_return_hello_world() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.helloWorld();
        assertThat(result).IsEqualTo("Hello World!")
    }
}