package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;

@UnstableApi
public class Period {
    @Nullable
    public final String a;
    public final long b;
    public final List c;
    public final List d;
    @Nullable
    public final Descriptor e;

    public Period(@Nullable String s, long v, List list0) {
        this(s, v, list0, Collections.emptyList(), null);
    }

    public Period(@Nullable String s, long v, List list0, List list1) {
        this(s, v, list0, list1, null);
    }

    public Period(@Nullable String s, long v, List list0, List list1, @Nullable Descriptor descriptor0) {
        this.a = s;
        this.b = v;
        this.c = DesugarCollections.unmodifiableList(list0);
        this.d = DesugarCollections.unmodifiableList(list1);
        this.e = descriptor0;
    }

    public int a(int v) {
        int v1 = this.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((AdaptationSet)this.c.get(v2)).b == v) {
                return v2;
            }
        }
        return -1;
    }
}

