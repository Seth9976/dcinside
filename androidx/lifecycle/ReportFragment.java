package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;
import z3.n;

@RestrictTo({Scope.c})
public class ReportFragment extends Fragment {
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @n
        public final void a(@l Activity activity0, @l Event lifecycle$Event0) {
            L.p(activity0, "activity");
            L.p(lifecycle$Event0, "event");
            if(activity0 instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner)activity0).getLifecycle().l(lifecycle$Event0);
                return;
            }
            if(activity0 instanceof LifecycleOwner) {
                Lifecycle lifecycle0 = ((LifecycleOwner)activity0).getLifecycle();
                if(lifecycle0 instanceof LifecycleRegistry) {
                    ((LifecycleRegistry)lifecycle0).l(lifecycle$Event0);
                }
            }
        }

        @l
        @i(name = "get")
        public final ReportFragment b(@l Activity activity0) {
            L.p(activity0, "<this>");
            Fragment fragment0 = activity0.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            L.n(fragment0, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment)fragment0;
        }

        @n
        public static void c(Activity activity0) {
        }

        @n
        public final void d(@l Activity activity0) {
            L.p(activity0, "activity");
            if(Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.Companion.a(activity0);
            }
            FragmentManager fragmentManager0 = activity0.getFragmentManager();
            if(fragmentManager0.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager0.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager0.executePendingTransactions();
            }
        }
    }

    @RequiresApi(29)
    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static final class androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion {
            private androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion() {
            }

            public androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion(w w0) {
            }

            @n
            public final void a(@l Activity activity0) {
                L.p(activity0, "activity");
                activity0.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
            }
        }

        @l
        public static final androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion Companion;

        static {
            LifecycleCallbacks.Companion = new androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion(null);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(@l Activity activity0, @m Bundle bundle0) {
            L.p(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(@l Activity activity0) {
            L.p(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(@l Activity activity0) {
            L.p(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostCreated(@l Activity activity0, @m Bundle bundle0) {
            L.p(activity0, "activity");
            ReportFragment.b.a(activity0, Event.ON_CREATE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostResumed(@l Activity activity0) {
            L.p(activity0, "activity");
            ReportFragment.b.a(activity0, Event.ON_RESUME);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostStarted(@l Activity activity0) {
            L.p(activity0, "activity");
            ReportFragment.b.a(activity0, Event.ON_START);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@l Activity activity0) {
            L.p(activity0, "activity");
            ReportFragment.b.a(activity0, Event.ON_DESTROY);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPrePaused(@l Activity activity0) {
            L.p(activity0, "activity");
            ReportFragment.b.a(activity0, Event.ON_PAUSE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreStopped(@l Activity activity0) {
            L.p(activity0, "activity");
            ReportFragment.b.a(activity0, Event.ON_STOP);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(@l Activity activity0) {
            L.p(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@l Activity activity0, @l Bundle bundle0) {
            L.p(activity0, "activity");
            L.p(bundle0, "bundle");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(@l Activity activity0) {
            L.p(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(@l Activity activity0) {
            L.p(activity0, "activity");
        }

        @n
        public static final void registerIn(@l Activity activity0) {
            LifecycleCallbacks.Companion.a(activity0);
        }
    }

    @m
    private ActivityInitializationListener a;
    @l
    public static final Companion b = null;
    @l
    private static final String c = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    static {
        ReportFragment.b = new Companion(null);
    }

    private final void a(Event lifecycle$Event0) {
        if(Build.VERSION.SDK_INT < 29) {
            Activity activity0 = this.getActivity();
            L.o(activity0, "activity");
            ReportFragment.b.a(activity0, lifecycle$Event0);
        }
    }

    @n
    public static final void b(@l Activity activity0, @l Event lifecycle$Event0) {
        ReportFragment.b.a(activity0, lifecycle$Event0);
    }

    private final void c(ActivityInitializationListener reportFragment$ActivityInitializationListener0) {
        if(reportFragment$ActivityInitializationListener0 != null) {
            reportFragment$ActivityInitializationListener0.onCreate();
        }
    }

    private final void d(ActivityInitializationListener reportFragment$ActivityInitializationListener0) {
        if(reportFragment$ActivityInitializationListener0 != null) {
            reportFragment$ActivityInitializationListener0.onResume();
        }
    }

    private final void e(ActivityInitializationListener reportFragment$ActivityInitializationListener0) {
        if(reportFragment$ActivityInitializationListener0 != null) {
            reportFragment$ActivityInitializationListener0.onStart();
        }
    }

    @l
    @i(name = "get")
    public static final ReportFragment f(@l Activity activity0) {
        return ReportFragment.b.b(activity0);
    }

    @n
    public static final void g(@l Activity activity0) {
        ReportFragment.b.d(activity0);
    }

    public final void h(@m ActivityInitializationListener reportFragment$ActivityInitializationListener0) {
        this.a = reportFragment$ActivityInitializationListener0;
    }

    @Override  // android.app.Fragment
    public void onActivityCreated(@m Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.c(this.a);
        this.a(Event.ON_CREATE);
    }

    @Override  // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a(Event.ON_DESTROY);
        this.a = null;
    }

    @Override  // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.a(Event.ON_PAUSE);
    }

    @Override  // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.d(this.a);
        this.a(Event.ON_RESUME);
    }

    @Override  // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.e(this.a);
        this.a(Event.ON_START);
    }

    @Override  // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a(Event.ON_STOP);
    }
}

