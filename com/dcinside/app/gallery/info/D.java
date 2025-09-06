package com.dcinside.app.gallery.info;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class d implements b {
    public final MajorEntrustFragment a;
    public final AppCompatActivity b;

    public d(MajorEntrustFragment majorEntrustFragment0, AppCompatActivity appCompatActivity0) {
        this.a = majorEntrustFragment0;
        this.b = appCompatActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        MajorEntrustFragment.w0(this.a, this.b, ((Throwable)object0));
    }
}

