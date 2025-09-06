package com.pgl.ssdk.ces;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.b0;
import com.pgl.ssdk.c0;
import com.pgl.ssdk.d0;
import com.pgl.ssdk.d1;
import com.pgl.ssdk.f0;
import com.pgl.ssdk.g0;
import com.pgl.ssdk.h0;
import com.pgl.ssdk.i0;
import com.pgl.ssdk.j0;
import com.pgl.ssdk.k0;
import com.pgl.ssdk.l0;
import com.pgl.ssdk.m0;
import com.pgl.ssdk.p0;
import com.pgl.ssdk.s;
import com.pgl.ssdk.t;
import com.pgl.ssdk.u0.a;
import com.pgl.ssdk.u0;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v0;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w0;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    private static volatile b a = null;
    private static boolean b = false;
    private static Map c = null;
    private static int d = 1;
    private static a e;
    public boolean f;
    public Context g;
    private String h;
    private int i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private String n;
    private boolean o;
    public int p;

    static {
    }

    private b(Context context0, String s) {
        this.f = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.o = false;
        this.p = 2;
        this.g = context0;
        this.h = s;
    }

    public static b a(Context context0, String s, int v, int v1, String s1) {
        static final class com.pgl.ssdk.ces.b.a implements Runnable {
            @Override
            public void run() {
                x.b(x.b());
            }
        }

        if(b.a == null) {
            Class class0 = b.class;
            synchronized(class0) {
                if(b.a != null) {
                    return b.a;
                }
                if(context0 == null) {
                    context0 = z.a().getApplicationContext();
                }
                if(context0 != null) {
                    b.a(v);
                    a u0$a0 = u0.b(context0, "nms");
                    if(u0$a0 == null) {
                        b b0 = new b(context0, s);
                        b.a = b0;
                        b0.i = v1;
                        b.a.j = s1;
                        b.a.b(context0);
                        b.a.d(b.a(context0));
                        x.c(context0);
                        b.d = 0;
                        p0.b(new com.pgl.ssdk.ces.b.a());
                        return b.a;
                    }
                    b.d = u0$a0.a;
                    b.e = u0$a0;
                    return null;
                }
                b.d = 4;
                return null;
            }
            return null;
        }
        return b.a;
    }

    private static String a(Context context0) {
        String s = v0.a(context0, "iid");
        if(TextUtils.isEmpty(s)) {
            s = "334c0d7b-dad7-4361-b28b-63b4ad6570a0";
            v0.b(context0, "iid", "334c0d7b-dad7-4361-b28b-63b4ad6570a0");
        }
        return s;
    }

    private String a(Object object0) {
        if(object0 instanceof String && "Start".equals(((String)object0)) && (b.c != null && !b.c.isEmpty())) {
            try {
                return new JSONObject(b.c).toString();
            }
            catch(Exception unused_ex) {
            }
        }
        return "{}";
    }

    public static void a(int v) {
        l0.a(v);
    }

    // This method was un-flattened
    private void a(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Object object1 = jSONObject0.get(((String)object0));
                switch(((String)object0)) {
                    case "autoctl_detect_enable": {
                        if(!(object1 instanceof Boolean)) {
                            continue;
                        }
                        i0.b = ((Boolean)object1).booleanValue();
                        continue;
                    }
                    case "report_ratio": {
                        if(!(object1 instanceof Integer)) {
                            continue;
                        }
                        if(((int)(((Integer)object1))) > 0) {
                            break;
                        }
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
                this.p = (int)(((Integer)object1));
            }
        }
        catch(JSONException unused_ex) {
        }
    }

    public Object a(int v, Object object0) {
        switch(v) {
            case 120: {
                return "{\"core\":-1,\"hw\":\"\",\"max\":\"0\",\"min\":\"0\",\"ft\":\"\"}";
            }
            case 0x79: {
                return b0.a();
            }
            case 0x7A: {
                return "";
            }
            case 0x7B: {
                return d0.a(this.g);
            }
            case 0x7C: {
                return "[]";
            }
            case 0x7D: {
                return "";
            }
            case 0x7E: {
                return b0.b(this.g);
            }
            case 0x80: {
                return "";
            }
            case 0x81: {
                return c0.e(this.g);
            }
            case 130: {
                return null;
            }
            case 0x85: {
                return this.a(object0);
            }
            case 0x86: {
                return i0.a(this.g).b();
            }
            case 0x87: {
                return t.f();
            }
            case 140: {
                return j0.a(this.g).e();
            }
            case 0x8D: {
                return c0.d(this.g);
            }
            case 0x8E: {
                return z.f(this.g);
            }
            case 0x8F: {
                return f0.a(this.g);
            }
            case 0x90: {
                return j0.a(this.g).d();
            }
            case 0x91: {
                return f0.b(this.g);
            }
            case 0x92: {
                try {
                    return t.b();
                }
                catch(Throwable unused_ex) {
                    return null;
                }
            }
            case 0x93: {
                return Boolean.valueOf(z.h(this.g));
            }
            case 0x94: {
                return s.b(this.g);
            }
            case 0x95: {
                return u.a(this.g);
            }
            case 150: {
                return v.a();
            }
            case 0x97: {
                return u.c();
            }
            case 0xA1: {
                return Boolean.valueOf(t.g());
            }
            case 0xA3: {
                return h0.a();
            }
            case 0xA9: {
                return Boolean.valueOf(y.b(this.g));
            }
            case 170: {
                return w.b(((String)object0));
            }
            case 201: {
                return b0.a(this.g);
            }
            case 202: {
                return "";
            }
            case 0xEC: {
                return w0.a(((String)object0));
            }
            default: {
                return null;
            }
        }
    }

    public Map a(String s, byte[] arr_b) {
        Map map0 = new HashMap();
        if(s == null) {
            s = "";
        }
        if(arr_b == null) {
            arr_b = new byte[0];
        }
        String s1 = (String)com.pgl.ssdk.ces.a.meta(0xE0, this.g, new Object[]{s, arr_b});
        if(!TextUtils.isEmpty(s1)) {
            map0.put("X-Armors", s1);
        }
        return map0;
    }

    public void a() {
        class com.pgl.ssdk.ces.b.b implements Runnable {
            final b a;

            @Override
            public void run() {
                j0.a(b.this.g).a();
            }
        }

        p0.b(new com.pgl.ssdk.ces.b.b(this));
    }

    public void a(MotionEvent motionEvent0) {
        w.a(motionEvent0, this.g);
    }

    public void a(String s, String s1, String s2, String s3) {
        this.b(s1);
        this.c(s3);
        try {
            this.l();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void a(String s, Map map0) {
        try {
            long v = "Start".equals(s) ? 10000L : 0L;
            Handler handler0 = p0.b();
            if(handler0 != null) {
                handler0.postDelayed(new m0(this.g, 0xDE, new Object[]{s, map0}), v);
            }
            this.a();
            x.a();
        }
        catch(Throwable unused_ex) {
        }
    }

    // This method was un-flattened
    public void a(Map map0) {
        Object object1;
        synchronized(this) {
            if(map0 != null && !map0.isEmpty()) {
                try {
                    Iterator iterator0 = map0.keySet().iterator();
                alab1:
                    while(true) {
                    label_4:
                        if(!iterator0.hasNext()) {
                            if(b.c == null) {
                                b.c = new HashMap();
                            }
                            b.c.putAll(map0);
                            return;
                        }
                        Object object0 = iterator0.next();
                        String s = (String)object0;
                        object1 = map0.get(s);
                        if(object1 != null) {
                            switch(s) {
                                case "check_clz": {
                                    goto label_29;
                                }
                                case "fields_allowed": {
                                    break alab1;
                                }
                                case "key_ipv6": {
                                    goto label_34;
                                }
                                case "key_transfer_host": {
                                    if(!(object1 instanceof String)) {
                                        break;
                                    }
                                    l0.a(((String)object1));
                                    break;
                                }
                                case "sec_config": {
                                    if(!(object1 instanceof String)) {
                                        break;
                                    }
                                    this.a(((String)object1));
                                }
                            }
                        }
                    }
                }
                catch(Throwable unused_ex) {
                    return;
                }
                if(object1 instanceof Set) {
                    goto label_23;
                }
                else {
                    goto label_4;
                    try {
                    label_23:
                        com.pgl.ssdk.ces.a.meta(0xA5, null, Boolean.valueOf(((Set)object1).contains("boot")));
                        com.pgl.ssdk.ces.a.meta(0xA6, null, Boolean.valueOf(((Set)object1).contains("mnc")));
                        com.pgl.ssdk.ces.a.meta(0xA7, null, Boolean.valueOf(((Set)object1).contains("mcc")));
                        com.pgl.ssdk.ces.a.meta(0xA8, null, Boolean.valueOf(((Set)object1).contains("gaid")));
                        this.m = ((Set)object1).contains("gaid");
                    }
                    catch(Throwable unused_ex) {
                    }
                    goto label_4;
                }
                try {
                label_29:
                    if(!(object1 instanceof String)) {
                        goto label_4;
                    }
                    String s1 = g0.a(((String)object1));
                    if(TextUtils.isEmpty(s1)) {
                        goto label_4;
                    }
                    com.pgl.ssdk.ces.a.meta(0x9F, null, s1);
                    goto label_4;
                label_34:
                    if(!(object1 instanceof String) || TextUtils.isEmpty(((String)object1))) {
                        goto label_4;
                    }
                    k0.a(((String)object1));
                    goto label_4;
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    private void b(Context context0) {
        if(context0 != null && !b.b) {
            try {
                com.pgl.ssdk.ces.a.meta(101, null, "1");
                com.pgl.ssdk.ces.a.meta(102, null, this.h);
                com.pgl.ssdk.ces.a.meta(0x72, null, this.i);
                com.pgl.ssdk.ces.a.meta(105, null, z.g(context0));
                com.pgl.ssdk.ces.a.meta(106, null, z.e(context0));
                com.pgl.ssdk.ces.a.meta(107, null, z.d(context0));
                com.pgl.ssdk.ces.a.meta(108, null, z.c(context0));
                com.pgl.ssdk.ces.a.meta(109, null, z.c());
                com.pgl.ssdk.ces.a.meta(110, null, z.b());
                com.pgl.ssdk.ces.a.meta(0x73, null, this.j);
                b.b = true;
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public void b() {
        class c implements Runnable {
            final b a;

            @Override
            public void run() {
                z.b(b.this.g);
            }
        }

        p0.b(new c(this));
    }

    public void b(String s) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && !s.equals(this.k)) {
                this.k = s;
                com.pgl.ssdk.ces.a.meta(103, null, s);
                d1.b();
            }
        }
    }

    public static String c() {
        return b.h() == null ? null : b.h().h;
    }

    public void c(String s) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && !s.equals(this.l)) {
                com.pgl.ssdk.ces.a.meta(0x6F, null, s);
                this.l = s;
                d1.b();
            }
        }
    }

    public static String d() {
        return b.h() == null ? null : b.h().k;
    }

    private void d(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.n = s;
            com.pgl.ssdk.ces.a.meta(104, null, s);
        }
    }

    public long e() {
        return x.a(this.g);
    }

    public static String f() {
        b b0 = b.h();
        return b0 == null || !b0.m || TextUtils.isEmpty(b0.l) ? null : b0.l;
    }

    public static int g() [...] // 潜在的解密器

    public static b h() {
        return b.a;
    }

    public static a i() {
        return b.e;
    }

    public String j() {
        return x.c();
    }

    public String k() {
        return d1.a();
    }

    public void l() {
        this.o = true;
        d1.a(this.g, this.h);
        this.a("Start", null);
    }
}

