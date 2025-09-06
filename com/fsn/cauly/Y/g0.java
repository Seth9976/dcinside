package com.fsn.cauly.Y;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class g0 extends AnimationDrawable {
    class a implements Runnable {
        final g0 a;

        @Override
        public void run() {
            g0.this.b.a();
            int v = g0.this.b.d();
            for(int v1 = 1; v1 < v; ++v1) {
                Bitmap bitmap0 = g0.this.b.b(v1);
                g0.this.c = bitmap0;
                int v2 = g0.this.b.a(v1);
                BitmapDrawable bitmapDrawable0 = new BitmapDrawable(g0.this.c);
                g0.this.addFrame(bitmapDrawable0, v2);
            }
            g0.this.a = true;
            g0.this.b = null;
        }
    }

    private boolean a;
    private h0 b;
    private Bitmap c;
    private int d;
    private int e;
    private Runnable f;

    public g0(File file0) {
        this(file0, false);
    }

    public g0(File file0, boolean z) {
        this(new BufferedInputStream(new FileInputStream(file0), 0x8000), z);
    }

    public g0(InputStream inputStream0, boolean z) {
        this.f = new a(this);
        if(!BufferedInputStream.class.isInstance(inputStream0)) {
            inputStream0 = new BufferedInputStream(inputStream0, 0x8000);
        }
        boolean z1 = false;
        this.a = false;
        h0 h00 = new h0();
        this.b = h00;
        h00.a(inputStream0);
        Bitmap bitmap0 = this.b.b(0);
        this.c = bitmap0;
        this.d = bitmap0.getHeight();
        this.e = this.c.getWidth();
        this.addFrame(new BitmapDrawable(this.c), this.b.a(0));
        if(this.b.e() != 0) {
            z1 = true;
        }
        this.setOneShot(z1);
        this.setVisible(true, true);
        if(z) {
            this.f.run();
            return;
        }
        new Thread(this.f).start();
    }

    @Override  // android.graphics.drawable.DrawableContainer
    public int getIntrinsicHeight() {
        return this.d;
    }

    @Override  // android.graphics.drawable.DrawableContainer
    public int getIntrinsicWidth() {
        return this.e;
    }

    @Override  // android.graphics.drawable.DrawableContainer
    public int getMinimumHeight() {
        return this.d;
    }

    @Override  // android.graphics.drawable.DrawableContainer
    public int getMinimumWidth() {
        return this.e;
    }
}

