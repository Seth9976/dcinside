package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,99:1\n361#2,7:100\n361#2,7:107\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:100,7\n92#1:107,7\n*E\n"})
public final class LiveLiteralKt {
    @l
    private static final HashMap a;
    private static boolean b;

    static {
        LiveLiteralKt.a = new HashMap();
    }

    @InternalComposeApi
    public static final void a() {
        LiveLiteralKt.b = true;
    }

    public static final boolean b() {
        return LiveLiteralKt.b;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static void c() {
    }

    @ComposeCompilerApi
    @InternalComposeApi
    @l
    public static final State d(@l String s, Object object0) {
        L.p(s, "key");
        HashMap hashMap0 = LiveLiteralKt.a;
        MutableState mutableState0 = hashMap0.get(s);
        if(mutableState0 == null) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            hashMap0.put(s, mutableState0);
        }
        L.n(mutableState0, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return mutableState0;
    }

    @InternalComposeApi
    public static final void e(@l String s, @m Object object0) {
        boolean z;
        L.p(s, "key");
        HashMap hashMap0 = LiveLiteralKt.a;
        MutableState mutableState0 = hashMap0.get(s);
        if(mutableState0 == null) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            hashMap0.put(s, mutableState0);
            z = false;
        }
        else {
            z = true;
        }
        if(z) {
            mutableState0.setValue(object0);
        }
    }
}

