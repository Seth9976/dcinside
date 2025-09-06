package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.entity.Header;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.runtime.a.b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {
    static final class a {
        private long a;
        private long b;
        private File c;
        private JSONObject d;

        private a(File file0) {
            this.d = null;
            this.c = file0;
            String[] arr_s = file0.getName().split("-|\\.");
            if(arr_s.length >= 2) {
                this.a = Long.parseLong(arr_s[0]);
                this.b = Long.parseLong(arr_s[1]);
                return;
            }
            String s = file0.getName();
            if(!TextUtils.isEmpty(s) && s.length() >= 13) {
                String s1 = s.substring(0, 13);
                if(TextUtils.isDigitsOnly(s1)) {
                    long v = Long.parseLong(s1);
                    this.a = v;
                    this.b = v;
                }
            }
        }

        a(File file0, byte b) {
            this(file0);
        }

        private JSONObject a() {
            if(this.d == null) {
                try {
                    this.d = new JSONObject(f.a(this.c.getAbsolutePath(), "\n"));
                }
                catch(Throwable unused_ex) {
                }
                if(this.d == null) {
                    this.d = new JSONObject();
                }
            }
            return this.d;
        }

        // 去混淆评级： 低(40)
        static boolean a(a o$a0, long v) {
            return o$a0.a > v && o$a0.a - v > 604800000L || (o$a0.b < v && v - o$a0.b > 604800000L || o$a0.c.lastModified() < v && v - o$a0.c.lastModified() > 604800000L);
        }

        static void d(a o$a0) {
            o$a0.c.delete();
        }
    }

    private static o a;
    private File b;
    private File c;
    private File d;
    private Context e;
    private a f;

    static {
    }

    private o(Context context0) {
        this.f = null;
        File file0 = j.c(context0);
        if(!file0.exists() || !file0.isDirectory() && file0.delete()) {
            file0.mkdirs();
            b.a();
        }
        this.b = file0;
        this.c = new File(file0, "did");
        this.d = new File(file0, "device_uuid");
        this.e = context0;
    }

    public static o a() {
        if(o.a == null) {
            o.a = new o(e.g());
        }
        return o.a;
    }

    private void a(long v, long v1, JSONObject jSONObject0, JSONArray jSONArray0) {
        File file0 = new File(this.b, v + "-" + v1 + ".ctx");
        File file1 = new File(this.b, v + "-" + v1 + ".allData");
        try {
            f.a(file0, jSONObject0);
            f.a(file1, jSONArray0);
            this.f = new a(file0, 0);
        }
        catch(IOException iOException0) {
            com.apm.insight.runtime.j.a(iOException0, "NPTH_CATCH");
        }
    }

    @Nullable
    public final JSONObject a(long v) {
        String s;
        boolean z;
        JSONObject jSONObject0;
        File file0 = null;
        Iterator iterator0 = this.c(".ctx").iterator();
        while(true) {
            jSONObject0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            a o$a0 = (a)object0;
            if(v >= o$a0.a && v <= o$a0.b) {
                file0 = o$a0.c;
                break;
            }
        }
        if(file0 == null) {
            a o$a1 = null;
            for(Object object1: this.c(".ctx")) {
                a o$a2 = (a)object1;
                if(o$a1 == null || Math.abs(o$a1.b - v) > Math.abs(o$a2.b - v)) {
                    o$a1 = o$a2;
                }
            }
            file0 = o$a1 == null ? null : o$a1.c;
            z = true;
        }
        else {
            z = false;
        }
        if(file0 != null) {
            try {
                s = null;
                s = f.a(file0.getAbsolutePath(), "\n");
                jSONObject0 = new JSONObject(s);
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(new IOException("content :" + s, throwable0), "NPTH_CATCH");
            }
        }
        if(jSONObject0 != null && z) {
            try {
                jSONObject0.put("unauthentic_version", 1);
                return jSONObject0;
            }
            catch(JSONException jSONException0) {
                com.apm.insight.runtime.j.a(jSONException0, "NPTH_CATCH");
            }
        }
        return jSONObject0;
    }

    protected final void a(String s) {
        try {
            f.a(this.c, s, false);
        }
        catch(Throwable unused_ex) {
        }
    }

    public final void a(Map map0, JSONArray jSONArray0) {
        JSONObject jSONObject0 = Header.a(this.e).a(map0);
        if(Header.c(jSONObject0)) {
            return;
        }
        long v = System.currentTimeMillis();
        if(this.f == null) {
            this.c(".ctx");
        }
        a o$a0 = this.f;
        if(o$a0 == null) {
            this.a(v, v, jSONObject0, jSONArray0);
            return;
        }
        JSONObject jSONObject1 = o$a0.a();
        if(Header.c(jSONObject1)) {
            this.a(v, v, jSONObject0, jSONArray0);
        }
        else if(!Header.c(jSONObject0)) {
            if(!String.valueOf(jSONObject0.opt("update_version_code")).equals(String.valueOf(jSONObject1.opt("update_version_code"))) || !Header.d(jSONObject1)) {
                this.a(v, v, jSONObject0, jSONArray0);
            }
            else {
                this.a(o$a0.a, v, jSONObject0, jSONArray0);
                f.a(o$a0.c);
            }
        }
        try {
            ArrayList arrayList0 = this.c("");
            if(arrayList0.size() <= 6) {
                return;
            }
            for(Object object0: arrayList0) {
                a o$a1 = (a)object0;
                if(a.a(o$a1, v)) {
                    a.d(o$a1);
                }
            }
        }
        catch(Throwable throwable0) {
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
        }
    }

    protected final String b() [...] // 潜在的解密器

    @Nullable
    public final JSONArray b(long v) {
        String s;
        File file0 = null;
        for(Object object0: this.c(".allData")) {
            a o$a0 = (a)object0;
            if(v >= o$a0.a && v <= o$a0.b) {
                file0 = o$a0.c;
                break;
            }
        }
        if(file0 == null) {
            a o$a1 = null;
            for(Object object1: this.c(".allData")) {
                a o$a2 = (a)object1;
                if(o$a1 == null || Math.abs(o$a1.b - v) > Math.abs(o$a2.b - v)) {
                    o$a1 = o$a2;
                }
            }
            file0 = o$a1 == null ? null : o$a1.c;
        }
        if(file0 != null) {
            try {
                s = null;
                s = f.a(file0.getAbsolutePath(), "\n");
                return new JSONArray(s);
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(new IOException("content :" + s, throwable0), "NPTH_CATCH");
            }
        }
        return null;
    }

    public final void b(String s) {
        try {
            f.a(this.d, s, false);
        }
        catch(Throwable unused_ex) {
        }
    }

    private ArrayList c(String s) {
        File[] arr_file = this.b.listFiles(new FilenameFilter() {
            private o b;

            // 去混淆评级： 低(20)
            @Override
            public final boolean accept(File file0, String s) {
                return s.endsWith(s) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(s).matches();
            }
        });
        ArrayList arrayList0 = new ArrayList();
        if(arr_file == null) {
            return arrayList0;
        }
        com.apm.insight.a.a(("foundRuntimeContextFiles " + arr_file.length));
        a o$a0 = null;
        for(int v = 0; v < arr_file.length; ++v) {
            File file0 = arr_file[v];
            try {
                a o$a1 = new a(file0, 0);
                arrayList0.add(o$a1);
                if(this.f == null && ".ctx".equals(s)) {
                    if(o$a0 == null) {
                        o$a0 = o$a1;
                    }
                    else if(o$a1.b >= o$a0.b) {
                        o$a0 = o$a1;
                    }
                }
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            }
        }
        if(this.f == null && o$a0 != null) {
            this.f = o$a0;
        }
        return arrayList0;
    }

    public final String c() {
        try {
            return f.a(this.d.getAbsolutePath(), "\n");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

