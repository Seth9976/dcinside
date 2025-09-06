package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
public interface MediaSourceEventListener {
    public static class EventDispatcher {
        static final class ListenerAndHandler {
            public Handler a;
            public MediaSourceEventListener b;

            public ListenerAndHandler(Handler handler0, MediaSourceEventListener mediaSourceEventListener0) {
                this.a = handler0;
                this.b = mediaSourceEventListener0;
            }
        }

        public final int a;
        @Nullable
        public final MediaPeriodId b;
        private final CopyOnWriteArrayList c;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList0, int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            this.c = copyOnWriteArrayList0;
            this.a = v;
            this.b = mediaSource$MediaPeriodId0;
        }

        public void A(LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.e0(this.a, this.b, loadEventInfo0, mediaLoadData0));
            }
        }

        public void B(MediaSourceEventListener mediaSourceEventListener0) {
            for(Object object0: this.c) {
                ListenerAndHandler mediaSourceEventListener$EventDispatcher$ListenerAndHandler0 = (ListenerAndHandler)object0;
                if(mediaSourceEventListener$EventDispatcher$ListenerAndHandler0.b == mediaSourceEventListener0) {
                    this.c.remove(mediaSourceEventListener$EventDispatcher$ListenerAndHandler0);
                }
            }
        }

        public void C(int v, long v1, long v2) {
            this.D(new MediaLoadData(1, v, null, 3, null, Util.B2(v1), Util.B2(v2)));
        }

        public void D(MediaLoadData mediaLoadData0) {
            MediaPeriodId mediaSource$MediaPeriodId0 = (MediaPeriodId)Assertions.g(this.b);
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.b0(this.a, mediaSource$MediaPeriodId0, mediaLoadData0));
            }
        }

        @CheckResult
        public EventDispatcher E(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            return new EventDispatcher(this.c, v, mediaSource$MediaPeriodId0);
        }

        @CheckResult
        @Deprecated
        public EventDispatcher F(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, long v1) {
            return new EventDispatcher(this.c, v, mediaSource$MediaPeriodId0);
        }

        public void g(Handler handler0, MediaSourceEventListener mediaSourceEventListener0) {
            Assertions.g(handler0);
            Assertions.g(mediaSourceEventListener0);
            ListenerAndHandler mediaSourceEventListener$EventDispatcher$ListenerAndHandler0 = new ListenerAndHandler(handler0, mediaSourceEventListener0);
            this.c.add(mediaSourceEventListener$EventDispatcher$ListenerAndHandler0);
        }

        public void h(int v, @Nullable Format format0, int v1, @Nullable Object object0, long v2) {
            this.i(new MediaLoadData(1, v, format0, v1, object0, Util.B2(v2), 0x8000000000000001L));
        }

        public void i(MediaLoadData mediaLoadData0) {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.P(this.a, this.b, mediaLoadData0));
            }
        }

        // 检测为 Lambda 实现
        private void j(MediaSourceEventListener mediaSourceEventListener0, MediaLoadData mediaLoadData0) [...]

        // 检测为 Lambda 实现
        private void k(MediaSourceEventListener mediaSourceEventListener0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) [...]

        // 检测为 Lambda 实现
        private void l(MediaSourceEventListener mediaSourceEventListener0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) [...]

        // 检测为 Lambda 实现
        private void m(MediaSourceEventListener mediaSourceEventListener0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) [...]

        // 检测为 Lambda 实现
        private void n(MediaSourceEventListener mediaSourceEventListener0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) [...]

        // 检测为 Lambda 实现
        private void o(MediaSourceEventListener mediaSourceEventListener0, MediaPeriodId mediaSource$MediaPeriodId0, MediaLoadData mediaLoadData0) [...]

        public void p(LoadEventInfo loadEventInfo0, int v) {
            this.q(loadEventInfo0, v, -1, null, 0, null, 0x8000000000000001L, 0x8000000000000001L);
        }

        public void q(LoadEventInfo loadEventInfo0, int v, int v1, @Nullable Format format0, int v2, @Nullable Object object0, long v3, long v4) {
            this.r(loadEventInfo0, new MediaLoadData(v, v1, format0, v2, object0, Util.B2(v3), Util.B2(v4)));
        }

        public void r(LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.M(this.a, this.b, loadEventInfo0, mediaLoadData0));
            }
        }

        public void s(LoadEventInfo loadEventInfo0, int v) {
            this.t(loadEventInfo0, v, -1, null, 0, null, 0x8000000000000001L, 0x8000000000000001L);
        }

        public void t(LoadEventInfo loadEventInfo0, int v, int v1, @Nullable Format format0, int v2, @Nullable Object object0, long v3, long v4) {
            this.u(loadEventInfo0, new MediaLoadData(v, v1, format0, v2, object0, Util.B2(v3), Util.B2(v4)));
        }

        public void u(LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.s0(this.a, this.b, loadEventInfo0, mediaLoadData0));
            }
        }

        public void v(LoadEventInfo loadEventInfo0, int v, int v1, @Nullable Format format0, int v2, @Nullable Object object0, long v3, long v4, IOException iOException0, boolean z) {
            this.x(loadEventInfo0, new MediaLoadData(v, v1, format0, v2, object0, Util.B2(v3), Util.B2(v4)), iOException0, z);
        }

        public void w(LoadEventInfo loadEventInfo0, int v, IOException iOException0, boolean z) {
            this.v(loadEventInfo0, v, -1, null, 0, null, 0x8000000000000001L, 0x8000000000000001L, iOException0, z);
        }

        public void x(LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.K(this.a, this.b, loadEventInfo0, mediaLoadData0, iOException0, z));
            }
        }

        public void y(LoadEventInfo loadEventInfo0, int v) {
            this.z(loadEventInfo0, v, -1, null, 0, null, 0x8000000000000001L, 0x8000000000000001L);
        }

        public void z(LoadEventInfo loadEventInfo0, int v, int v1, @Nullable Format format0, int v2, @Nullable Object object0, long v3, long v4) {
            this.A(loadEventInfo0, new MediaLoadData(v, v1, format0, v2, object0, Util.B2(v3), Util.B2(v4)));
        }
    }

    void K(int arg1, @Nullable MediaPeriodId arg2, LoadEventInfo arg3, MediaLoadData arg4, IOException arg5, boolean arg6);

    void M(int arg1, @Nullable MediaPeriodId arg2, LoadEventInfo arg3, MediaLoadData arg4);

    void P(int arg1, @Nullable MediaPeriodId arg2, MediaLoadData arg3);

    void b0(int arg1, MediaPeriodId arg2, MediaLoadData arg3);

    void e0(int arg1, @Nullable MediaPeriodId arg2, LoadEventInfo arg3, MediaLoadData arg4);

    void s0(int arg1, @Nullable MediaPeriodId arg2, LoadEventInfo arg3, MediaLoadData arg4);
}

