package com.bykv.vk.openvk.PjT.PjT.Zh.ReZ;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.b;
import com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.c;
import com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c;
import com.bykv.vk.openvk.PjT.PjT.Zh.Zh.h.c;
import com.bykv.vk.openvk.PjT.PjT.Zh.Zh.h.d;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.cz;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class a {
    private static final Handler a;
    public static final Charset b;

    static {
        a.a = new Handler(Looper.getMainLooper());
        a.b = Charset.forName("UTF-8");
    }

    public static int a() [...] // 潜在的解密器

    public static int b(c.c c$c0) {
        if(c$c0 == null) {
            return -1;
        }
        switch(c$c0.b()) {
            case 200: {
                return a.c(c$c0.e("Content-Length", null), -1);
            }
            case 206: {
                String s = c$c0.e("Content-Range", null);
                if(!TextUtils.isEmpty(s)) {
                    int v = s.lastIndexOf("/");
                    return v < 0 || v >= s.length() - 1 ? -1 : a.c(s.substring(v + 1), -1);
                }
                return -1;
            }
            default: {
                return -1;
            }
        }
    }

    public static int c(String s, int v) {
        if(TextUtils.isEmpty(s)) {
            return v;
        }
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static h.c d(c.c c$c0, h.d h$d0, String s, int v) {
        String s5;
        String s3;
        String s2;
        h.c h$c0 = h$d0.c(s, v);
        if(h$c0 == null) {
            int v1 = a.b(c$c0);
            String s1 = c$c0.e("Content-Type", null);
            if(v1 > 0 && !TextUtils.isEmpty(s1)) {
                c.b c$b0 = c$c0.g();
                if(c$b0 == null) {
                    s3 = "";
                    s2 = "";
                }
                else {
                    s2 = c$b0.b;
                    s3 = a.w(c$b0.e);
                }
                String s4 = a.v(c$c0.f());
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("requestUrl", s2);
                    jSONObject0.put("requestHeaders", s3);
                    s5 = "";
                    jSONObject0.put("responseHeaders", s4);
                    s5 = jSONObject0.toString();
                }
                catch(Throwable unused_ex) {
                }
                h$c0 = new h.c(s, s1, v1, v, s5);
                h$d0.f(h$c0);
            }
        }
        return h$c0;
    }

    public static String e(int v, int v1) {
        String s = a.u(v, v1);
        return s == null ? null : "bytes=" + s;
    }

    public static String f(c.c c$c0, int v) {
        if(c$c0 != null && c$c0.h()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(c$c0.a().toUpperCase());
            stringBuilder0.append(' ');
            stringBuilder0.append(c$c0.b());
            stringBuilder0.append(' ');
            stringBuilder0.append(c$c0.j());
            stringBuilder0.append("\r\n");
            if(c.d) {
                Log.i("TAG_PROXY_headers", c$c0.a().toUpperCase() + " " + c$c0.b() + " " + c$c0.j());
            }
            List list0 = a.i(c$c0.f());
            boolean z = true;
            if(list0 != null) {
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c f$c0 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c)list0.get(v2);
                    if(f$c0 != null) {
                        String s = f$c0.a;
                        String s1 = f$c0.b;
                        stringBuilder0.append(s);
                        stringBuilder0.append(": ");
                        stringBuilder0.append(s1);
                        stringBuilder0.append("\r\n");
                        if("Content-Range".equalsIgnoreCase(s)) {
                            z = false;
                        }
                        else if("Accept-Ranges".equalsIgnoreCase(s) && "bytes".equalsIgnoreCase(s1)) {
                            z = false;
                        }
                    }
                }
            }
            if(z) {
                int v3 = a.b(c$c0);
                if(v3 > 0) {
                    stringBuilder0.append("Content-Range: bytes ");
                    stringBuilder0.append(Math.max(v, 0));
                    stringBuilder0.append("-");
                    stringBuilder0.append(v3 - 1);
                    stringBuilder0.append("/");
                    stringBuilder0.append(v3);
                    stringBuilder0.append("\r\n");
                }
            }
            stringBuilder0.append("Connection: close\r\n");
            stringBuilder0.append("\r\n");
            String s2 = stringBuilder0.toString();
            if(c.d) {
                Log.i("TAG_PROXY_WRITE_TO_MP", s2);
            }
            return s2;
        }
        return null;
    }

    public static String g(c.c c$c0, boolean z, boolean z1) {
        if(c$c0 == null) {
            if(c.d) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        }
        if(!c$c0.h()) {
            if(c.d) {
                Log.e("TAG_PROXY_Response", "response code: " + c$c0.b());
            }
            return "response code: " + c$c0.b();
        }
        String s = c$c0.e("Content-Type", null);
        if(!a.s(s)) {
            if(c.d) {
                Log.e("TAG_PROXY_Response", "Content-Type: " + s);
            }
            return "Content-Type: " + s;
        }
        int v = a.b(c$c0);
        if(v <= 0) {
            if(c.d) {
                Log.e("TAG_PROXY_Response", "Content-Length: " + v);
            }
            return "Content-Length: " + v;
        }
        if(z) {
            String s1 = c$c0.e("Accept-Ranges", null);
            if(s1 == null || !s1.contains("bytes")) {
                if(c.d) {
                    Log.e("TAG_PROXY_Response", "Accept-Ranges: " + s1);
                }
                return "Accept-Ranges: " + s1;
            }
        }
        if(z1 && c$c0.i() == null) {
            if(c.d) {
                Log.e("TAG_PROXY_Response", "response body null");
            }
            return "response body null";
        }
        return null;
    }

    public static String h(h.c h$c0, int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(v <= 0) {
            stringBuilder0.append("HTTP/1.1 200 OK\r\n");
        }
        else {
            stringBuilder0.append("HTTP/1.1 206 Partial Content\r\n");
        }
        stringBuilder0.append("Accept-Ranges: bytes\r\n");
        stringBuilder0.append("Content-Type: ");
        stringBuilder0.append(h$c0.b);
        stringBuilder0.append("\r\n");
        if(v <= 0) {
            stringBuilder0.append("Content-Length: ");
            stringBuilder0.append(h$c0.c);
        }
        else {
            stringBuilder0.append("Content-Range: bytes ");
            stringBuilder0.append(v);
            stringBuilder0.append("-");
            stringBuilder0.append(h$c0.c - 1);
            stringBuilder0.append("/");
            stringBuilder0.append(h$c0.c);
            stringBuilder0.append("\r\n");
            stringBuilder0.append("Content-Length: ");
            stringBuilder0.append(h$c0.c - v);
        }
        stringBuilder0.append("\r\n");
        stringBuilder0.append("Connection: close\r\n");
        stringBuilder0.append("\r\n");
        String s = stringBuilder0.toString();
        if(c.d) {
            Log.i("TAG_PROXY_WRITE_TO_MP", s);
        }
        return s;
    }

    public static List i(List list0) {
        if(list0 != null && list0.size() != 0) {
            if(c.d) {
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c f$c0 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c)list0.get(v2);
                    if(f$c0 != null) {
                        Log.i("TAG_PROXY_PRE_FILTER", f$c0.a + ": " + f$c0.a);
                    }
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c f$c1 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c)object0;
                if("Host".equals(f$c1.a) || "Keep-Alive".equals(f$c1.a) || "Connection".equals(f$c1.a) || "Proxy-Connection".equals(f$c1.a)) {
                    arrayList0.add(f$c1);
                }
            }
            list0.removeAll(arrayList0);
            if(c.d) {
                int v3 = list0.size();
                for(int v = 0; v < v3; ++v) {
                    com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c f$c2 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c)list0.get(v);
                    if(f$c2 != null) {
                        Log.i("TAG_PROXY_POST_FILTER", f$c2.a + ": " + f$c2.b);
                    }
                }
            }
            return list0;
        }
        return null;
    }

    public static List j(Map map0) {
        if(map0 != null && !map0.isEmpty()) {
            try {
                Set set0 = map0.entrySet();
                List list0 = new ArrayList();
                for(Object object0: set0) {
                    list0.add(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue())));
                }
                return list0;
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    public static List k(String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            List list0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(a.r(s)) {
                    ((ArrayList)list0).add(s);
                }
            }
            return ((ArrayList)list0).isEmpty() ? null : list0;
        }
        return null;
    }

    public static void l(Au au0) {
        if(au0 != null) {
            if(a.x()) {
                cz.Zh(au0);
                if(c.d) {
                    Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                }
            }
            else {
                au0.run();
                if(c.d) {
                    Log.e("TAG_PROXY_UTIL", "invoke calling thread");
                }
            }
        }
    }

    public static void m(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void n(RandomAccessFile randomAccessFile0) {
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.getFD().sync();
                randomAccessFile0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void o(Runnable runnable0) {
        if(runnable0 != null) {
            if(a.x()) {
                runnable0.run();
                return;
            }
            a.a.post(runnable0);
        }
    }

    public static void p(ServerSocket serverSocket0) {
        if(serverSocket0 != null) {
            try {
                serverSocket0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void q(Socket socket0) {
        if(socket0 != null) {
            try {
                socket0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean r(String s) {
        return s != null && (s.startsWith("http://") || s.startsWith("https://"));
    }

    // 去混淆评级： 低(30)
    public static boolean s(String s) {
        return s != null && (s.startsWith("video/") || "application/octet-stream".equals(s) || "binary/octet-stream".equals(s));
    }

    public static int t(String s) {
        return a.c(s, 0);
    }

    public static String u(int v, int v1) {
        if(v >= 0 && v1 > 0) {
            return v + "-" + v1;
        }
        if(v > 0) {
            return v + "-";
        }
        return v >= 0 || v1 <= 0 ? null : "-" + v1;
    }

    public static String v(List list0) {
        if(list0 != null && list0.size() != 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c f$c0 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c)list0.get(0);
                if(f$c0 != null) {
                    stringBuilder0.append(f$c0.a);
                    stringBuilder0.append(": ");
                    stringBuilder0.append(f$c0.b);
                    stringBuilder0.append("\r\n");
                }
            }
            return stringBuilder0.toString();
        }
        return "";
    }

    public static String w(Map map0) {
        if(map0 != null && map0.size() != 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: map0.entrySet()) {
                stringBuilder0.append(((Map.Entry)object0).getKey());
                stringBuilder0.append(": ");
                stringBuilder0.append(((Map.Entry)object0).getValue());
                stringBuilder0.append("\r\n");
            }
            return stringBuilder0.toString();
        }
        return "";
    }

    public static boolean x() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}

