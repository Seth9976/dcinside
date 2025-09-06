package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class j {
    private long a;
    private long b;
    @Nullable
    private TimeInterpolator c;
    private int d;
    private int e;

    public j(long v, long v1) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = v;
        this.b = v1;
    }

    public j(long v, long v1, @NonNull TimeInterpolator timeInterpolator0) {
        this.d = 0;
        this.e = 1;
        this.a = v;
        this.b = v1;
        this.c = timeInterpolator0;
    }

    public void a(@NonNull Animator animator0) {
        animator0.setStartDelay(this.c());
        animator0.setDuration(this.d());
        animator0.setInterpolator(this.e());
        if(animator0 instanceof ValueAnimator) {
            ((ValueAnimator)animator0).setRepeatCount(this.g());
            ((ValueAnimator)animator0).setRepeatMode(this.h());
        }
    }

    @NonNull
    static j b(@NonNull ValueAnimator valueAnimator0) {
        j j0 = new j(valueAnimator0.getStartDelay(), valueAnimator0.getDuration(), j.f(valueAnimator0));
        j0.d = valueAnimator0.getRepeatCount();
        j0.e = valueAnimator0.getRepeatMode();
        return j0;
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    @Nullable
    public TimeInterpolator e() {
        return this.c == null ? b.b : this.c;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(this.c() != ((j)object0).c()) {
            return false;
        }
        if(this.d() != ((j)object0).d()) {
            return false;
        }
        if(this.g() != ((j)object0).g()) {
            return false;
        }
        return this.h() == ((j)object0).h() ? this.e().getClass().equals(((j)object0).e().getClass()) : false;
    }

    private static TimeInterpolator f(@NonNull ValueAnimator valueAnimator0) {
        TimeInterpolator timeInterpolator0 = valueAnimator0.getInterpolator();
        if(!(timeInterpolator0 instanceof AccelerateDecelerateInterpolator) && timeInterpolator0 != null) {
            if(timeInterpolator0 instanceof AccelerateInterpolator) {
                return b.c;
            }
            return timeInterpolator0 instanceof DecelerateInterpolator ? b.d : timeInterpolator0;
        }
        return b.b;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return (((((int)(this.c() ^ this.c() >>> 0x20)) * 0x1F + ((int)(this.d() ^ this.d() >>> 0x20))) * 0x1F + this.e().getClass().hashCode()) * 0x1F + this.g()) * 0x1F + this.h();
    }

    @Override
    @NonNull
    public String toString() {
        return '\n' + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.c() + " duration: " + this.d() + " interpolator: " + this.e().getClass() + " repeatCount: " + this.g() + " repeatMode: " + this.h() + "}\n";
    }
}

