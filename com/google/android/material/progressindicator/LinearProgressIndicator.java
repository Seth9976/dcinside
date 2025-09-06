package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearProgressIndicator extends b {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.progressindicator.LinearProgressIndicator.b {
    }

    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;
    public static final int z;

    static {
        LinearProgressIndicator.z = style.Widget_MaterialComponents_LinearProgressIndicator;
    }

    public LinearProgressIndicator(@NonNull Context context0) {
        this(context0, null);
    }

    public LinearProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v, LinearProgressIndicator.z);
        this.u();
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec)this.a).h;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec)this.a).i;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec)this.a).k;
    }

    @Override  // com.google.android.material.progressindicator.b
    c i(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return this.t(context0, attributeSet0);
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        c c0 = this.a;
        ((LinearProgressIndicatorSpec)c0).j = ((LinearProgressIndicatorSpec)c0).i == 1 || ViewCompat.e0(this) == 1 && ((LinearProgressIndicatorSpec)this.a).i == 2 || ViewCompat.e0(this) == 0 && ((LinearProgressIndicatorSpec)this.a).i == 3;
    }

    @Override  // android.widget.ProgressBar
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        int v4 = v - (this.getPaddingLeft() + this.getPaddingRight());
        int v5 = v1 - (this.getPaddingTop() + this.getPaddingBottom());
        j j0 = this.getIndeterminateDrawable();
        if(j0 != null) {
            j0.setBounds(0, 0, v4, v5);
        }
        f f0 = this.getProgressDrawable();
        if(f0 != null) {
            f0.setBounds(0, 0, v4, v5);
        }
    }

    @Override  // com.google.android.material.progressindicator.b
    public void p(int v, boolean z) {
        if(this.a != null && ((LinearProgressIndicatorSpec)this.a).h == 0 && this.isIndeterminate()) {
            return;
        }
        super.p(v, z);
    }

    public void setIndeterminateAnimationType(int v) {
        if(((LinearProgressIndicatorSpec)this.a).h == v) {
            return;
        }
        if(this.s() && this.isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        c c0 = this.a;
        ((LinearProgressIndicatorSpec)c0).h = v;
        ((LinearProgressIndicatorSpec)c0).e();
        if(v == 0) {
            this.getIndeterminateDrawable().G(new l(((LinearProgressIndicatorSpec)this.a)));
        }
        else {
            this.getIndeterminateDrawable().G(new m(this.getContext(), ((LinearProgressIndicatorSpec)this.a)));
        }
        this.invalidate();
    }

    @Override  // com.google.android.material.progressindicator.b
    public void setIndicatorColor(@NonNull int[] arr_v) {
        super.setIndicatorColor(arr_v);
        ((LinearProgressIndicatorSpec)this.a).e();
    }

    public void setIndicatorDirection(int v) {
        c c0 = this.a;
        ((LinearProgressIndicatorSpec)c0).i = v;
        ((LinearProgressIndicatorSpec)c0).j = v == 1 || ViewCompat.e0(this) == 1 && ((LinearProgressIndicatorSpec)this.a).i == 2 || ViewCompat.e0(this) == 0 && v == 3;
        this.invalidate();
    }

    @Override  // com.google.android.material.progressindicator.b
    public void setTrackCornerRadius(int v) {
        super.setTrackCornerRadius(v);
        ((LinearProgressIndicatorSpec)this.a).e();
        this.invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int v) {
        c c0 = this.a;
        if(((LinearProgressIndicatorSpec)c0).k != v) {
            ((LinearProgressIndicatorSpec)c0).k = Math.min(v, ((LinearProgressIndicatorSpec)c0).a);
            ((LinearProgressIndicatorSpec)this.a).e();
            this.invalidate();
        }
    }

    LinearProgressIndicatorSpec t(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return new LinearProgressIndicatorSpec(context0, attributeSet0);
    }

    private void u() {
        k k0 = new k(((LinearProgressIndicatorSpec)this.a));
        this.setIndeterminateDrawable(j.B(this.getContext(), ((LinearProgressIndicatorSpec)this.a), k0));
        this.setProgressDrawable(f.E(this.getContext(), ((LinearProgressIndicatorSpec)this.a), k0));
    }
}

