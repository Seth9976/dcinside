package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.styleable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class StateListDrawableCompat extends DrawableContainerCompat {
    static class StateListState extends DrawableContainerState {
        int[][] J;

        StateListState(StateListState stateListDrawableCompat$StateListState0, StateListDrawableCompat stateListDrawableCompat0, Resources resources0) {
            super(stateListDrawableCompat$StateListState0, stateListDrawableCompat0, resources0);
            if(stateListDrawableCompat$StateListState0 != null) {
                this.J = stateListDrawableCompat$StateListState0.J;
                return;
            }
            this.J = new int[this.g()][];
        }

        int D(int[] arr_v, Drawable drawable0) {
            int v = this.a(drawable0);
            this.J[v] = arr_v;
            return v;
        }

        int E(int[] arr_v) {
            int[][] arr2_v = this.J;
            int v = this.i();
            for(int v1 = 0; v1 < v; ++v1) {
                if(StateSet.stateSetMatches(arr2_v[v1], arr_v)) {
                    return v1;
                }
            }
            return -1;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new StateListDrawableCompat(this, null);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources0) {
            return new StateListDrawableCompat(this, resources0);
        }

        @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState
        public void r(int v, int v1) {
            super.r(v, v1);
            int[][] arr2_v = new int[v1][];
            System.arraycopy(this.J, 0, arr2_v, 0, v);
            this.J = arr2_v;
        }

        @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState
        void v() {
            int[][] arr2_v = this.J;
            int[][] arr2_v1 = new int[arr2_v.length][];
            for(int v = arr2_v.length - 1; v >= 0; --v) {
                int[] arr_v = this.J[v];
                arr2_v1[v] = arr_v == null ? null : ((int[])arr_v.clone());
            }
            this.J = arr2_v1;
        }
    }

    private StateListState p;
    private boolean q;
    private static final String r = "StateListDrawableCompat";
    private static final boolean s = false;

    public StateListDrawableCompat() {
        this(null, null);
    }

    StateListDrawableCompat(@Nullable StateListState stateListDrawableCompat$StateListState0) {
        if(stateListDrawableCompat$StateListState0 != null) {
            this.i(stateListDrawableCompat$StateListState0);
        }
    }

    StateListDrawableCompat(StateListState stateListDrawableCompat$StateListState0, Resources resources0) {
        this.i(new StateListState(stateListDrawableCompat$StateListState0, this, resources0));
        this.onStateChange(this.getState());
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme resources$Theme0) {
        super.applyTheme(resources$Theme0);
        this.onStateChange(this.getState());
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void b() {
        super.b();
        this.q = false;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    DrawableContainerState c() {
        return this.o();
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void i(@NonNull DrawableContainerState drawableContainerCompat$DrawableContainerState0) {
        super.i(drawableContainerCompat$DrawableContainerState0);
        if(drawableContainerCompat$DrawableContainerState0 instanceof StateListState) {
            this.p = (StateListState)drawableContainerCompat$DrawableContainerState0;
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public boolean isStateful() {
        return true;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    @NonNull
    public Drawable mutate() {
        if(!this.q && super.mutate() == this) {
            this.p.v();
            this.q = true;
        }
        return this;
    }

    public void n(int[] arr_v, Drawable drawable0) {
        if(drawable0 != null) {
            this.p.D(arr_v, drawable0);
            this.onStateChange(this.getState());
        }
    }

    StateListState o() {
        return new StateListState(this.p, this, null);
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    protected boolean onStateChange(@NonNull int[] arr_v) {
        boolean z = super.onStateChange(arr_v);
        int v = this.p.E(arr_v);
        if(v < 0) {
            v = this.p.E(StateSet.WILD_CARD);
        }
        return this.h(v) || z;
    }

    int[] p(AttributeSet attributeSet0) {
        int v = attributeSet0.getAttributeCount();
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = attributeSet0.getAttributeNameResource(v1);
            if(v3 != 0 && v3 != 0x10100D0 && v3 != 0x1010199) {
                if(!attributeSet0.getAttributeBooleanValue(v1, false)) {
                    v3 = -v3;
                }
                arr_v[v2] = v3;
                ++v2;
            }
        }
        return StateSet.trimStateSet(arr_v, v2);
    }

    int q() {
        return this.p.i();
    }

    Drawable r(int v) {
        return this.p.h(v);
    }

    int s(int[] arr_v) {
        return this.p.E(arr_v);
    }

    StateListState t() {
        return this.p;
    }

    int[] u(int v) {
        return this.p.J[v];
    }

    public void v(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, styleable.StateListDrawable);
        this.setVisible(typedArray0.getBoolean(styleable.StateListDrawable_android_visible, true), true);
        this.x(typedArray0);
        this.m(resources0);
        typedArray0.recycle();
        this.w(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        this.onStateChange(this.getState());
    }

    private void w(Context context0, Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        StateListState stateListDrawableCompat$StateListState0 = this.p;
        int v = xmlPullParser0.getDepth();
        int v1;
        while((v1 = xmlPullParser0.next()) != 1) {
            int v2 = xmlPullParser0.getDepth();
            if(v2 < v + 1 && v1 == 3) {
                break;
            }
            if(v1 == 2 && v2 <= v + 1 && xmlPullParser0.getName().equals("item")) {
                TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, styleable.StateListDrawableItem);
                int v3 = typedArray0.getResourceId(styleable.StateListDrawableItem_android_drawable, -1);
                Drawable drawable0 = v3 <= 0 ? null : ResourceManagerInternal.h().j(context0, v3);
                typedArray0.recycle();
                int[] arr_v = this.p(attributeSet0);
                if(drawable0 == null) {
                alab1:
                    while(true) {
                        switch(xmlPullParser0.next()) {
                            case 2: {
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
                stateListDrawableCompat$StateListState0.D(arr_v, drawable0);
            }
        }
    }

    private void x(TypedArray typedArray0) {
        StateListState stateListDrawableCompat$StateListState0 = this.p;
        stateListDrawableCompat$StateListState0.d |= Api21Impl.b(typedArray0);
        stateListDrawableCompat$StateListState0.i = typedArray0.getBoolean(styleable.StateListDrawable_android_variablePadding, stateListDrawableCompat$StateListState0.i);
        stateListDrawableCompat$StateListState0.l = typedArray0.getBoolean(styleable.StateListDrawable_android_constantSize, stateListDrawableCompat$StateListState0.l);
        stateListDrawableCompat$StateListState0.A = typedArray0.getInt(styleable.StateListDrawable_android_enterFadeDuration, stateListDrawableCompat$StateListState0.A);
        stateListDrawableCompat$StateListState0.B = typedArray0.getInt(styleable.StateListDrawable_android_exitFadeDuration, stateListDrawableCompat$StateListState0.B);
        stateListDrawableCompat$StateListState0.x = typedArray0.getBoolean(styleable.StateListDrawable_android_dither, stateListDrawableCompat$StateListState0.x);
    }
}

