package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.l.f;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

public final class n {
    public static final class a {
        public String a;
        private String b;
        private long c;

        a(String s) {
            String[] arr_s = s.split("\\s+");
            if(arr_s.length == 3) {
                this.b = arr_s[0];
                this.a = arr_s[1];
                try {
                    this.c = Long.parseLong(arr_s[2]);
                }
                catch(Throwable throwable0) {
                    j.a(new RuntimeException("err ProcessTrack line:" + s, throwable0), "NPTH_CATCH");
                }
                return;
            }
            j.a(new RuntimeException("err ProcessTrack line:" + s), "NPTH_CATCH");
        }
    }

    private static File a;

    static {
    }

    // 去混淆评级： 低(20)
    public static File a(long v) {
        return new File("/sdcard/", "apminsight/ProcessTrack/" + (v - v % 86400000L) / 86400000L);
    }

    @NonNull
    public static HashMap a(long v, String s) {
        File file0 = new File("/sdcard/", "apminsight/ProcessTrack/" + (v - v % 86400000L) / 86400000L);
        String[] arr_s = file0.list();
        HashMap hashMap0 = new HashMap();
        if(arr_s != null) {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s1 = arr_s[v1];
                File file1 = new File(file0, s1);
                long v2 = file1.length();
                try {
                    JSONArray jSONArray0 = f.a(file1, (v2 <= 0x100000L ? 0L : v2 - 0x80000L));
                    for(int v3 = jSONArray0.length() - 1; v3 >= 0; --v3) {
                        String s2 = jSONArray0.optString(v3);
                        if(!TextUtils.isEmpty(s2) && s2.startsWith(s)) {
                            hashMap0.put(s1.replace('_', ':').replace(".txt", ""), new a(s2));
                            break;
                        }
                    }
                }
                catch(IOException unused_ex) {
                }
            }
        }
        return hashMap0;
    }

    public static void a(String s, String s1) {
        try {
            if(n.a == null) {
                long v = System.currentTimeMillis();
                n.a = new File("/sdcard/", "apminsight/ProcessTrack/" + (v - v % 86400000L) / 86400000L + '/' + "" + ".txt");
            }
            File file0 = n.a;
            if(file0 != null) {
                f.a(file0, s + ' ' + s1 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

