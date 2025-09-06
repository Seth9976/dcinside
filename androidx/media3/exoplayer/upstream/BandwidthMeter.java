package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
public interface BandwidthMeter {
    public interface EventListener {
        public static final class EventDispatcher {
            static final class HandlerAndListener {
                private final Handler a;
                private final EventListener b;
                private boolean c;

                public HandlerAndListener(Handler handler0, EventListener bandwidthMeter$EventListener0) {
                    this.a = handler0;
                    this.b = bandwidthMeter$EventListener0;
                }

                public void d() {
                    this.c = true;
                }
            }

            private final CopyOnWriteArrayList a;

            public EventDispatcher() {
                this.a = new CopyOnWriteArrayList();
            }

            public void b(Handler handler0, EventListener bandwidthMeter$EventListener0) {
                Assertions.g(handler0);
                Assertions.g(bandwidthMeter$EventListener0);
                this.e(bandwidthMeter$EventListener0);
                HandlerAndListener bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0 = new HandlerAndListener(handler0, bandwidthMeter$EventListener0);
                this.a.add(bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0);
            }

            public void c(int v, long v1, long v2) {
                for(Object object0: this.a) {
                    HandlerAndListener bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0 = (HandlerAndListener)object0;
                    if(!bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0.c) {
                        bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0.a.post(() -> bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0.b.u(v, v1, v2));
                    }
                }
            }

            // 检测为 Lambda 实现
            private static void d(HandlerAndListener bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0, int v, long v1, long v2) [...]

            public void e(EventListener bandwidthMeter$EventListener0) {
                for(Object object0: this.a) {
                    HandlerAndListener bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0 = (HandlerAndListener)object0;
                    if(bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0.b == bandwidthMeter$EventListener0) {
                        bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0.d();
                        this.a.remove(bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener0);
                    }
                }
            }
        }

        void u(int arg1, long arg2, long arg3);
    }

    void a(EventListener arg1);

    long b();

    void c(Handler arg1, EventListener arg2);

    long d();

    @Nullable
    TransferListener g();
}

