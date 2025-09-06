package W1;

import com.google.firebase.crashlytics.internal.concurrency.l;
import com.google.firebase.crashlytics.internal.g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class a {
    private final String a;
    private final Map b;
    private final Map c;
    private static final String d = "GET";
    private static final int e = 10000;
    private static final int f = 0x2000;

    public a(String s, Map map0) {
        this.a = s;
        this.b = map0;
        this.c = new HashMap();
    }

    private String a(Map map0) throws UnsupportedEncodingException {
        StringBuilder stringBuilder0 = new StringBuilder();
        Iterator iterator0 = map0.entrySet().iterator();
        Object object0 = iterator0.next();
        stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
        stringBuilder0.append("=");
        stringBuilder0.append((((Map.Entry)object0).getValue() == null ? "" : URLEncoder.encode(((String)((Map.Entry)object0).getValue()), "UTF-8")));
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            stringBuilder0.append("&");
            stringBuilder0.append(((String)map$Entry0.getKey()));
            stringBuilder0.append("=");
            stringBuilder0.append((map$Entry0.getValue() == null ? "" : URLEncoder.encode(((String)map$Entry0.getValue()), "UTF-8")));
        }
        return stringBuilder0.toString();
    }

    private String b(String s, Map map0) throws UnsupportedEncodingException {
        String s1 = this.a(map0);
        if(s1.isEmpty()) {
            return s;
        }
        if(s.contains("?")) {
            if(!s.endsWith("&")) {
                s1 = "&" + s1;
            }
            return s + s1;
        }
        return s + "?" + s1;
    }

    public c c() throws IOException {
        InputStream inputStream1;
        int v;
        HttpsURLConnection httpsURLConnection0;
        l.d();
        InputStream inputStream0 = null;
        try {
            String s = this.b(this.a, this.b);
            g.f().k("GET Request URL: " + s);
            httpsURLConnection0 = null;
            httpsURLConnection0 = (HttpsURLConnection)new URL(s).openConnection();
            httpsURLConnection0.setReadTimeout(10000);
            httpsURLConnection0.setConnectTimeout(10000);
            httpsURLConnection0.setRequestMethod("GET");
            for(Object object0: this.c.entrySet()) {
                httpsURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            httpsURLConnection0.connect();
            v = httpsURLConnection0.getResponseCode();
            inputStream1 = httpsURLConnection0.getInputStream();
            if(inputStream1 != null) {
                inputStream0 = inputStream1;
                inputStream0 = this.f(inputStream1);
            }
        }
        catch(Throwable throwable0) {
            if(inputStream0 != null) {
                inputStream0.close();
            }
            if(httpsURLConnection0 != null) {
                httpsURLConnection0.disconnect();
            }
            throw throwable0;
        }
        if(inputStream1 != null) {
            inputStream1.close();
        }
        httpsURLConnection0.disconnect();
        return new c(v, ((String)inputStream0));
    }

    public a d(String s, String s1) {
        this.c.put(s, s1);
        return this;
    }

    public a e(Map.Entry map$Entry0) {
        return this.d(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
    }

    private String f(InputStream inputStream0) throws IOException {
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, "UTF-8"));
        char[] arr_c = new char[0x2000];
        StringBuilder stringBuilder0 = new StringBuilder();
        int v;
        while((v = bufferedReader0.read(arr_c)) != -1) {
            stringBuilder0.append(arr_c, 0, v);
        }
        return stringBuilder0.toString();
    }
}

