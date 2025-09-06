package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c {
    private final List a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;

    public c() {
        this.a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
    }

    @NonNull
    public final List a() {
        return this.e;
    }

    final void a(ICrashCallback iCrashCallback0, CrashType crashType0) {
        switch(crashType0) {
            case 1: {
                this.a.add(iCrashCallback0);
                this.b.add(iCrashCallback0);
                this.c.add(iCrashCallback0);
                this.d.add(iCrashCallback0);
                return;
            }
            case 2: {
                this.d.add(iCrashCallback0);
                return;
            }
            case 3: {
                this.b.add(iCrashCallback0);
                return;
            }
            case 4: {
                this.a.add(iCrashCallback0);
                return;
            }
            case 5: {
                this.c.add(iCrashCallback0);
            }
        }
    }

    final void a(IOOMCallback iOOMCallback0) {
        this.e.add(iOOMCallback0);
    }

    @NonNull
    public final List b() {
        return this.a;
    }

    final void b(ICrashCallback iCrashCallback0, CrashType crashType0) {
        switch(crashType0) {
            case 1: {
                this.a.remove(iCrashCallback0);
                this.b.remove(iCrashCallback0);
                this.c.remove(iCrashCallback0);
                this.d.remove(iCrashCallback0);
                return;
            }
            case 2: {
                this.d.remove(iCrashCallback0);
                return;
            }
            case 3: {
                this.b.remove(iCrashCallback0);
                return;
            }
            case 4: {
                this.a.remove(iCrashCallback0);
                return;
            }
            case 5: {
                this.c.remove(iCrashCallback0);
            }
        }
    }

    final void b(IOOMCallback iOOMCallback0) {
        this.e.remove(iOOMCallback0);
    }

    @NonNull
    public final List c() {
        return this.b;
    }

    @NonNull
    public final List d() {
        return this.c;
    }

    @NonNull
    public final List e() {
        return this.d;
    }
}

