package com.dcinside.app.barcode;

import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;
import y4.m;

public final class j extends Tracker {
    public interface a {
        void a(int arg1, @m Barcode arg2);
    }

    @m
    private a a;

    public void a(int v, @m Barcode barcode0) {
        a j$a0 = this.a;
        if(j$a0 != null) {
            j$a0.a(v, barcode0);
        }
    }

    public final void b(@m a j$a0) {
        this.a = j$a0;
    }

    @Override  // com.google.android.gms.vision.Tracker
    public void onNewItem(int v, Object object0) {
        this.a(v, ((Barcode)object0));
    }
}

