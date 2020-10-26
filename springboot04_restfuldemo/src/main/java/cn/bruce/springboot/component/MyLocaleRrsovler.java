package cn.bruce.springboot.component;

import com.sun.corba.se.spi.resolver.LocalResolver;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author Bruce
 * @create 2020-10-26 9:32
 */
public class MyLocaleRrsovler implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // 获取请求头中的参数l
        String l = request.getParameter("l");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(l)) {
            // 以参数l中的"_"进行切分，得到区域信息和区域代码
            String[] split = l.split("_");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
