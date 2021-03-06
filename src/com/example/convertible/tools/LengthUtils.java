package com.example.convertible.tools;

import java.lang.Math;

/**
 * Created with IntelliJ IDEA.
 * User: shawli
 * Date: 19/05/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class LengthUtils {

    public static Double kilometreToMetre(Double km) {
        return (km*1000);
    }

    public static Double kilometreToCentimetre(Double km) {
        return (km*100000);
    }

    public static Double kilometreToMillimetre(Double km) {
        return (km*1000000);
    }

    public static Double kilometreToMile(Double km) {
        return (km*0.621371);
    }

    public static Double kilometreToFoot(Double km) {
        return (km*3280.83989501);
    }

    public static Double metresToKilometres(Double m) {
        return (m / 1000);
    }

    public static Double metresToCentimetres(Double m) {
        return (m*100);
    }

    public static Double metresToMillimetre(Double m) {
        return (m*1000);
    }

    public static Double metresToMiles(Double m) {
        return (m*0.000621371);
    }

    public static Double metresToFoot(Double m) {
        return (m*3.2808399);
    }

    public static Double centimetresToKilometres(Double cm) {
        return (cm/100000);
    }

    public static Double centimetresToMetres(Double cm) {
        return (cm/100);
    }

    public static Double centimetresToMillimetres(Double cm) {
        return (cm*10);
    }

    public static Double centimetresToMile(Double cm) {
        return (cm*6.2137*Math.pow(10, -6));
    }

    public static Double centimetresToFoot(Double cm) {
        return (cm*0.0328084);
    }

    public static Double millimetresToKilometres(Double mm) {
        return (mm/1000000);
    }

    public static Double millimetresToMetres(Double mm) {
        return (mm/1000);
    }

    public static Double millimetresToCentimetres(Double mm) {
        return (mm/10);
    }

    public static Double millimetresToMile(Double mm) {
        return (mm*6.2137*Math.pow(10, -7));
    }

    public static Double millimetresToFoot(Double mm) {
        return (mm*0.00328084);
    }

    public static Double mileToKilometre(Double mi) {
        return (mi*1.60934);
    }

    public static Double mileToMetre(Double mi) {
        return (mi*1609.34);
    }

    public static Double mileToCentimetre(Double mi) {
        return (mi*160934);
    }

    public static Double mileToMillimetre(Double mi) {
        return (mi*1609344);
    }

    public static Double mileToFoot(Double mi) {
        return (mi*5280);
    }

    public static Double mileToYard(Double mi) {
        return (mi*1760);
    }

    public static Double mileToInch(Double mi) {
        return (mi*63360);
    }

    public static Double footToKilometre(Double ft) {
        return (ft*0.0003048);
    }

    public static Double footToMetre(Double ft) {
        return (ft*0.3048);
    }

    public static Double footToCentimetre(Double ft) {
        return (ft*30.48);
    }

    public static Double footToMillimetre(Double ft) {
        return (ft*304.8);
    }

    public static Double footToMile(Double ft) {
        return (ft*0.00018939);
    }

    public static Double footToYard(Double ft) {
        return (ft*333333);
    }

    public static Double footToInch(Double ft) {
        return (ft*12);
    }

}
