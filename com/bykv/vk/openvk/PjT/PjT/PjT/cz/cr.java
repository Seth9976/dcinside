package com.bykv.vk.openvk.PjT.PjT.PjT.cz;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView.SurfaceTextureListener;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class cr extends TextureView implements TextureView.SurfaceTextureListener, d {
    private b a;
    private a b;

    public cr(Context context0) {
        this(context0, null);
    }

    public cr(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
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
        this.a = b0;
        this.setSurfaceTextureListener(this);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.d
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.d
    public View getView() {
        return this;
    }

    @Override  // android.view.TextureView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.TextureView
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        b b0 = this.a;
        if(b0 != null) {
            b0.PjT(surfaceTexture0, v, v1);
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        return this.a == null ? false : this.a.PjT(surfaceTexture0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
    }

    public void setWindowVisibilityChangedListener(a d$a0) {
        this.b = d$a0;
    }
}

