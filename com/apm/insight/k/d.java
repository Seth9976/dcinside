package com.apm.insight.k;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.a;
import com.apm.insight.e;
import com.apm.insight.h.b;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.n;
import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile d a;
    private volatile Context b;

    private d(@NonNull Context context0) {
        this.b = context0;
    }

    public static d a() {
        if(d.a == null) {
            d.a = new d(e.g());
        }
        return d.a;
    }

    public static boolean a(JSONObject jSONObject0, File file0, File file1) {
        try {
            return com.apm.insight.k.e.a("", jSONObject0.toString(), new File[]{file0, file1, n.a(System.currentTimeMillis()), new File(b.a())}).a();
        }
        catch(Throwable throwable0) {
            a.b(throwable0);
            return false;
        }
    }

    public final void a(JSONObject jSONObject0, long v, boolean z) {
        File[] arr_file;
        if(jSONObject0 != null && jSONObject0.length() > 0) {
            try {
                int v1 = 0;
                File file0 = new File(j.a(this.b), e.a(v, CrashType.ANR, false, false));
                f.a(file0, file0.getName(), "", jSONObject0, false);
                if(z) {
                    jSONObject0.put("upload_scene", "direct");
                    jSONObject0.put("crash_uuid", file0.getName());
                    if(com.apm.insight.runtime.a.h()) {
                        HashMap hashMap0 = n.a(v, "anr_trace");
                        arr_file = new File[hashMap0.size() + 2];
                        for(Object object0: hashMap0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            if(!((String)map$Entry0.getKey()).equals(com.apm.insight.l.a.d(this.b))) {
                                arr_file[v1] = j.a(this.b, ((com.apm.insight.runtime.n.a)map$Entry0.getValue()).a);
                                ++v1;
                            }
                        }
                    }
                    else {
                        arr_file = new File[2];
                    }
                    arr_file[arr_file.length - 1] = j.a(this.b, "8782da059da78adbU");
                    arr_file[arr_file.length - 2] = n.a(v);
                    if(com.apm.insight.k.e.a("", jSONObject0.toString(), arr_file).a()) {
                        f.a(file0);
                        if(!Npth.hasCrash()) {
                            f.a(j.e(e.g()));
                        }
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public final boolean a(JSONObject jSONObject0) {
        if(jSONObject0 != null && jSONObject0.length() > 0) {
            try {
                File file0 = new File(j.a(this.b), "dart_73ebb588e4e0083U_82fc1d55bdbf960bG");
                f.a(file0, file0.getName(), "", jSONObject0, false);
                jSONObject0.put("upload_scene", "direct");
                if(com.apm.insight.k.e.b("", jSONObject0.toString()).a()) {
                    f.a(file0);
                    return true;
                }
                return false;
            }
            catch(Throwable throwable0) {
                a.b(throwable0);
            }
        }
        return false;
    }

    public final void b(JSONObject jSONObject0) {
        if(jSONObject0 != null && jSONObject0.length() > 0) {
            try {
                File file0 = new File(j.a(this.b), "ensure_7803f9a25e7ae288U_9147cdfff9d8b149G");
                f.a(file0, file0.getName(), "", jSONObject0, false);
                if(com.apm.insight.k.e.a("", jSONObject0.toString()).a()) {
                    f.a(file0);
                }
            }
            catch(Throwable throwable0) {
                a.b(throwable0);
            }
        }
    }

    public final void c(JSONObject jSONObject0) {
        if(jSONObject0 != null && jSONObject0.length() != 0) {
            m.a().a(new Runnable() {
                private d b;

                @Override
                public final void run() {
                    try {
                        jSONObject0.put("upload_scene", "direct");
                    }
                    catch(JSONException jSONException0) {
                        jSONException0.printStackTrace();
                    }
                    com.apm.insight.k.e.b("", jSONObject0.toString());
                }
            });
        }
    }
}

