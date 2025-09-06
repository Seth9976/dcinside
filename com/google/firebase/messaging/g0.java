package com.google.firebase.messaging;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class g0 {
    private final SharedPreferences a;
    private final String b;
    private final String c;
    @GuardedBy("internalQueue")
    @VisibleForTesting
    final ArrayDeque d;
    private final Executor e;
    @GuardedBy("internalQueue")
    private boolean f;

    private g0(SharedPreferences sharedPreferences0, String s, String s1, Executor executor0) {
        this.d = new ArrayDeque();
        this.f = false;
        this.a = sharedPreferences0;
        this.b = s;
        this.c = s1;
        this.e = executor0;
    }

    public boolean b(@NonNull String s) {
        if(!TextUtils.isEmpty(s) && !s.contains(this.c)) {
            ArrayDeque arrayDeque0 = this.d;
            return this.f(this.d.add(s));
        }
        return false;
    }

    @GuardedBy("internalQueue")
    public void c() {
        this.f = true;
    }

    @VisibleForTesting
    void d() {
        synchronized(this.d) {
            this.c();
        }
    }

    @GuardedBy("internalQueue")
    private String e(String s) {
        this.f(s != null);
        return s;
    }

    @GuardedBy("internalQueue")
    private boolean f(boolean z) {
        if(z && !this.f) {
            this.s();
        }
        return z;
    }

    public void g() {
        synchronized(this.d) {
            this.d.clear();
            this.f(true);
        }
    }

    @GuardedBy("internalQueue")
    public void h() {
        this.f = false;
        this.s();
    }

    @VisibleForTesting
    void i() {
        synchronized(this.d) {
            this.h();
        }
    }

    @WorkerThread
    static g0 j(SharedPreferences sharedPreferences0, String s, String s1, Executor executor0) {
        g0 g00 = new g0(sharedPreferences0, s, s1, executor0);
        g00.k();
        return g00;
    }

    @WorkerThread
    private void k() {
        synchronized(this.d) {
            this.d.clear();
            String s = this.a.getString(this.b, "");
            if(!TextUtils.isEmpty(s) && s.contains(this.c)) {
                String[] arr_s = s.split(this.c, -1);
                if(arr_s.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    String s1 = arr_s[v1];
                    if(!TextUtils.isEmpty(s1)) {
                        this.d.add(s1);
                    }
                }
            }
        }
    }

    @Nullable
    public String l() {
        synchronized(this.d) {
        }
        return (String)this.d.peek();
    }

    public String m() {
        synchronized(this.d) {
        }
        return this.e(((String)this.d.remove()));
    }

    public boolean n(@Nullable Object object0) {
        synchronized(this.d) {
        }
        return this.f(this.d.remove(object0));
    }

    @GuardedBy("internalQueue")
    @NonNull
    public String o() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.d) {
            stringBuilder0.append(((String)object0));
            stringBuilder0.append(this.c);
        }
        return stringBuilder0.toString();
    }

    @VisibleForTesting
    public String p() {
        synchronized(this.d) {
        }
        return this.o();
    }

    public int q() {
        synchronized(this.d) {
        }
        return this.d.size();
    }

    // 检测为 Lambda 实现
    @WorkerThread
    private void r() [...]

    private void s() {
        f0 f00 = () -> synchronized(this.d) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            String s = this.o();
            sharedPreferences$Editor0.putString(this.b, s).commit();
        };
        this.e.execute(f00);
    }

    @NonNull
    public List t() {
        synchronized(this.d) {
        }
        return new ArrayList(this.d);
    }
}

