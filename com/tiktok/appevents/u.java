package com.tiktok.appevents;

import android.app.Application;
import androidx.annotation.NonNull;
import com.tiktok.b;
import com.tiktok.util.f;
import com.tiktok.util.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class u {
    static class a implements Serializable {
        static class com.tiktok.appevents.u.a.a implements Serializable {
            public final String a;
            public long b;
            public int c;

            public com.tiktok.appevents.u.a.a(String s, long v, int v1) {
                this.a = s;
                this.b = v;
                this.c = v1;
            }
        }

        List a;

        a() {
            this.a = new ArrayList();
        }

        public void a(String s, long v, int v1) {
            if(v1 < 2) {
                this.a.add(new com.tiktok.appevents.u.a.a(s, v, v1));
            }
        }
    }

    private static final String a = "com.tiktok.appevents.u";
    private static final f b = null;
    private static final String c = "tt_crash_log";
    private static final int d = 2;
    private static final int e = 5;
    static a f;

    static {
        u.b = new f(u.class.getCanonicalName(), b.o());
        u.f = new a();
    }

    private static String a(Throwable throwable0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            stringBuilder0.append(arr_stackTraceElement[v].toString());
            stringBuilder0.append("\n");
        }
        return stringBuilder0.toString();
    }

    public static void b(String s, Throwable throwable0, int v) {
        u.b.b(throwable0, "Error caused by sdk at " + s + "\n" + throwable0.getMessage() + "\n" + u.a(throwable0), new Object[0]);
        u.f(throwable0, v);
    }

    public static void c() {
        a u$a0 = u.h();
        if(u$a0 != null) {
            u.f.a.addAll(u$a0.a);
            try {
                File file0 = new File(b.l().getFilesDir(), "tt_crash_log");
                if(file0.exists()) {
                    file0.delete();
                }
            }
            catch(Exception unused_ex) {
            }
        }
        a u$a1 = u.i(u.f);
        u.f = u$a1;
        u.k(u$a1);
        u.f = new a();
    }

    public static boolean d(Throwable throwable0) {
        if(throwable0 == null) {
            return false;
        }
        Throwable throwable1 = null;
        while(throwable0 != null && throwable0 != throwable1) {
            if(u.e(throwable0.getStackTrace())) {
                return true;
            }
            throwable1 = throwable0;
            throwable0 = throwable0.getCause();
        }
        return false;
    }

    public static boolean e(StackTraceElement[] arr_stackTraceElement) {
        if(arr_stackTraceElement == null) {
            return false;
        }
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            if(arr_stackTraceElement[v].getClassName().startsWith("com.tiktok")) {
                return true;
            }
        }
        return false;
    }

    private static void f(Throwable throwable0, int v) {
        JSONObject jSONObject0 = null;
        try {
            jSONObject0 = z.h();
            jSONObject0.put("monitor", g.d(throwable0, null, v));
            u.f.a(jSONObject0.toString(), System.currentTimeMillis(), 0);
            u.k(u.f);
            u.f = new a();
        }
        catch(Exception unused_ex) {
            if(jSONObject0 != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(jSONObject0);
                JSONObject jSONObject1 = z.d();
                try {
                    jSONObject1.put("batch", new JSONArray(arrayList0));
                }
                catch(Exception unused_ex) {
                }
                y.f(jSONObject1);
            }
        }
    }

    public static void g() {
        for(Object object0: u.f.a) {
            u.b.c("persistToFile %s", new Object[]{((com.tiktok.appevents.u.a.a)object0).a});
        }
        u.k(u.f);
        u.f = new a();
    }

    private static a h() {
        a u$a0 = new a();
        Application application0 = b.l();
        try {
            FileInputStream fileInputStream0 = application0.openFileInput("tt_crash_log");
            u$a0 = A.c(fileInputStream0);
            fileInputStream0.close();
        }
        catch(Exception unused_ex) {
        }
        return u$a0;
    }

    private static a i(@NonNull a u$a0) {
        if(u$a0.a.size() == 0) {
            return u$a0;
        }
        a u$a1 = new a();
        for(int v = 0; v < u$a0.a.size(); v += 5) {
            List list0 = u$a0.a.subList(v, (v + 5 <= u$a0.a.size() ? v + 5 : u$a0.a.size()));
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                com.tiktok.appevents.u.a.a u$a$a0 = (com.tiktok.appevents.u.a.a)object0;
                try {
                    arrayList0.add(new JSONObject(u$a$a0.a));
                }
                catch(Exception unused_ex) {
                }
            }
            JSONObject jSONObject0 = z.d();
            try {
                jSONObject0.put("batch", new JSONArray(arrayList0));
            }
            catch(Exception unused_ex) {
            }
            if(com.tiktok.util.a.f(y.f(jSONObject0)) != 0) {
                for(Object object1: list0) {
                    u$a1.a(((com.tiktok.appevents.u.a.a)object1).a, System.currentTimeMillis(), ((com.tiktok.appevents.u.a.a)object1).c + 1);
                }
            }
        }
        return u$a1;
    }

    public static void j(JSONObject jSONObject0) {
        u.f.a(jSONObject0.toString(), System.currentTimeMillis(), 0);
        if(u.f.a.size() >= 5) {
            u.c();
        }
    }

    private static void k(a u$a0) {
        try {
            FileOutputStream fileOutputStream0 = b.l().openFileOutput("tt_crash_log", 0);
            ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(fileOutputStream0);
            objectOutputStream0.writeObject(u$a0);
            objectOutputStream0.close();
            fileOutputStream0.close();
        }
        catch(Exception unused_ex) {
            u.i(u$a0);
        }
    }
}

