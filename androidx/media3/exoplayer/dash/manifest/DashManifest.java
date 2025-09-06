package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@UnstableApi
public class DashManifest implements FilterableManifest {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    @Nullable
    public final UtcTimingElement i;
    @Nullable
    public final ServiceDescriptionElement j;
    @Nullable
    public final Uri k;
    @Nullable
    public final ProgramInformation l;
    private final List m;

    public DashManifest(long v, long v1, long v2, boolean z, long v3, long v4, long v5, long v6, @Nullable ProgramInformation programInformation0, @Nullable UtcTimingElement utcTimingElement0, @Nullable ServiceDescriptionElement serviceDescriptionElement0, @Nullable Uri uri0, List list0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
        this.l = programInformation0;
        this.i = utcTimingElement0;
        this.k = uri0;
        this.j = serviceDescriptionElement0;
        this.m = list0 == null ? Collections.emptyList() : list0;
    }

    @Override  // androidx.media3.exoplayer.offline.FilterableManifest
    public Object a(List list0) {
        return this.b(list0);
    }

    public final DashManifest b(List list0) {
        long v2;
        LinkedList linkedList0 = new LinkedList(list0);
        Collections.sort(linkedList0);
        linkedList0.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList0 = new ArrayList();
        long v = 0L;
        for(int v1 = 0; true; ++v1) {
            v2 = 0x8000000000000001L;
            if(v1 >= this.e()) {
                break;
            }
            if(((StreamKey)linkedList0.peek()).a == v1) {
                Period period0 = this.d(v1);
                ArrayList arrayList1 = DashManifest.c(period0.c, linkedList0);
                arrayList0.add(new Period(period0.a, period0.b - v, arrayList1, period0.d));
            }
            else {
                long v3 = this.f(v1);
                if(v3 != 0x8000000000000001L) {
                    v += v3;
                }
            }
        }
        long v4 = this.b;
        if(v4 != 0x8000000000000001L) {
            v2 = v4 - v;
        }
        return new DashManifest(this.a, v2, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList0);
    }

    private static ArrayList c(List list0, LinkedList linkedList0) {
        StreamKey streamKey0 = (StreamKey)linkedList0.poll();
        int v = streamKey0.a;
        ArrayList arrayList0 = new ArrayList();
        do {
            int v1 = streamKey0.b;
            AdaptationSet adaptationSet0 = (AdaptationSet)list0.get(v1);
            List list1 = adaptationSet0.c;
            ArrayList arrayList1 = new ArrayList();
            do {
                arrayList1.add(((Representation)list1.get(streamKey0.c)));
                streamKey0 = (StreamKey)linkedList0.poll();
            }
            while(streamKey0.a == v && streamKey0.b == v1);
            arrayList0.add(new AdaptationSet(adaptationSet0.a, adaptationSet0.b, arrayList1, adaptationSet0.d, adaptationSet0.e, adaptationSet0.f));
        }
        while(streamKey0.a == v);
        linkedList0.addFirst(streamKey0);
        return arrayList0;
    }

    public final Period d(int v) {
        return (Period)this.m.get(v);
    }

    public final int e() {
        return this.m.size();
    }

    public final long f(int v) {
        if(v == this.m.size() - 1) {
            return this.b == 0x8000000000000001L ? 0x8000000000000001L : this.b - ((Period)this.m.get(v)).b;
        }
        return ((Period)this.m.get(v + 1)).b - ((Period)this.m.get(v)).b;
    }

    public final long g(int v) {
        return Util.F1(this.f(v));
    }
}

