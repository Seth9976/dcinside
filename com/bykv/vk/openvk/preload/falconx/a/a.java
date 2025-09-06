package com.bykv.vk.openvk.preload.falconx.a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.b.b.b;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class a {
    private final Map a;

    public a() {
        this.a = new HashMap();
    }

    public static WebResourceResponse a(InputStream inputStream0, Map map0) {
        if(inputStream0 != null) {
            try {
                String s = (String)map0.get("content-type");
                boolean z = false;
                String[] arr_s = new String[0];
                if(TextUtils.isEmpty(s)) {
                    s = (String)map0.get("Content-Type");
                }
                if(!TextUtils.isEmpty(s) && s != null) {
                    s = s.replace(" ", "");
                    arr_s = s.split(";");
                }
                String s1 = "";
                String s2 = "";
                for(int v = 0; v < arr_s.length; ++v) {
                    String s3 = arr_s[v];
                    if(!TextUtils.isEmpty(s3)) {
                        int v1 = s3.indexOf("=");
                        if(v1 == -1) {
                            s1 = s3;
                        }
                        else if(s3.contains("charset")) {
                            s2 = s3.substring(v1 + 1);
                        }
                    }
                }
                if(s != null) {
                    z = s.contains("font/ttf");
                }
                if(z) {
                    return new WebResourceResponse(s1, s2, 200, "OK", map0, inputStream0);
                }
                WebResourceResponse webResourceResponse0 = new WebResourceResponse(s1, s2, inputStream0);
                webResourceResponse0.setResponseHeaders(map0);
                return webResourceResponse0;
            }
            catch(Throwable throwable0) {
            }
            Log.e("WebResourceUtils", "getResponseWithHeaders error", throwable0);
        }
        return null;
    }

    public static Object a(Object object0) {
        object0.getClass();
        return object0;
    }

    public static DateFormat a(int v, int v1) {
        String s1;
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(v) {
            case 0: {
                s = "EEEE, MMMM d, yyyy";
                break;
            }
            case 1: {
                s = "MMMM d, yyyy";
                break;
            }
            case 2: {
                s = "MMM d, yyyy";
                break;
            }
            case 3: {
                s = "M/d/yy";
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown DateFormat style: " + v);
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" ");
        switch(v1) {
            case 0: 
            case 1: {
                s1 = "h:mm:ss a z";
                break;
            }
            case 2: {
                s1 = "h:mm:ss a";
                break;
            }
            case 3: {
                s1 = "h:mm a";
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown DateFormat style: " + v1);
            }
        }
        stringBuilder0.append(s1);
        return new SimpleDateFormat(stringBuilder0.toString(), Locale.US);
    }

    public static void a(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public final com.bykv.vk.openvk.preload.b.b.a a(Class class0) {
        synchronized(this.a) {
            return (com.bykv.vk.openvk.preload.b.b.a)this.a.get(class0);
        }
    }

    public final void a(Class class0, com.bykv.vk.openvk.preload.b.b.a a0) {
        Map map0 = this.a;
        __monitor_enter(map0);
        try {
            b b0 = (b)this.a.get(class0);
            if(b0 == null) {
                b0 = new b(new com.bykv.vk.openvk.preload.b.b.a[0]);
                this.a.put(class0, b0);
            }
            b0.a(a0);
            __monitor_exit(map0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }
}

