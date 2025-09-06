package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.b.h.a;
import com.apm.insight.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

public final class h {
    private static a a;

    static {
    }

    public static JSONArray a(String s) {
        if(h.a != null && "ba8eede9bdbc762dU".equals(s)) {
            try {
                return h.b(h.a.b());
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
            }
        }
        int v = e.i().getLogcatDumpCount();
        int v1 = e.i().getLogcatLevel();
        try {
            return h.b(com.apm.insight.a.a(s, v, v1).getAbsolutePath());
        }
        catch(Throwable throwable1) {
            j.a(throwable1, "NPTH_CATCH");
            return null;
        }
    }

    public static void a(a h$a0) {
        h.a = h$a0;
    }

    private static JSONArray b(String s) {
        BufferedReader bufferedReader1;
        JSONArray jSONArray0;
        BufferedReader bufferedReader0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            jSONArray0 = new JSONArray();
            bufferedReader1 = null;
            bufferedReader1 = new BufferedReader(new FileReader(s));
            goto label_9;
        }
        catch(IOException iOException0) {
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
        goto label_23;
        try {
            try {
            label_9:
                File file0 = new File(s);
                if(file0.length() > 0x7D000L) {
                    bufferedReader1.skip(file0.length() - 0x7D000L);
                }
                while(true) {
                    String s1 = bufferedReader1.readLine();
                    if(s1 == null) {
                        goto label_25;
                    }
                    jSONArray0.put(s1);
                }
                bufferedReader0 = bufferedReader1;
                goto label_23;
            }
            catch(IOException iOException0) {
            }
        label_20:
            iOException0.printStackTrace();
        }
        catch(Throwable throwable0) {
            bufferedReader0 = bufferedReader1;
            goto label_23;
        }
        com.apm.insight.a.a(bufferedReader1);
        return null;
    label_23:
        com.apm.insight.a.a(bufferedReader0);
        throw throwable0;
    label_25:
        com.apm.insight.a.a(bufferedReader1);
        return jSONArray0;
    }
}

