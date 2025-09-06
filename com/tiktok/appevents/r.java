package com.tiktok.appevents;

import android.app.Application;
import com.tiktok.b.c;
import com.tiktok.b;
import com.tiktok.util.f;
import com.tiktok.util.g;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;
import org.json.JSONObject;

class r {
    private static final String a = "com.tiktok.appevents.r";
    private static final f b = null;
    private static final String c = "events_cache";
    private static final int d = 500;

    static {
        r.b = new f(r.class.getCanonicalName(), b.o());
    }

    public static void a() {
        synchronized(r.class) {
            g.a("com.tiktok.appevents.r");
            r.b(new File(b.l().getFilesDir(), "events_cache"));
            c b$c0 = b.t;
            if(b$c0 != null) {
                b$c0.b(0, true);
            }
        }
    }

    private static void b(File file0) {
        if(file0.exists()) {
            file0.delete();
        }
    }

    private static void c(q q0, int v) {
        if(q0 != null && !q0.c()) {
            List list0 = q0.b();
            int v1 = list0.size();
            if(v1 > v) {
                r.b.a("Way too many events(%d), slim it!", new Object[]{v1});
                int v2 = v1 - v;
                p.q += v2;
                b.t.a(p.q);
                q0.d(new ArrayList(list0.subList(v2, v1)));
            }
        }
    }

    public static void d(List list0) {
        synchronized(r.class) {
            g.a("com.tiktok.appevents.r");
            f f0 = r.b;
            f0.a("Tried to persist to disk", new Object[0]);
            if(!b.D()) {
                f0.a("Quit persisting to disk because global switch is turned off", new Object[0]);
                return;
            }
            List list1 = s.c();
            q q0 = r.e();
            if(list1.isEmpty() && q0.c() && (list0 == null || list0.isEmpty())) {
                return;
            }
            q q1 = new q();
            if(list0 != null) {
                q1.a(list0);
            }
            q1.a(q0.b());
            q1.a(list1);
            r.c(q1, 500);
            r.f(q1);
        }
    }

    static q e() {
        synchronized(r.class) {
            long v1 = System.currentTimeMillis();
            g.a("com.tiktok.appevents.r");
            Application application0 = b.l();
            File file0 = new File(application0.getFilesDir(), "events_cache");
            if(!file0.exists()) {
                return new q();
            }
            q q1 = new q();
            try {
                FileInputStream fileInputStream0 = application0.openFileInput("events_cache");
                try {
                    q1 = A.b(fileInputStream0);
                    r.b.a("disk read data: %s", new Object[]{q1});
                    r.b(file0);
                    c b$c0 = b.t;
                    if(b$c0 != null) {
                        b$c0.b(0, true);
                    }
                    if(fileInputStream0 != null) {
                        goto label_31;
                    }
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    if(fileInputStream0 != null) {
                        try {
                            fileInputStream0.close();
                        }
                        catch(Throwable throwable1) {
                            throwable0.addSuppressed(throwable1);
                        }
                    }
                    throw throwable0;
                }
            label_31:
                fileInputStream0.close();
            }
            catch(Exception exception0) {
                r.b(file0);
                u.b("com.tiktok.appevents.r", exception0, 2);
            }
            try {
            label_36:
                long v2 = System.currentTimeMillis();
                JSONObject jSONObject0 = g.c(v2).put("latency", v2 - v1).put("size", q1.b().size());
                b.j().I("file_r", jSONObject0, null);
            }
            catch(Exception unused_ex) {
            }
            return q1;
        }
    }

    private static boolean f(q q0) {
        ObjectOutputStream objectOutputStream0;
        boolean z = true;
        if(q0.c()) {
            return false;
        }
        long v = System.currentTimeMillis();
        Application application0 = b.l();
        try {
            objectOutputStream0 = new ObjectOutputStream(new BufferedOutputStream(application0.openFileOutput("events_cache", 0)));
            try {
                objectOutputStream0.writeObject(q0);
                r.b.a("Saving %d events to disk", new Object[]{q0.b().size()});
                c b$c0 = b.t;
                if(b$c0 != null) {
                    b$c0.b(q0.b().size(), false);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(objectOutputStream0, throwable0);
                throw throwable0;
            }
        }
        catch(Exception exception0) {
            z = false;
            goto label_21;
        }
        try {
            objectOutputStream0.close();
            goto label_22;
        }
        catch(Exception exception0) {
        }
    label_21:
        u.b("com.tiktok.appevents.r", exception0, 2);
        try {
        label_22:
            JSONObject jSONObject0 = g.c(v).put("latency", System.currentTimeMillis() - v).put("success", z).put("size", q0.b().size());
            b.j().I("file_w", jSONObject0, null);
        }
        catch(Exception unused_ex) {
        }
        return z;
    }
}

