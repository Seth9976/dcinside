package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.l;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.crashlytics.internal.metadata.o;
import com.google.firebase.crashlytics.internal.model.F.a;
import com.google.firebase.crashlytics.internal.model.F.f.d.f;
import com.google.firebase.crashlytics.internal.model.F.f.d;
import com.google.firebase.crashlytics.internal.persistence.e;
import com.google.firebase.crashlytics.internal.send.b;
import com.google.firebase.crashlytics.internal.settings.k;
import j..util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class f0 {
    private final E a;
    private final e b;
    private final b c;
    private final com.google.firebase.crashlytics.internal.metadata.e d;
    private final o e;
    private final N f;
    private final l g;
    private static final String h = "crash";
    private static final String i = "error";
    private static final int j = 4;
    private static final int k = 8;
    private static final int l = 0x2000;

    f0(E e0, e e1, b b0, com.google.firebase.crashlytics.internal.metadata.e e2, o o0, N n0, l l0) {
        this.a = e0;
        this.b = e1;
        this.c = b0;
        this.d = e2;
        this.e = o0;
        this.f = n0;
        this.g = l0;
    }

    public Task A(@NonNull Executor executor0) {
        return this.B(executor0, null);
    }

    public Task B(@NonNull Executor executor0, @Nullable String s) {
        List list0 = this.b.w();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            F f0 = (F)object0;
            if(s == null || s.equals(f0.d())) {
                F f1 = this.k(f0);
                arrayList0.add(this.c.c(f1, s != null).continueWith(executor0, new d0(this)));
            }
        }
        return Tasks.whenAll(arrayList0);
    }

    private d d(d f$f$d0) {
        return this.e(f$f$d0, this.d, this.e);
    }

    private d e(d f$f$d0, com.google.firebase.crashlytics.internal.metadata.e e0, o o0) {
        com.google.firebase.crashlytics.internal.model.F.f.d.b f$f$d$b0 = f$f$d0.h();
        String s = e0.c();
        if(s == null) {
            g.f().k("No log data to include with this event.");
        }
        else {
            f$f$d$b0.d(com.google.firebase.crashlytics.internal.model.F.f.d.d.a().b(s).a());
        }
        List list0 = f0.o(o0.g());
        List list1 = f0.o(o0.h());
        if(!list0.isEmpty() || !list1.isEmpty()) {
            f$f$d$b0.b(f$f$d0.b().i().e(list0).g(list1).a());
        }
        return f$f$d$b0.a();
    }

    private d f(d f$f$d0) {
        return this.g(this.e(f$f$d0, this.d, this.e), this.e);
    }

    private d g(d f$f$d0, o o0) {
        List list0 = o0.i();
        if(list0.isEmpty()) {
            return f$f$d0;
        }
        com.google.firebase.crashlytics.internal.model.F.f.d.b f$f$d$b0 = f$f$d0.h();
        f$f$d$b0.e(f.a().b(list0).a());
        return f$f$d$b0.a();
    }

    @RequiresApi(api = 30)
    private static a h(ApplicationExitInfo applicationExitInfo0) {
        try {
            InputStream inputStream0 = applicationExitInfo0.getTraceInputStream();
            if(inputStream0 != null) {
                String s = f0.i(inputStream0);
                return a.a().c(applicationExitInfo0.getImportance()).e(applicationExitInfo0.getProcessName()).g(applicationExitInfo0.getReason()).i(applicationExitInfo0.getTimestamp()).d(applicationExitInfo0.getPid()).f(applicationExitInfo0.getPss()).h(applicationExitInfo0.getRss()).j(s).a();
            }
        }
        catch(IOException iOException0) {
            g.f().m("Could not get input trace in application exit info: " + applicationExitInfo0.toString() + " Error: " + iOException0);
            return a.a().c(applicationExitInfo0.getImportance()).e(applicationExitInfo0.getProcessName()).g(applicationExitInfo0.getReason()).i(applicationExitInfo0.getTimestamp()).d(applicationExitInfo0.getPid()).f(applicationExitInfo0.getPss()).h(applicationExitInfo0.getRss()).j(null).a();
        }
        return a.a().c(applicationExitInfo0.getImportance()).e(applicationExitInfo0.getProcessName()).g(applicationExitInfo0.getReason()).i(applicationExitInfo0.getTimestamp()).d(applicationExitInfo0.getPid()).f(applicationExitInfo0.getPss()).h(applicationExitInfo0.getRss()).j(null).a();
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    public static String i(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x2000];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        return byteArrayOutputStream0.toString("UTF-8");
    }

    public static f0 j(Context context0, N n0, com.google.firebase.crashlytics.internal.persistence.g g0, com.google.firebase.crashlytics.internal.common.a a0, com.google.firebase.crashlytics.internal.metadata.e e0, o o0, X1.d d0, k k0, T t0, m m0, l l0) {
        return new f0(new E(context0, n0, a0, d0, k0), new e(g0, k0, m0), b.b(context0, k0, t0), e0, o0, n0, l0);
    }

    private F k(F f0) {
        if(f0.b().h() != null && f0.b().g() != null) {
            return f0;
        }
        M m0 = this.f.d(true);
        return F.a(f0.b().u(m0.f()).t(m0.e()), f0.d(), f0.c());
    }

    public void l(@NonNull String s, @NonNull List list0, a f$a0) {
        g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            com.google.firebase.crashlytics.internal.model.F.e.b f$e$b0 = ((Q)object0).b();
            if(f$e$b0 != null) {
                arrayList0.add(f$e$b0);
            }
        }
        com.google.firebase.crashlytics.internal.model.F.e f$e0 = com.google.firebase.crashlytics.internal.model.F.e.a().b(DesugarCollections.unmodifiableList(arrayList0)).a();
        this.b.l(s, f$e0, f$a0);
    }

    public void m(long v, @Nullable String s) {
        this.b.k(s, v);
    }

    @Nullable
    @RequiresApi(api = 30)
    private ApplicationExitInfo n(String s, List list0) {
        long v = this.b.q(s);
        for(Object object0: list0) {
            ApplicationExitInfo applicationExitInfo0 = (ApplicationExitInfo)object0;
            if(applicationExitInfo0.getTimestamp() < v) {
                return null;
            }
            if(applicationExitInfo0.getReason() == 6) {
                return applicationExitInfo0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NonNull
    private static List o(@NonNull Map map0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.ensureCapacity(map0.size());
        for(Object object0: map0.entrySet()) {
            arrayList0.add(com.google.firebase.crashlytics.internal.model.F.d.a().b(((String)((Map.Entry)object0).getKey())).c(((String)((Map.Entry)object0).getValue())).a());
        }
        Collections.sort(arrayList0, (com.google.firebase.crashlytics.internal.model.F.d f$d0, com.google.firebase.crashlytics.internal.model.F.d f$d1) -> f$d0.b().compareTo(f$d1.b()));
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public boolean p() {
        return this.b.r();
    }

    // 检测为 Lambda 实现
    private static int q(com.google.firebase.crashlytics.internal.model.F.d f$d0, com.google.firebase.crashlytics.internal.model.F.d f$d1) [...]

    // 检测为 Lambda 实现
    private void r(d f$f$d0, String s, boolean z) [...]

    public SortedSet s() {
        return this.b.p();
    }

    public void t(@NonNull String s, long v) {
        com.google.firebase.crashlytics.internal.model.F f0 = this.a.e(s, v);
        this.b.A(f0);
    }

    private boolean u(@NonNull Task task0) {
        if(task0.isSuccessful()) {
            F f0 = (F)task0.getResult();
            g.f().b("Crashlytics report successfully enqueued to DataTransport: " + f0.d());
            File file0 = f0.c();
            if(file0.delete()) {
                g.f().b("Deleted report file: " + file0.getPath());
                return true;
            }
            g.f().m("Crashlytics could not delete report file: " + file0.getPath());
            return true;
        }
        g.f().n("Crashlytics report could not be enqueued to DataTransport", task0.getException());
        return false;
    }

    private void v(@NonNull Throwable throwable0, @NonNull Thread thread0, @NonNull String s, @NonNull String s1, long v, boolean z) {
        boolean z1 = s1.equals("crash");
        d f$f$d0 = this.f(this.a.d(throwable0, thread0, s1, v, 4, 8, z));
        if(!z) {
            e0 e00 = () -> {
                g.f().b("disk worker: log non-fatal event to persistence");
                this.b.z(f$f$d0, s, z1);
            };
            this.g.b.q(e00);
            return;
        }
        this.b.z(f$f$d0, s, z1);
    }

    public void w(@NonNull Throwable throwable0, @NonNull Thread thread0, @NonNull String s, long v) {
        g.f().k("Persisting fatal event for session " + s);
        this.v(throwable0, thread0, s, "crash", v, true);
    }

    public void x(@NonNull Throwable throwable0, @NonNull Thread thread0, @NonNull String s, long v) {
        g.f().k("Persisting non-fatal event for session " + s);
        this.v(throwable0, thread0, s, "error", v, false);
    }

    @RequiresApi(api = 30)
    public void y(String s, List list0, com.google.firebase.crashlytics.internal.metadata.e e0, o o0) {
        ApplicationExitInfo applicationExitInfo0 = this.n(s, list0);
        if(applicationExitInfo0 == null) {
            g.f().k("No relevant ApplicationExitInfo occurred during session: " + s);
            return;
        }
        a f$a0 = f0.h(applicationExitInfo0);
        d f$f$d0 = this.a.c(f$a0);
        g.f().b("Persisting anr for session " + s);
        d f$f$d1 = this.g(this.e(f$f$d0, e0, o0), o0);
        this.b.z(f$f$d1, s, true);
    }

    public void z() {
        this.b.i();
    }
}

