package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class CompositeSequenceableLoader implements SequenceableLoader {
    static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        private final SequenceableLoader a;
        private final O2 b;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader0, List list0) {
            this.a = sequenceableLoader0;
            this.b = O2.r(list0);
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean a() {
            return this.a.a();
        }

        public O2 b() {
            return this.b;
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader
        public long d() {
            return this.a.d();
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader
        public void e(long v) {
            this.a.e(v);
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean f(LoadingInfo loadingInfo0) {
            return this.a.f(loadingInfo0);
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader
        public long g() {
            return this.a.g();
        }
    }

    private final O2 a;
    private long b;

    public CompositeSequenceableLoader(List list0, List list1) {
        a o2$a0 = O2.n();
        Assertions.a(list0.size() == list1.size());
        for(int v = 0; v < list0.size(); ++v) {
            o2$a0.j(new SequenceableLoaderWithTrackTypes(((SequenceableLoader)list0.get(v)), ((List)list1.get(v))));
        }
        this.a = o2$a0.n();
        this.b = 0x8000000000000001L;
    }

    @Deprecated
    public CompositeSequenceableLoader(SequenceableLoader[] arr_sequenceableLoader) {
        O2 o20 = O2.x(arr_sequenceableLoader);
        O2 o21 = O2.B(-1);
        this(o20, Collections.nCopies(arr_sequenceableLoader.length, o21));
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean a() {
        for(int v = 0; v < this.a.size(); ++v) {
            if(((SequenceableLoaderWithTrackTypes)this.a.get(v)).a()) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public long d() {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        long v2 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < this.a.size(); ++v) {
            SequenceableLoaderWithTrackTypes compositeSequenceableLoader$SequenceableLoaderWithTrackTypes0 = (SequenceableLoaderWithTrackTypes)this.a.get(v);
            long v3 = compositeSequenceableLoader$SequenceableLoaderWithTrackTypes0.d();
            if((compositeSequenceableLoader$SequenceableLoaderWithTrackTypes0.b().contains(1) || compositeSequenceableLoader$SequenceableLoaderWithTrackTypes0.b().contains(2) || compositeSequenceableLoader$SequenceableLoaderWithTrackTypes0.b().contains(4)) && v3 != 0x8000000000000000L) {
                v1 = Math.min(v1, v3);
            }
            if(v3 != 0x8000000000000000L) {
                v2 = Math.min(v2, v3);
            }
        }
        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
            this.b = v1;
            return v1;
        }
        if(v2 != 0x7FFFFFFFFFFFFFFFL) {
            return this.b == 0x8000000000000001L ? v2 : this.b;
        }
        return 0x8000000000000000L;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public void e(long v) {
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            ((SequenceableLoaderWithTrackTypes)this.a.get(v1)).e(v);
        }
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean f(LoadingInfo loadingInfo0) {
        boolean z = false;
        do {
            long v = this.g();
            if(v == 0x8000000000000000L) {
                break;
            }
            boolean z1 = false;
            for(int v1 = 0; v1 < this.a.size(); ++v1) {
                long v2 = ((SequenceableLoaderWithTrackTypes)this.a.get(v1)).g();
                if(v2 == v || v2 != 0x8000000000000000L && v2 <= loadingInfo0.a) {
                    z1 |= ((SequenceableLoaderWithTrackTypes)this.a.get(v1)).f(loadingInfo0);
                }
            }
            z |= z1;
        }
        while(z1);
        return z;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public long g() {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < this.a.size(); ++v) {
            long v2 = ((SequenceableLoaderWithTrackTypes)this.a.get(v)).g();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }
}

