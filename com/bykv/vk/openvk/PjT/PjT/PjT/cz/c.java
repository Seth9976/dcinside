package com.bykv.vk.openvk.PjT.PjT.PjT.cz;

import android.content.Context;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends a implements SurfaceHolder.Callback, d {
    private WeakReference a;
    private e b;
    private com.bykv.vk.openvk.PjT.PjT.PjT.cz.d.a c;
    private static final ArrayList d;

    static {
        c.d = new ArrayList();
    }

    public c(Context context0) {
        super(context0);
        this.b();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.d
    public void PjT(int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        viewGroup$LayoutParams0.height = v1;
        viewGroup$LayoutParams0.width = v;
        this.setLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.d
    public void a(b b0) {
        this.a = new WeakReference(b0);
        SurfaceHolder surfaceHolder0 = this.getHolder();
        surfaceHolder0.setFormat(-3);
        Iterator iterator0 = c.d.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            e e0 = (e)object0;
            if(e0 != null && e0.a() == null) {
                surfaceHolder0.removeCallback(e0);
                iterator0.remove();
            }
        }
        surfaceHolder0.addCallback(this.b);
    }

    private void b() {
        e e0 = new e(this);
        this.b = e0;
        c.d.add(e0);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.d
    public View getView() {
        return this;
    }

    @Override  // android.view.SurfaceView
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
    }

    public void setWindowVisibilityChangedListener(com.bykv.vk.openvk.PjT.PjT.PjT.cz.d.a d$a0) {
        this.c = d$a0;
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        if(this.a != null && this.a.get() != null) {
            ((b)this.a.get()).PjT(surfaceHolder0, v, v1, v2);
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder0) {
        if(this.a != null && this.a.get() != null) {
            ((b)this.a.get()).PjT(surfaceHolder0);
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        if(this.a != null && this.a.get() != null) {
            ((b)this.a.get()).Zh(surfaceHolder0);
        }
    }
}

