package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import java.util.ArrayList;
import java.util.List;

public class RangeSlider extends BaseSlider {
    static class RangeSliderState extends AbsSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public RangeSliderState a(Parcel parcel0) {
                return new RangeSliderState(parcel0, null);
            }

            public RangeSliderState[] b(int v) {
                return new RangeSliderState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        private float a;
        private int b;

        static {
            RangeSliderState.CREATOR = new a();
        }

        private RangeSliderState(Parcel parcel0) {
            super(parcel0.readParcelable(RangeSliderState.class.getClassLoader()));
            this.a = parcel0.readFloat();
            this.b = parcel0.readInt();
        }

        RangeSliderState(Parcel parcel0, com.google.android.material.slider.RangeSlider.a rangeSlider$a0) {
            this(parcel0);
        }

        RangeSliderState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeFloat(this.a);
            parcel0.writeInt(this.b);
        }
    }

    static class com.google.android.material.slider.RangeSlider.a {
    }

    public interface b extends com.google.android.material.slider.a {
        @Override  // com.google.android.material.slider.a
        void a(@NonNull Object arg1, float arg2, boolean arg3);

        void b(@NonNull RangeSlider arg1, float arg2, boolean arg3);
    }

    public interface c extends com.google.android.material.slider.b {
        @Override  // com.google.android.material.slider.b
        void a(@NonNull Object arg1);

        @Override  // com.google.android.material.slider.b
        void b(@NonNull Object arg1);

        void d(@NonNull RangeSlider arg1);

        void e(@NonNull RangeSlider arg1);
    }

    private float M9;
    private int N9;

    public RangeSlider(@NonNull Context context0) {
        this(context0, null);
    }

    public RangeSlider(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.sliderStyle);
    }

    public RangeSlider(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.RangeSlider, v, BaseSlider.C9, new int[0]);
        if(typedArray0.hasValue(styleable.RangeSlider_values)) {
            int v1 = typedArray0.getResourceId(1, 0);
            this.setValues(RangeSlider.O0(typedArray0.getResources().obtainTypedArray(v1)));
        }
        this.M9 = typedArray0.getDimension(styleable.RangeSlider_minSeparation, 0.0f);
        typedArray0.recycle();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean O() {
        return super.O();
    }

    private static List O0(TypedArray typedArray0) {
        List list0 = new ArrayList();
        for(int v = 0; v < typedArray0.length(); ++v) {
            list0.add(typedArray0.getFloat(v, -1.0f));
        }
        return list0;
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean X() {
        return super.X();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent0) {
        return super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getMinSeparation() {
        return this.M9;
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getStepSize() {
        return super.getStepSize();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getThumbHeight() {
        return super.getThumbHeight();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public int getThumbTrackGapSize() {
        return super.getThumbTrackGapSize();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getThumbWidth() {
        return super.getThumbWidth();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public int getTrackInsideCornerSize() {
        return super.getTrackInsideCornerSize();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public int getTrackStopIndicatorSize() {
        return super.getTrackStopIndicatorSize();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @Px
    public int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getValueFrom() {
        return super.getValueFrom();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getValueTo() {
        return super.getValueTo();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public List getValues() {
        return super.getValues();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void h(@NonNull com.google.android.material.slider.a a0) {
        super.h(a0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void i(@NonNull com.google.android.material.slider.b b0) {
        super.i(b0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void o0(@NonNull com.google.android.material.slider.a a0) {
        super.o0(a0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean onKeyDown(int v, @NonNull KeyEvent keyEvent0) {
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean onKeyUp(int v, @NonNull KeyEvent keyEvent0) {
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    protected void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        super.onRestoreInstanceState(((RangeSliderState)parcelable0).getSuperState());
        this.M9 = ((RangeSliderState)parcelable0).a;
        int v = ((RangeSliderState)parcelable0).b;
        this.N9 = v;
        this.setSeparationUnit(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new RangeSliderState(super.onSaveInstanceState());
        ((RangeSliderState)parcelable0).a = this.M9;
        ((RangeSliderState)parcelable0).b = this.N9;
        return parcelable0;
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void p() {
        super.p();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void p0(@NonNull com.google.android.material.slider.b b0) {
        super.p0(b0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void q() {
        super.q();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@DrawableRes int v) {
        super.setCustomThumbDrawable(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@NonNull Drawable drawable0) {
        super.setCustomThumbDrawable(drawable0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(@DrawableRes @NonNull int[] arr_v) {
        super.setCustomThumbDrawablesForValues(arr_v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(@NonNull Drawable[] arr_drawable) {
        super.setCustomThumbDrawablesForValues(arr_drawable);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setFocusedThumbIndex(int v) {
        super.setFocusedThumbIndex(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setHaloRadius(@IntRange(from = 0L) @Px int v) {
        super.setHaloRadius(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setHaloRadiusResource(@DimenRes int v) {
        super.setHaloRadiusResource(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setHaloTintList(@NonNull ColorStateList colorStateList0) {
        super.setHaloTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setLabelBehavior(int v) {
        super.setLabelBehavior(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setLabelFormatter(@Nullable e e0) {
        super.setLabelFormatter(e0);
    }

    public void setMinSeparation(@Dimension float f) {
        this.M9 = f;
        this.N9 = 0;
        this.setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.M9 = f;
        this.N9 = 1;
        this.setSeparationUnit(1);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbElevationResource(@DimenRes int v) {
        super.setThumbElevationResource(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbHeight(@IntRange(from = 0L) @Px int v) {
        super.setThumbHeight(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbHeightResource(@DimenRes int v) {
        super.setThumbHeightResource(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbRadius(@IntRange(from = 0L) @Px int v) {
        super.setThumbRadius(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbRadiusResource(@DimenRes int v) {
        super.setThumbRadiusResource(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList0) {
        super.setThumbStrokeColor(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeColorResource(@ColorRes int v) {
        super.setThumbStrokeColorResource(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeWidthResource(@DimenRes int v) {
        super.setThumbStrokeWidthResource(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbTintList(@NonNull ColorStateList colorStateList0) {
        super.setThumbTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbTrackGapSize(@Px int v) {
        super.setThumbTrackGapSize(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbWidth(@IntRange(from = 0L) @Px int v) {
        super.setThumbWidth(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbWidthResource(@DimenRes int v) {
        super.setThumbWidthResource(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickActiveRadius(@IntRange(from = 0L) @Px int v) {
        super.setTickActiveRadius(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickActiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTickActiveTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickInactiveRadius(@IntRange(from = 0L) @Px int v) {
        super.setTickInactiveRadius(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTickInactiveTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickTintList(@NonNull ColorStateList colorStateList0) {
        super.setTickTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTrackActiveTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackHeight(@IntRange(from = 0L) @Px int v) {
        super.setTrackHeight(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTrackInactiveTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackInsideCornerSize(@Px int v) {
        super.setTrackInsideCornerSize(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackStopIndicatorSize(@Px int v) {
        super.setTrackStopIndicatorSize(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackTintList(@NonNull ColorStateList colorStateList0) {
        super.setTrackTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setValueTo(float f) {
        super.setValueTo(f);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setValues(@NonNull List list0) {
        super.setValues(list0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setValues(@NonNull Float[] arr_float) {
        super.setValues(arr_float);
    }
}

