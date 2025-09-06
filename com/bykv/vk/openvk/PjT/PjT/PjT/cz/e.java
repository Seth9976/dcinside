package com.bykv.vk.openvk.PjT.PjT.PjT.cz;

import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

public class e implements SurfaceHolder.Callback {
    private final WeakReference a;

    public e(SurfaceHolder.Callback surfaceHolder$Callback0) {
        this.a = new WeakReference(surfaceHolder$Callback0);
    }

    public SurfaceHolder.Callback a() {
        return (SurfaceHolder.Callback)this.a.get();
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        SurfaceHolder.Callback surfaceHolder$Callback0 = (SurfaceHolder.Callback)this.a.get();
        if(surfaceHolder$Callback0 != null) {
            surfaceHolder$Callback0.surfaceChanged(surfaceHolder0, v, v1, v2);
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder0) {
        SurfaceHolder.Callback surfaceHolder$Callback0 = (SurfaceHolder.Callback)this.a.get();
        if(surfaceHolder$Callback0 != null) {
            surfaceHolder$Callback0.surfaceCreated(surfaceHolder0);
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        SurfaceHolder.Callback surfaceHolder$Callback0 = (SurfaceHolder.Callback)this.a.get();
        if(surfaceHolder$Callback0 != null) {
            surfaceHolder$Callback0.surfaceDestroyed(surfaceHolder0);
        }
    }
}

