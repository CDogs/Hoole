package com.CDogs.Hoole.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算星座的辅助类
 * Created by CDogs on 2016/6/9.
 */
public class Constellation {
    private final static int[] dayArr = new int[] { 20, 19, 21, 20, 21, 22, 23, 23, 23, 24, 23, 22 };
    private final static String[] constellationArr = new String[] { "摩羯座", "水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座" };


    public static String getConstellation(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String dateStr = format.format(date);
        int day = Integer.valueOf(dateStr.substring(4,5));
        int month = Integer.valueOf(dateStr.substring(1, 2));
        return day < dayArr[month - 1] ? constellationArr[month - 1] : constellationArr[month];
    }
}
