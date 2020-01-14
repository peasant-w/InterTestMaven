import com.jayway.jsonpath.JsonPath;
import com.testing.keywords.HttpClient;

public class CookieTest {
    public static void main(String[] args) {
        HttpClient kw = new HttpClient();
//        kw.saveCookie();
        try {
            kw.doPost("http://www.testingedu.com.cn/inter/HTTP/login", "username=Will&password=123456");
            String authResult = kw.doPost("http://www.testingedu.com.cn/inter/HTTP/auth", "");
            String tokenValue = JsonPath.read(authResult, "$.token");
            System.out.println(tokenValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
