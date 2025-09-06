package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

final class k0 {
    private final SharedPreferences a;
    private g0 b;
    private final Executor c;
    @VisibleForTesting
    static final String d = "com.google.android.gms.appid";
    @VisibleForTesting
    static final String e = "topic_operation_queue";
    private static final String f = ",";
    @GuardedBy("TopicsStore.class")
    private static WeakReference g;

    private k0(SharedPreferences sharedPreferences0, Executor executor0) {
        this.c = executor0;
        this.a = sharedPreferences0;
    }

    boolean a(j0 j00) {
        synchronized(this) {
            return this.b.b(j00.e());
        }
    }

    @VisibleForTesting
    static void b() {
        synchronized(k0.class) {
            WeakReference weakReference0 = k0.g;
            if(weakReference0 != null) {
                weakReference0.clear();
            }
        }
    }

    void c() {
        synchronized(this) {
            this.b.g();
        }
    }

    @WorkerThread
    public static k0 d(Context context0, Executor executor0) {
        synchronized(k0.class) {
            k0 k00 = k0.g == null ? null : ((k0)k0.g.get());
            if(k00 == null) {
                k00 = new k0(context0.getSharedPreferences("com.google.android.gms.appid", 0), executor0);
                k00.g();
                k0.g = new WeakReference(k00);
            }
            return k00;
        }
    }

    @Nullable
    j0 e() {
        synchronized(this) {
            return j0.a(this.b.l());
        }
    }

    @NonNull
    List f() {
        synchronized(this) {
            List list0 = this.b.t();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                list1.add(j0.a(((String)object0)));
            }
            return list1;
        }
    }

    @WorkerThread
    private void g() {
        synchronized(this) {
            this.b = g0.j(this.a, "topic_operation_queue", ",", this.c);
        }
    }

    @Nullable
    j0 h() {
        synchronized(this) {
            try {
                return j0.a(this.b.m());
            }
            catch(NoSuchElementException unused_ex) {
                Log.e("FirebaseMessaging", "Polling operation queue failed");
                return null;
            }
        }
    }

    boolean i(j0 j00) {
        synchronized(this) {
            return this.b.n(j00.e());
        }
    }
}

