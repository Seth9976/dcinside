package com.apm.insight.runtime;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONArray;

public final class f {
    private Context a;
    private HashMap b;
    private int c;
    private int d;

    public f(Context context0) {
        this.c = 50;
        this.d = 100;
        this.a = context0;
        this.b = this.b();
        this.c = a.a(this.c, new String[]{"custom_event_settings", "npth_simple_setting", "crash_limit_issue"});
        this.d = a.a(this.d, new String[]{"custom_event_settings", "npth_simple_setting", "crash_limit_all"});
    }

    public final void a() {
        HashMap hashMap0 = this.b;
        Long long0 = (Long)hashMap0.remove("time");
        if(long0 == null) {
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(long0);
        stringBuilder0.append('\n');
        for(Object object0: hashMap0.entrySet()) {
            stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
            stringBuilder0.append(' ');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            stringBuilder0.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.a), stringBuilder0.toString(), false);
        }
        catch(IOException unused_ex) {
        }
    }

    public final boolean a(String s) {
        if(s == null) {
            s = "default";
        }
        long v = (long)com.apm.insight.l.c.1.a(this.b, "all", 1L);
        return ((long)com.apm.insight.l.c.1.a(this.b, s, 1L)) < ((long)this.c) && v < ((long)this.d);
    }

    private HashMap b() {
        File file0 = com.apm.insight.l.j.h(this.a);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("time", System.currentTimeMillis());
        try {
            JSONArray jSONArray0 = com.apm.insight.l.f.a(file0.getAbsolutePath());
            if(com.apm.insight.a.a(jSONArray0)) {
                return hashMap0;
            }
            Long long0 = Long.decode(jSONArray0.optString(0, null));
            if(System.currentTimeMillis() - ((long)long0) > 86400000L) {
                File file1 = com.apm.insight.l.j.g(this.a);
                file0.renameTo(new File(file1, "1757088857094"));
                String[] arr_s = file1.list();
                if(arr_s != null && arr_s.length > 5) {
                    Arrays.sort(arr_s);
                    new File(file1, arr_s[0]).delete();
                    return hashMap0;
                }
                return hashMap0;
            }
            hashMap0.put("time", long0);
            for(int v = 1; true; ++v) {
                if(v >= jSONArray0.length()) {
                    return hashMap0;
                }
                String[] arr_s1 = jSONArray0.optString(v, "").split(" ");
                if(arr_s1.length == 2) {
                    hashMap0.put(arr_s1[0], Long.decode(arr_s1[1]));
                }
            }
        }
        catch(IOException unused_ex) {
            return hashMap0;
        }
        catch(Throwable throwable0) {
        }
        j.a(throwable0, "NPTH_CATCH");
        return hashMap0;
    }
}

