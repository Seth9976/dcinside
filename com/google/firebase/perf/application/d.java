package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.metrics.h;
import com.google.firebase.perf.util.f;
import java.util.HashMap;
import java.util.Map;

public class d {
    private final Activity a;
    private final FrameMetricsAggregator b;
    private final Map c;
    private boolean d;
    private static final a e = null;
    private static final String f = "androidx.core.app.FrameMetricsAggregator";

    static {
        d.e = a.e();
    }

    public d(Activity activity0) {
        this(activity0, new FrameMetricsAggregator(), new HashMap());
    }

    @VisibleForTesting
    d(Activity activity0, FrameMetricsAggregator frameMetricsAggregator0, Map map0) {
        this.d = false;
        this.a = activity0;
        this.b = frameMetricsAggregator0;
        this.c = map0;
    }

    static boolean a() [...] // Inlined contents

    private f b() {
        if(!this.d) {
            d.e.a("No recording has been started.");
            return f.a();
        }
        SparseIntArray[] arr_sparseIntArray = this.b.b();
        if(arr_sparseIntArray == null) {
            d.e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return f.a();
        }
        if(arr_sparseIntArray[0] == null) {
            d.e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return f.a();
        }
        return f.e(h.a(arr_sparseIntArray));
    }

    public void c() {
        if(this.d) {
            Object[] arr_object = {this.a.getClass().getSimpleName()};
            d.e.b("FrameMetricsAggregator is already recording %s", arr_object);
            return;
        }
        this.b.a(this.a);
        this.d = true;
    }

    public void d(Fragment fragment0) {
        if(!this.d) {
            d.e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if(this.c.containsKey(fragment0)) {
            Object[] arr_object = {fragment0.getClass().getSimpleName()};
            d.e.b("Cannot start sub-recording because one is already ongoing with the key %s", arr_object);
            return;
        }
        f f0 = this.b();
        if(!f0.d()) {
            Object[] arr_object1 = {fragment0.getClass().getSimpleName()};
            d.e.b("startFragment(%s): snapshot() failed", arr_object1);
            return;
        }
        com.google.firebase.perf.metrics.h.a h$a0 = (com.google.firebase.perf.metrics.h.a)f0.c();
        this.c.put(fragment0, h$a0);
    }

    public f e() {
        if(!this.d) {
            d.e.a("Cannot stop because no recording was started");
            return f.a();
        }
        if(!this.c.isEmpty()) {
            d.e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.c.clear();
        }
        f f0 = this.b();
        try {
            this.b.c(this.a);
        }
        catch(IllegalArgumentException | NullPointerException illegalArgumentException0) {
            if(illegalArgumentException0 instanceof NullPointerException && Build.VERSION.SDK_INT > 28) {
                throw illegalArgumentException0;
            }
            d.e.m("View not hardware accelerated. Unable to collect FrameMetrics. %s", new Object[]{illegalArgumentException0.toString()});
            f0 = f.a();
        }
        this.b.d();
        this.d = false;
        return f0;
    }

    public f f(Fragment fragment0) {
        if(!this.d) {
            d.e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return f.a();
        }
        if(!this.c.containsKey(fragment0)) {
            Object[] arr_object = {fragment0.getClass().getSimpleName()};
            d.e.b("Sub-recording associated with key %s was not started or does not exist", arr_object);
            return f.a();
        }
        com.google.firebase.perf.metrics.h.a h$a0 = (com.google.firebase.perf.metrics.h.a)this.c.remove(fragment0);
        f f0 = this.b();
        if(!f0.d()) {
            Object[] arr_object1 = {fragment0.getClass().getSimpleName()};
            d.e.b("stopFragment(%s): snapshot() failed", arr_object1);
            return f.a();
        }
        return f.e(((com.google.firebase.perf.metrics.h.a)f0.c()).a(h$a0));
    }
}

