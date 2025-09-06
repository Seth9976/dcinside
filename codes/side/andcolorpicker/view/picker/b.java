package codes.side.andcolorpicker.view.picker;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import codes.side.andcolorpicker.R.attr;
import codes.side.andcolorpicker.R.dimen;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public abstract class b extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static class codes.side.andcolorpicker.view.picker.b.b implements d {
        @Override  // codes.side.andcolorpicker.view.picker.b$d
        public void a(@l b b0, @l codes.side.andcolorpicker.model.a a0, int v, boolean z) {
            L.p(b0, "picker");
            L.p(a0, "color");
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$d
        public void b(@l b b0, @l codes.side.andcolorpicker.model.a a0, int v, boolean z) {
            L.p(b0, "picker");
            L.p(a0, "color");
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$d
        public void c(@l b b0, @l codes.side.andcolorpicker.model.a a0, int v) {
            L.p(b0, "picker");
            L.p(a0, "color");
        }
    }

    public interface c {
        int a();

        int b();
    }

    public interface d {
        void a(@l b arg1, @l codes.side.andcolorpicker.model.a arg2, int arg3, boolean arg4);

        void b(@l b arg1, @l codes.side.andcolorpicker.model.a arg2, int arg3, boolean arg4);

        void c(@l b arg1, @l codes.side.andcolorpicker.model.a arg2, int arg3);
    }

    private final codes.side.andcolorpicker.model.a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final HashSet f;
    private GradientDrawable g;
    private ObjectAnimator h;
    private final HashSet i;
    @l
    private final D j;
    private final m.b k;
    private HashMap l;
    private static final String m = "ColorSeekBar";
    private static final boolean n = false;
    private static final int o = 8000;
    private static final int p = 10000;
    private static final long q = 150L;
    @l
    public static final a r;

    static {
        b.r = new a(null);
    }

    @j
    public b(@l m.b b0, @l Context context0) {
        this(b0, context0, null, 0, 12, null);
    }

    @j
    public b(@l m.b b0, @l Context context0, @m AttributeSet attributeSet0) {
        this(b0, context0, attributeSet0, 0, 8, null);
    }

    @j
    public b(@l m.b b0, @l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class g extends N implements A3.a {
            final b e;

            g(b b0) {
                this.e = b0;
                super(0);
            }

            public final int b() {
                return this.e.getResources().getDimensionPixelOffset(dimen.acp_thumb_stroke_width);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(b0, "colorFactory");
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.k = b0;
        this.b = b0.a();
        this.c = true;
        this.f = new HashSet();
        this.i = new HashSet();
        this.j = E.a(new g(this));
        this.setSplitTrack(false);
        this.setOnSeekBarChangeListener(this);
        this.B();
        this.C();
        this.D();
        this.y();
        this.x();
        this.w();
        this.z();
    }

    public b(m.b b0, Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 8) != 0) {
            v = attr.seekBarStyle;
        }
        this(b0, context0, attributeSet0, v);
    }

    public final void A(@l d b$d0) {
        L.p(b$d0, "listener");
        this.f.remove(b$d0);
    }

    private final void B() {
        int v = Build.VERSION.SDK_INT;
        Drawable drawable0 = this.getBackground();
        if(drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            if(drawable1 instanceof RippleDrawable && v >= 23) {
                ((RippleDrawable)drawable1).setRadius(this.getResources().getDimensionPixelOffset(dimen.acp_thumb_ripple_radius));
            }
            this.setBackground(drawable1);
        }
    }

    private final void C() {
        int v = this.getResources().getDimensionPixelOffset(dimen.acp_seek_progress_padding);
        this.getResources().getDimensionPixelOffset(dimen.acp_seek_progress_height);
        int v1 = 0;
        Drawable[] arr_drawable = this.t(new Drawable[0]);
        LayerDrawable layerDrawable0 = new LayerDrawable(arr_drawable);
        for(int v2 = 0; v1 < arr_drawable.length; ++v2) {
            Drawable drawable0 = arr_drawable[v1];
            layerDrawable0.setLayerInset(v2, v, v, v, v);
            ++v1;
        }
        this.setProgressDrawable(layerDrawable0);
    }

    private final void D() {
        int v = this.getResources().getDimensionPixelOffset(dimen.acp_seek_progress_padding);
        int v1 = this.getResources().getDimensionPixelOffset(dimen.acp_thumb_size_full);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setColor(-1);
        gradientDrawable0.setShape(1);
        gradientDrawable0.setSize(v1, v1);
        this.g = gradientDrawable0;
        this.i.add(gradientDrawable0);
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        int[] arr_v = StateSet.WILD_CARD;
        GradientDrawable gradientDrawable1 = this.g;
        if(gradientDrawable1 == null) {
            L.S("thumbDrawable");
        }
        stateListDrawable0.addState(arr_v, gradientDrawable1);
        ScaleDrawable scaleDrawable0 = new ScaleDrawable(stateListDrawable0, 17, 1.0f, 1.0f);
        scaleDrawable0.setLevel(8000);
        this.setThumb(scaleDrawable0);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(this.getThumb(), "level", new int[]{8000, 10000});
        L.o(objectAnimator0, "it");
        objectAnimator0.setDuration(150L);
        L.o(objectAnimator0, "ObjectAnimator.ofInt(\n  …THUMB_ANIM_DURATION\n    }");
        this.h = objectAnimator0;
        this.setThumbOffset(this.getThumbOffset() - v / 2);
    }

    private final void E(codes.side.andcolorpicker.model.a a0) {
        this.u(this.getInternalPickedColor(), a0);
    }

    public void a() {
        HashMap hashMap0 = this.l;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View b(int v) {
        if(this.l == null) {
            this.l = new HashMap();
        }
        View view0 = (View)this.l.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.l.put(v, view0);
        }
        return view0;
    }

    @l
    protected k.a getColorConverter() {
        codes.side.andcolorpicker.model.b b0 = this.getInternalPickedColor().N1();
        return k.d.b.a(b0);
    }

    @l
    protected final codes.side.andcolorpicker.model.a getInternalPickedColor() {
        return this.b;
    }

    public final boolean getNotifyListeners() {
        return this.c;
    }

    @l
    public final codes.side.andcolorpicker.model.a getPickedColor() {
        return this.k.b(this.b);
    }

    protected final int getThumbStrokeWidthPx() {
        return ((Number)this.j.getValue()).intValue();
    }

    public final void i(@l d b$d0) {
        L.p(b$d0, "listener");
        this.f.add(b$d0);
    }

    public final void j() {
        this.f.clear();
    }

    public final int k(@l c b$c0) {
        L.p(b$c0, "$this$absoluteProgress");
        return b$c0.b() - b$c0.a();
    }

    private final void l() {
        if(!this.c) {
            return;
        }
        for(Object object0: this.f) {
            ((d)object0).c(this, this.getPickedColor(), this.getProgress());
        }
    }

    private final void m(boolean z) {
        if(!this.c) {
            return;
        }
        for(Object object0: this.f) {
            ((d)object0).b(this, this.getPickedColor(), this.getProgress(), z);
        }
    }

    private final void n(boolean z) {
        if(!this.c) {
            return;
        }
        for(Object object0: this.f) {
            ((d)object0).a(this, this.getPickedColor(), this.getProgress(), z);
        }
    }

    protected abstract boolean o(@l codes.side.andcolorpicker.model.a arg1, int arg2);

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(@l SeekBar seekBar0, int v, boolean z) {
        L.p(seekBar0, "seekBar");
        if(!this.d && !this.e) {
            this.v();
            this.w();
            this.z();
            this.n(z);
            if(!z) {
                this.m(false);
            }
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStartTrackingTouch(@l SeekBar seekBar0) {
        L.p(seekBar0, "seekBar");
        ObjectAnimator objectAnimator0 = this.h;
        if(objectAnimator0 == null) {
            L.S("thumbObjectAnimator");
        }
        Drawable drawable0 = this.getThumb();
        L.o(drawable0, "thumb");
        objectAnimator0.setIntValues(new int[]{drawable0.getLevel(), 10000});
        ObjectAnimator objectAnimator1 = this.h;
        if(objectAnimator1 == null) {
            L.S("thumbObjectAnimator");
        }
        objectAnimator1.start();
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStopTrackingTouch(@l SeekBar seekBar0) {
        L.p(seekBar0, "seekBar");
        ObjectAnimator objectAnimator0 = this.h;
        if(objectAnimator0 == null) {
            L.S("thumbObjectAnimator");
        }
        Drawable drawable0 = this.getThumb();
        L.o(drawable0, "thumb");
        objectAnimator0.setIntValues(new int[]{drawable0.getLevel(), 8000});
        ObjectAnimator objectAnimator1 = this.h;
        if(objectAnimator1 == null) {
            L.S("thumbObjectAnimator");
        }
        objectAnimator1.start();
        this.m(true);
    }

    protected abstract void p(@l LayerDrawable arg1);

    @m
    protected abstract Integer q(@l codes.side.andcolorpicker.model.a arg1);

    protected abstract void r();

    protected abstract void s(@l Set arg1);

    @Override  // android.widget.AbsSeekBar
    public void setMax(int v) {
        static final class e extends N implements A3.a {
            final b e;
            final int f;

            e(b b0, int v) {
                this.e = b0;
                this.f = v;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.super.setMax(this.f);
            }
        }

        n.b.a(new codes.side.andcolorpicker.view.picker.c(this), new e(this, v));
    }

    @Override  // android.widget.AbsSeekBar
    public void setMin(int v) {
        static final class f extends N implements A3.a {
            final b e;
            final int f;

            f(b b0, int v) {
                this.e = b0;
                this.f = v;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.super.setMin(this.f);
            }
        }

        if(v != 0) {
            throw new IllegalArgumentException("Current mode supports 0 min value only, was " + v);
        }
        n.b.a(new codes.side.andcolorpicker.view.picker.d(this), new f(this, 0));
    }

    public final void setNotifyListeners(boolean z) {
        this.c = z;
    }

    @Override  // android.widget.SeekBar
    public final void setOnSeekBarChangeListener(@m SeekBar.OnSeekBarChangeListener seekBar$OnSeekBarChangeListener0) {
        if(!L.g(seekBar$OnSeekBarChangeListener0, this)) {
            throw new IllegalStateException("Custom OnSeekBarChangeListener not supported yet");
        }
        super.setOnSeekBarChangeListener(seekBar$OnSeekBarChangeListener0);
    }

    public final void setPickedColor(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "value");
        if(L.g(this.b, a0)) {
            return;
        }
        this.E(a0);
        this.x();
        this.w();
        this.z();
        this.l();
    }

    @l
    protected abstract Drawable[] t(@l Drawable[] arg1);

    protected abstract void u(@l codes.side.andcolorpicker.model.a arg1, @l codes.side.andcolorpicker.model.a arg2);

    private final void v() {
        if(this.o(this.getInternalPickedColor(), this.getProgress())) {
            this.l();
        }
    }

    protected final void w() {
        Drawable drawable0 = this.getProgressDrawable();
        if(drawable0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        }
        this.p(((LayerDrawable)drawable0));
    }

    protected final void x() {
        Integer integer0 = this.q(this.getInternalPickedColor());
        if(integer0 != null) {
            this.setProgress(integer0.intValue());
        }
    }

    protected final void y() {
        this.r();
    }

    protected final void z() {
        this.s(this.i);
    }
}

