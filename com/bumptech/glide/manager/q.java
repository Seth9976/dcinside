package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.request.e;
import com.bumptech.glide.util.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class q {
    private final Set a;
    private final Set b;
    private boolean c;
    private static final String d = "RequestTracker";

    public q() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.b = new HashSet();
    }

    @VisibleForTesting
    void a(e e0) {
        this.a.add(e0);
    }

    public boolean b(@Nullable e e0) {
        if(e0 == null) {
            return true;
        }
        boolean z = this.a.remove(e0);
        if(!this.b.remove(e0) && !z) {
            return false;
        }
        e0.clear();
        return true;
    }

    public void c() {
        for(Object object0: o.l(this.a)) {
            this.b(((e)object0));
        }
        this.b.clear();
    }

    public boolean d() {
        return this.c;
    }

    public void e() {
        this.c = true;
        for(Object object0: o.l(this.a)) {
            e e0 = (e)object0;
            if(e0.isRunning() || e0.e()) {
                e0.clear();
                this.b.add(e0);
            }
        }
    }

    public void f() {
        this.c = true;
        for(Object object0: o.l(this.a)) {
            e e0 = (e)object0;
            if(e0.isRunning()) {
                e0.pause();
                this.b.add(e0);
            }
        }
    }

    public void g() {
        for(Object object0: o.l(this.a)) {
            e e0 = (e)object0;
            if(!e0.e() && !e0.f()) {
                e0.clear();
                if(this.c) {
                    this.b.add(e0);
                }
                else {
                    e0.i();
                }
            }
        }
    }

    public void h() {
        this.c = false;
        for(Object object0: o.l(this.a)) {
            e e0 = (e)object0;
            if(!e0.e() && !e0.isRunning()) {
                e0.i();
            }
        }
        this.b.clear();
    }

    public void i(@NonNull e e0) {
        this.a.add(e0);
        if(!this.c) {
            e0.i();
            return;
        }
        e0.clear();
        if(Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.b.add(e0);
    }

    @Override
    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}

