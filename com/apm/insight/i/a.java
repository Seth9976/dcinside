package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings.Secure;
import com.apm.insight.runtime.o;
import java.util.UUID;

public class a {
    private static volatile UUID a = null;
    private static String b = "";

    static {
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context0) {
        String s1;
        if(a.a == null) {
            synchronized(a.class) {
                if(a.a == null) {
                    String s = o.a().c();
                    if(s == null) {
                        try {
                            s1 = null;
                            s1 = Settings.Secure.getString(context0.getContentResolver(), "android_id");
                        }
                        catch(Throwable unused_ex) {
                        }
                        try {
                            a.a = s1 == null ? UUID.randomUUID() : UUID.nameUUIDFromBytes(s1.getBytes("utf8"));
                        }
                        catch(Throwable unused_ex) {
                        }
                        try {
                            o.a().b(a.a.toString());
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                    else {
                        a.a = UUID.fromString(s);
                    }
                }
            }
        }
    }

    public static String a(Context context0) {
        synchronized(a.class) {
            new a(context0);
            UUID uUID0 = a.a;
            if(uUID0 != null) {
                a.b = uUID0.toString();
            }
            return "";
        }
    }
}

