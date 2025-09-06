package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressIndicator extends b {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final int A = 0;
    public static final int B = 1;
    public static final int z;

    static {
        CircularProgressIndicator.z = style.Widget_MaterialComponents_CircularProgressIndicator;
    }

    public CircularProgressIndicator(@NonNull Context context0) {
        this(context0, null);
    }

    public CircularProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v, CircularProgressIndicator.z);
        this.u();
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec)this.a).j;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec)this.a).i;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec)this.a).h;
    }

    @Override  // com.google.android.material.progressindicator.b
    c i(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return this.t(context0, attributeSet0);
    }

    public void setIndicatorDirection(int v) {
        ((CircularProgressIndicatorSpec)this.a).j = v;
        this.invalidate();
    }

    public void setIndicatorInset(@Px int v) {
        c c0 = this.a;
        if(((CircularProgressIndicatorSpec)c0).i != v) {
            ((CircularProgressIndicatorSpec)c0).i = v;
            this.invalidate();
        }
    }

    public void setIndicatorSize(@Px int v) {
        int v1 = Math.max(v, this.getTrackThickness() * 2);
        c c0 = this.a;
        if(((CircularProgressIndicatorSpec)c0).h != v1) {
            ((CircularProgressIndicatorSpec)c0).h = v1;
            ((CircularProgressIndicatorSpec)c0).e();
            this.requestLayout();
            this.invalidate();
        }
    }

    @Override  // com.google.android.material.progressindicator.b
    public void setTrackThickness(int v) {
        super.setTrackThickness(v);
        ((CircularProgressIndicatorSpec)this.a).e();
    }

    CircularProgressIndicatorSpec t(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return new CircularProgressIndicatorSpec(context0, attributeSet0);
    }

    private void u() {
        d d0 = new d(((CircularProgressIndicatorSpec)this.a));
        this.setIndeterminateDrawable(j.z(this.getContext(), ((CircularProgressIndicatorSpec)this.a), d0));
        this.setProgressDrawable(f.C(this.getContext(), ((CircularProgressIndicatorSpec)this.a), d0));
    }
}

