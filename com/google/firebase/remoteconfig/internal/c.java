package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.d;
import com.google.firebase.remoteconfig.q;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    @GuardedBy("this")
    private final Set a;
    private final HttpURLConnection b;
    private final n c;
    private final g d;
    private final d e;
    private final ScheduledExecutorService f;
    private final Random g;
    private static final int h = 3;
    private static final String i = "latestTemplateVersionNumber";
    private static final String j = "featureDisabled";

    public c(HttpURLConnection httpURLConnection0, n n0, g g0, Set set0, d d0, ScheduledExecutorService scheduledExecutorService0) {
        this.b = httpURLConnection0;
        this.c = n0;
        this.d = g0;
        this.a = set0;
        this.e = d0;
        this.f = scheduledExecutorService0;
        this.g = new Random();
    }

    private void b(int v, long v1) {
        class a implements Runnable {
            final int a;
            final long b;
            final c c;

            a(int v, long v1) {
                this.a = v;
                this.b = v1;
                super();
            }

            @Override
            public void run() {
                c.this.d(this.a, this.b);
            }
        }

        if(v == 0) {
            this.k(new u("Unable to fetch the latest version of the template.", com.google.firebase.remoteconfig.r.a.e));
            return;
        }
        int v2 = this.g.nextInt(4);
        a c$a0 = new a(this, v, v1);
        this.f.schedule(c$a0, ((long)v2), TimeUnit.SECONDS);
    }

    private void c(com.google.firebase.remoteconfig.c c0) {
        synchronized(this) {
            for(Object object0: this.a) {
                ((d)object0).a(c0);
            }
        }
    }

    @VisibleForTesting
    public Task d(int v, long v1) {
        synchronized(this) {
            Task task0 = this.c.n(b.c, 4 - v);
            Task task1 = this.d.f();
            Task task2 = Tasks.whenAllComplete(new Task[]{task0, task1});
            com.google.firebase.remoteconfig.internal.b b0 = (Task task2) -> {
                if(!task0.isSuccessful()) {
                    return Tasks.forException(new q("Failed to auto-fetch config update.", task0.getException()));
                }
                if(!task1.isSuccessful()) {
                    return Tasks.forException(new q("Failed to get activated config for auto-fetch", task1.getException()));
                }
                com.google.firebase.remoteconfig.internal.n.a n$a0 = (com.google.firebase.remoteconfig.internal.n.a)task0.getResult();
                h h0 = (h)task1.getResult();
                if(!c.e(n$a0, v1).booleanValue()) {
                    Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK\'s current version. Retrying fetch.");
                    this.b(v - 1, v1);
                    return Tasks.forResult(null);
                }
                if(n$a0.e() == null) {
                    Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                    return Tasks.forResult(null);
                }
                if(h0 == null) {
                    h0 = h.l().a();
                }
                Set set0 = h0.f(n$a0.e());
                if(set0.isEmpty()) {
                    Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                    return Tasks.forResult(null);
                }
                this.c(com.google.firebase.remoteconfig.c.a(set0));
                return Tasks.forResult(null);
            };
            return task2.continueWithTask(this.f, b0);
        }
    }

    private static Boolean e(com.google.firebase.remoteconfig.internal.n.a n$a0, long v) {
        boolean z = false;
        if(n$a0.e() != null) {
            if(n$a0.e().k() >= v) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if(n$a0.g() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private void f(InputStream inputStream0) throws IOException {
        String s;
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, "utf-8"));
        while(true) {
            s = "";
            do {
            label_2:
                String s1 = bufferedReader0.readLine();
                if(s1 == null) {
                    goto label_27;
                }
                s = s + s1;
                if(!s1.contains("}")) {
                    goto label_2;
                }
                s = this.j(s);
            }
            while(s.isEmpty());
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                if(jSONObject0.has("featureDisabled") && jSONObject0.getBoolean("featureDisabled")) {
                    u u0 = new u("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.r.a.f);
                    this.e.b(u0);
                }
                else if(!this.g()) {
                    if(jSONObject0.has("latestTemplateVersionNumber")) {
                        long v = this.c.s();
                        long v1 = jSONObject0.getLong("latestTemplateVersionNumber");
                        if(v1 <= v) {
                            continue;
                        }
                        this.b(3, v1);
                        continue;
                    }
                    else {
                        break;
                    }
                    goto label_2;
                }
                goto label_27;
            }
            catch(JSONException jSONException0) {
            }
            this.k(new q("Unable to parse config update message.", jSONException0.getCause(), com.google.firebase.remoteconfig.r.a.d));
            Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", jSONException0);
        }
        s = "";
        goto label_2;
    label_27:
        bufferedReader0.close();
        inputStream0.close();
    }

    private boolean g() {
        synchronized(this) {
        }
        return this.a.isEmpty();
    }

    // 检测为 Lambda 实现
    private Task h(Task task0, Task task1, long v, int v1, Task task2) throws Exception [...]

    @VisibleForTesting
    public void i() {
        int v;
        try {
            HttpURLConnection httpURLConnection0 = this.b;
            if(httpURLConnection0 == null) {
                return;
            }
            v = FIN.finallyOpen$NT();
            InputStream inputStream0 = httpURLConnection0.getInputStream();
            this.f(inputStream0);
            inputStream0.close();
        }
        catch(IOException iOException0) {
            Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", iOException0);
        }
        FIN.finallyCodeBegin$NT(v);
        this.b.disconnect();
        FIN.finallyCodeEnd$NT(v);
    }

    private String j(String s) {
        int v = s.indexOf(0x7B);
        int v1 = s.lastIndexOf(0x7D);
        return v < 0 || v1 < 0 || v >= v1 ? "" : s.substring(v, v1 + 1);
    }

    private void k(r r0) {
        synchronized(this) {
            for(Object object0: this.a) {
                ((d)object0).b(r0);
            }
        }
    }
}

