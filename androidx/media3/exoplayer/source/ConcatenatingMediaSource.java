package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.Builder;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@UnstableApi
@Deprecated
public final class ConcatenatingMediaSource extends CompositeMediaSource {
    static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final int h;
        private final int i;
        private final int[] j;
        private final int[] k;
        private final Timeline[] l;
        private final Object[] m;
        private final HashMap n;

        public ConcatenatedTimeline(Collection collection0, ShuffleOrder shuffleOrder0, boolean z) {
            super(z, shuffleOrder0);
            int v = collection0.size();
            this.j = new int[v];
            this.k = new int[v];
            this.l = new Timeline[v];
            this.m = new Object[v];
            this.n = new HashMap();
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            for(Object object0: collection0) {
                this.l[v3] = ((MediaSourceHolder)object0).a.U0();
                this.k[v3] = v1;
                this.j[v3] = v2;
                v1 += this.l[v3].v();
                v2 += this.l[v3].m();
                this.m[v3] = ((MediaSourceHolder)object0).b;
                this.n.put(((MediaSourceHolder)object0).b, v3);
                ++v3;
            }
            this.h = v1;
            this.i = v2;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int A(int v) {
            return Util.m(this.j, v + 1, false, false);
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int B(int v) {
            return Util.m(this.k, v + 1, false, false);
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected Object E(int v) {
            return this.m[v];
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int G(int v) {
            return this.j[v];
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int H(int v) {
            return this.k[v];
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected Timeline K(int v) {
            return this.l[v];
        }

        @Override  // androidx.media3.common.Timeline
        public int m() {
            return this.i;
        }

        @Override  // androidx.media3.common.Timeline
        public int v() {
            return this.h;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int z(Object object0) {
            Integer integer0 = (Integer)this.n.get(object0);
            return integer0 == null ? -1 : ((int)integer0);
        }
    }

    static final class FakeMediaSource extends BaseMediaSource {
        private FakeMediaSource() {
        }

        FakeMediaSource(androidx.media3.exoplayer.source.ConcatenatingMediaSource.1 concatenatingMediaSource$10) {
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource
        public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource
        public MediaItem d() {
            return ConcatenatingMediaSource.C;
        }

        @Override  // androidx.media3.exoplayer.source.BaseMediaSource
        protected void o0(@Nullable TransferListener transferListener0) {
        }

        @Override  // androidx.media3.exoplayer.source.BaseMediaSource
        protected void q0() {
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource
        public void r(MediaPeriod mediaPeriod0) {
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource
        public void w() {
        }
    }

    static final class HandlerAndRunnable {
        private final Handler a;
        private final Runnable b;

        public HandlerAndRunnable(Handler handler0, Runnable runnable0) {
            this.a = handler0;
            this.b = runnable0;
        }

        public void a() {
            this.a.post(this.b);
        }
    }

    static final class MediaSourceHolder {
        public final MaskingMediaSource a;
        public final Object b;
        public final List c;
        public int d;
        public int e;
        public boolean f;

        public MediaSourceHolder(MediaSource mediaSource0, boolean z) {
            this.a = new MaskingMediaSource(mediaSource0, z);
            this.c = new ArrayList();
            this.b = new Object();
        }

        public void a(int v, int v1) {
            this.d = v;
            this.e = v1;
            this.f = false;
            this.c.clear();
        }
    }

    static final class MessageData {
        public final int a;
        public final Object b;
        @Nullable
        public final HandlerAndRunnable c;

        public MessageData(int v, Object object0, @Nullable HandlerAndRunnable concatenatingMediaSource$HandlerAndRunnable0) {
            this.a = v;
            this.b = object0;
            this.c = concatenatingMediaSource$HandlerAndRunnable0;
        }
    }

    private static final int A = 5;
    private static final int B = 6;
    private static final MediaItem C = null;
    @GuardedBy("this")
    private final List k;
    @GuardedBy("this")
    private final Set l;
    @GuardedBy("this")
    @Nullable
    private Handler m;
    private final List n;
    private final IdentityHashMap o;
    private final Map p;
    private final Set q;
    private final boolean r;
    private final boolean s;
    private boolean t;
    private Set u;
    private ShuffleOrder v;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private static final int z = 4;

    static {
        ConcatenatingMediaSource.C = new Builder().M(Uri.EMPTY).a();
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder0, MediaSource[] arr_mediaSource) {
        this(z, false, shuffleOrder0, arr_mediaSource);
    }

    public ConcatenatingMediaSource(boolean z, boolean z1, ShuffleOrder shuffleOrder0, MediaSource[] arr_mediaSource) {
        for(int v = 0; v < arr_mediaSource.length; ++v) {
            Assertions.g(arr_mediaSource[v]);
        }
        if(shuffleOrder0.getLength() > 0) {
            shuffleOrder0 = shuffleOrder0.d();
        }
        this.v = shuffleOrder0;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        this.k = new ArrayList();
        this.n = new ArrayList();
        this.u = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        this.r = z;
        this.s = z1;
        this.N0(Arrays.asList(arr_mediaSource));
    }

    public ConcatenatingMediaSource(boolean z, MediaSource[] arr_mediaSource) {
        this(z, new DefaultShuffleOrder(0), arr_mediaSource);
    }

    public ConcatenatingMediaSource(MediaSource[] arr_mediaSource) {
        this(false, arr_mediaSource);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void B0(Object object0, MediaSource mediaSource0, Timeline timeline0) {
        this.m1(((MediaSourceHolder)object0), mediaSource0, timeline0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        Object object0 = ConcatenatingMediaSource.b1(mediaSource$MediaPeriodId0.a);
        MediaPeriodId mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0.a(ConcatenatingMediaSource.Y0(mediaSource$MediaPeriodId0.a));
        MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0 = (MediaSourceHolder)this.p.get(object0);
        if(concatenatingMediaSource$MediaSourceHolder0 == null) {
            concatenatingMediaSource$MediaSourceHolder0 = new MediaSourceHolder(new FakeMediaSource(null), this.s);
            concatenatingMediaSource$MediaSourceHolder0.f = true;
            this.C0(concatenatingMediaSource$MediaSourceHolder0, concatenatingMediaSource$MediaSourceHolder0.a);
        }
        this.X0(concatenatingMediaSource$MediaSourceHolder0);
        concatenatingMediaSource$MediaSourceHolder0.c.add(mediaSource$MediaPeriodId1);
        MediaPeriod mediaPeriod0 = concatenatingMediaSource$MediaSourceHolder0.a.R0(mediaSource$MediaPeriodId1, allocator0, v);
        this.o.put(mediaPeriod0, concatenatingMediaSource$MediaSourceHolder0);
        this.V0();
        return mediaPeriod0;
    }

    public void G0(int v, MediaSource mediaSource0) {
        synchronized(this) {
            this.Q0(v, Collections.singletonList(mediaSource0), null, null);
        }
    }

    public void H0(int v, MediaSource mediaSource0, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.Q0(v, Collections.singletonList(mediaSource0), handler0, runnable0);
        }
    }

    public void I0(MediaSource mediaSource0) {
        synchronized(this) {
            this.G0(this.k.size(), mediaSource0);
        }
    }

    public void J0(MediaSource mediaSource0, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.H0(this.k.size(), mediaSource0, handler0, runnable0);
        }
    }

    private void K0(int v, MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0) {
        if(v > 0) {
            MediaSourceHolder concatenatingMediaSource$MediaSourceHolder1 = (MediaSourceHolder)this.n.get(v - 1);
            concatenatingMediaSource$MediaSourceHolder0.a(v, concatenatingMediaSource$MediaSourceHolder1.e + concatenatingMediaSource$MediaSourceHolder1.a.U0().v());
        }
        else {
            concatenatingMediaSource$MediaSourceHolder0.a(v, 0);
        }
        this.T0(v, 1, concatenatingMediaSource$MediaSourceHolder0.a.U0().v());
        this.n.add(v, concatenatingMediaSource$MediaSourceHolder0);
        this.p.put(concatenatingMediaSource$MediaSourceHolder0.b, concatenatingMediaSource$MediaSourceHolder0);
        this.C0(concatenatingMediaSource$MediaSourceHolder0, concatenatingMediaSource$MediaSourceHolder0.a);
        if(this.i0() && this.o.isEmpty()) {
            this.q.add(concatenatingMediaSource$MediaSourceHolder0);
            return;
        }
        this.v0(concatenatingMediaSource$MediaSourceHolder0);
    }

    public void L0(int v, Collection collection0) {
        synchronized(this) {
            this.Q0(v, collection0, null, null);
        }
    }

    public void M0(int v, Collection collection0, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.Q0(v, collection0, handler0, runnable0);
        }
    }

    public void N0(Collection collection0) {
        synchronized(this) {
            this.Q0(this.k.size(), collection0, null, null);
        }
    }

    public void O0(Collection collection0, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.Q0(this.k.size(), collection0, handler0, runnable0);
        }
    }

    private void P0(int v, Collection collection0) {
        for(Object object0: collection0) {
            this.K0(v, ((MediaSourceHolder)object0));
            ++v;
        }
    }

    @GuardedBy("this")
    private void Q0(int v, Collection collection0, @Nullable Handler handler0, @Nullable Runnable runnable0) {
        Assertions.a((handler0 == null ? 1 : 0) == (runnable0 == null ? 1 : 0));
        Handler handler1 = this.m;
        for(Object object0: collection0) {
            Assertions.g(((MediaSource)object0));
        }
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object1: collection0) {
            arrayList0.add(new MediaSourceHolder(((MediaSource)object1), this.s));
        }
        this.k.addAll(v, arrayList0);
        if(handler1 != null && !collection0.isEmpty()) {
            handler1.obtainMessage(1, new MessageData(v, arrayList0, this.U0(handler0, runnable0))).sendToTarget();
            return;
        }
        if(runnable0 != null && handler0 != null) {
            handler0.post(runnable0);
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean R() {
        return false;
    }

    public void R0() {
        synchronized(this) {
            this.q1(0, this.e1());
        }
    }

    public void S0(Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.r1(0, this.e1(), handler0, runnable0);
        }
    }

    private void T0(int v, int v1, int v2) {
        while(v < this.n.size()) {
            MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0 = (MediaSourceHolder)this.n.get(v);
            concatenatingMediaSource$MediaSourceHolder0.d += v1;
            concatenatingMediaSource$MediaSourceHolder0.e += v2;
            ++v;
        }
    }

    @GuardedBy("this")
    @Nullable
    private HandlerAndRunnable U0(@Nullable Handler handler0, @Nullable Runnable runnable0) {
        if(handler0 != null && runnable0 != null) {
            HandlerAndRunnable concatenatingMediaSource$HandlerAndRunnable0 = new HandlerAndRunnable(handler0, runnable0);
            this.l.add(concatenatingMediaSource$HandlerAndRunnable0);
            return concatenatingMediaSource$HandlerAndRunnable0;
        }
        return null;
    }

    private void V0() {
        Iterator iterator0 = this.q.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0 = (MediaSourceHolder)object0;
            if(concatenatingMediaSource$MediaSourceHolder0.c.isEmpty()) {
                this.v0(concatenatingMediaSource$MediaSourceHolder0);
                iterator0.remove();
            }
        }
    }

    private void W0(Set set0) {
        synchronized(this) {
            for(Object object0: set0) {
                ((HandlerAndRunnable)object0).a();
            }
            this.l.removeAll(set0);
        }
    }

    private void X0(MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0) {
        this.q.add(concatenatingMediaSource$MediaSourceHolder0);
        this.w0(concatenatingMediaSource$MediaSourceHolder0);
    }

    private static Object Y0(Object object0) {
        return AbstractConcatenatedTimeline.C(object0);
    }

    @Nullable
    protected MediaPeriodId Z0(MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0, MediaPeriodId mediaSource$MediaPeriodId0) {
        for(int v = 0; v < concatenatingMediaSource$MediaSourceHolder0.c.size(); ++v) {
            if(((MediaPeriodId)concatenatingMediaSource$MediaSourceHolder0.c.get(v)).d == mediaSource$MediaPeriodId0.d) {
                return mediaSource$MediaPeriodId0.a(ConcatenatingMediaSource.c1(concatenatingMediaSource$MediaSourceHolder0, mediaSource$MediaPeriodId0.a));
            }
        }
        return null;
    }

    public MediaSource a1(int v) {
        synchronized(this) {
            return ((MediaSourceHolder)this.k.get(v)).a;
        }
    }

    private static Object b1(Object object0) {
        return AbstractConcatenatedTimeline.D(object0);
    }

    private static Object c1(MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0, Object object0) {
        return AbstractConcatenatedTimeline.F(concatenatingMediaSource$MediaSourceHolder0.b, object0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        return ConcatenatingMediaSource.C;
    }

    private Handler d1() {
        return (Handler)Assertions.g(this.m);
    }

    public int e1() {
        synchronized(this) {
        }
        return this.k.size();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void f0() {
        super.f0();
        this.q.clear();
    }

    protected int f1(MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0, int v) {
        return v + concatenatingMediaSource$MediaSourceHolder0.e;
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void g0() {
    }

    // 检测为 Lambda 实现
    private boolean g1(Message message0) [...]

    private void h1(MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0) {
        if(concatenatingMediaSource$MediaSourceHolder0.f && concatenatingMediaSource$MediaSourceHolder0.c.isEmpty()) {
            this.q.remove(concatenatingMediaSource$MediaSourceHolder0);
            this.D0(concatenatingMediaSource$MediaSourceHolder0);
        }
    }

    public void i1(int v, int v1) {
        synchronized(this) {
            this.l1(v, v1, null, null);
        }
    }

    public void j1(int v, int v1, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.l1(v, v1, handler0, runnable0);
        }
    }

    private void k1(int v, int v1) {
        int v2 = Math.min(v, v1);
        int v3 = Math.max(v, v1);
        int v4 = ((MediaSourceHolder)this.n.get(v2)).e;
        MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0 = (MediaSourceHolder)this.n.remove(v);
        this.n.add(v1, concatenatingMediaSource$MediaSourceHolder0);
        while(v2 <= v3) {
            MediaSourceHolder concatenatingMediaSource$MediaSourceHolder1 = (MediaSourceHolder)this.n.get(v2);
            concatenatingMediaSource$MediaSourceHolder1.d = v2;
            concatenatingMediaSource$MediaSourceHolder1.e = v4;
            v4 += concatenatingMediaSource$MediaSourceHolder1.a.U0().v();
            ++v2;
        }
    }

    @GuardedBy("this")
    private void l1(int v, int v1, @Nullable Handler handler0, @Nullable Runnable runnable0) {
        Assertions.a((handler0 == null ? 1 : 0) == (runnable0 == null ? 1 : 0));
        Handler handler1 = this.m;
        MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0 = (MediaSourceHolder)this.k.remove(v);
        this.k.add(v1, concatenatingMediaSource$MediaSourceHolder0);
        if(handler1 != null) {
            handler1.obtainMessage(3, new MessageData(v, v1, this.U0(handler0, runnable0))).sendToTarget();
            return;
        }
        if(runnable0 != null && handler0 != null) {
            handler0.post(runnable0);
        }
    }

    protected void m1(MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0, MediaSource mediaSource0, Timeline timeline0) {
        this.y1(concatenatingMediaSource$MediaSourceHolder0, timeline0);
    }

    public MediaSource n1(int v) {
        synchronized(this) {
            MediaSource mediaSource0 = this.a1(v);
            this.s1(v, v + 1, null, null);
            return mediaSource0;
        }
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        synchronized(this) {
            super.o0(transferListener0);
            this.m = new Handler((Message message0) -> switch(message0.what) {
                case 1: {
                    MessageData concatenatingMediaSource$MessageData0 = (MessageData)message0.obj;
                    this.v = this.v.g(concatenatingMediaSource$MessageData0.a, ((Collection)concatenatingMediaSource$MessageData0.b).size());
                    this.P0(concatenatingMediaSource$MessageData0.a, ((Collection)concatenatingMediaSource$MessageData0.b));
                    this.u1(concatenatingMediaSource$MessageData0.c);
                    return true;
                }
                case 2: {
                    MessageData concatenatingMediaSource$MessageData1 = (MessageData)message0.obj;
                    int v = concatenatingMediaSource$MessageData1.a;
                    int v1 = (int)(((Integer)concatenatingMediaSource$MessageData1.b));
                    this.v = v != 0 || v1 != this.v.getLength() ? this.v.f(v, v1) : this.v.d();
                    for(int v2 = v1 - 1; v2 >= v; --v2) {
                        this.p1(v2);
                    }
                    this.u1(concatenatingMediaSource$MessageData1.c);
                    return true;
                }
                case 3: {
                    MessageData concatenatingMediaSource$MessageData2 = (MessageData)message0.obj;
                    this.v = this.v.f(concatenatingMediaSource$MessageData2.a, concatenatingMediaSource$MessageData2.a + 1).g(((int)(((Integer)concatenatingMediaSource$MessageData2.b))), 1);
                    this.k1(concatenatingMediaSource$MessageData2.a, ((int)(((Integer)concatenatingMediaSource$MessageData2.b))));
                    this.u1(concatenatingMediaSource$MessageData2.c);
                    return true;
                }
                case 4: {
                    MessageData concatenatingMediaSource$MessageData3 = (MessageData)message0.obj;
                    this.v = (ShuffleOrder)concatenatingMediaSource$MessageData3.b;
                    this.u1(concatenatingMediaSource$MessageData3.c);
                    return true;
                }
                case 5: {
                    this.z1();
                    return true;
                }
                case 6: {
                    this.W0(((Set)message0.obj));
                    return true;
                }
                default: {
                    throw new IllegalStateException();
                }
            });
            if(this.k.isEmpty()) {
                this.z1();
            }
            else {
                this.v = this.v.g(0, this.k.size());
                this.P0(0, this.k);
                this.t1();
            }
        }
    }

    public MediaSource o1(int v, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            MediaSource mediaSource0 = this.a1(v);
            this.s1(v, v + 1, handler0, runnable0);
            return mediaSource0;
        }
    }

    private void p1(int v) {
        MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0 = (MediaSourceHolder)this.n.remove(v);
        this.p.remove(concatenatingMediaSource$MediaSourceHolder0.b);
        this.T0(v, -1, -concatenatingMediaSource$MediaSourceHolder0.a.U0().v());
        concatenatingMediaSource$MediaSourceHolder0.f = true;
        this.h1(concatenatingMediaSource$MediaSourceHolder0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void q0() {
        synchronized(this) {
            super.q0();
            this.n.clear();
            this.q.clear();
            this.p.clear();
            this.v = this.v.d();
            Handler handler0 = this.m;
            if(handler0 != null) {
                handler0.removeCallbacksAndMessages(null);
                this.m = null;
            }
            this.t = false;
            this.u.clear();
            this.W0(this.l);
        }
    }

    public void q1(int v, int v1) {
        synchronized(this) {
            this.s1(v, v1, null, null);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0 = (MediaSourceHolder)Assertions.g(((MediaSourceHolder)this.o.remove(mediaPeriod0)));
        concatenatingMediaSource$MediaSourceHolder0.a.r(mediaPeriod0);
        concatenatingMediaSource$MediaSourceHolder0.c.remove(((MaskingMediaPeriod)mediaPeriod0).a);
        if(!this.o.isEmpty()) {
            this.V0();
        }
        this.h1(concatenatingMediaSource$MediaSourceHolder0);
    }

    public void r1(int v, int v1, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.s1(v, v1, handler0, runnable0);
        }
    }

    @GuardedBy("this")
    private void s1(int v, int v1, @Nullable Handler handler0, @Nullable Runnable runnable0) {
        Assertions.a((handler0 == null ? 1 : 0) == (runnable0 == null ? 1 : 0));
        Handler handler1 = this.m;
        Util.V1(this.k, v, v1);
        if(handler1 != null) {
            handler1.obtainMessage(2, new MessageData(v, v1, this.U0(handler0, runnable0))).sendToTarget();
            return;
        }
        if(runnable0 != null && handler0 != null) {
            handler0.post(runnable0);
        }
    }

    private void t1() {
        this.u1(null);
    }

    private void u1(@Nullable HandlerAndRunnable concatenatingMediaSource$HandlerAndRunnable0) {
        if(!this.t) {
            this.d1().obtainMessage(5).sendToTarget();
            this.t = true;
        }
        if(concatenatingMediaSource$HandlerAndRunnable0 != null) {
            this.u.add(concatenatingMediaSource$HandlerAndRunnable0);
        }
    }

    @GuardedBy("this")
    private void v1(ShuffleOrder shuffleOrder0, @Nullable Handler handler0, @Nullable Runnable runnable0) {
        Assertions.a((handler0 == null ? 1 : 0) == (runnable0 == null ? 1 : 0));
        Handler handler1 = this.m;
        if(handler1 != null) {
            int v = this.e1();
            if(shuffleOrder0.getLength() != v) {
                shuffleOrder0 = shuffleOrder0.d().g(0, v);
            }
            handler1.obtainMessage(4, new MessageData(0, shuffleOrder0, this.U0(handler0, runnable0))).sendToTarget();
            return;
        }
        if(shuffleOrder0.getLength() > 0) {
            shuffleOrder0 = shuffleOrder0.d();
        }
        this.v = shuffleOrder0;
        if(runnable0 != null && handler0 != null) {
            handler0.post(runnable0);
        }
    }

    public void w1(ShuffleOrder shuffleOrder0) {
        synchronized(this) {
            this.v1(shuffleOrder0, null, null);
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public Timeline x() {
        synchronized(this) {
            ShuffleOrder shuffleOrder0 = this.v.getLength() == this.k.size() ? this.v : this.v.d().g(0, this.k.size());
            return new ConcatenatedTimeline(this.k, shuffleOrder0, this.r);
        }
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    protected MediaPeriodId x0(Object object0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.Z0(((MediaSourceHolder)object0), mediaSource$MediaPeriodId0);
    }

    public void x1(ShuffleOrder shuffleOrder0, Handler handler0, Runnable runnable0) {
        synchronized(this) {
            this.v1(shuffleOrder0, handler0, runnable0);
        }
    }

    private void y1(MediaSourceHolder concatenatingMediaSource$MediaSourceHolder0, Timeline timeline0) {
        if(concatenatingMediaSource$MediaSourceHolder0.d + 1 < this.n.size()) {
            MediaSourceHolder concatenatingMediaSource$MediaSourceHolder1 = (MediaSourceHolder)this.n.get(concatenatingMediaSource$MediaSourceHolder0.d + 1);
            int v = timeline0.v() - (concatenatingMediaSource$MediaSourceHolder1.e - concatenatingMediaSource$MediaSourceHolder0.e);
            if(v != 0) {
                this.T0(concatenatingMediaSource$MediaSourceHolder0.d + 1, 0, v);
            }
        }
        this.t1();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected int z0(Object object0, int v) {
        return this.f1(((MediaSourceHolder)object0), v);
    }

    private void z1() {
        this.t = false;
        Set set0 = this.u;
        this.u = new HashSet();
        this.p0(new ConcatenatedTimeline(this.n, this.v, this.r));
        this.d1().obtainMessage(6, set0).sendToTarget();
    }

    class androidx.media3.exoplayer.source.ConcatenatingMediaSource.1 {
    }

}

