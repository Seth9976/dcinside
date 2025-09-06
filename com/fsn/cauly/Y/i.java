package com.fsn.cauly.Y;

import android.content.Context;
import com.fsn.cauly.blackdragoncore.utils.e;
import java.io.File;

public class i extends u0 {
    public i(Context context0, String s) {
        this.m = s;
        String s1 = m0.e(context0);
        e.d(s1);
        this.a(m0.a(this.m, s1));
        this.a(true);
    }

    @Override  // com.fsn.cauly.Y.u0
    protected boolean a(byte[] arr_b) {
        if(arr_b == null) {
            new File(this.k).delete();
            this.c = -100;
            this.q = "Image Loading Error";
            return false;
        }
        return true;
    }

    @Override  // com.fsn.cauly.Y.u0
    protected void g() {
        File file0 = new File(this.k);
        if(!file0.exists() || file0.length() <= 0L) {
            file0.delete();
            this.c = -100;
            this.q = "Video Loading Error";
        }
    }
}

