package pl.sda.powitania;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void powitaniePL() {
        HelloWorld helloWorld = new HelloWorld ();
        assert helloWorld.getHelloMessage ("pl")
                .equals ("Witaj Świecie!");
    }

    @Test
    public void powitanieEN() {
        HelloWorld helloWorld = new HelloWorld ();
        assert helloWorld.getHelloMessage ("en")
                .equals ("Hello world!");
    }

    @Test
    public void powitanieCS() {
        HelloWorld helloWorld = new HelloWorld ();
        assert helloWorld.getHelloMessage ("cs")
                .equals ("cos");
    }

    @Test
    public void powitanieJezykNieznany() {
        HelloWorld helloWorld = new HelloWorld ();
        assert helloWorld.getHelloMessage (" ")
                .equals ("Język nieznany!");
    }
}
