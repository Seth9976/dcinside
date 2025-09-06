package com.fsn.cauly.Y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.fsn.cauly.blackdragoncore.utils.e;
import com.fsn.cauly.blackdragoncore.utils.f;
import java.io.File;
import java.io.IOException;

public class g extends u0 {
    Drawable s;
    Bitmap t;
    ImageView u;

    public g(Context context0, String s, ImageView imageView0) {
        this.u = imageView0;
        this.m = s;
        String s1 = m0.e(context0);
        e.d(s1);
        this.a(m0.a(this.m, s1));
        this.a(true);
    }

    @Override  // com.fsn.cauly.Y.u0
    protected boolean a(byte[] arr_b) {
        Bitmap bitmap0 = f.a(arr_b);
        this.t = bitmap0;
        if(bitmap0 == null && this.s == null) {
            new File(this.k).delete();
            this.c = -100;
            this.q = "Image Loading Error";
            return false;
        }
        return true;
    }

    @Override  // com.fsn.cauly.Y.u0
    protected void g() {
        if(this.p) {
            Bitmap bitmap0 = f.a(this.k);
            this.t = bitmap0;
            if(bitmap0 == null && this.s == null) {
                new File(this.k).delete();
                this.c = -100;
                this.q = "Image Loading Error";
            }
        }
    }

    public ImageView i() {
        return this.u;
    }

    public Bitmap j() {
        return this.t;
    }

    public void k() {
        if(this.t != null && this.u != null) {
            try {
                g0 g00 = new g0(new File(this.e()));
                this.u.setImageDrawable(g00);
                g00.setVisible(true, true);
                g00.start();
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
            }
        }
    }

    public void l() {
        Bitmap bitmap0 = this.t;
        if(bitmap0 != null) {
            ImageView imageView0 = this.u;
            if(imageView0 != null) {
                imageView0.setImageBitmap(bitmap0);
            }
        }
    }
}

