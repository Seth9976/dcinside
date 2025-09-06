package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.w0;
import y4.l;

@s0({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoomKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,162:1\n361#2,7:163\n361#2,7:170\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoomKt\n*L\n149#1:163,7\n159#1:170,7\n*E\n"})
public final class CoroutinesRoomKt {
    @RestrictTo({Scope.b})
    @l
    public static final K a(@l RoomDatabase roomDatabase0) {
        Map map0 = roomDatabase0.n();
        K k0 = map0.get("QueryDispatcher");
        if(k0 == null) {
            k0 = w0.c(roomDatabase0.t());
            map0.put("QueryDispatcher", k0);
        }
        L.n(k0, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return k0;
    }

    @l
    public static final K b(@l RoomDatabase roomDatabase0) {
        Map map0 = roomDatabase0.n();
        K k0 = map0.get("TransactionDispatcher");
        if(k0 == null) {
            k0 = w0.c(roomDatabase0.x());
            map0.put("TransactionDispatcher", k0);
        }
        L.n(k0, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return k0;
    }
}

