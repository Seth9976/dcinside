package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.a;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.i;
import java.util.WeakHashMap;

public class c extends FragmentLifecycleCallbacks {
    private final WeakHashMap a;
    private final a b;
    private final k c;
    private final com.google.firebase.perf.application.a d;
    private final d e;
    private static final com.google.firebase.perf.logging.a f;

    static {
        c.f = com.google.firebase.perf.logging.a.e();
    }

    public c(a a0, k k0, com.google.firebase.perf.application.a a1, d d0) {
        this.a = new WeakHashMap();
        this.b = a0;
        this.c = k0;
        this.d = a1;
        this.e = d0;
    }

    @Override  // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public void f(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        super.f(fragmentManager0, fragment0);
        com.google.firebase.perf.logging.a a0 = c.f;
        a0.b("FragmentMonitor %s.onFragmentPaused ", new Object[]{fragment0.getClass().getSimpleName()});
        if(!this.a.containsKey(fragment0)) {
            a0.m("FragmentMonitor: missed a fragment trace from %s", new Object[]{fragment0.getClass().getSimpleName()});
            return;
        }
        Trace trace0 = (Trace)this.a.get(fragment0);
        this.a.remove(fragment0);
        f f0 = this.e.f(fragment0);
        if(!f0.d()) {
            a0.m("onFragmentPaused: recorder failed to trace %s", new Object[]{fragment0.getClass().getSimpleName()});
            return;
        }
        i.a(trace0, ((com.google.firebase.perf.metrics.h.a)f0.c()));
        trace0.stop();
    }

    @Override  // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public void i(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        super.i(fragmentManager0, fragment0);
        Object[] arr_object = {fragment0.getClass().getSimpleName()};
        c.f.b("FragmentMonitor %s.onFragmentResumed", arr_object);
        Trace trace0 = new Trace(this.o(fragment0), this.c, this.b, this.d);
        trace0.start();
        trace0.putAttribute("Parent_fragment", (fragment0.getParentFragment() == null ? "No parent" : fragment0.getParentFragment().getClass().getSimpleName()));
        if(fragment0.getActivity() != null) {
            trace0.putAttribute("Hosting_activity", fragment0.getActivity().getClass().getSimpleName());
        }
        this.a.put(fragment0, trace0);
        this.e.d(fragment0);
    }

    public String o(Fragment fragment0) {
        return "_st_" + fragment0.getClass().getSimpleName();
    }

    @VisibleForTesting
    WeakHashMap p() {
        return this.a;
    }
}

