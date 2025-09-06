package com.google.firebase.sessions;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n766#2:97\n857#2,2:98\n1549#2:100\n1620#2,3:101\n1#3:104\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n*L\n41#1:97\n41#1:98,2\n45#1:100\n45#1:101,3\n*E\n"})
public final class w {
    @l
    public static final w a;

    static {
        w.a = new w();
    }

    private final v a(String s, int v, int v1, boolean z) {
        return new v(s, v, v1, z);
    }

    static v b(w w0, String s, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        if((v2 & 8) != 0) {
            z = false;
        }
        return w0.a(s, v, v1, z);
    }

    @l
    public final List c(@l Context context0) {
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
            String s1 = ((ActivityManager.RunningAppProcessInfo)object2).processName;
            L.o(s1, "runningAppProcessInfo.processName");
            list1.add(new v(s1, ((ActivityManager.RunningAppProcessInfo)object2).pid, ((ActivityManager.RunningAppProcessInfo)object2).importance, L.g(((ActivityManager.RunningAppProcessInfo)object2).processName, s)));
        }
        return list1;
    }

    @l
    public final v d(@l Context context0) {
        L.p(context0, "context");
        int v = Process.myPid();
        for(Object object0: this.c(context0)) {
            if(((v)object0).h() == v) {
                return ((v)object0) == null ? w.b(this, this.e(), v, 0, false, 12, null) : ((v)object0);
            }
            if(false) {
                break;
            }
        }
        return w.b(this, this.e(), v, 0, false, 12, null);
    }

    @l
    public final String e() {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            String s = Process.myProcessName();
            L.o(s, "myProcessName()");
            return s;
        }
        if(v >= 28) {
            String s1 = Application.getProcessName();
            if(s1 != null) {
                return s1;
            }
        }
        String s2 = ProcessUtils.getMyProcessName();
        return s2 == null ? "" : s2;
    }
}

