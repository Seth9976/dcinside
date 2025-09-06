package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.L;
import y4.l;

public final class InvalidationLiveDataContainer {
    @l
    private final RoomDatabase a;
    @l
    private final Set b;

    public InvalidationLiveDataContainer(@l RoomDatabase roomDatabase0) {
        L.p(roomDatabase0, "database");
        super();
        this.a = roomDatabase0;
        Set set0 = Collections.newSetFromMap(new IdentityHashMap());
        L.o(set0, "newSetFromMap(IdentityHashMap())");
        this.b = set0;
    }

    @l
    public final LiveData a(@l String[] arr_s, boolean z, @l Callable callable0) {
        L.p(arr_s, "tableNames");
        L.p(callable0, "computeFunction");
        return new RoomTrackingLiveData(this.a, this, z, callable0, arr_s);
    }

    @l
    public final Set b() {
        return this.b;
    }

    public final void c(@l LiveData liveData0) {
        L.p(liveData0, "liveData");
        this.b.add(liveData0);
    }

    public final void d(@l LiveData liveData0) {
        L.p(liveData0, "liveData");
        this.b.remove(liveData0);
    }
}

