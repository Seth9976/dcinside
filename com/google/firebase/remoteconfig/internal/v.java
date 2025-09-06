package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o3.h;
import org.json.JSONException;
import org.json.JSONObject;

@AnyThread
public class v {
    private final Context a;
    private final String b;
    @GuardedBy("ConfigStorageClient.class")
    private static final Map c = null;
    private static final String d = "UTF-8";

    static {
        v.c = new HashMap();
    }

    private v(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    public Void a() {
        synchronized(this) {
            this.a.deleteFile(this.b);
            return null;
        }
    }

    @VisibleForTesting
    public static void b() {
        synchronized(v.class) {
            v.c.clear();
        }
    }

    String c() {
        return this.b;
    }

    public static v d(Context context0, String s) {
        synchronized(v.class) {
            Map map0 = v.c;
            if(!map0.containsKey(s)) {
                map0.put(s, new v(context0, s));
            }
            return (v)map0.get(s);
        }
    }

    @h
    public com.google.firebase.remoteconfig.internal.h e() throws IOException {
        com.google.firebase.remoteconfig.internal.h h0;
        FileInputStream fileInputStream0;
        __monitor_enter(this);
        try {
            fileInputStream0 = null;
            fileInputStream0 = this.a.openFileInput(this.b);
            goto label_7;
        }
        catch(JSONException | FileNotFoundException unused_ex) {
            goto label_12;
        }
        catch(Throwable throwable0) {
        }
        Throwable throwable1 = throwable0;
        goto label_17;
        try {
        label_7:
            int v = fileInputStream0.available();
            byte[] arr_b = new byte[v];
            fileInputStream0.read(arr_b, 0, v);
            h0 = com.google.firebase.remoteconfig.internal.h.b(new JSONObject(new String(arr_b, "UTF-8")));
            goto label_20;
        }
        catch(JSONException | FileNotFoundException unused_ex) {
        label_12:
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(Throwable throwable2) {
                    __monitor_exit(this);
                    throw throwable2;
                }
            }
            __monitor_exit(this);
            return null;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_17:
            if(fileInputStream0 != null) {
                fileInputStream0.close();
            }
            throw throwable1;
        label_20:
            fileInputStream0.close();
        }
        catch(Throwable throwable2) {
            __monitor_exit(this);
            throw throwable2;
        }
        __monitor_exit(this);
        return h0;
    }

    public Void f(com.google.firebase.remoteconfig.internal.h h0) throws IOException {
        synchronized(this) {
            FileOutputStream fileOutputStream0 = this.a.openFileOutput(this.b, 0);
            try {
                fileOutputStream0.write(h0.toString().getBytes("UTF-8"));
            }
            catch(Throwable throwable0) {
                fileOutputStream0.close();
                throw throwable0;
            }
            fileOutputStream0.close();
            return null;
        }
    }
}

