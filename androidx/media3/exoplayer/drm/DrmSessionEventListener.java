package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
public interface DrmSessionEventListener {
    public static class EventDispatcher {
        static final class ListenerAndHandler {
            public Handler a;
            public DrmSessionEventListener b;

            public ListenerAndHandler(Handler handler0, DrmSessionEventListener drmSessionEventListener0) {
                this.a = handler0;
                this.b = drmSessionEventListener0;
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

        public void g(Handler handler0, DrmSessionEventListener drmSessionEventListener0) {
            Assertions.g(handler0);
            Assertions.g(drmSessionEventListener0);
            ListenerAndHandler drmSessionEventListener$EventDispatcher$ListenerAndHandler0 = new ListenerAndHandler(handler0, drmSessionEventListener0);
            this.c.add(drmSessionEventListener$EventDispatcher$ListenerAndHandler0);
        }

        public void h() {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.G(this.a, this.b));
            }
        }

        public void i() {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.m0(this.a, this.b));
            }
        }

        public void j() {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.t0(this.a, this.b));
            }
        }

        public void k(int v) {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> {
                    ((ListenerAndHandler)object0).b.k0(this.a, this.b);
                    ((ListenerAndHandler)object0).b.j0(this.a, this.b, v);
                });
            }
        }

        public void l(Exception exception0) {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.n0(this.a, this.b, exception0));
            }
        }

        public void m() {
            for(Object object0: this.c) {
                Util.Q1(((ListenerAndHandler)object0).a, () -> ((ListenerAndHandler)object0).b.W(this.a, this.b));
            }
        }

        // 检测为 Lambda 实现
        private void n(DrmSessionEventListener drmSessionEventListener0) [...]

        // 检测为 Lambda 实现
        private void o(DrmSessionEventListener drmSessionEventListener0) [...]

        // 检测为 Lambda 实现
        private void p(DrmSessionEventListener drmSessionEventListener0) [...]

        // 检测为 Lambda 实现
        private void q(DrmSessionEventListener drmSessionEventListener0, int v) [...]

        // 检测为 Lambda 实现
        private void r(DrmSessionEventListener drmSessionEventListener0, Exception exception0) [...]

        // 检测为 Lambda 实现
        private void s(DrmSessionEventListener drmSessionEventListener0) [...]

        public void t(DrmSessionEventListener drmSessionEventListener0) {
            for(Object object0: this.c) {
                ListenerAndHandler drmSessionEventListener$EventDispatcher$ListenerAndHandler0 = (ListenerAndHandler)object0;
                if(drmSessionEventListener$EventDispatcher$ListenerAndHandler0.b == drmSessionEventListener0) {
                    this.c.remove(drmSessionEventListener$EventDispatcher$ListenerAndHandler0);
                }
            }
        }

        @CheckResult
        public EventDispatcher u(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
            return new EventDispatcher(this.c, v, mediaSource$MediaPeriodId0);
        }
    }

    void G(int arg1, @Nullable MediaPeriodId arg2);

    void W(int arg1, @Nullable MediaPeriodId arg2);

    void j0(int arg1, @Nullable MediaPeriodId arg2, int arg3);

    @Deprecated
    void k0(int arg1, @Nullable MediaPeriodId arg2);

    void m0(int arg1, @Nullable MediaPeriodId arg2);

    void n0(int arg1, @Nullable MediaPeriodId arg2, Exception arg3);

    void t0(int arg1, @Nullable MediaPeriodId arg2);
}

