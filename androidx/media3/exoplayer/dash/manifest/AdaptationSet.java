package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;
import j..util.DesugarCollections;
import java.util.List;

@UnstableApi
public class AdaptationSet {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public static final long g = -1L;

    public AdaptationSet(long v, int v1, List list0, List list1, List list2, List list3) {
        this.a = v;
        this.b = v1;
        this.c = DesugarCollections.unmodifiableList(list0);
        this.d = DesugarCollections.unmodifiableList(list1);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
    }
}

