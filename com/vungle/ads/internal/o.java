package com.vungle.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.vungle.ads.internal.util.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class o {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public interface b {
        void onImpression(@m View arg1);

        void onViewInvisible(@m View arg1);
    }

    @VisibleForTesting
    public static final class c {
        @m
        private b impressionListener;
        private int minViewablePercent;

        @m
        public final b getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(@m b o$b0) {
            this.impressionListener = o$b0;
        }

        public final void setMinViewablePercent(int v) {
            this.minViewablePercent = v;
        }
    }

    @VisibleForTesting
    public final class d implements Runnable {
        @l
        private final ArrayList invisibleViews;
        @l
        private final ArrayList visibleViews;

        public d() {
            this.visibleViews = new ArrayList();
            this.invisibleViews = new ArrayList();
        }

        @Override
        public void run() {
            o.this.isVisibilityScheduled = false;
            for(Object object0: o.this.trackedViews.entrySet()) {
                View view0 = (View)((Map.Entry)object0).getKey();
                int v = ((c)((Map.Entry)object0).getValue()).getMinViewablePercent();
                if(o.this.isVisible(view0, v)) {
                    this.visibleViews.add(view0);
                }
                else {
                    this.invisibleViews.add(view0);
                }
            }
            for(Object object1: this.visibleViews) {
                View view1 = (View)object1;
                c o$c0 = (c)o.this.trackedViews.get(view1);
                if(o$c0 != null) {
                    b o$b0 = o$c0.getImpressionListener();
                    if(o$b0 != null) {
                        o$b0.onImpression(view1);
                    }
                }
                L.o(view1, "view");
                o.this.removeView(view1);
            }
            this.visibleViews.clear();
            for(Object object2: this.invisibleViews) {
                View view2 = (View)object2;
                c o$c1 = (c)o.this.trackedViews.get(view2);
                if(o$c1 != null) {
                    b o$b1 = o$c1.getImpressionListener();
                    if(o$b1 != null) {
                        o$b1.onViewInvisible(view2);
                    }
                }
            }
            this.invisibleViews.clear();
            if(!o.this.trackedViews.isEmpty() && !o.this.setViewTreeObserverSucceed) {
                o.this.scheduleVisibilityCheck();
            }
        }
    }

    @l
    public static final a Companion = null;
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final String TAG = null;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    @l
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    @l
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    @l
    private final Map trackedViews;
    @l
    private final Handler visibilityHandler;
    @l
    private final d visibilityRunnable;
    @l
    private WeakReference weakViewTreeObserver;

    static {
        o.Companion = new a(null);
        o.TAG = "o";
    }

    public o(@l Context context0) {
        L.p(context0, "context");
        this(context0, new WeakHashMap(10), new Handler());
    }

    @VisibleForTesting
    public o(@l Context context0, @l Map map0, @l Handler handler0) {
        L.p(context0, "context");
        L.p(map0, "trackedViews");
        L.p(handler0, "visibilityHandler");
        super();
        this.trackedViews = map0;
        this.visibilityHandler = handler0;
        this.clipRect = new Rect();
        this.visibilityRunnable = new d(this);
        this.onPreDrawListener = () -> {
            L.p(this, "this$0");
            this.scheduleVisibilityCheck();
            return true;
        };
        this.weakViewTreeObserver = new WeakReference(null);
        this.setViewTreeObserverSucceed = this.setViewTreeObserver(context0, null);
    }

    // 检测为 Lambda 实现
    private static final boolean _init_$lambda-0(o o0) [...]

    public final void addView(@l View view0, @m b o$b0) {
        L.p(view0, "view");
        this.setViewTreeObserverSucceed = this.setViewTreeObserver(view0.getContext(), view0);
        c o$c0 = (c)this.trackedViews.get(view0);
        if(o$c0 == null) {
            o$c0 = new c();
            this.trackedViews.put(view0, o$c0);
            this.scheduleVisibilityCheck();
        }
        o$c0.setMinViewablePercent(1);
        o$c0.setImpressionListener(o$b0);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        this.clear();
        ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)this.weakViewTreeObserver.get();
        if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    @l
    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    @VisibleForTesting
    public static void getOnPreDrawListener$annotations() {
    }

    private final View getTopView(Context context0, View view0) {
        View view1 = context0 instanceof Activity ? ((Activity)context0).getWindow().getDecorView().findViewById(0x1020002) : null;
        if(view1 == null && view0 != null) {
            if(!ViewCompat.T0(view0)) {
                L.o("o", "TAG");
                p.Companion.w("o", "Trying to call View#rootView() on an unattached View.");
            }
            View view2 = view0.getRootView();
            if(view2 != null) {
                view1 = view2.findViewById(0x1020002);
            }
            return view1 == null ? view2 : view1;
        }
        return view1;
    }

    @l
    public final WeakReference getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    @VisibleForTesting
    public static void getWeakViewTreeObserver$annotations() {
    }

    private final boolean isVisible(View view0, int v) {
        if(view0 != null && view0.getVisibility() == 0 && view0.getParent() != null) {
            for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof ViewGroup; viewParent0 = ((ViewGroup)viewParent0).getParent()) {
                if(((ViewGroup)viewParent0).getVisibility() != 0) {
                    p.Companion.w("ImpressionTracker", "Parent visibility is not visible: " + viewParent0);
                    return false;
                }
            }
            if(!view0.getGlobalVisibleRect(this.clipRect)) {
                return false;
            }
            long v1 = ((long)this.clipRect.height()) * ((long)this.clipRect.width());
            long v2 = ((long)view0.getHeight()) * ((long)view0.getWidth());
            return v2 > 0L && 100L * v1 >= ((long)v) * v2;
        }
        return false;
    }

    @VisibleForTesting
    public final void removeView(@l View view0) {
        L.p(view0, "view");
        this.trackedViews.remove(view0);
    }

    private final void scheduleVisibilityCheck() {
        if(this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context0, View view0) {
        ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)this.weakViewTreeObserver.get();
        if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
            return true;
        }
        View view1 = this.getTopView(context0, view0);
        if(view1 == null) {
            L.o("o", "TAG");
            p.Companion.d("o", "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver1 = view1.getViewTreeObserver();
        if(!viewTreeObserver1.isAlive()) {
            L.o("o", "TAG");
            p.Companion.d("o", "The root view tree observer was not alive");
            return false;
        }
        this.weakViewTreeObserver = new WeakReference(viewTreeObserver1);
        viewTreeObserver1.addOnPreDrawListener(this.onPreDrawListener);
        return true;
    }

    public final void setWeakViewTreeObserver(@l WeakReference weakReference0) {
        L.p(weakReference0, "<set-?>");
        this.weakViewTreeObserver = weakReference0;
    }
}

