package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.styleable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    static class AnimatableTransition extends Transition {
        private final Animatable a;

        AnimatableTransition(Animatable animatable0) {
            super(null);
            this.a = animatable0;
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public void c() {
            this.a.start();
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public void d() {
            this.a.stop();
        }
    }

    static class AnimatedStateListState extends StateListState {
        LongSparseArray K;
        SparseArrayCompat L;
        private static final long M = 0x100000000L;
        private static final long N = 0x200000000L;

        AnimatedStateListState(@Nullable AnimatedStateListState animatedStateListDrawableCompat$AnimatedStateListState0, @NonNull AnimatedStateListDrawableCompat animatedStateListDrawableCompat0, @Nullable Resources resources0) {
            super(animatedStateListDrawableCompat$AnimatedStateListState0, animatedStateListDrawableCompat0, resources0);
            if(animatedStateListDrawableCompat$AnimatedStateListState0 != null) {
                this.K = animatedStateListDrawableCompat$AnimatedStateListState0.K;
                this.L = animatedStateListDrawableCompat$AnimatedStateListState0.L;
                return;
            }
            this.K = new LongSparseArray();
            this.L = new SparseArrayCompat();
        }

        int F(@NonNull int[] arr_v, @NonNull Drawable drawable0, int v) {
            int v1 = super.D(arr_v, drawable0);
            this.L.o(v1, v);
            return v1;
        }

        int G(int v, int v1, @NonNull Drawable drawable0, boolean z) {
            int v2 = super.a(drawable0);
            this.K.a(((long)v1) | ((long)v) << 0x20, ((long)(((long)v2) | (z ? 0x200000000L : 0L))));
            if(z) {
                this.K.a(((long)v) | ((long)v1) << 0x20, ((long)(0x100000000L | ((long)v2) | 0x200000000L)));
            }
            return v2;
        }

        private static long H(int v, int v1) [...] // Inlined contents

        int I(int v) {
            return v < 0 ? 0 : ((int)(((Integer)this.L.h(v, 0))));
        }

        int J(@NonNull int[] arr_v) {
            int v = super.E(arr_v);
            return v < 0 ? super.E(StateSet.WILD_CARD) : v;
        }

        int K(int v, int v1) {
            return (int)(((long)(((Long)this.K.h(((long)v1) | ((long)v) << 0x20, -1L)))));
        }

        boolean L(int v, int v1) {
            return (((long)(((Long)this.K.h(((long)v1) | ((long)v) << 0x20, -1L)))) & 0x100000000L) != 0L;
        }

        boolean M(int v, int v1) {
            return (((long)(((Long)this.K.h(((long)v1) | ((long)v) << 0x20, -1L)))) & 0x200000000L) != 0L;
        }

        @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState
        @NonNull
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState
        @NonNull
        public Drawable newDrawable(Resources resources0) {
            return new AnimatedStateListDrawableCompat(this, resources0);
        }

        @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState
        void v() {
            this.K = this.K.c();
            this.L = this.L.c();
        }
    }

    static class AnimatedVectorDrawableTransition extends Transition {
        private final AnimatedVectorDrawableCompat a;

        AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat0) {
            super(null);
            this.a = animatedVectorDrawableCompat0;
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public void c() {
            this.a.start();
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public void d() {
            this.a.stop();
        }
    }

    static class AnimationDrawableTransition extends Transition {
        private final ObjectAnimator a;
        private final boolean b;

        AnimationDrawableTransition(AnimationDrawable animationDrawable0, boolean z, boolean z1) {
            super(null);
            int v = animationDrawable0.getNumberOfFrames();
            FrameInterpolator animatedStateListDrawableCompat$FrameInterpolator0 = new FrameInterpolator(animationDrawable0, z);
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(animationDrawable0, "currentIndex", new int[]{(z ? v - 1 : 0), (z ? 0 : v - 1)});
            objectAnimator0.setAutoCancel(true);
            objectAnimator0.setDuration(((long)animatedStateListDrawableCompat$FrameInterpolator0.a()));
            objectAnimator0.setInterpolator(animatedStateListDrawableCompat$FrameInterpolator0);
            this.b = z1;
            this.a = objectAnimator0;
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public boolean a() {
            return this.b;
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public void b() {
            this.a.reverse();
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public void c() {
            this.a.start();
        }

        @Override  // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition
        public void d() {
            this.a.cancel();
        }
    }

    static class FrameInterpolator implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        FrameInterpolator(AnimationDrawable animationDrawable0, boolean z) {
            this.b(animationDrawable0, z);
        }

        int a() {
            return this.c;
        }

        int b(AnimationDrawable animationDrawable0, boolean z) {
            int v = animationDrawable0.getNumberOfFrames();
            this.b = v;
            if(this.a == null || this.a.length < v) {
                this.a = new int[v];
            }
            int[] arr_v = this.a;
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                int v3 = animationDrawable0.getDuration((z ? v - v1 - 1 : v1));
                arr_v[v1] = v3;
                v2 += v3;
            }
            this.c = v2;
            return v2;
        }

        @Override  // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int v = (int)(f * ((float)this.c) + 0.5f);
            int v1 = this.b;
            int[] arr_v = this.a;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                int v3 = arr_v[v2];
                if(v < v3) {
                    break;
                }
                v -= v3;
            }
            return v2 >= v1 ? ((float)v2) / ((float)v1) + 0.0f : ((float)v2) / ((float)v1) + ((float)v) / ((float)this.c);
        }
    }

    static abstract class Transition {
        private Transition() {
        }

        Transition(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.1 animatedStateListDrawableCompat$10) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    private static final String A = "item";
    private static final String B = ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable";
    private static final String C = ": <transition> tag requires \'fromId\' & \'toId\' attributes";
    private static final String D = ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable";
    private AnimatedStateListState t;
    private Transition u;
    private int v;
    private int w;
    private boolean x;
    private static final String y = "AnimatedStateListDrawableCompat";
    private static final String z = "transition";

    static {
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    AnimatedStateListDrawableCompat(@Nullable AnimatedStateListState animatedStateListDrawableCompat$AnimatedStateListState0, @Nullable Resources resources0) {
        super(null);
        this.v = -1;
        this.w = -1;
        this.i(new AnimatedStateListState(animatedStateListDrawableCompat$AnimatedStateListState0, this, resources0));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    AnimatedStateListState A() {
        return new AnimatedStateListState(this.t, this, null);
    }

    @Nullable
    public static AnimatedStateListDrawableCompat B(@NonNull Context context0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        try {
            Resources resources0 = context0.getResources();
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return AnimatedStateListDrawableCompat.C(context0, resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("AnimatedStateListDrawableCompat", "parser error", iOException0);
            return null;
        }
        Log.e("AnimatedStateListDrawableCompat", "parser error", xmlPullParserException0);
        return null;
    }

    @NonNull
    public static AnimatedStateListDrawableCompat C(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws IOException, XmlPullParserException {
        String s = xmlPullParser0.getName();
        if(!s.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": invalid animated-selector tag " + s);
        }
        AnimatedStateListDrawableCompat animatedStateListDrawableCompat0 = new AnimatedStateListDrawableCompat();
        animatedStateListDrawableCompat0.v(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return animatedStateListDrawableCompat0;
    }

    private void D() {
        this.onStateChange(this.getState());
    }

    private int E(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, styleable.AnimatedStateListDrawableItem);
        int v = typedArray0.getResourceId(styleable.AnimatedStateListDrawableItem_android_id, 0);
        int v1 = typedArray0.getResourceId(styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawable0 = v1 <= 0 ? null : ResourceManagerInternal.h().j(context0, v1);
        typedArray0.recycle();
        int[] arr_v = this.p(attributeSet0);
        if(drawable0 == null) {
        alab1:
            while(true) {
                switch(xmlPullParser0.next()) {
                    case 2: {
                        if(xmlPullParser0.getName().equals("vector")) {
                            drawable0 = VectorDrawableCompat.f(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
                            break alab1;
                        }
                        drawable0 = Api21Impl.a(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
                        break alab1;
                    }
                    case 4: {
                        break;
                    }
                    default: {
                        throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                    }
                }
            }
        }
        if(drawable0 == null) {
            throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
        }
        return this.t.F(arr_v, drawable0, v);
    }

    private int F(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, styleable.AnimatedStateListDrawableTransition);
        int v = typedArray0.getResourceId(styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int v1 = typedArray0.getResourceId(styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int v2 = typedArray0.getResourceId(styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawable0 = v2 <= 0 ? null : ResourceManagerInternal.h().j(context0, v2);
        boolean z = typedArray0.getBoolean(styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArray0.recycle();
        if(drawable0 == null) {
        alab1:
            while(true) {
                switch(xmlPullParser0.next()) {
                    case 2: {
                        if(xmlPullParser0.getName().equals("animated-vector")) {
                            drawable0 = AnimatedVectorDrawableCompat.f(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
                            break alab1;
                        }
                        drawable0 = Api21Impl.a(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
                        break alab1;
                    }
                    case 4: {
                        break;
                    }
                    default: {
                        throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                    }
                }
            }
        }
        if(drawable0 == null) {
            throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
        }
        if(v == -1 || v1 == -1) {
            throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <transition> tag requires \'fromId\' & \'toId\' attributes");
        }
        return this.t.G(v, v1, drawable0, z);
    }

    private boolean G(int v) {
        AnimationDrawableTransition animatedStateListDrawableCompat$AnimationDrawableTransition0;
        int v1;
        Transition animatedStateListDrawableCompat$Transition0 = this.u;
        if(animatedStateListDrawableCompat$Transition0 == null) {
            v1 = this.d();
        }
        else {
            if(v == this.v) {
                return true;
            }
            if(v == this.w && animatedStateListDrawableCompat$Transition0.a()) {
                animatedStateListDrawableCompat$Transition0.b();
                this.v = this.w;
                this.w = v;
                return true;
            }
            v1 = this.v;
            animatedStateListDrawableCompat$Transition0.d();
        }
        this.u = null;
        this.w = -1;
        this.v = -1;
        AnimatedStateListState animatedStateListDrawableCompat$AnimatedStateListState0 = this.t;
        int v2 = animatedStateListDrawableCompat$AnimatedStateListState0.I(v1);
        int v3 = animatedStateListDrawableCompat$AnimatedStateListState0.I(v);
        if(v3 != 0 && v2 != 0) {
            int v4 = animatedStateListDrawableCompat$AnimatedStateListState0.K(v2, v3);
            if(v4 < 0) {
                return false;
            }
            boolean z = animatedStateListDrawableCompat$AnimatedStateListState0.M(v2, v3);
            this.h(v4);
            Drawable drawable0 = this.getCurrent();
            if(drawable0 instanceof AnimationDrawable) {
                animatedStateListDrawableCompat$AnimationDrawableTransition0 = new AnimationDrawableTransition(((AnimationDrawable)drawable0), animatedStateListDrawableCompat$AnimatedStateListState0.L(v2, v3), z);
                goto label_34;
            }
            boolean z1 = false;
            if(drawable0 instanceof AnimatedVectorDrawableCompat) {
                z1 = true;
                animatedStateListDrawableCompat$AnimationDrawableTransition0 = new AnimatedVectorDrawableTransition(((AnimatedVectorDrawableCompat)drawable0));
            }
            else if(drawable0 instanceof Animatable) {
                z1 = true;
                animatedStateListDrawableCompat$AnimationDrawableTransition0 = new AnimatableTransition(((Animatable)drawable0));
            }
            if(z1) {
            label_34:
                animatedStateListDrawableCompat$AnimationDrawableTransition0.c();
                this.u = animatedStateListDrawableCompat$AnimationDrawableTransition0;
                this.w = v1;
                this.v = v;
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    void b() {
        super.b();
        this.x = false;
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    DrawableContainerState c() {
        return this.A();
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    void i(@NonNull DrawableContainerState drawableContainerCompat$DrawableContainerState0) {
        super.i(drawableContainerCompat$DrawableContainerState0);
        if(drawableContainerCompat$DrawableContainerState0 instanceof AnimatedStateListState) {
            this.t = (AnimatedStateListState)drawableContainerCompat$DrawableContainerState0;
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public boolean isStateful() {
        return true;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition animatedStateListDrawableCompat$Transition0 = this.u;
        if(animatedStateListDrawableCompat$Transition0 != null) {
            animatedStateListDrawableCompat$Transition0.d();
            this.u = null;
            this.h(this.v);
            this.v = -1;
            this.w = -1;
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    @NonNull
    public Drawable mutate() {
        if(!this.x && super.mutate() == this) {
            this.t.v();
            this.x = true;
        }
        return this;
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    StateListState o() {
        return this.A();
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    protected boolean onStateChange(@NonNull int[] arr_v) {
        int v = this.t.J(arr_v);
        boolean z = v != this.d() && (this.G(v) || this.h(v));
        Drawable drawable0 = this.getCurrent();
        return drawable0 != null ? z | drawable0.setState(arr_v) : z;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        Transition animatedStateListDrawableCompat$Transition0 = this.u;
        if(animatedStateListDrawableCompat$Transition0 != null && (z2 || z1)) {
            if(z) {
                animatedStateListDrawableCompat$Transition0.c();
                return z2;
            }
            this.jumpToCurrentState();
        }
        return z2;
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void v(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, styleable.AnimatedStateListDrawableCompat);
        this.setVisible(typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        this.x(typedArray0);
        this.m(resources0);
        typedArray0.recycle();
        this.w(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        this.D();
    }

    private void w(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        int v = xmlPullParser0.getDepth();
        int v1;
        while((v1 = xmlPullParser0.next()) != 1) {
            int v2 = xmlPullParser0.getDepth();
            if(v2 < v + 1 && v1 == 3) {
                break;
            }
            if(v1 != 2 || v2 > v + 1) {
            }
            else if(xmlPullParser0.getName().equals("item")) {
                this.E(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            }
            else if(xmlPullParser0.getName().equals("transition")) {
                this.F(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            }
        }
    }

    private void x(TypedArray typedArray0) {
        AnimatedStateListState animatedStateListDrawableCompat$AnimatedStateListState0 = this.t;
        animatedStateListDrawableCompat$AnimatedStateListState0.d |= Api21Impl.b(typedArray0);
        animatedStateListDrawableCompat$AnimatedStateListState0.B(typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_variablePadding, animatedStateListDrawableCompat$AnimatedStateListState0.i));
        animatedStateListDrawableCompat$AnimatedStateListState0.x(typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_constantSize, animatedStateListDrawableCompat$AnimatedStateListState0.l));
        animatedStateListDrawableCompat$AnimatedStateListState0.y(typedArray0.getInt(styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, animatedStateListDrawableCompat$AnimatedStateListState0.A));
        animatedStateListDrawableCompat$AnimatedStateListState0.z(typedArray0.getInt(styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, animatedStateListDrawableCompat$AnimatedStateListState0.B));
        this.setDither(typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_dither, animatedStateListDrawableCompat$AnimatedStateListState0.x));
    }

    public void y(@NonNull int[] arr_v, @NonNull Drawable drawable0, int v) {
        ObjectsCompat.d(drawable0);
        this.t.F(arr_v, drawable0, v);
        this.onStateChange(this.getState());
    }

    public void z(int v, int v1, @NonNull Drawable drawable0, boolean z) {
        ObjectsCompat.d(drawable0);
        this.t.G(v, v1, drawable0, z);
    }

    class androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.1 {
    }

}

