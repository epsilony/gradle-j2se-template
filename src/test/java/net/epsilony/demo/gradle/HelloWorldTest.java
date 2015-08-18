package net.epsilony.demo.gradle;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void test() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        BufferedReader br = new BufferedReader((new InputStreamReader(classLoader.getResourceAsStream("sample.txt"))));
        String name = br.readLine();

        BufferedReader tbr = new BufferedReader(
                (new InputStreamReader(classLoader.getResourceAsStream("test-sample.txt"))));
        String test = tbr.readLine();
        String act = test + " " + name;
        assertEquals("test World", act);
    }

}
