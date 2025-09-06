package androidx.core.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window.OnFrameMetricsAvailableListener;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class FrameMetricsAggregator {
    @RequiresApi(24)
    static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {
        int a;
        SparseIntArray[] b;
        private final ArrayList c;
        Window.OnFrameMetricsAvailableListener d;
        private static final int e = 1000000;
        private static final int f = 500000;
        private static HandlerThread g;
        private static Handler h;

        static {
        }

        FrameMetricsApi24Impl(int v) {
            this.b = new SparseIntArray[9];
            this.c = new ArrayList();
            this.d = new Window.OnFrameMetricsAvailableListener() {
                final FrameMetricsApi24Impl a;

                @Override  // android.view.Window$OnFrameMetricsAvailableListener
                public void onFrameMetricsAvailable(Window window0, FrameMetrics frameMetrics0, int v) {
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl0 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl0.a & 1) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl0.f(frameMetricsAggregator$FrameMetricsApi24Impl0.b[0], frameMetrics0.getMetric(8));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl1 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl1.a & 2) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl1.f(frameMetricsAggregator$FrameMetricsApi24Impl1.b[1], frameMetrics0.getMetric(1));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl2 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl2.a & 4) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl2.f(frameMetricsAggregator$FrameMetricsApi24Impl2.b[2], frameMetrics0.getMetric(3));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl3 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl3.a & 8) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl3.f(frameMetricsAggregator$FrameMetricsApi24Impl3.b[3], frameMetrics0.getMetric(4));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl4 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl4.a & 16) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl4.f(frameMetricsAggregator$FrameMetricsApi24Impl4.b[4], frameMetrics0.getMetric(5));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl5 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl5.a & 0x40) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl5.f(frameMetricsAggregator$FrameMetricsApi24Impl5.b[6], frameMetrics0.getMetric(7));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl6 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl6.a & 0x20) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl6.f(frameMetricsAggregator$FrameMetricsApi24Impl6.b[5], frameMetrics0.getMetric(6));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl7 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl7.a & 0x80) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl7.f(frameMetricsAggregator$FrameMetricsApi24Impl7.b[7], frameMetrics0.getMetric(0));
                    }
                    FrameMetricsApi24Impl frameMetricsAggregator$FrameMetricsApi24Impl8 = FrameMetricsApi24Impl.this;
                    if((frameMetricsAggregator$FrameMetricsApi24Impl8.a & 0x100) != 0) {
                        frameMetricsAggregator$FrameMetricsApi24Impl8.f(frameMetricsAggregator$FrameMetricsApi24Impl8.b[8], frameMetrics0.getMetric(2));
                    }
                }
            };
            this.a = v;
        }

        @Override  // androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl
        public void a(Activity activity0) {
            if(FrameMetricsApi24Impl.g == null) {
                HandlerThread handlerThread0 = new HandlerThread("FrameMetricsAggregator");
                FrameMetricsApi24Impl.g = handlerThread0;
                handlerThread0.start();
                FrameMetricsApi24Impl.h = new Handler(FrameMetricsApi24Impl.g.getLooper());
            }
            for(int v = 0; v <= 8; ++v) {
                SparseIntArray[] arr_sparseIntArray = this.b;
                if(arr_sparseIntArray[v] == null && (this.a & 1 << v) != 0) {
                    arr_sparseIntArray[v] = new SparseIntArray();
                }
            }
            activity0.getWindow().addOnFrameMetricsAvailableListener(this.d, FrameMetricsApi24Impl.h);
            WeakReference weakReference0 = new WeakReference(activity0);
            this.c.add(weakReference0);
        }

        @Override  // androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl
        public SparseIntArray[] b() {
            return this.b;
        }

        @Override  // androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl
        public SparseIntArray[] c(Activity activity0) {
            for(Object object0: this.c) {
                WeakReference weakReference0 = (WeakReference)object0;
                if(weakReference0.get() == activity0) {
                    this.c.remove(weakReference0);
                    break;
                }
                if(false) {
                    break;
                }
            }
            activity0.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.b;
        }

        @Override  // androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl
        public SparseIntArray[] d() {
            SparseIntArray[] arr_sparseIntArray = this.b;
            this.b = new SparseIntArray[9];
            return arr_sparseIntArray;
        }

        @Override  // androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl
        public SparseIntArray[] e() {
            for(int v = this.c.size() - 1; v >= 0; --v) {
                WeakReference weakReference0 = (WeakReference)this.c.get(v);
                Activity activity0 = (Activity)weakReference0.get();
                if(weakReference0.get() != null) {
                    activity0.getWindow().removeOnFrameMetricsAvailableListener(this.d);
                    this.c.remove(v);
                }
            }
            return this.b;
        }

        void f(SparseIntArray sparseIntArray0, long v) {
            if(sparseIntArray0 != null) {
                int v1 = (int)((v + 500000L) / 1000000L);
                if(v >= 0L) {
                    sparseIntArray0.put(v1, sparseIntArray0.get(v1) + 1);
                }
            }
        }
    }

    static class FrameMetricsBaseImpl {
        public void a(Activity activity0) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity0) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricType {
    }

    private final FrameMetricsBaseImpl a;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private static final int k = 8;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 4;
    public static final int o = 8;
    public static final int p = 16;
    public static final int q = 0x20;
    public static final int r = 0x40;
    public static final int s = 0x80;
    public static final int t = 0x100;
    public static final int u = 0x1FF;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int v) {
        if(Build.VERSION.SDK_INT >= 24) {
            this.a = new FrameMetricsApi24Impl(v);
            return;
        }
        this.a = new FrameMetricsBaseImpl();
    }

    public void a(Activity activity0) {
        this.a.a(activity0);
    }

    public SparseIntArray[] b() {
        return this.a.b();
    }

    public SparseIntArray[] c(Activity activity0) {
        return this.a.c(activity0);
    }

    public SparseIntArray[] d() {
        return this.a.d();
    }

    public SparseIntArray[] e() {
        return this.a.e();
    }
}

