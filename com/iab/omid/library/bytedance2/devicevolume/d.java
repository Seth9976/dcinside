package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

public final class d extends ContentObserver {
    private final Context a;
    private final AudioManager b;
    private final a c;
    private final c d;
    private float e;

    public d(Handler handler0, Context context0, a a0, c c0) {
        super(handler0);
        this.a = context0;
        this.b = (AudioManager)context0.getSystemService("audio");
        this.c = a0;
        this.d = c0;
    }

    private float a() {
        int v = this.b.getStreamVolume(3);
        int v1 = this.b.getStreamMaxVolume(3);
        return this.c.a(v, v1);
    }

    private boolean a(float f) {
        return f != this.e;
    }

    private void b() {
        this.d.a(this.e);
    }

    public void c() {
        this.e = this.a();
        this.b();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    @Override  // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float f = this.a();
        if(this.a(f)) {
            this.e = f;
            this.b();
        }
    }
}

