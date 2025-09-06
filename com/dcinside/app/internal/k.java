package com.dcinside.app.internal;

import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import com.dcinside.app.util.Dk;
import kotlin.jvm.internal.L;
import y4.l;

public final class k implements d, e {
    @l
    private final TextView a;

    public k(@l TextView textView0) {
        L.p(textView0, "textView");
        super();
        this.a = textView0;
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e a(@DrawableRes int v) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(v, 0, 0, 0);
        return this;
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e b(@DrawableRes int v) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, v);
        return this;
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e b(@DrawableRes int v, @DrawableRes int v1, @DrawableRes int v2, @DrawableRes int v3) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(v, v1, v2, v3);
        return this;
    }

    @Override  // com.dcinside.app.internal.e
    public void c(@IntRange(from = 0L) int v) {
        if(v > 0) {
            this.a.setCompoundDrawablePadding(Dk.d(v));
        }
    }

    @Override  // com.dcinside.app.internal.d
    public void clear() {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e d(@DrawableRes int v) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, v, 0);
        return this;
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e e(@DrawableRes int v) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(0, v, 0, 0);
        return this;
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e f(@DrawableRes int v) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(0, v, 0, v);
        return this;
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e g(@DrawableRes int v) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(v, 0, v, 0);
        return this;
    }

    @Override  // com.dcinside.app.internal.d
    @l
    public e h(@DrawableRes int v) {
        this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(v, v, v, v);
        return this;
    }
}

