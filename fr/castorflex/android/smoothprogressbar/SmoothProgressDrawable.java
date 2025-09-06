package fr.castorflex.android.smoothprogressbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public class SmoothProgressDrawable extends Drawable implements Animatable {
    public static class Builder {
        private Drawable mBackgroundDrawableWhenHidden;
        private int[] mColors;
        private boolean mGenerateBackgroundUsingColors;
        private boolean mGradients;
        private Interpolator mInterpolator;
        private boolean mMirrorMode;
        private Callbacks mOnProgressiveStopEndedListener;
        private boolean mProgressiveStartActivated;
        private float mProgressiveStartSpeed;
        private float mProgressiveStopSpeed;
        private boolean mReversed;
        private int mSectionsCount;
        private float mSpeed;
        private int mStrokeSeparatorLength;
        private float mStrokeWidth;

        public Builder(Context context0) {
            this(context0, false);
        }

        public Builder(Context context0, boolean z) {
            this.initValues(context0, z);
        }

        public Builder backgroundDrawable(Drawable drawable0) {
            this.mBackgroundDrawableWhenHidden = drawable0;
            return this;
        }

        public SmoothProgressDrawable build() {
            if(this.mGenerateBackgroundUsingColors) {
                this.mBackgroundDrawableWhenHidden = SmoothProgressBarUtils.generateDrawableWithColors(this.mColors, this.mStrokeWidth);
            }
            return new SmoothProgressDrawable(this.mInterpolator, this.mSectionsCount, this.mStrokeSeparatorLength, this.mColors, this.mStrokeWidth, this.mSpeed, this.mProgressiveStartSpeed, this.mProgressiveStopSpeed, this.mReversed, this.mMirrorMode, this.mOnProgressiveStopEndedListener, this.mProgressiveStartActivated, this.mBackgroundDrawableWhenHidden, this.mGradients, null);
        }

        public Builder callbacks(Callbacks smoothProgressDrawable$Callbacks0) {
            this.mOnProgressiveStopEndedListener = smoothProgressDrawable$Callbacks0;
            return this;
        }

        public Builder color(int v) {
            this.mColors = new int[]{v};
            return this;
        }

        public Builder colors(int[] arr_v) {
            SmoothProgressBarUtils.checkColors(arr_v);
            this.mColors = arr_v;
            return this;
        }

        public Builder generateBackgroundUsingColors() {
            this.mGenerateBackgroundUsingColors = true;
            return this;
        }

        public Builder gradients() {
            return this.gradients(true);
        }

        public Builder gradients(boolean z) {
            this.mGradients = z;
            return this;
        }

        private void initValues(Context context0, boolean z) {
            Resources resources0 = context0.getResources();
            this.mInterpolator = new AccelerateInterpolator();
            if(z) {
                this.mSectionsCount = 4;
                this.mSpeed = 1.0f;
                this.mReversed = false;
                this.mProgressiveStartActivated = false;
                this.mColors = new int[]{0xFF33B5E5};
                this.mStrokeSeparatorLength = 4;
                this.mStrokeWidth = 4.0f;
            }
            else {
                this.mSectionsCount = resources0.getInteger(integer.spb_default_sections_count);
                this.mSpeed = Float.parseFloat(resources0.getString(string.spb_default_speed));
                this.mReversed = resources0.getBoolean(bool.spb_default_reversed);
                this.mProgressiveStartActivated = resources0.getBoolean(bool.spb_default_progressiveStart_activated);
                this.mColors = new int[]{resources0.getColor(color.spb_default_color)};
                this.mStrokeSeparatorLength = resources0.getDimensionPixelSize(dimen.spb_default_stroke_separator_length);
                this.mStrokeWidth = (float)resources0.getDimensionPixelOffset(dimen.spb_default_stroke_width);
            }
            this.mProgressiveStartSpeed = this.mSpeed;
            this.mProgressiveStopSpeed = this.mSpeed;
            this.mGradients = false;
        }

        public Builder interpolator(Interpolator interpolator0) {
            SmoothProgressBarUtils.checkNotNull(interpolator0, "Interpolator");
            this.mInterpolator = interpolator0;
            return this;
        }

        public Builder mirrorMode(boolean z) {
            this.mMirrorMode = z;
            return this;
        }

        public Builder progressiveStart(boolean z) {
            this.mProgressiveStartActivated = z;
            return this;
        }

        public Builder progressiveStartSpeed(float f) {
            SmoothProgressBarUtils.checkSpeed(f);
            this.mProgressiveStartSpeed = f;
            return this;
        }

        public Builder progressiveStopSpeed(float f) {
            SmoothProgressBarUtils.checkSpeed(f);
            this.mProgressiveStopSpeed = f;
            return this;
        }

        public Builder reversed(boolean z) {
            this.mReversed = z;
            return this;
        }

        public Builder sectionsCount(int v) {
            SmoothProgressBarUtils.checkPositive(v, "Sections count");
            this.mSectionsCount = v;
            return this;
        }

        public Builder separatorLength(int v) {
            SmoothProgressBarUtils.checkPositiveOrZero(v, "Separator length");
            this.mStrokeSeparatorLength = v;
            return this;
        }

        public Builder speed(float f) {
            SmoothProgressBarUtils.checkSpeed(f);
            this.mSpeed = f;
            return this;
        }

        public Builder strokeWidth(float f) {
            SmoothProgressBarUtils.checkPositiveOrZero(f, "Width");
            this.mStrokeWidth = f;
            return this;
        }
    }

    public interface Callbacks {
        void onStart();

        void onStop();
    }

    private static final long FRAME_DURATION = 16L;
    private static final float OFFSET_PER_FRAME = 0.01f;
    private final Rect fBackgroundRect;
    private Drawable mBackgroundDrawable;
    private Rect mBounds;
    private Callbacks mCallbacks;
    private int[] mColors;
    private int mColorsIndex;
    private float mCurrentOffset;
    private int mCurrentSections;
    private boolean mFinishing;
    private float mFinishingOffset;
    private Interpolator mInterpolator;
    private int[] mLinearGradientColors;
    private float[] mLinearGradientPositions;
    private float mMaxOffset;
    private boolean mMirrorMode;
    private boolean mNewTurn;
    private Paint mPaint;
    private boolean mProgressiveStartActivated;
    private float mProgressiveStartSpeed;
    private float mProgressiveStopSpeed;
    private boolean mReversed;
    private boolean mRunning;
    private int mSectionsCount;
    private int mSeparatorLength;
    private float mSpeed;
    private int mStartSection;
    private float mStrokeWidth;
    private final Runnable mUpdater;
    private boolean mUseGradients;

    private SmoothProgressDrawable(Interpolator interpolator0, int v, int v1, int[] arr_v, float f, float f1, float f2, float f3, boolean z, boolean z1, Callbacks smoothProgressDrawable$Callbacks0, boolean z2, Drawable drawable0, boolean z3) {
        this.fBackgroundRect = new Rect();
        this.mUpdater = new Runnable() {
            @Override
            public void run() {
                if(SmoothProgressDrawable.this.isFinishing()) {
                    SmoothProgressDrawable.this.mFinishingOffset += SmoothProgressDrawable.this.mProgressiveStopSpeed * 0.01f;
                    SmoothProgressDrawable.this.mCurrentOffset += SmoothProgressDrawable.this.mProgressiveStopSpeed * 0.01f;
                    if(SmoothProgressDrawable.this.mFinishingOffset >= 1.0f) {
                        SmoothProgressDrawable.this.stop();
                    }
                }
                else if(SmoothProgressDrawable.this.isStarting()) {
                    SmoothProgressDrawable.this.mCurrentOffset += SmoothProgressDrawable.this.mProgressiveStartSpeed * 0.01f;
                }
                else {
                    SmoothProgressDrawable.this.mCurrentOffset += SmoothProgressDrawable.this.mSpeed * 0.01f;
                }
                if(SmoothProgressDrawable.this.mCurrentOffset >= SmoothProgressDrawable.this.mMaxOffset) {
                    SmoothProgressDrawable.this.mNewTurn = true;
                    SmoothProgressDrawable.this.mCurrentOffset -= SmoothProgressDrawable.this.mMaxOffset;
                }
                if(SmoothProgressDrawable.this.isRunning()) {
                    long v = SystemClock.uptimeMillis();
                    SmoothProgressDrawable.this.scheduleSelf(SmoothProgressDrawable.this.mUpdater, v + 16L);
                }
                SmoothProgressDrawable.this.invalidateSelf();
            }
        };
        this.mRunning = false;
        this.mInterpolator = interpolator0;
        this.mSectionsCount = v;
        this.mStartSection = 0;
        this.mCurrentSections = v;
        this.mSeparatorLength = v1;
        this.mSpeed = f1;
        this.mProgressiveStartSpeed = f2;
        this.mProgressiveStopSpeed = f3;
        this.mReversed = z;
        this.mColors = arr_v;
        this.mColorsIndex = 0;
        this.mMirrorMode = z1;
        this.mFinishing = false;
        this.mBackgroundDrawable = drawable0;
        this.mStrokeWidth = f;
        this.mMaxOffset = 1.0f / ((float)v);
        Paint paint0 = new Paint();
        this.mPaint = paint0;
        paint0.setStrokeWidth(f);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setDither(false);
        this.mPaint.setAntiAlias(false);
        this.mProgressiveStartActivated = z2;
        this.mCallbacks = smoothProgressDrawable$Callbacks0;
        this.mUseGradients = z3;
        this.refreshLinearGradientOptions();
    }

    SmoothProgressDrawable(Interpolator interpolator0, int v, int v1, int[] arr_v, float f, float f1, float f2, float f3, boolean z, boolean z1, Callbacks smoothProgressDrawable$Callbacks0, boolean z2, Drawable drawable0, boolean z3, fr.castorflex.android.smoothprogressbar.SmoothProgressDrawable.1 smoothProgressDrawable$10) {
        this(interpolator0, v, v1, arr_v, f, f1, f2, f3, z, z1, smoothProgressDrawable$Callbacks0, z2, drawable0, z3);
    }

    private void checkColorIndex(int v) {
        if(v < 0 || v >= this.mColors.length) {
            throw new IllegalArgumentException(String.format("Index %d not valid", v));
        }
    }

    private int decrementColor(int v) {
        return v - 1 >= 0 ? v - 1 : this.mColors.length - 1;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        this.mBounds = rect0;
        canvas0.clipRect(rect0);
        if(this.mNewTurn) {
            this.mColorsIndex = this.decrementColor(this.mColorsIndex);
            this.mNewTurn = false;
            if(this.isFinishing()) {
                int v = this.mStartSection + 1;
                this.mStartSection = v;
                if(v > this.mSectionsCount) {
                    this.stop();
                    return;
                }
            }
            int v1 = this.mCurrentSections;
            if(v1 < this.mSectionsCount) {
                this.mCurrentSections = v1 + 1;
            }
        }
        if(this.mUseGradients) {
            this.drawGradient(canvas0);
        }
        this.drawStrokes(canvas0);
    }

    private void drawBackground(Canvas canvas0, float f, float f1) {
        int v = canvas0.save();
        canvas0.clipRect(f, ((float)(((int)((((float)canvas0.getHeight()) - this.mStrokeWidth) / 2.0f)))), f1, ((float)(((int)((((float)canvas0.getHeight()) + this.mStrokeWidth) / 2.0f)))));
        this.mBackgroundDrawable.draw(canvas0);
        canvas0.restoreToCount(v);
    }

    private void drawBackgroundIfNeeded(Canvas canvas0, float f, float f1) {
        if(this.mBackgroundDrawable == null) {
            return;
        }
        this.fBackgroundRect.top = (int)((((float)canvas0.getHeight()) - this.mStrokeWidth) / 2.0f);
        this.fBackgroundRect.bottom = (int)((((float)canvas0.getHeight()) + this.mStrokeWidth) / 2.0f);
        this.fBackgroundRect.left = 0;
        this.fBackgroundRect.right = this.mMirrorMode ? canvas0.getWidth() / 2 : canvas0.getWidth();
        this.mBackgroundDrawable.setBounds(this.fBackgroundRect);
        if(!this.isRunning()) {
            if(this.mMirrorMode) {
                canvas0.save();
                canvas0.translate(((float)(canvas0.getWidth() / 2)), 0.0f);
                this.drawBackground(canvas0, 0.0f, ((float)this.fBackgroundRect.width()));
                canvas0.scale(-1.0f, 1.0f);
                this.drawBackground(canvas0, 0.0f, ((float)this.fBackgroundRect.width()));
                canvas0.restore();
                return;
            }
            this.drawBackground(canvas0, 0.0f, ((float)this.fBackgroundRect.width()));
            return;
        }
        if(!this.isFinishing() && !this.isStarting()) {
            return;
        }
        if(f > f1) {
            float f2 = f1;
            f1 = f;
            f = f2;
        }
        if(f > 0.0f) {
            if(this.mMirrorMode) {
                canvas0.save();
                canvas0.translate(((float)(canvas0.getWidth() / 2)), 0.0f);
                if(this.mReversed) {
                    this.drawBackground(canvas0, 0.0f, f);
                    canvas0.scale(-1.0f, 1.0f);
                    this.drawBackground(canvas0, 0.0f, f);
                }
                else {
                    this.drawBackground(canvas0, ((float)(canvas0.getWidth() / 2)) - f, ((float)(canvas0.getWidth() / 2)));
                    canvas0.scale(-1.0f, 1.0f);
                    this.drawBackground(canvas0, ((float)(canvas0.getWidth() / 2)) - f, ((float)(canvas0.getWidth() / 2)));
                }
                canvas0.restore();
            }
            else {
                this.drawBackground(canvas0, 0.0f, f);
            }
        }
        if(f1 <= ((float)canvas0.getWidth())) {
            if(this.mMirrorMode) {
                canvas0.save();
                canvas0.translate(((float)(canvas0.getWidth() / 2)), 0.0f);
                if(this.mReversed) {
                    this.drawBackground(canvas0, f1, ((float)(canvas0.getWidth() / 2)));
                    canvas0.scale(-1.0f, 1.0f);
                    this.drawBackground(canvas0, f1, ((float)(canvas0.getWidth() / 2)));
                }
                else {
                    this.drawBackground(canvas0, 0.0f, ((float)(canvas0.getWidth() / 2)) - f1);
                    canvas0.scale(-1.0f, 1.0f);
                    this.drawBackground(canvas0, 0.0f, ((float)(canvas0.getWidth() / 2)) - f1);
                }
                canvas0.restore();
                return;
            }
            this.drawBackground(canvas0, f1, ((float)canvas0.getWidth()));
        }
    }

    private void drawGradient(Canvas canvas0) {
        int v4;
        float f = 1.0f / ((float)this.mSectionsCount);
        int v = this.mColorsIndex;
        float[] arr_f = this.mLinearGradientPositions;
        int v1 = 0;
        arr_f[0] = 0.0f;
        arr_f[arr_f.length - 1] = 1.0f;
        int v2 = v - 1;
        this.mLinearGradientColors[0] = this.mColors[(v2 >= 0 ? v - 1 : v2 + this.mColors.length)];
        while(v1 < this.mSectionsCount) {
            float f1 = this.mInterpolator.getInterpolation(((float)v1) * f + this.mCurrentOffset);
            ++v1;
            this.mLinearGradientPositions[v1] = f1;
            int[] arr_v = this.mColors;
            this.mLinearGradientColors[v1] = arr_v[v];
            v = (v + 1) % arr_v.length;
        }
        this.mLinearGradientColors[this.mLinearGradientColors.length - 1] = this.mColors[v];
        int v3 = !this.mReversed || !this.mMirrorMode ? this.mBounds.left : Math.abs(this.mBounds.left - this.mBounds.right) / 2;
        if(!this.mMirrorMode) {
            v4 = this.mBounds.right;
        }
        else if(this.mReversed) {
            v4 = this.mBounds.left;
        }
        else {
            v4 = Math.abs(this.mBounds.left - this.mBounds.right) / 2;
        }
        float f2 = ((float)this.mBounds.centerY()) - this.mStrokeWidth / 2.0f;
        float f3 = (float)this.mBounds.centerY();
        LinearGradient linearGradient0 = new LinearGradient(((float)v3), f2, ((float)v4), this.mStrokeWidth / 2.0f + f3, this.mLinearGradientColors, this.mLinearGradientPositions, (this.mMirrorMode ? Shader.TileMode.MIRROR : Shader.TileMode.CLAMP));
        this.mPaint.setShader(linearGradient0);
    }

    private void drawLine(Canvas canvas0, int v, float f, float f1, float f2, float f3, int v1) {
        this.mPaint.setColor(this.mColors[v1]);
        if(!this.mMirrorMode) {
            canvas0.drawLine(f, f1, f2, f3, this.mPaint);
            return;
        }
        if(this.mReversed) {
            canvas0.drawLine(((float)v) + f, f1, ((float)v) + f2, f3, this.mPaint);
            canvas0.drawLine(((float)v) - f, f1, ((float)v) - f2, f3, this.mPaint);
            return;
        }
        canvas0.drawLine(f, f1, f2, f3, this.mPaint);
        canvas0.drawLine(((float)(v * 2)) - f, f1, ((float)(v * 2)) - f2, f3, this.mPaint);
    }

    private void drawStrokes(Canvas canvas0) {
        float f12;
        int v11;
        int v10;
        int v9;
        int v8;
        float f11;
        float f10;
        float f9;
        if(this.mReversed) {
            canvas0.translate(((float)this.mBounds.width()), 0.0f);
            canvas0.scale(-1.0f, 1.0f);
        }
        int v = this.mBounds.width();
        if(this.mMirrorMode) {
            v /= 2;
        }
        int v1 = v;
        int v2 = this.mSeparatorLength + v1 + this.mSectionsCount;
        int v3 = this.mBounds.centerY();
        int v4 = this.mSectionsCount;
        int v5 = this.mColorsIndex;
        float f = this.mStartSection != this.mCurrentSections || this.mCurrentSections != v4 ? 0.0f : ((float)canvas0.getWidth());
        int v6 = v5;
        float f1 = 0.0f;
        float f2 = 0.0f;
        int v7 = 0;
        while(v7 <= this.mCurrentSections) {
            float f3 = ((float)v7) * (1.0f / ((float)v4)) + this.mCurrentOffset;
            float f4 = Math.max(0.0f, f3 - 1.0f / ((float)v4));
            float f5 = (float)(((int)(Math.abs(this.mInterpolator.getInterpolation(f4) - this.mInterpolator.getInterpolation(Math.min(f3, 1.0f))) * ((float)v2))));
            float f6 = f4 + f5 < ((float)v2) ? Math.min(f5, this.mSeparatorLength) : 0.0f;
            float f7 = f1 + (f5 > f6 ? f5 - f6 : 0.0f);
            if(f7 <= f1 || v7 < this.mStartSection) {
                f9 = f7;
                f10 = f1;
                f11 = f2;
                v10 = v6;
                v8 = v1;
                v11 = v2;
                v9 = v7;
                f12 = f;
            }
            else {
                float f8 = Math.max(this.mInterpolator.getInterpolation(Math.min(this.mFinishingOffset, 1.0f)) * ((float)v2), Math.min(v1, f1));
                f9 = f7;
                f10 = f1;
                f11 = f2;
                v8 = v1;
                v9 = v7;
                v10 = v6;
                v11 = v2;
                f12 = f;
                this.drawLine(canvas0, v1, f8, ((float)v3), Math.min(v1, f7), ((float)v3), v10);
                if(v9 == this.mStartSection) {
                    f = f8 - ((float)this.mSeparatorLength);
                    goto label_45;
                }
            }
            f = f12;
        label_45:
            f2 = v9 == this.mCurrentSections ? f10 + f5 : f11;
            f1 = f9 + f6;
            v6 = this.incrementColor(v10);
            v7 = v9 + 1;
            v2 = v11;
            v1 = v8;
        }
        this.drawBackgroundIfNeeded(canvas0, f, f2);
    }

    public Drawable getBackgroundDrawable() {
        return this.mBackgroundDrawable;
    }

    public int[] getColors() {
        return this.mColors;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public float getStrokeWidth() {
        return this.mStrokeWidth;
    }

    private int incrementColor(int v) {
        return v + 1 < this.mColors.length ? v + 1 : 0;
    }

    public boolean isFinishing() {
        return this.mFinishing;
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mRunning;
    }

    public boolean isStarting() {
        return this.mCurrentSections < this.mSectionsCount;
    }

    public void progressiveStart() {
        this.progressiveStart(0);
    }

    public void progressiveStart(int v) {
        this.resetProgressiveStart(v);
        this.start();
    }

    public void progressiveStop() {
        this.mFinishing = true;
        this.mStartSection = 0;
    }

    protected void refreshLinearGradientOptions() {
        if(this.mUseGradients) {
            int v = this.mSectionsCount;
            this.mLinearGradientColors = new int[v + 2];
            this.mLinearGradientPositions = new float[v + 2];
            return;
        }
        this.mPaint.setShader(null);
        this.mLinearGradientColors = null;
        this.mLinearGradientPositions = null;
    }

    private void resetProgressiveStart(int v) {
        this.checkColorIndex(v);
        this.mCurrentOffset = 0.0f;
        this.mFinishing = false;
        this.mFinishingOffset = 0.0f;
        this.mStartSection = 0;
        this.mCurrentSections = 0;
        this.mColorsIndex = v;
    }

    @Override  // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable0, long v) {
        this.mRunning = true;
        super.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.mPaint.setAlpha(v);
    }

    public void setBackgroundDrawable(Drawable drawable0) {
        if(this.mBackgroundDrawable == drawable0) {
            return;
        }
        this.mBackgroundDrawable = drawable0;
        this.invalidateSelf();
    }

    public void setCallbacks(Callbacks smoothProgressDrawable$Callbacks0) {
        this.mCallbacks = smoothProgressDrawable$Callbacks0;
    }

    public void setColor(int v) {
        this.setColors(new int[]{v});
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.mPaint.setColorFilter(colorFilter0);
    }

    public void setColors(int[] arr_v) {
        if(arr_v == null || arr_v.length == 0) {
            throw new IllegalArgumentException("Colors cannot be null or empty");
        }
        this.mColorsIndex = 0;
        this.mColors = arr_v;
        this.refreshLinearGradientOptions();
        this.invalidateSelf();
    }

    public void setInterpolator(Interpolator interpolator0) {
        if(interpolator0 == null) {
            throw new IllegalArgumentException("Interpolator cannot be null");
        }
        this.mInterpolator = interpolator0;
        this.invalidateSelf();
    }

    public void setMirrorMode(boolean z) {
        if(this.mMirrorMode == z) {
            return;
        }
        this.mMirrorMode = z;
        this.invalidateSelf();
    }

    public void setProgressiveStartActivated(boolean z) {
        this.mProgressiveStartActivated = z;
    }

    public void setProgressiveStartSpeed(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("SpeedProgressiveStart must be >= 0");
        }
        this.mProgressiveStartSpeed = f;
        this.invalidateSelf();
    }

    public void setProgressiveStopSpeed(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("SpeedProgressiveStop must be >= 0");
        }
        this.mProgressiveStopSpeed = f;
        this.invalidateSelf();
    }

    public void setReversed(boolean z) {
        if(this.mReversed == z) {
            return;
        }
        this.mReversed = z;
        this.invalidateSelf();
    }

    public void setSectionsCount(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("SectionsCount must be > 0");
        }
        this.mSectionsCount = v;
        this.mMaxOffset = 1.0f / ((float)v);
        this.mCurrentOffset %= 1.0f / ((float)v);
        this.refreshLinearGradientOptions();
        this.invalidateSelf();
    }

    public void setSeparatorLength(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("SeparatorLength must be >= 0");
        }
        this.mSeparatorLength = v;
        this.invalidateSelf();
    }

    public void setSpeed(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Speed must be >= 0");
        }
        this.mSpeed = f;
        this.invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("The strokeWidth must be >= 0");
        }
        this.mPaint.setStrokeWidth(f);
        this.invalidateSelf();
    }

    public void setUseGradients(boolean z) {
        if(this.mUseGradients == z) {
            return;
        }
        this.mUseGradients = z;
        this.refreshLinearGradientOptions();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        if(this.mProgressiveStartActivated) {
            this.resetProgressiveStart(0);
        }
        if(this.isRunning()) {
            return;
        }
        Callbacks smoothProgressDrawable$Callbacks0 = this.mCallbacks;
        if(smoothProgressDrawable$Callbacks0 != null) {
            smoothProgressDrawable$Callbacks0.onStart();
        }
        long v = SystemClock.uptimeMillis();
        this.scheduleSelf(this.mUpdater, v + 16L);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        if(!this.isRunning()) {
            return;
        }
        Callbacks smoothProgressDrawable$Callbacks0 = this.mCallbacks;
        if(smoothProgressDrawable$Callbacks0 != null) {
            smoothProgressDrawable$Callbacks0.onStop();
        }
        this.mRunning = false;
        this.unscheduleSelf(this.mUpdater);
    }
}

