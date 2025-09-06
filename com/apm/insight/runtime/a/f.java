package com.apm.insight.runtime.a;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class f {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile f a;
    private Context b;
    private Map c;
    private b d;
    private d e;

    private f(@NonNull Context context0) {
        this.c = new HashMap();
        this.b = context0;
        try {
            this.d = b.d();
            this.e = new d(this.b);
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
        }
    }

    @Nullable
    private c a(CrashType crashType0) {
        c c0 = (c)this.c.get(crashType0);
        if(c0 != null) {
            return c0;
        }
        switch(crashType0) {
            case 1: {
                c0 = new com.apm.insight.runtime.a.j(this.b, this.d, this.e);
                break;
            }
            case 2: {
                c0 = new k(this.b, this.d, this.e);
                break;
            }
            case 3: {
                c0 = new l(this.b, this.d, this.e);
                break;
            }
            case 4: {
                c0 = new a(this.b, this.d, this.e);
                break;
            }
            case 5: {
                c0 = new h(this.b, this.d, this.e);
                break;
            }
            case 6: {
                c0 = new g(this.b, this.d, this.e);
                break;
            }
            case 7: {
                c0 = new e(this.b, this.d, this.e);
                break;
            }
            case 8: {
                c0 = new i(this.b, this.d, this.e);
            }
        }
        if(c0 != null) {
            this.c.put(crashType0, c0);
        }
        return c0;
    }

    public static f a() {
        if(f.a == null) {
            Context context0 = com.apm.insight.e.g();
            if(context0 == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f.a = new f(context0);
            return f.a;
        }
        return f.a;
    }

    public final com.apm.insight.entity.a a(CrashType crashType0, com.apm.insight.entity.a a0) {
        if(crashType0 == null) {
            return a0;
        }
        c c0 = this.a(crashType0);
        return c0 == null ? a0 : c0.a(a0, null, false);
    }

    public final com.apm.insight.entity.a a(CrashType crashType0, @Nullable com.apm.insight.runtime.a.c.a c$a0) {
        if(crashType0 == null) {
            return null;
        }
        c c0 = this.a(crashType0);
        return c0 == null ? null : c0.a(null, c$a0, true);
    }

    public final com.apm.insight.entity.a a(List list0, JSONArray jSONArray0) {
        if(list0.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a a0 = new com.apm.insight.entity.a();
        JSONArray jSONArray1 = new JSONArray();
        for(Object object0: list0) {
            jSONArray1.put(((com.apm.insight.entity.a)object0).c());
        }
        a0.a("data", jSONArray1);
        a0.a("all_data", jSONArray0);
        Header header0 = Header.a(this.b);
        Header.a(header0);
        header0.c();
        header0.d();
        header0.e();
        Header.b(header0);
        a0.a(header0);
        return a0;
    }
}

