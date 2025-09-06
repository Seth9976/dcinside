package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.R.id;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
public class m extends SharedElementCallback {
    public interface d {
        @Nullable
        p a(@NonNull View arg1);
    }

    public static class e implements d {
        // 去混淆评级： 低(20)
        @Override  // com.google.android.material.transition.platform.m$d
        @Nullable
        public p a(@NonNull View view0) {
            return view0 instanceof t ? ((t)view0).getShapeAppearanceModel() : null;
        }
    }

    private boolean a;
    private boolean b;
    private boolean c;
    @Nullable
    private Rect d;
    @Nullable
    private d e;
    @Nullable
    private static WeakReference f;

    public m() {
        this.a = true;
        this.b = true;
        this.c = false;
        this.e = new e();
    }

    @Nullable
    public d e() {
        return this.e;
    }

    @Nullable
    private static Drawable f(Window window0) {
        return window0.getDecorView().getBackground();
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.b;
    }

    private static void i(Window window0) {
        Drawable drawable0 = m.f(window0);
        if(drawable0 == null) {
            return;
        }
        drawable0.mutate().setColorFilter(BlendModeColorFilterCompat.a(0, BlendModeCompat.a));
    }

    private static void j(Window window0) {
        Drawable drawable0 = m.f(window0);
        if(drawable0 == null) {
            return;
        }
        drawable0.mutate().clearColorFilter();
    }

    public void k(@Nullable d m$d0) {
        this.e = m$d0;
    }

    public void l(boolean z) {
        this.c = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    private void n(Window window0) {
        class a extends u {
            final Window a;
            final m b;

            a(Window window0) {
                this.a = window0;
                super();
            }

            @Override  // com.google.android.material.transition.platform.u
            public void onTransitionEnd(Transition transition0) {
                m.j(this.a);
            }

            @Override  // com.google.android.material.transition.platform.u
            public void onTransitionStart(Transition transition0) {
                m.i(this.a);
            }
        }

        Transition transition0 = window0.getSharedElementEnterTransition();
        if(transition0 instanceof l) {
            if(!this.c) {
                window0.setSharedElementReenterTransition(null);
            }
            if(this.b) {
                m.p(window0, ((l)transition0));
                ((l)transition0).addListener(new a(this, window0));
            }
        }
    }

    private void o(Activity activity0, Window window0) {
        class b extends u {
            final Activity a;
            final m b;

            b(Activity activity0) {
                this.a = activity0;
                super();
            }

            @Override  // com.google.android.material.transition.platform.u
            public void onTransitionEnd(Transition transition0) {
                if(m.f != null) {
                    View view0 = (View)m.f.get();
                    if(view0 != null) {
                        view0.setAlpha(1.0f);
                        m.f = null;
                    }
                }
                this.a.finish();
                this.a.overridePendingTransition(0, 0);
            }
        }


        class c extends u {
            final Window a;
            final m b;

            c(Window window0) {
                this.a = window0;
                super();
            }

            @Override  // com.google.android.material.transition.platform.u
            public void onTransitionStart(Transition transition0) {
                m.i(this.a);
            }
        }

        Transition transition0 = window0.getSharedElementReturnTransition();
        if(transition0 instanceof l) {
            ((l)transition0).W(true);
            ((l)transition0).addListener(new b(this, activity0));
            if(this.b) {
                m.p(window0, ((l)transition0));
                ((l)transition0).addListener(new c(this, window0));
            }
        }
    }

    @Override  // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view0, @NonNull Matrix matrix0, @NonNull RectF rectF0) {
        m.f = new WeakReference(view0);
        return super.onCaptureSharedElementSnapshot(view0, matrix0, rectF0);
    }

    @Override  // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context0, @Nullable Parcelable parcelable0) {
        View view0 = super.onCreateSnapshotView(context0, parcelable0);
        if(view0 != null) {
            WeakReference weakReference0 = m.f;
            if(weakReference0 != null && this.e != null) {
                View view1 = (View)weakReference0.get();
                if(view1 != null) {
                    p p0 = this.e.a(view1);
                    if(p0 != null) {
                        view0.setTag(id.mtrl_motion_snapshot_view, p0);
                    }
                }
            }
        }
        return view0;
    }

    @Override  // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List list0, @NonNull Map map0) {
        if(!list0.isEmpty() && !map0.isEmpty()) {
            View view0 = (View)map0.get(list0.get(0));
            if(view0 != null) {
                Activity activity0 = com.google.android.material.internal.c.a(view0.getContext());
                if(activity0 != null) {
                    Window window0 = activity0.getWindow();
                    if(this.a) {
                        this.n(window0);
                        return;
                    }
                    this.o(activity0, window0);
                }
            }
        }
    }

    @Override  // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List list0, @NonNull List list1, @NonNull List list2) {
        if(!list1.isEmpty() && ((View)list1.get(0)).getTag(id.mtrl_motion_snapshot_view) instanceof View) {
            ((View)list1.get(0)).setTag(0x7F0B08AF, null);  // id:mtrl_motion_snapshot_view
        }
        if(!this.a && !list1.isEmpty()) {
            this.d = w.j(((View)list1.get(0)));
        }
        this.a = false;
    }

    @Override  // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List list0, @NonNull List list1, @NonNull List list2) {
        if(!list1.isEmpty() && !list2.isEmpty()) {
            View view0 = (View)list1.get(0);
            Object object0 = list2.get(0);
            view0.setTag(id.mtrl_motion_snapshot_view, object0);
        }
        if(!this.a && !list1.isEmpty() && this.d != null) {
            View view1 = (View)list1.get(0);
            view1.measure(View.MeasureSpec.makeMeasureSpec(this.d.width(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.d.height(), 0x40000000));
            view1.layout(this.d.left, this.d.top, this.d.right, this.d.bottom);
        }
    }

    private static void p(Window window0, l l0) {
        if(l0.getDuration() >= 0L) {
            window0.setTransitionBackgroundFadeDuration(l0.getDuration());
        }
    }
}

