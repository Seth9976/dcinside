package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {
    static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {
        int a;
        VectorDrawableCompat b;
        AnimatorSet c;
        ArrayList d;
        ArrayMap e;

        public AnimatedVectorDrawableCompatState(Context context0, AnimatedVectorDrawableCompatState animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0, Drawable.Callback drawable$Callback0, Resources resources0) {
            if(animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0 != null) {
                this.a = animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.a;
                VectorDrawableCompat vectorDrawableCompat0 = animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.b;
                if(vectorDrawableCompat0 != null) {
                    Drawable.ConstantState drawable$ConstantState0 = vectorDrawableCompat0.getConstantState();
                    this.b = resources0 == null ? ((VectorDrawableCompat)drawable$ConstantState0.newDrawable()) : ((VectorDrawableCompat)drawable$ConstantState0.newDrawable(resources0));
                    VectorDrawableCompat vectorDrawableCompat1 = (VectorDrawableCompat)this.b.mutate();
                    this.b = vectorDrawableCompat1;
                    vectorDrawableCompat1.setCallback(drawable$Callback0);
                    this.b.setBounds(animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.b.getBounds());
                    this.b.m(false);
                }
                ArrayList arrayList0 = animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.d;
                if(arrayList0 != null) {
                    int v1 = arrayList0.size();
                    this.d = new ArrayList(v1);
                    this.e = new ArrayMap(v1);
                    for(int v = 0; v < v1; ++v) {
                        Animator animator0 = (Animator)animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.d.get(v);
                        Animator animator1 = animator0.clone();
                        String s = (String)animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.e.get(animator0);
                        animator1.setTarget(this.b.h(s));
                        this.d.add(animator1);
                        this.e.put(animator1, s);
                    }
                    this.a();
                }
            }
        }

        public void a() {
            if(this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @RequiresApi(24)
    static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState drawable$ConstantState0) {
            this.a = drawable$ConstantState0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            Drawable drawable0 = new AnimatedVectorDrawableCompat();
            Drawable drawable1 = this.a.newDrawable();
            drawable0.a = drawable1;
            drawable1.setCallback(drawable0.h);
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0) {
            Drawable drawable0 = new AnimatedVectorDrawableCompat();
            Drawable drawable1 = this.a.newDrawable(resources0);
            drawable0.a = drawable1;
            drawable1.setCallback(drawable0.h);
            return drawable0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
            Drawable drawable0 = new AnimatedVectorDrawableCompat();
            Drawable drawable1 = this.a.newDrawable(resources0, resources$Theme0);
            drawable0.a = drawable1;
            drawable1.setCallback(drawable0.h);
            return drawable0;
        }
    }

    private AnimatedVectorDrawableCompatState b;
    private Context c;
    private ArgbEvaluator d;
    AnimatedVectorDrawableDelegateState e;
    private Animator.AnimatorListener f;
    ArrayList g;
    final Drawable.Callback h;
    private static final String i = "AnimatedVDCompat";
    private static final String j = "animated-vector";
    private static final String k = "target";
    private static final boolean l = false;

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    private AnimatedVectorDrawableCompat(@Nullable Context context0) {
        this(context0, null, null);
    }

    private AnimatedVectorDrawableCompat(@Nullable Context context0, @Nullable AnimatedVectorDrawableCompatState animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0, @Nullable Resources resources0) {
        this.d = null;
        this.f = null;
        this.g = null;
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1 animatedVectorDrawableCompat$10 = new Drawable.Callback() {
            final AnimatedVectorDrawableCompat a;

            @Override  // android.graphics.drawable.Drawable$Callback
            public void invalidateDrawable(Drawable drawable0) {
                AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            @Override  // android.graphics.drawable.Drawable$Callback
            public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
                AnimatedVectorDrawableCompat.this.scheduleSelf(runnable0, v);
            }

            @Override  // android.graphics.drawable.Drawable$Callback
            public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
                AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable0);
            }
        };
        this.h = animatedVectorDrawableCompat$10;
        this.c = context0;
        if(animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0 != null) {
            this.b = animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0;
            return;
        }
        this.b = new AnimatedVectorDrawableCompatState(context0, null, animatedVectorDrawableCompat$10, resources0);
    }

    public static void a(Drawable drawable0) {
        if(!(drawable0 instanceof Animatable)) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 24) {
            ((AnimatedVectorDrawable)drawable0).clearAnimationCallbacks();
            return;
        }
        ((AnimatedVectorDrawableCompat)drawable0).e();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void applyTheme(Resources.Theme resources$Theme0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.a(drawable0, resources$Theme0);
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean b(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            AnimatedVectorDrawableCompat.m(((AnimatedVectorDrawable)drawable0), animatable2Compat$AnimationCallback0);
        }
        ArrayList arrayList0 = this.g;
        if(arrayList0 != null && animatable2Compat$AnimationCallback0 != null) {
            boolean z = arrayList0.remove(animatable2Compat$AnimationCallback0);
            if(this.g.size() == 0) {
                this.i();
            }
            return z;
        }
        return false;
    }

    @Nullable
    public static AnimatedVectorDrawableCompat c(@NonNull Context context0, @DrawableRes int v) {
        if(Build.VERSION.SDK_INT >= 24) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = new AnimatedVectorDrawableCompat(context0);
            Drawable drawable0 = ResourcesCompat.g(context0.getResources(), v, context0.getTheme());
            animatedVectorDrawableCompat0.a = drawable0;
            drawable0.setCallback(animatedVectorDrawableCompat0.h);
            animatedVectorDrawableCompat0.e = new AnimatedVectorDrawableDelegateState(animatedVectorDrawableCompat0.a.getConstantState());
            return animatedVectorDrawableCompat0;
        }
        Resources resources0 = context0.getResources();
        try {
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return AnimatedVectorDrawableCompat.f(context0, context0.getResources(), xmlResourceParser0, attributeSet0, context0.getTheme());
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("AnimatedVDCompat", "parser error", iOException0);
            return null;
        }
        Log.e("AnimatedVDCompat", "parser error", xmlPullParserException0);
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.a == null ? false : DrawableCompat.b(this.a);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void d(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            AnimatedVectorDrawableCompat.h(((AnimatedVectorDrawable)drawable0), animatable2Compat$AnimationCallback0);
            return;
        }
        if(animatable2Compat$AnimationCallback0 == null) {
            return;
        }
        if(this.g == null) {
            this.g = new ArrayList();
        }
        if(this.g.contains(animatable2Compat$AnimationCallback0)) {
            return;
        }
        this.g.add(animatable2Compat$AnimationCallback0);
        if(this.f == null) {
            this.f = new AnimatorListenerAdapter() {
                final AnimatedVectorDrawableCompat a;

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationEnd(Animator animator0) {
                    ArrayList arrayList0 = new ArrayList(AnimatedVectorDrawableCompat.this.g);
                    int v = arrayList0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((AnimationCallback)arrayList0.get(v1)).b(AnimatedVectorDrawableCompat.this);
                    }
                }

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationStart(Animator animator0) {
                    ArrayList arrayList0 = new ArrayList(AnimatedVectorDrawableCompat.this.g);
                    int v = arrayList0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((AnimationCallback)arrayList0.get(v1)).c(AnimatedVectorDrawableCompat.this);
                    }
                }
            };
        }
        this.b.c.addListener(this.f);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        this.b.b.draw(canvas0);
        if(this.b.c.isStarted()) {
            this.invalidateSelf();
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void e() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).clearAnimationCallbacks();
            return;
        }
        this.i();
        ArrayList arrayList0 = this.g;
        if(arrayList0 == null) {
            return;
        }
        arrayList0.clear();
    }

    public static AnimatedVectorDrawableCompat f(Context context0, Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = new AnimatedVectorDrawableCompat(context0);
        animatedVectorDrawableCompat0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return animatedVectorDrawableCompat0;
    }

    public static void g(Drawable drawable0, AnimationCallback animatable2Compat$AnimationCallback0) {
        if(drawable0 == null || animatable2Compat$AnimationCallback0 == null || !(drawable0 instanceof Animatable)) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 24) {
            AnimatedVectorDrawableCompat.h(((AnimatedVectorDrawable)drawable0), animatable2Compat$AnimationCallback0);
            return;
        }
        ((AnimatedVectorDrawableCompat)drawable0).d(animatable2Compat$AnimationCallback0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.getAlpha() : DrawableCompat.d(drawable0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? super.getChangingConfigurations() | this.b.a : drawable0.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.getColorFilter() : DrawableCompat.e(drawable0);
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a != null && Build.VERSION.SDK_INT >= 24 ? new AnimatedVectorDrawableDelegateState(this.a.getConstantState()) : null;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.getIntrinsicHeight() : drawable0.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.getIntrinsicWidth() : drawable0.getIntrinsicWidth();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.getOpacity() : drawable0.getOpacity();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public boolean getPadding(Rect rect0) {
        return super.getPadding(rect0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public int[] getState() {
        return super.getState();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @RequiresApi(23)
    private static void h(@NonNull AnimatedVectorDrawable animatedVectorDrawable0, @NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        animatedVectorDrawable0.registerAnimationCallback(animatable2Compat$AnimationCallback0.a());
    }

    private void i() {
        Animator.AnimatorListener animator$AnimatorListener0 = this.f;
        if(animator$AnimatorListener0 != null) {
            this.b.c.removeListener(animator$AnimatorListener0);
            this.f = null;
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) throws XmlPullParserException, IOException {
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.g(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        int v = xmlPullParser0.getEventType();
        int v1 = xmlPullParser0.getDepth();
        while(v != 1 && (xmlPullParser0.getDepth() >= v1 + 1 || v != 3)) {
            if(v == 2) {
                String s = xmlPullParser0.getName();
                if("animated-vector".equals(s)) {
                    TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, AndroidResources.M);
                    int v2 = typedArray0.getResourceId(0, 0);
                    if(v2 != 0) {
                        VectorDrawableCompat vectorDrawableCompat0 = VectorDrawableCompat.c(resources0, v2, resources$Theme0);
                        vectorDrawableCompat0.m(false);
                        vectorDrawableCompat0.setCallback(this.h);
                        VectorDrawableCompat vectorDrawableCompat1 = this.b.b;
                        if(vectorDrawableCompat1 != null) {
                            vectorDrawableCompat1.setCallback(null);
                        }
                        this.b.b = vectorDrawableCompat0;
                    }
                    typedArray0.recycle();
                }
                else if("target".equals(s)) {
                    TypedArray typedArray1 = resources0.obtainAttributes(attributeSet0, AndroidResources.O);
                    String s1 = typedArray1.getString(0);
                    int v3 = typedArray1.getResourceId(1, 0);
                    if(v3 != 0) {
                        Context context0 = this.c;
                        if(context0 != null) {
                            this.j(s1, AnimatorInflaterCompat.j(context0, v3));
                            goto label_33;
                        }
                        typedArray1.recycle();
                        throw new IllegalStateException("Context can\'t be null when inflating animators");
                    }
                label_33:
                    typedArray1.recycle();
                }
            }
            v = xmlPullParser0.next();
        }
        this.b.a();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.isAutoMirrored() : DrawableCompat.h(drawable0);
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.c.isRunning() : ((AnimatedVectorDrawable)drawable0).isRunning();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.isStateful() : drawable0.isStateful();
    }

    private void j(String s, Animator animator0) {
        animator0.setTarget(this.b.b.h(s));
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0 = this.b;
        if(animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.d == null) {
            animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState0.d = new ArrayList();
            AnimatedVectorDrawableCompatState animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState1 = this.b;
            animatedVectorDrawableCompat$AnimatedVectorDrawableCompatState1.e = new ArrayMap();
        }
        this.b.d.add(animator0);
        this.b.e.put(animator0, s);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    private void k(Animator animator0) {
        if(animator0 instanceof AnimatorSet) {
            ArrayList arrayList0 = ((AnimatorSet)animator0).getChildAnimations();
            if(arrayList0 != null) {
                for(int v = 0; v < arrayList0.size(); ++v) {
                    this.k(((Animator)arrayList0.get(v)));
                }
            }
        }
        if(animator0 instanceof ObjectAnimator) {
            String s = ((ObjectAnimator)animator0).getPropertyName();
            if("fillColor".equals(s) || "strokeColor".equals(s)) {
                if(this.d == null) {
                    this.d = new ArgbEvaluator();
                }
                ((ObjectAnimator)animator0).setEvaluator(this.d);
            }
        }
    }

    public static boolean l(Drawable drawable0, AnimationCallback animatable2Compat$AnimationCallback0) {
        if(drawable0 == null || animatable2Compat$AnimationCallback0 == null || !(drawable0 instanceof Animatable)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 24 ? ((AnimatedVectorDrawableCompat)drawable0).b(animatable2Compat$AnimationCallback0) : AnimatedVectorDrawableCompat.m(((AnimatedVectorDrawable)drawable0), animatable2Compat$AnimationCallback0);
    }

    @RequiresApi(23)
    private static boolean m(AnimatedVectorDrawable animatedVectorDrawable0, AnimationCallback animatable2Compat$AnimationCallback0) {
        return animatedVectorDrawable0.unregisterAnimationCallback(animatable2Compat$AnimationCallback0.a());
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.mutate();
        }
        return this;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
            return;
        }
        this.b.b.setBounds(rect0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    protected boolean onLevelChange(int v) {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.setLevel(v) : drawable0.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.setState(arr_v) : drawable0.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        this.b.b.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.j(drawable0, z);
            return;
        }
        this.b.b.setAutoMirrored(z);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setChangingConfigurations(int v) {
        super.setChangingConfigurations(v);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        super.setColorFilter(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
            return;
        }
        this.b.b.setColorFilter(colorFilter0);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setHotspot(float f, float f1) {
        super.setHotspot(f, f1);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        super.setHotspotBounds(v, v1, v2, v3);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
    public boolean setState(int[] arr_v) {
        return super.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.n(drawable0, v);
            return;
        }
        this.b.b.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.o(drawable0, colorStateList0);
            return;
        }
        this.b.b.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.p(drawable0, porterDuff$Mode0);
            return;
        }
        this.b.b.setTintMode(porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            return drawable0.setVisible(z, z1);
        }
        this.b.b.setVisible(z, z1);
        return super.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).start();
            return;
        }
        if(this.b.c.isStarted()) {
            return;
        }
        this.b.c.start();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).stop();
            return;
        }
        this.b.c.end();
    }
}

