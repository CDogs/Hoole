package com.CDogs.Hoole.Util;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * jackson日期转换工具类
 *
 * @author CDogs
 *
 */
public class JsonDateFormat extends JsonSerializer<Date> {

    /**
     * Jackson支持日期字符串格式
     * "yyyy-MM-dd' 'HH:mm:ss.SSSZ" "yyyy-MM-dd' 'HH:mm:ss.SSS'Z'"
     * "EEE, dd MMM yyyy HH:mm:ss zzz" "yyyy-MM-dd"
     */
    @Override
    public void serialize(Date value, JsonGenerator jgen,
                          SerializerProvider provider) throws

            IOException, JsonProcessingException {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy-MM-dd' 'HH:mm:ss");
        String formattedDate = formatter.format(value);
        jgen.writeString(formattedDate);

    }

}
