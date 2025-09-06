package com.dcinside.app.wv;

import java.util.HashSet;
import y4.m;

public final class k implements f {
    @m
    private HashSet a;
    private boolean b;

    public k() {
        this.a = new HashSet();
    }

    public final void a(@m f f0) {
        if(f0 == null) {
            return;
        }
        if(this.b) {
            f0.onDestroy();
            return;
        }
        HashSet hashSet0 = this.a;
        if(hashSet0 != null) {
            hashSet0.add(f0);
        }
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        HashSet hashSet0 = this.a;
        boolean z = false;
        if(hashSet0 == null) {
            return false;
        }
        for(Object object0: hashSet0) {
            z |= ((f)object0).g();
        }
        return z;
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.b = true;
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return;
        }
        for(Object object0: hashSet0) {
            ((f)object0).onDestroy();
        }
        hashSet0.clear();
        this.a = null;
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return;
        }
        for(Object object0: hashSet0) {
            ((f)object0).onPause();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return;
        }
        for(Object object0: hashSet0) {
            ((f)object0).onResume();
        }
    }
}

