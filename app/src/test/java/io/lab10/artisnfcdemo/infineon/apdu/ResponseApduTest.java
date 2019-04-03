package io.lab10.artisnfcdemo.infineon.apdu;

import io.lab10.artisnfcdemo.infineon.apdu.response.ResponseApdu;
import io.lab10.artisnfcdemo.utils.ByteUtils;
import org.junit.Test;

/**
 * @author Johannes Zweng on 02.10.18.
 */
public class ResponseApduTest {


    @Test
    public void getSW1SW2() {
        ResponseApdu r = new ResponseApdu(ByteUtils.fromHexString("12349000"));
        System.out.println("response: " + r.toHexString());
        System.out.println("SW1: "+r.getSW1());
        System.out.println("SW2: " +r.getSW2());
        System.out.println("SW1SW2: "+r.getSW1SW2());
        System.out.println("SW1SW2: "+r.getSW1SW2HexString());
        System.out.println("is SUccess: "+r.isSuccess());
    }

    @Test
    public void isSuccess() {
    }
}