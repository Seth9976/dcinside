package fr.castorflex.android.smoothprogressbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;

public class SmoothProgressBar extends ProgressBar {
    private static final int INTERPOLATOR_ACCELERATE = 0;
    private static final int INTERPOLATOR_ACCELERATEDECELERATE = 2;
    private static final int INTERPOLATOR_DECELERATE = 3;
    private static final int INTERPOLATOR_LINEAR = 1;

    public SmoothProgressBar(Context context0) {
        this(context0, null);
    }

    public SmoothProgressBar(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.spbStyle);
    }

    public SmoothProgressBar(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        if(this.isInEditMode()) {
            this.setIndeterminateDrawable(new Builder(context0, true).build());
            return;
        }
        Resources resources0 = context0.getResources();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.SmoothProgressBar, v, 0);
        int v1 = resources0.getColor(color.spb_default_color);
        int v2 = typedArray0.getColor(styleable.SmoothProgressBar_spb_color, v1);
        int v3 = resources0.getInteger(integer.spb_default_sections_count);
        int v4 = typedArray0.getInteger(styleable.SmoothProgressBar_spb_sections_count, v3);
        int v5 = resources0.getDimensionPixelSize(dimen.spb_default_stroke_separator_length);
        int v6 = typedArray0.getDimensionPixelSize(styleable.SmoothProgressBar_spb_stroke_separator_length, v5);
        float f = resources0.getDimension(dimen.spb_default_stroke_width);
        float f1 = typedArray0.getDimension(styleable.SmoothProgressBar_spb_stroke_width, f);
        float f2 = Float.parseFloat(resources0.getString(string.spb_default_speed));
        float f3 = typedArray0.getFloat(styleable.SmoothProgressBar_spb_speed, f2);
        float f4 = typedArray0.getFloat(styleable.SmoothProgressBar_spb_progressiveStart_speed, f3);
        float f5 = typedArray0.getFloat(styleable.SmoothProgressBar_spb_progressiveStop_speed, f3);
        int v7 = typedArray0.getInteger(styleable.SmoothProgressBar_spb_interpolator, -1);
        boolean z = resources0.getBoolean(bool.spb_default_reversed);
        boolean z1 = typedArray0.getBoolean(styleable.SmoothProgressBar_spb_reversed, z);
        boolean z2 = resources0.getBoolean(bool.spb_default_mirror_mode);
        boolean z3 = typedArray0.getBoolean(styleable.SmoothProgressBar_spb_mirror_mode, z2);
        int v8 = typedArray0.getResourceId(styleable.SmoothProgressBar_spb_colors, 0);
        boolean z4 = resources0.getBoolean(bool.spb_default_progressiveStart_activated);
        boolean z5 = typedArray0.getBoolean(styleable.SmoothProgressBar_spb_progressiveStart_activated, z4);
        Drawable drawable0 = typedArray0.getDrawable(styleable.SmoothProgressBar_spb_background);
        boolean z6 = typedArray0.getBoolean(styleable.SmoothProgressBar_spb_generate_background_with_colors, false);
        boolean z7 = typedArray0.getBoolean(styleable.SmoothProgressBar_spb_gradients, false);
        typedArray0.recycle();
        Interpolator interpolator0 = v7 == -1 ? this.getInterpolator() : null;
        if(interpolator0 == null) {
            switch(v7) {
                case 1: {
                    interpolator0 = new LinearInterpolator();
                    break;
                }
                case 2: {
                    interpolator0 = new AccelerateDecelerateInterpolator();
                    break;
                }
                case 3: {
                    interpolator0 = new DecelerateInterpolator();
                    break;
                }
                default: {
                    interpolator0 = new AccelerateInterpolator();
                }
            }
        }
        int[] arr_v = v8 == 0 ? null : resources0.getIntArray(v8);
        Builder smoothProgressDrawable$Builder0 = new Builder(context0).speed(f3).progressiveStartSpeed(f4).progressiveStopSpeed(f5).interpolator(interpolator0).sectionsCount(v4).separatorLength(v6).strokeWidth(f1).reversed(z1).mirrorMode(z3).progressiveStart(z5).gradients(z7);
        if(drawable0 != null) {
            smoothProgressDrawable$Builder0.backgroundDrawable(drawable0);
        }
        if(z6) {
            smoothProgressDrawable$Builder0.generateBackgroundUsingColors();
        }
        if(arr_v == null || arr_v.length <= 0) {
            smoothProgressDrawable$Builder0.color(v2);
        }
        else {
            smoothProgressDrawable$Builder0.colors(arr_v);
        }
        this.setIndeterminateDrawable(smoothProgressDrawable$Builder0.build());
    }

    public void applyStyle(int v) {
        AccelerateInterpolator accelerateInterpolator0 = null;
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, styleable.SmoothProgressBar, 0, v);
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_color)) {
            this.setSmoothProgressDrawableColor(typedArray0.getColor(2, 0));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_colors)) {
            int v1 = typedArray0.getResourceId(3, 0);
            if(v1 != 0) {
                int[] arr_v = this.getResources().getIntArray(v1);
                if(arr_v != null && arr_v.length > 0) {
                    this.setSmoothProgressDrawableColors(arr_v);
                }
            }
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_sections_count)) {
            this.setSmoothProgressDrawableSectionsCount(typedArray0.getInteger(12, 0));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_stroke_separator_length)) {
            this.setSmoothProgressDrawableSeparatorLength(typedArray0.getDimensionPixelSize(14, 0));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_stroke_width)) {
            this.setSmoothProgressDrawableStrokeWidth(typedArray0.getDimension(15, 0.0f));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_speed)) {
            this.setSmoothProgressDrawableSpeed(typedArray0.getFloat(13, 0.0f));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_progressiveStart_speed)) {
            this.setSmoothProgressDrawableProgressiveStartSpeed(typedArray0.getFloat(9, 0.0f));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_progressiveStop_speed)) {
            this.setSmoothProgressDrawableProgressiveStopSpeed(typedArray0.getFloat(10, 0.0f));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_reversed)) {
            this.setSmoothProgressDrawableReversed(typedArray0.getBoolean(11, false));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_mirror_mode)) {
            this.setSmoothProgressDrawableMirrorMode(typedArray0.getBoolean(7, false));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_progressiveStart_activated)) {
            this.setProgressiveStartActivated(typedArray0.getBoolean(8, false));
        }
        if(typedArray0.hasValue(8)) {
            this.setProgressiveStartActivated(typedArray0.getBoolean(8, false));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_gradients)) {
            this.setSmoothProgressDrawableUseGradients(typedArray0.getBoolean(5, false));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_generate_background_with_colors) && typedArray0.getBoolean(4, false)) {
            this.setSmoothProgressDrawableBackgroundDrawable(SmoothProgressBarUtils.generateDrawableWithColors(this.checkIndeterminateDrawable().getColors(), this.checkIndeterminateDrawable().getStrokeWidth()));
        }
        if(typedArray0.hasValue(styleable.SmoothProgressBar_spb_interpolator)) {
            switch(typedArray0.getInteger(6, -1)) {
                case 0: {
                    accelerateInterpolator0 = new AccelerateInterpolator();
                    break;
                }
                case 1: {
                    accelerateInterpolator0 = new LinearInterpolator();
                    break;
                }
                case 2: {
                    accelerateInterpolator0 = new AccelerateDecelerateInterpolator();
                    break;
                }
                case 3: {
                    accelerateInterpolator0 = new DecelerateInterpolator();
                }
            }
            if(accelerateInterpolator0 != null) {
                this.setInterpolator(accelerateInterpolator0);
            }
        }
        typedArray0.recycle();
    }

    private SmoothProgressDrawable checkIndeterminateDrawable() {
        Drawable drawable0 = this.getIndeterminateDrawable();
        if(drawable0 == null || !(drawable0 instanceof SmoothProgressDrawable)) {
            throw new RuntimeException("The drawable is not a SmoothProgressDrawable");
        }
        return (SmoothProgressDrawable)drawable0;
    }

    @Override  // android.widget.ProgressBar
    protected void onDraw(Canvas canvas0) {
        synchronized(this) {
            super.onDraw(canvas0);
            if(this.isIndeterminate() && this.getIndeterminateDrawable() instanceof SmoothProgressDrawable && !((SmoothProgressDrawable)this.getIndeterminateDrawable()).isRunning()) {
                this.getIndeterminateDrawable().draw(canvas0);
            }
        }
    }

    public void progressiveStart() {
        this.checkIndeterminateDrawable().progressiveStart();
    }

    public void progressiveStop() {
        this.checkIndeterminateDrawable().progressiveStop();
    }

    @Override  // android.widget.ProgressBar
    public void setInterpolator(Interpolator interpolator0) {
        super.setInterpolator(interpolator0);
        Drawable drawable0 = this.getIndeterminateDrawable();
        if(drawable0 != null && drawable0 instanceof SmoothProgressDrawable) {
            ((SmoothProgressDrawable)drawable0).setInterpolator(interpolator0);
        }
    }

    public void setProgressiveStartActivated(boolean z) {
        this.checkIndeterminateDrawable().setProgressiveStartActivated(z);
    }

    public void setSmoothProgressDrawableBackgroundDrawable(Drawable drawable0) {
        this.checkIndeterminateDrawable().setBackgroundDrawable(drawable0);
    }

    public void setSmoothProgressDrawableCallbacks(Callbacks smoothProgressDrawable$Callbacks0) {
        this.checkIndeterminateDrawable().setCallbacks(smoothProgressDrawable$Callbacks0);
    }

    public void setSmoothProgressDrawableColor(int v) {
        this.checkIndeterminateDrawable().setColor(v);
    }

    public void setSmoothProgressDrawableColors(int[] arr_v) {
        this.checkIndeterminateDrawable().setColors(arr_v);
    }

    public void setSmoothProgressDrawableInterpolator(Interpolator interpolator0) {
        this.checkIndeterminateDrawable().setInterpolator(interpolator0);
    }

    public void setSmoothProgressDrawableMirrorMode(boolean z) {
        this.checkIndeterminateDrawable().setMirrorMode(z);
    }

    public void setSmoothProgressDrawableProgressiveStartSpeed(float f) {
        this.checkIndeterminateDrawable().setProgressiveStartSpeed(f);
    }

    public void setSmoothProgressDrawableProgressiveStopSpeed(float f) {
        this.checkIndeterminateDrawable().setProgressiveStopSpeed(f);
    }

    public void setSmoothProgressDrawableReversed(boolean z) {
        this.checkIndeterminateDrawable().setReversed(z);
    }

    public void setSmoothProgressDrawableSectionsCount(int v) {
        this.checkIndeterminateDrawable().setSectionsCount(v);
    }

    public void setSmoothProgressDrawableSeparatorLength(int v) {
        this.checkIndeterminateDrawable().setSeparatorLength(v);
    }

    public void setSmoothProgressDrawableSpeed(float f) {
        this.checkIndeterminateDrawable().setSpeed(f);
    }

    public void setSmoothProgressDrawableStrokeWidth(float f) {
        this.checkIndeterminateDrawable().setStrokeWidth(f);
    }

    public void setSmoothProgressDrawableUseGradients(boolean z) {
        this.checkIndeterminateDrawable().setUseGradients(z);
    }
}

