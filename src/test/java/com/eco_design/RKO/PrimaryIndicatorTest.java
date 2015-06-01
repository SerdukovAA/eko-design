package com.eco_design.RKO;

import com.eco_design.RKO.beans.InfoSource;
import com.eco_design.RKO.beans.prInd.DangerClassGround;
import com.eco_design.RKO.beans.prInd.PDKground;
import com.eco_design.RKO.beans.prInd.PDKwater;
import org.junit.*;

import static org.junit.Assert.*;

public class PrimaryIndicatorTest {

    @Test
    public void testPDKground() {
        PDKground pdk = new PDKground(0.009, new InfoSource());
        System.out.println(pdk.getName());
        assertEquals("ПДКп*(ОДК**),мг/кг",pdk.getName());
        assertEquals(1, pdk.getBall());
        pdk.setValue(1.12, new InfoSource());
        assertEquals(2, pdk.getBall());
        pdk.setValue(10.12, new InfoSource());
        assertEquals(3, pdk.getBall());
        pdk.setValue(100.12, new InfoSource());
        assertEquals(4, pdk.getBall());
    }
    @Test
    public void testDangerClassGround() {
        DangerClassGround dc = new DangerClassGround(1, new InfoSource());
        System.out.println(dc.getName());
        assertEquals("Класс опасности в почве",dc.getName());
        assertEquals(1, dc.getBall());
        dc.setValue(2, new InfoSource());
        assertEquals(2, dc.getBall());
        dc.setValue(3, new InfoSource());
        assertEquals(3, dc.getBall());
        dc.setValue(-1, new InfoSource());
        assertEquals(4, dc.getBall());

    }
    @Test
    public void testPDKwater() {
        PDKwater pdk = new PDKwater(0.009, new InfoSource());
        System.out.println(pdk.getName());
        assertEquals("ПДКв (ОДУ,ОБУВ), мг/л", pdk.getName());
        pdk.setValue(0.009, new InfoSource());
        assertEquals(1, pdk.getBall());
        pdk.setValue(0.01, new InfoSource());
        assertEquals(2, pdk.getBall());
        pdk.setValue(0.11, new InfoSource());
        assertEquals(3, pdk.getBall());
        pdk.setValue(1.12, new InfoSource());
        assertEquals(4, pdk.getBall());

    }
}