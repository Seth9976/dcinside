package com.dcinside.app.barcode;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.annotation.RequiresPermission;
import com.dcinside.app.internal.t;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.vision.CameraSource;
import java.io.IOException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class CameraSourcePreview extends ViewGroup {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @s0({"SMAP\nCameraSourcePreview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraSourcePreview.kt\ncom/dcinside/app/barcode/CameraSourcePreview$SurfaceCallback\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,207:1\n147#2:208\n*S KotlinDebug\n*F\n+ 1 CameraSourcePreview.kt\ncom/dcinside/app/barcode/CameraSourcePreview$SurfaceCallback\n*L\n177#1:208\n*E\n"})
    static final class b implements SurfaceHolder.Callback {
        @l
        private final t a;

        public b(@l CameraSourcePreview cameraSourcePreview0) {
            L.p(cameraSourcePreview0, "view");
            super();
            this.a = new t(cameraSourcePreview0);
        }

        @Override  // android.view.SurfaceHolder$Callback
        public void surfaceChanged(@l SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
            L.p(surfaceHolder0, "holder");
            CameraSourcePreview cameraSourcePreview0 = (CameraSourcePreview)this.a.a();
            if(cameraSourcePreview0 == null) {
                return;
            }
            cameraSourcePreview0.c = true;
        }

        @Override  // android.view.SurfaceHolder$Callback
        public void surfaceCreated(@l SurfaceHolder surfaceHolder0) {
            L.p(surfaceHolder0, "holder");
            CameraSourcePreview cameraSourcePreview0 = (CameraSourcePreview)this.a.a();
            if(cameraSourcePreview0 == null) {
                return;
            }
            cameraSourcePreview0.c = true;
            cameraSourcePreview0.h();
        }

        @Override  // android.view.SurfaceHolder$Callback
        public void surfaceDestroyed(@l SurfaceHolder surfaceHolder0) {
            L.p(surfaceHolder0, "holder");
            CameraSourcePreview cameraSourcePreview0 = (CameraSourcePreview)this.a.a();
            if(cameraSourcePreview0 == null) {
                return;
            }
            cameraSourcePreview0.c = false;
        }
    }

    @l
    private final SurfaceView a;
    private boolean b;
    private boolean c;
    @m
    private CameraSource d;
    @m
    private GraphicOverlay e;
    @l
    public static final a f = null;
    private static final int g = 0xF0;
    private static final int h = 320;

    static {
        CameraSourcePreview.f = new a(null);
    }

    public CameraSourcePreview(@m Context context0, @m AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        SurfaceView surfaceView0 = new SurfaceView(context0);
        this.a = surfaceView0;
        surfaceView0.getHolder().addCallback(new b(this));
        this.addView(surfaceView0);
    }

    private final boolean c() {
        return this.getContext().getResources().getConfiguration().orientation == 1;
    }

    public final void d() {
        CameraSource cameraSource0 = this.d;
        if(cameraSource0 != null) {
            L.m(cameraSource0);
            cameraSource0.release();
            this.d = null;
        }
    }

    public final void e(@m CameraSource cameraSource0, @m GraphicOverlay graphicOverlay0) {
        try {
            this.e = graphicOverlay0;
            if(cameraSource0 != null) {
                this.d = cameraSource0;
                this.b = true;
                this.f();
                return;
            }
            this.d();
            return;
        }
        catch(SecurityException securityException0) {
        }
        timber.log.b.a.x("SecurityException!: " + securityException0.getMessage(), new Object[0]);
    }

    @RequiresPermission("android.permission.CAMERA")
    private final void f() {
        if(this.b && this.c) {
            try {
                CameraSource cameraSource0 = this.d;
                L.m(cameraSource0);
                cameraSource0.start(this.a.getHolder());
                this.requestLayout();
            }
            catch(IOException unused_ex) {
                timber.log.b.a.x("Could not start camera source", new Object[0]);
                this.d();
            }
            catch(SecurityException unused_ex) {
                timber.log.b.a.x("Do not have permission to start the camera", new Object[0]);
            }
            catch(RuntimeException runtimeException0) {
                timber.log.b.a.x("Runtime Exception! " + runtimeException0.getMessage(), new Object[0]);
            }
            GraphicOverlay graphicOverlay0 = this.e;
            L.m(graphicOverlay0);
            graphicOverlay0.a();
            this.b = false;
        }
    }

    public final void g() {
        CameraSource cameraSource0 = this.d;
        if(cameraSource0 != null) {
            L.m(cameraSource0);
            cameraSource0.stop();
        }
    }

    private final void h() {
        try {
            this.f();
        }
        catch(SecurityException unused_ex) {
            timber.log.b.a.x("Do not have permission to start the camera", new Object[0]);
        }
    }

    @Override  // android.view.ViewGroup
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v5;
        int v4;
        CameraSource cameraSource0 = this.d;
        if(cameraSource0 == null) {
            v4 = 0xF0;
            v5 = 320;
        }
        else {
            L.m(cameraSource0);
            Size size0 = cameraSource0.getPreviewSize();
            if(size0 == null) {
                v4 = 0xF0;
                v5 = 320;
            }
            else {
                v4 = size0.getWidth();
                v5 = size0.getHeight();
            }
        }
        if(!this.c()) {
            int v6 = v4;
            v4 = v5;
            v5 = v6;
        }
        g.d(new Size(v5, v4));
        int v7 = v2 - v;
        int v8 = v3 - v1;
        if(this.c()) {
            int v9 = (int)(((double)v7) / ((double)v5) * ((double)v4));
            int v10 = (v8 - v9) / 2;
            int v11 = this.getChildCount();
            for(int v12 = 0; v12 < v11; ++v12) {
                this.getChildAt(v12).layout(0, v10, v7, v9 + v10);
            }
        }
        else {
            int v13 = (int)(((double)v8) / ((double)v4) * ((double)v5));
            int v14 = (v7 - v13) / 2;
            int v15 = this.getChildCount();
            for(int v16 = 0; v16 < v15; ++v16) {
                this.getChildAt(v16).layout(v14, 0, v13 + v14, v8);
            }
        }
        this.h();
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            this.getChildAt(v3).measure(v, v1);
        }
    }
}

