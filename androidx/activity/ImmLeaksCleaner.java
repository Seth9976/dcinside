package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static abstract class Cleaner {
        private Cleaner() {
        }

        public Cleaner(w w0) {
        }

        public abstract boolean a(@l InputMethodManager arg1);

        @m
        public abstract Object b(@l InputMethodManager arg1);

        @m
        public abstract View c(@l InputMethodManager arg1);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Cleaner a() {
            return (Cleaner)ImmLeaksCleaner.c.getValue();
        }
    }

    public static final class FailedInitialization extends Cleaner {
        @l
        public static final FailedInitialization a;

        static {
            FailedInitialization.a = new FailedInitialization();
        }

        private FailedInitialization() {
            super(null);
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        public boolean a(@l InputMethodManager inputMethodManager0) {
            L.p(inputMethodManager0, "<this>");
            return false;
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @m
        public Object b(@l InputMethodManager inputMethodManager0) {
            L.p(inputMethodManager0, "<this>");
            return null;
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @m
        public View c(@l InputMethodManager inputMethodManager0) {
            L.p(inputMethodManager0, "<this>");
            return null;
        }
    }

    public static final class ValidCleaner extends Cleaner {
        @l
        private final Field a;
        @l
        private final Field b;
        @l
        private final Field c;

        public ValidCleaner(@l Field field0, @l Field field1, @l Field field2) {
            L.p(field0, "hField");
            L.p(field1, "servedViewField");
            L.p(field2, "nextServedViewField");
            super(null);
            this.a = field0;
            this.b = field1;
            this.c = field2;
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        public boolean a(@l InputMethodManager inputMethodManager0) {
            L.p(inputMethodManager0, "<this>");
            try {
                this.c.set(inputMethodManager0, null);
                return true;
            }
            catch(IllegalAccessException unused_ex) {
                return false;
            }
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @m
        public Object b(@l InputMethodManager inputMethodManager0) {
            L.p(inputMethodManager0, "<this>");
            try {
                return this.a.get(inputMethodManager0);
            }
            catch(IllegalAccessException unused_ex) {
                return null;
            }
        }

        @Override  // androidx.activity.ImmLeaksCleaner$Cleaner
        @m
        public View c(@l InputMethodManager inputMethodManager0) {
            L.p(inputMethodManager0, "<this>");
            try {
                return (View)this.b.get(inputMethodManager0);
            }
            catch(IllegalAccessException | ClassCastException unused_ex) {
                return null;
            }
        }
    }

    @l
    private final Activity a;
    @l
    public static final Companion b;
    @l
    private static final D c;

    static {
        ImmLeaksCleaner.b = new Companion(null);
        ImmLeaksCleaner.c = E.a(ImmLeaksCleaner.Companion.cleaner.2.e);
    }

    public ImmLeaksCleaner(@l Activity activity0) {
        L.p(activity0, "activity");
        super();
        this.a = activity0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        if(lifecycle$Event0 != Event.ON_DESTROY) {
            return;
        }
        Object object0 = this.a.getSystemService("input_method");
        L.n(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        Cleaner immLeaksCleaner$Cleaner0 = ImmLeaksCleaner.b.a();
        Object object1 = immLeaksCleaner$Cleaner0.b(((InputMethodManager)object0));
        if(object1 == null) {
            return;
        }
        synchronized(object1) {
            View view0 = immLeaksCleaner$Cleaner0.c(((InputMethodManager)object0));
            if(view0 == null) {
                return;
            }
            if(view0.isAttachedToWindow()) {
                return;
            }
            boolean z = immLeaksCleaner$Cleaner0.a(((InputMethodManager)object0));
        }
        if(z) {
            ((InputMethodManager)object0).isActive();
        }
    }
}

