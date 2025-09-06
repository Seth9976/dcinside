package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.F.f.d.a.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n766#2:93\n857#2,2:94\n1549#2:96\n1620#2,3:97\n1#3:100\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n*L\n41#1:93\n41#1:94,2\n45#1:96\n45#1:97,3\n*E\n"})
public final class j {
    @l
    public static final j a;

    static {
        j.a = new j();
    }

    @l
    @z3.j
    public final c a(@l String s) {
        L.p(s, "processName");
        return j.e(this, s, 0, 0, false, 14, null);
    }

    @l
    @z3.j
    public final c b(@l String s, int v) {
        L.p(s, "processName");
        return j.e(this, s, v, 0, false, 12, null);
    }

    @l
    @z3.j
    public final c c(@l String s, int v, int v1) {
        L.p(s, "processName");
        return j.e(this, s, v, v1, false, 8, null);
    }

    @l
    @z3.j
    public final c d(@l String s, int v, int v1, boolean z) {
        L.p(s, "processName");
        c f$f$d$a$c0 = c.a().e(s).d(v).c(v1).b(z).a();
        L.o(f$f$d$a$c0, "builder()\n      .setProc…ltProcess)\n      .build()");
        return f$f$d$a$c0;
    }

    public static c e(j j0, String s, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        if((v2 & 8) != 0) {
            z = false;
        }
        return j0.d(s, v, v1, z);
    }

    @l
    public final List f(@l Context context0) {
        L.p(context0, "context");
        int v = context0.getApplicationInfo().uid;
        String s = context0.getApplicationInfo().processName;
        Object object0 = context0.getSystemService("activity");
        List list0 = null;
        ActivityManager activityManager0 = object0 instanceof ActivityManager ? ((ActivityManager)object0) : null;
        if(activityManager0 != null) {
            list0 = activityManager0.getRunningAppProcesses();
        }
        if(list0 == null) {
            list0 = u.H();
        }
        Iterable iterable0 = u.s2(list0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: iterable0) {
            if(((ActivityManager.RunningAppProcessInfo)object1).uid == v) {
                arrayList0.add(object1);
            }
        }
        List list1 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object2: arrayList0) {
            list1.add(c.a().e(((ActivityManager.RunningAppProcessInfo)object2).processName).d(((ActivityManager.RunningAppProcessInfo)object2).pid).c(((ActivityManager.RunningAppProcessInfo)object2).importance).b(L.g(((ActivityManager.RunningAppProcessInfo)object2).processName, s)).a());
        }
        return list1;
    }

    @l
    public final c g(@l Context context0) {
        L.p(context0, "context");
        int v = Process.myPid();
        for(Object object0: this.f(context0)) {
            if(((c)object0).c() == v) {
                return ((c)object0) == null ? j.e(this, this.h(), v, 0, false, 12, null) : ((c)object0);
            }
            if(false) {
                break;
            }
        }
        return j.e(this, this.h(), v, 0, false, 12, null);
    }

    private final String h() {
        String s;
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            s = Process.myProcessName();
            L.o(s, "{\n      Process.myProcessName()\n    }");
            return s;
        }
        if(v >= 28) {
            s = Application.getProcessName();
            return s == null ? "" : s;
        }
        return "";
    }
}

