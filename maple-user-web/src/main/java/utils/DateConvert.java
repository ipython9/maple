package utils;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:
 * @Description:
 * @Date: Create in 21:51 2019/2/25
 */
public class DateConvert  implements Converter<String,Date>{
    @Override
    public Date convert(String s) {
        Date date = null;
        String pattern = s.length()==10 ? "yyyy-MM-dd" : "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat(pattern);
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        return date;
    }
}
