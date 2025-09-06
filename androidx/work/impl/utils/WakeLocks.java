package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nWakeLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeLocks.kt\nandroidx/work/impl/utils/WakeLocks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,71:1\n1#2:72\n215#3,2:73\n*S KotlinDebug\n*F\n+ 1 WakeLocks.kt\nandroidx/work/impl/utils/WakeLocks\n*L\n63#1:73,2\n*E\n"})
@i(name = "WakeLocks")
public final class WakeLocks {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-WakeLocks", "tagWithPrefix(\"WakeLocks\")");
        WakeLocks.a = "WM-WakeLocks";
    }

    public static final void a() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        synchronized(WakeLocksHolder.a) {
            linkedHashMap0.putAll(WakeLocksHolder.a.a());
        }
        for(Object object0: linkedHashMap0.entrySet()) {
            PowerManager.WakeLock powerManager$WakeLock0 = (PowerManager.WakeLock)((Map.Entry)object0).getKey();
            String s = (String)((Map.Entry)object0).getValue();
            if(powerManager$WakeLock0 != null && powerManager$WakeLock0.isHeld()) {
                Logger.e().l("WM-WakeLocks", "WakeLock held for " + s);
            }
        }
    }

    @l
    public static final PowerManager.WakeLock b(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "tag");
        Object object0 = context0.getApplicationContext().getSystemService("power");
        L.n(object0, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)object0).newWakeLock(1, "WorkManager: " + s);
        synchronized(WakeLocksHolder.a) {
            String s1 = (String)WakeLocksHolder.a.a().put(powerManager$WakeLock0, "WorkManager: " + s);
        }
        L.o(powerManager$WakeLock0, "wakeLock");
        return powerManager$WakeLock0;
    }
}

