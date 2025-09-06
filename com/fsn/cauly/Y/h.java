package com.fsn.cauly.Y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.fsn.cauly.blackdragoncore.utils.e;
import com.fsn.cauly.blackdragoncore.utils.f;
import java.io.ByteArrayInputStream;
import java.io.File;

public class h extends u0 {
    Drawable s;
    Bitmap t;
    boolean u;

    public h(Context context0, j0 j00, boolean z) {
        this.u = z;
        if(!TextUtils.isEmpty(j00.i) && !j00.i.equalsIgnoreCase("null")) {
            this.m = j00.i;
            goto label_7;
        }
        else if(!TextUtils.isEmpty(j00.h)) {
            this.m = j00.h;
        label_7:
            String s = m0.e(context0);
            e.d(s);
            this.a(m0.a(this.m, s));
            this.a(true);
        }
    }

    @Override  // com.fsn.cauly.Y.u0
    protected boolean a(byte[] arr_b) {
        if(this.u) {
            this.t = f.a(arr_b);
        }
        else {
            this.s = Drawable.createFromStream(new ByteArrayInputStream(arr_b), this.k);
        }
        if(this.t == null && this.s == null) {
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
            if(this.u) {
                this.t = f.a(this.k);
            }
            else {
                this.s = Drawable.createFromPath(this.k);
            }
            if(this.t == null && this.s == null) {
                new File(this.k).delete();
                this.c = -100;
                this.q = "Image Loading Error";
            }
        }
    }

    public Bitmap i() {
        return this.t;
    }
}

