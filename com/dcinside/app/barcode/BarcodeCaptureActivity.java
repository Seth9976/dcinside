package com.dcinside.app.barcode;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.WindowMetrics;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.E0;
import androidx.core.view.F0;
import androidx.core.view.WindowInsetsControllerCompat;
import com.dcinside.app.Application;
import com.google.android.gms.vision.CameraSource.Builder;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.android.material.snackbar.Snackbar;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;

@s0({"SMAP\nBarcodeCaptureActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeCaptureActivity.kt\ncom/dcinside/app/barcode/BarcodeCaptureActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
public final class BarcodeCaptureActivity extends AppCompatActivity {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private CameraSource i;
    private CameraSourcePreview j;
    private GraphicOverlay k;
    private OrientationEventListener l;
    private k m;
    private int n;
    private boolean o;
    @l
    private final com.dcinside.app.barcode.j.a p;
    @l
    public static final a q = null;
    @l
    public static final String r = "EXTRA_BARCODE_VALUE";
    private static final int s = 1;
    private static final float t = 30.0f;
    private static final int u = 100;
    private static final int v = 200;

    static {
        BarcodeCaptureActivity.q = new a(null);
    }

    public BarcodeCaptureActivity() {
        public static final class b implements com.dcinside.app.barcode.j.a {
            final BarcodeCaptureActivity a;

            b(BarcodeCaptureActivity barcodeCaptureActivity0) {
                this.a = barcodeCaptureActivity0;
                super();
            }

            @Override  // com.dcinside.app.barcode.j$a
            public void a(int v, @m Barcode barcode0) {
                f f0 = () -> {
                    L.p(this.a, "this$0");
                    if(!this.a.o) {
                        this.a.o = true;
                        CameraSourcePreview cameraSourcePreview0 = this.a.j;
                        if(cameraSourcePreview0 == null) {
                            L.S("cameraSourcePreview");
                            cameraSourcePreview0 = null;
                        }
                        cameraSourcePreview0.g();
                        Object object0 = this.a.getSystemService("audio");
                        L.n(object0, "null cannot be cast to non-null type android.media.AudioManager");
                        if(((AudioManager)object0).getRingerMode() == 2) {
                            new ToneGenerator(3, 100).startTone(44, 200);
                        }
                        this.a.m1(barcode0);
                    }
                };
                this.a.runOnUiThread(f0);
            }

            // 检测为 Lambda 实现
            private static final void c(BarcodeCaptureActivity barcodeCaptureActivity0, Barcode barcode0) [...]
        }

        this.p = new b(this);
    }

    private final void l1() {
        V v0;
        if(Build.VERSION.SDK_INT >= 30) {
            WindowMetrics windowMetrics0 = this.getWindowManager().getCurrentWindowMetrics();
            L.o(windowMetrics0, "getCurrentWindowMetrics(...)");
            Rect rect0 = windowMetrics0.getBounds();
            L.o(rect0, "getBounds(...)");
            Insets insets0 = windowMetrics0.getWindowInsets().getInsets(E0.a() | F0.a());
            L.o(insets0, "getInsets(...)");
            v0 = r0.a(rect0.width(), ((int)(rect0.height() - insets0.top - insets0.bottom)));
        }
        else {
            Point point0 = new Point();
            this.getWindowManager().getDefaultDisplay().getSize(point0);
            v0 = r0.a(point0.x, point0.y);
        }
        int v1 = ((Number)v0.a()).intValue();
        int v2 = ((Number)v0.b()).intValue();
        if(v1 <= v2) {
            int v3 = v1;
            v1 = v2;
            v2 = v3;
        }
        PackageManager packageManager0 = this.getPackageManager();
        int v4 = packageManager0.hasSystemFeature("android.hardware.camera.any") || !packageManager0.hasSystemFeature("android.hardware.camera.front") ? 0 : 1;
        Context context0 = this.getApplicationContext();
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.Application");
        BarcodeDetector barcodeDetector0 = ((Application)context0).g();
        if(barcodeDetector0 == null) {
            return;
        }
        j j0 = new j();
        j0.b(this.p);
        barcodeDetector0.setProcessor(new h(barcodeDetector0, j0, ((boolean)(v4 ^ 1))));
        CameraSource cameraSource0 = new Builder(this.getApplicationContext(), barcodeDetector0).setFacing(v4).setAutoFocusEnabled(true).setRequestedPreviewSize(v1, v2).setRequestedFps(30.0f).build();
        L.m(cameraSource0);
        this.i = cameraSource0;
    }

    private final void m1(Barcode barcode0) {
        if(barcode0 == null) {
            return;
        }
        Intent intent0 = new Intent();
        intent0.putExtra("EXTRA_BARCODE_VALUE", barcode0.displayValue);
        this.setResult(-1, intent0);
        this.finish();
    }

    // 检测为 Lambda 实现
    private static final void n1(BarcodeCaptureActivity barcodeCaptureActivity0, DialogInterface dialogInterface0, int v) [...]

    private final void o1() {
        String[] arr_s = {"android.permission.CAMERA"};
        k k0 = this.m;
        k k1 = null;
        if(k0 == null) {
            L.S("permissionHandler");
            k0 = null;
        }
        if(!k0.c(this, "android.permission.CAMERA")) {
            k k2 = this.m;
            if(k2 == null) {
                L.S("permissionHandler");
            }
            else {
                k1 = k2;
            }
            k1.a(this, arr_s, 1);
            return;
        }
        d d0 = (View view0) -> {
            L.p(this, "this$0");
            L.p(arr_s, "$permissions");
            k k0 = this.m;
            if(k0 == null) {
                L.S("permissionHandler");
                k0 = null;
            }
            k0.a(this, arr_s, 1);
        };
        GraphicOverlay graphicOverlay0 = this.k;
        if(graphicOverlay0 == null) {
            L.S("graphicOverlay");
        }
        else {
            k1 = graphicOverlay0;
        }
        Snackbar.D0(((View)k1), 0x7F150147, -2).G0(0x7F15034A, d0).m0();  // string:barcode_permission_camera_rationale "바코드를 스캔하려면 카메라 권한이 필요합니다."
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = new WindowInsetsControllerCompat(this.getWindow(), this.getWindow().getDecorView());
        windowInsetsControllerCompat0.d(1);
        windowInsetsControllerCompat0.j(2);
        this.setContentView(0x7F0E0026);  // layout:activity_barcode_capture
        this.q1();
        this.r1();
        this.s1();
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void onDestroy() {
        CameraSourcePreview cameraSourcePreview0 = this.j;
        OrientationEventListener orientationEventListener0 = null;
        if(cameraSourcePreview0 == null) {
            L.S("cameraSourcePreview");
            cameraSourcePreview0 = null;
        }
        cameraSourcePreview0.d();
        OrientationEventListener orientationEventListener1 = this.l;
        if(orientationEventListener1 == null) {
            L.S("orientationEventListener");
        }
        else {
            orientationEventListener0 = orientationEventListener1;
        }
        orientationEventListener0.disable();
        super.onDestroy();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        CameraSourcePreview cameraSourcePreview0 = this.j;
        if(cameraSourcePreview0 == null) {
            L.S("cameraSourcePreview");
            cameraSourcePreview0 = null;
        }
        cameraSourcePreview0.g();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int v, @l String[] arr_s, @l int[] arr_v) {
        L.p(arr_s, "permissions");
        L.p(arr_v, "grantResults");
        if(v != 1) {
            super.onRequestPermissionsResult(v, arr_s, arr_v);
            return;
        }
        if(arr_v.length != 0 && arr_v[0] == 0) {
            this.l1();
            return;
        }
        new AlertDialog.Builder(this).setMessage(0x7F150146).setPositiveButton(0x7F15034A, (DialogInterface dialogInterface0, int v) -> {
            L.p(this, "this$0");
            this.finish();
        }).show();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onResume() {
        super.onResume();
        this.t1();
    }

    // 检测为 Lambda 实现
    private static final void p1(BarcodeCaptureActivity barcodeCaptureActivity0, String[] arr_s, View view0) [...]

    private final void q1() {
        int v1;
        int v = Build.VERSION.SDK_INT;
        com.dcinside.app.barcode.a a0 = v < 24 ? new com.dcinside.app.barcode.a() : new com.dcinside.app.barcode.l();
        this.m = a0;
        View view0 = this.findViewById(0x7F0B026D);  // id:camera_source_preview
        L.o(view0, "findViewById(...)");
        this.j = (CameraSourcePreview)view0;
        View view1 = this.findViewById(0x7F0B0555);  // id:graphic_overlay
        L.o(view1, "findViewById(...)");
        this.k = (GraphicOverlay)view1;
        if(v >= 30) {
            Display display0 = this.getDisplay();
            v1 = display0 == null ? 0 : display0.getRotation();
        }
        else {
            v1 = this.getWindowManager().getDefaultDisplay().getRotation();
        }
        this.n = v1;
    }

    private final void r1() {
        public static final class c extends OrientationEventListener {
            final BarcodeCaptureActivity a;

            c(BarcodeCaptureActivity barcodeCaptureActivity0) {
                this.a = barcodeCaptureActivity0;
                super(barcodeCaptureActivity0, 2);
            }

            @Override  // android.view.OrientationEventListener
            public void onOrientationChanged(int v) {
                int v1;
                if(v == -1) {
                    return;
                }
                if(Build.VERSION.SDK_INT >= 30) {
                    Display display0 = this.a.getDisplay();
                    v1 = display0 == null ? 0 : display0.getRotation();
                }
                else {
                    v1 = this.a.getWindowManager().getDefaultDisplay().getRotation();
                }
                if(this.a.n != v1) {
                    this.a.n = v1;
                    CameraSourcePreview cameraSourcePreview0 = this.a.j;
                    CameraSourcePreview cameraSourcePreview1 = null;
                    if(cameraSourcePreview0 == null) {
                        L.S("cameraSourcePreview");
                        cameraSourcePreview0 = null;
                    }
                    cameraSourcePreview0.g();
                    CameraSourcePreview cameraSourcePreview2 = this.a.j;
                    if(cameraSourcePreview2 == null) {
                        L.S("cameraSourcePreview");
                    }
                    else {
                        cameraSourcePreview1 = cameraSourcePreview2;
                    }
                    cameraSourcePreview1.d();
                    this.a.l1();
                    this.a.t1();
                }
            }
        }

        c barcodeCaptureActivity$c0 = new c(this);
        this.l = barcodeCaptureActivity$c0;
        OrientationEventListener orientationEventListener0 = null;
        if(barcodeCaptureActivity$c0.canDetectOrientation()) {
            OrientationEventListener orientationEventListener1 = this.l;
            if(orientationEventListener1 == null) {
                L.S("orientationEventListener");
            }
            else {
                orientationEventListener0 = orientationEventListener1;
            }
            orientationEventListener0.enable();
            return;
        }
        OrientationEventListener orientationEventListener2 = this.l;
        if(orientationEventListener2 == null) {
            L.S("orientationEventListener");
        }
        else {
            orientationEventListener0 = orientationEventListener2;
        }
        orientationEventListener0.disable();
    }

    private final void s1() {
        k k0 = this.m;
        if(k0 == null) {
            L.S("permissionHandler");
            k0 = null;
        }
        if(k0.b(this, "android.permission.CAMERA") == 0) {
            this.l1();
            return;
        }
        this.o1();
    }

    private final void t1() throws SecurityException {
        if(this.i != null) {
            CameraSourcePreview cameraSourcePreview0 = this.j;
            GraphicOverlay graphicOverlay0 = null;
            if(cameraSourcePreview0 == null) {
                L.S("cameraSourcePreview");
                cameraSourcePreview0 = null;
            }
            CameraSource cameraSource0 = this.i;
            if(cameraSource0 == null) {
                L.S("cameraSource");
                cameraSource0 = null;
            }
            GraphicOverlay graphicOverlay1 = this.k;
            if(graphicOverlay1 == null) {
                L.S("graphicOverlay");
            }
            else {
                graphicOverlay0 = graphicOverlay1;
            }
            cameraSourcePreview0.e(cameraSource0, graphicOverlay0);
        }
    }
}

