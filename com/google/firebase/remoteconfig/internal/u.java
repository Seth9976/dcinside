package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.installations.p;
import com.google.firebase.remoteconfig.d;
import com.google.firebase.remoteconfig.r;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class u {
    @GuardedBy("this")
    private final Set a;
    @GuardedBy("this")
    private boolean b;
    @GuardedBy("this")
    private int c;
    @GuardedBy("this")
    private boolean d;
    private boolean e;
    private final int f;
    private final ScheduledExecutorService g;
    private final n h;
    private final h i;
    private final k j;
    g k;
    private final Context l;
    private final String m;
    private final Random n;
    private final Clock o;
    private final q p;
    @VisibleForTesting
    static final int[] q = null;
    private static final Pattern r = null;
    private static final String s = "X-Goog-Api-Key";
    private static final String t = "X-Android-Package";
    private static final String u = "X-Android-Cert";
    private static final String v = "X-Google-GFE-Can-Retry";
    private static final String w = "X-Goog-Firebase-Installations-Auth";
    private static final String x = "X-Accept-Response-Streaming";

    static {
        u.q = new int[]{2, 4, 8, 16, 0x20, 0x40, 0x80, 0x100};
        u.r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }

    public u(h h0, k k0, n n0, g g0, Context context0, String s, Set set0, q q0, ScheduledExecutorService scheduledExecutorService0) {
        this.f = 8;
        this.a = set0;
        this.b = false;
        this.g = scheduledExecutorService0;
        this.n = new Random();
        this.c = Math.max(8 - q0.j().b(), 1);
        this.o = DefaultClock.getInstance();
        this.i = h0;
        this.h = n0;
        this.j = k0;
        this.k = g0;
        this.l = context0;
        this.m = s;
        this.p = q0;
        this.d = false;
        this.e = false;
    }

    private void A(boolean z) {
        synchronized(this) {
            this.b = z;
        }
    }

    void B(boolean z) {
        this.e = z;
    }

    @SuppressLint({"VisibleForTests"})
    public void C(HttpURLConnection httpURLConnection0, String s, String s1) throws IOException {
        httpURLConnection0.setRequestMethod("POST");
        this.z(httpURLConnection0, s1);
        byte[] arr_b = this.i(s).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
        bufferedOutputStream0.write(arr_b);
        bufferedOutputStream0.flush();
        bufferedOutputStream0.close();
    }

    @SuppressLint({"VisibleForTests"})
    public c D(HttpURLConnection httpURLConnection0) {
        class b implements d {
            final u a;

            @Override  // com.google.firebase.remoteconfig.d
            public void a(@NonNull com.google.firebase.remoteconfig.c c0) {
            }

            @Override  // com.google.firebase.remoteconfig.d
            public void b(@NonNull r r0) {
                u.this.j();
                u.this.w(r0);
            }
        }

        synchronized(this) {
            b u$b0 = new b(this);
            return new c(httpURLConnection0, this.h, this.k, this.a, u$b0, this.g);
        }
    }

    public void E() {
        this.u(0L);
    }

    private void F(Date date0) {
        int v = this.p.j().b();
        long v1 = this.o(v + 1);
        Date date1 = new Date(date0.getTime() + v1);
        this.p.r(v + 1, date1);
    }

    // 检测为 Lambda 实现
    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() [...]

    private boolean f() {
        synchronized(this) {
            return !this.a.isEmpty() && !this.b && !this.d && !this.e;
        }
    }

    public void g(HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
            try {
                httpURLConnection0.getInputStream().close();
                if(httpURLConnection0.getErrorStream() != null) {
                    httpURLConnection0.getErrorStream().close();
                }
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public Task h() {
        Task task0 = this.j.b(false);
        Task task1 = this.j.getId();
        Task task2 = Tasks.whenAllComplete(new Task[]{task0, task1});
        s s0 = (Task task2) -> {
            if(!task0.isSuccessful()) {
                return Tasks.forException(new com.google.firebase.remoteconfig.q("Firebase Installations failed to get installation auth token for config update listener connection.", task0.getException()));
            }
            if(!task1.isSuccessful()) {
                return Tasks.forException(new com.google.firebase.remoteconfig.q("Firebase Installations failed to get installation ID for config update listener connection.", task1.getException()));
            }
            try {
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)this.q().openConnection();
                String s = ((p)task0.getResult()).b();
                this.C(httpURLConnection0, ((String)task1.getResult()), s);
                return Tasks.forResult(httpURLConnection0);
            }
            catch(IOException iOException0) {
                return Tasks.forException(new com.google.firebase.remoteconfig.q("Failed to open HTTP stream connection", iOException0));
            }
        };
        return task2.continueWithTask(this.g, s0);
    }

    private JSONObject i(String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("project", u.k(this.i.s().j()));
        hashMap0.put("namespace", this.m);
        hashMap0.put("lastKnownVersionNumber", Long.toString(this.h.s()));
        hashMap0.put("appId", this.i.s().j());
        hashMap0.put("sdkVersion", "22.0.0");
        hashMap0.put("appInstanceId", s);
        return new JSONObject(hashMap0);
    }

    private void j() {
        synchronized(this) {
            this.d = true;
        }
    }

    private static String k(String s) {
        Matcher matcher0 = u.r.matcher(s);
        return matcher0.matches() ? matcher0.group(1) : null;
    }

    @SuppressLint({"VisibleForTests"})
    public Date l() {
        return this.p.j().a();
    }

    private String m() {
        try {
            byte[] arr_b = AndroidUtilsLight.getPackageCertificateHashBytes(this.l, "com.dcinside.app.android");
            if(arr_b == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: com.dcinside.app.android");
                return null;
            }
            return Hex.bytesToStringUppercase(arr_b, false);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.i("FirebaseRemoteConfig", "No such package: com.dcinside.app.android");
            return null;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public int n() {
        return this.p.j().b();
    }

    private long o(int v) {
        int[] arr_v = u.q;
        if(v >= arr_v.length) {
            v = arr_v.length;
        }
        long v1 = TimeUnit.MINUTES.toMillis(((long)arr_v[v - 1]));
        return v1 / 2L + ((long)this.n.nextInt(((int)v1)));
    }

    private String p(String s) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", u.k(this.i.s().j()), s);
    }

    private URL q() {
        try {
            return new URL(this.p(this.m));
        }
        catch(MalformedURLException unused_ex) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean r(int v) {
        return v == 408 || v == 429 || v == 502 || v == 503 || v == 504;
    }

    // 检测为 Lambda 实现
    private Task s(Task task0, Task task1) throws Exception [...]

    // 检测为 Lambda 实现
    private Task t(Task task0, Task task1, Task task2) throws Exception [...]

    private void u(long v) {
        class a implements Runnable {
            final u a;

            @Override
            public void run() {
                u.this.e();
            }
        }

        synchronized(this) {
            if(!this.f()) {
                return;
            }
            int v2 = this.c;
            if(v2 > 0) {
                this.c = v2 - 1;
                a u$a0 = () -> {
                    if(!u.this.f()) {
                        return;
                    }
                    com.google.firebase.remoteconfig.internal.q.b q$b0 = u.this.p.j();
                    if(new Date(u.this.o.currentTimeMillis()).before(q$b0.a())) {
                        u.this.y();
                        return;
                    }
                    Task task0 = u.this.h();
                    Task task1 = Tasks.whenAllComplete(new Task[]{task0});
                    t t0 = (Task task1) -> {
                        com.google.firebase.remoteconfig.u u0;
                        int v;
                        Integer integer0;
                        HttpURLConnection httpURLConnection0;
                        try {
                            if(!task0.isSuccessful()) {
                                throw new IOException(task0.getException());
                            }
                            u.this.A(true);
                            httpURLConnection0 = (HttpURLConnection)task0.getResult();
                        }
                        catch(IOException iOException0) {
                            try {
                                httpURLConnection0 = null;
                                integer0 = null;
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", iOException0);
                                goto label_29;
                            }
                            catch(Throwable throwable1) {
                                goto label_38;
                            }
                        }
                        catch(Throwable throwable0) {
                            integer0 = null;
                            throwable1 = throwable0;
                            httpURLConnection0 = null;
                            goto label_38;
                        }
                        try {
                            integer0 = null;
                            v = httpURLConnection0.getResponseCode();
                            integer0 = v;
                            goto label_22;
                        }
                        catch(IOException iOException0) {
                            goto label_28;
                        }
                        catch(Throwable throwable2) {
                        }
                        throwable1 = throwable2;
                        goto label_38;
                    label_22:
                        if(v == 200) {
                            try {
                                try {
                                    u.this.x();
                                    u.this.p.l();
                                    u.this.D(httpURLConnection0).i();
                                    goto label_48;
                                }
                                catch(IOException iOException0) {
                                label_28:
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", iOException0);
                                }
                            }
                            catch(Throwable throwable1) {
                                goto label_38;
                            }
                        label_29:
                            u.this.g(httpURLConnection0);
                            u.this.A(false);
                            boolean z = integer0 == null || u.this.r(((int)integer0));
                            if(z) {
                                u.this.F(new Date(u.this.o.currentTimeMillis()));
                            }
                            if(!z && ((int)integer0) != 200) {
                                u0 = new com.google.firebase.remoteconfig.u(((int)integer0), (((int)integer0) == 403 ? u.this.v(httpURLConnection0.getErrorStream()) : String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", integer0)), com.google.firebase.remoteconfig.r.a.c);
                                u.this.w(u0);
                                return Tasks.forResult(null);
                            label_38:
                                u.this.g(httpURLConnection0);
                                u.this.A(false);
                                boolean z1 = integer0 == null || u.this.r(((int)integer0));
                                if(z1) {
                                    u.this.F(new Date(u.this.o.currentTimeMillis()));
                                }
                                if(z1 || ((int)integer0) == 200) {
                                    u.this.y();
                                }
                                else {
                                    u.this.w(new com.google.firebase.remoteconfig.u(((int)integer0), (((int)integer0) == 403 ? u.this.v(httpURLConnection0.getErrorStream()) : String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", integer0)), com.google.firebase.remoteconfig.r.a.c));
                                }
                                throw throwable1;
                            }
                        }
                        else {
                        label_48:
                            u.this.g(httpURLConnection0);
                            u.this.A(false);
                            boolean z2 = u.this.r(v);
                            if(z2) {
                                u.this.F(new Date(u.this.o.currentTimeMillis()));
                            }
                            if(!z2 && v != 200) {
                                u0 = new com.google.firebase.remoteconfig.u(v, (v == 403 ? u.this.v(httpURLConnection0.getErrorStream()) : String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", integer0)), com.google.firebase.remoteconfig.r.a.c);
                                u.this.w(u0);
                                return Tasks.forResult(null);
                            }
                        }
                        u.this.y();
                        return Tasks.forResult(null);
                    };
                    task1.continueWith(u.this.g, t0);
                };
                this.g.schedule(u$a0, v, TimeUnit.MILLISECONDS);
            }
            else if(!this.e) {
                this.w(new com.google.firebase.remoteconfig.q("Unable to connect to the server. Check your connection and try again.", com.google.firebase.remoteconfig.r.a.c));
            }
        }
    }

    private String v(InputStream inputStream0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
            }
            return stringBuilder0.toString();
        }
        catch(IOException unused_ex) {
            return stringBuilder0.length() == 0 ? "Unable to connect to the server, access is forbidden. HTTP status code: 403" : stringBuilder0.toString();
        }
    }

    private void w(r r0) {
        synchronized(this) {
            for(Object object0: this.a) {
                ((d)object0).b(r0);
            }
        }
    }

    private void x() {
        synchronized(this) {
            this.c = 8;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public void y() {
        synchronized(this) {
            Date date0 = new Date(this.o.currentTimeMillis());
            this.u(Math.max(0L, this.p.j().a().getTime() - date0.getTime()));
        }
    }

    private void z(HttpURLConnection httpURLConnection0, String s) {
        httpURLConnection0.setRequestProperty("X-Goog-Firebase-Installations-Auth", s);
        httpURLConnection0.setRequestProperty("X-Goog-Api-Key", this.i.s().i());
        httpURLConnection0.setRequestProperty("X-Android-Package", "com.dcinside.app.android");
        httpURLConnection0.setRequestProperty("X-Android-Cert", this.m());
        httpURLConnection0.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection0.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Accept", "application/json");
    }
}

