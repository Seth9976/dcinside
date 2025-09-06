package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Align;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import com.github.mikephil.charting.animation.a;
import com.github.mikephil.charting.animation.b.C;
import com.github.mikephil.charting.components.c;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.highlight.f;
import com.github.mikephil.charting.renderer.g;
import com.github.mikephil.charting.renderer.i;
import com.github.mikephil.charting.utils.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import s1.e;

public abstract class Chart extends ViewGroup implements e {
    static class b {
        static final int[] a;

        static {
            int[] arr_v = new int[Bitmap.CompressFormat.values().length];
            b.a = arr_v;
            try {
                arr_v[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected d[] A;
    protected float B;
    protected boolean C;
    protected com.github.mikephil.charting.components.d D;
    protected ArrayList E;
    private boolean F;
    public static final String G = "MPAndroidChart";
    public static final int H = 4;
    public static final int I = 7;
    public static final int J = 11;
    public static final int K = 13;
    public static final int L = 14;
    public static final int M = 18;
    protected boolean a;
    protected k b;
    protected boolean c;
    private boolean d;
    private float e;
    protected com.github.mikephil.charting.formatter.d f;
    protected Paint g;
    protected Paint h;
    protected j i;
    protected boolean j;
    protected c k;
    protected com.github.mikephil.charting.components.e l;
    protected com.github.mikephil.charting.listener.d m;
    protected com.github.mikephil.charting.listener.b n;
    private String o;
    private com.github.mikephil.charting.listener.c p;
    protected i q;
    protected g r;
    protected f s;
    protected l t;
    protected a u;
    private float v;
    private float w;
    private float x;
    private float y;
    private boolean z;

    public Chart(Context context0) {
        super(context0);
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new com.github.mikephil.charting.formatter.d(0);
        this.j = true;
        this.o = "No chart data available.";
        this.t = new l();
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList();
        this.F = false;
        this.H();
    }

    public Chart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new com.github.mikephil.charting.formatter.d(0);
        this.j = true;
        this.o = "No chart data available.";
        this.t = new l();
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList();
        this.F = false;
        this.H();
    }

    public Chart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new com.github.mikephil.charting.formatter.d(0);
        this.j = true;
        this.o = "No chart data available.";
        this.t = new l();
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList();
        this.F = false;
        this.H();
    }

    public void A(float f, float f1, int v) {
        this.B(f, f1, v, true);
    }

    public void B(float f, float f1, int v, boolean z) {
        if(v >= 0 && v < this.b.m()) {
            this.F(new d(f, f1, v), z);
            return;
        }
        this.F(null, z);
    }

    public void C(float f, int v) {
        this.D(f, v, true);
    }

    public void D(float f, int v, boolean z) {
        this.B(f, NaNf, v, z);
    }

    public void E(d d0) {
        this.F(d0, false);
    }

    public void F(d d0, boolean z) {
        Entry entry0 = null;
        if(d0 == null) {
            this.A = null;
        }
        else {
            if(this.a) {
                Log.i("MPAndroidChart", "Highlighted: " + d0.toString());
            }
            Entry entry1 = this.b.s(d0);
            if(entry1 == null) {
                this.A = null;
                d0 = null;
            }
            else {
                this.A = new d[]{d0};
            }
            entry0 = entry1;
        }
        this.setLastHighlighted(this.A);
        if(z && this.m != null) {
            if(this.Y()) {
                this.m.a(entry0, d0);
            }
            else {
                this.m.b();
            }
        }
        this.invalidate();
    }

    public void G(d[] arr_d) {
        this.A = arr_d;
        this.setLastHighlighted(arr_d);
        this.invalidate();
    }

    protected void H() {
        class com.github.mikephil.charting.charts.Chart.a implements ValueAnimator.AnimatorUpdateListener {
            final Chart a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                Chart.this.postInvalidate();
            }
        }

        this.setWillNotDraw(false);
        this.u = new a(new com.github.mikephil.charting.charts.Chart.a(this));
        com.github.mikephil.charting.utils.k.H(this.getContext());
        this.B = com.github.mikephil.charting.utils.k.e(500.0f);
        this.k = new c();
        com.github.mikephil.charting.components.e e0 = new com.github.mikephil.charting.components.e();
        this.l = e0;
        this.q = new i(this.t, e0);
        this.i = new j();
        this.g = new Paint(1);
        Paint paint0 = new Paint(1);
        this.h = paint0;
        paint0.setColor(Color.rgb(0xF7, 0xBD, 51));
        this.h.setTextAlign(Paint.Align.CENTER);
        this.h.setTextSize(com.github.mikephil.charting.utils.k.e(12.0f));
        if(this.a) {
            Log.i("", "Chart.init()");
        }
    }

    public boolean I() {
        return this.d;
    }

    @Deprecated
    public boolean J() {
        return this.K();
    }

    public boolean K() {
        return this.C;
    }

    public boolean L() {
        return this.b == null ? true : this.b.r() <= 0;
    }

    public boolean M() {
        return this.c;
    }

    public boolean N() {
        return this.a;
    }

    public abstract void O();

    public void P(Runnable runnable0) {
        this.E.remove(runnable0);
    }

    public boolean Q(String s) {
        return this.S(s, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, 40);
    }

    public boolean R(String s, int v) {
        return this.S(s, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, v);
    }

    public boolean S(String s, String s1, String s2, Bitmap.CompressFormat bitmap$CompressFormat0, int v) {
        if(v < 0 || v > 100) {
            v = 50;
        }
        long v1 = System.currentTimeMillis();
        File file0 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/" + s1);
        if(!file0.exists() && !file0.mkdirs()) {
            return false;
        }
        switch(b.a[bitmap$CompressFormat0.ordinal()]) {
            case 1: {
                if(!s.endsWith(".png")) {
                    s = s + ".png";
                }
                break;
            }
            case 2: {
                if(!s.endsWith(".webp")) {
                    s = s + ".webp";
                }
                break;
            }
            default: {
                if(!s.endsWith(".jpg") && !s.endsWith(".jpeg")) {
                    s = s + ".jpg";
                }
            }
        }
        String s3 = file0.getAbsolutePath() + "/" + s;
        try {
            FileOutputStream fileOutputStream0 = new FileOutputStream(s3);
            this.getChartBitmap().compress(bitmap$CompressFormat0, v, fileOutputStream0);
            fileOutputStream0.flush();
            fileOutputStream0.close();
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return false;
        }
        long v2 = new File(s3).length();
        ContentValues contentValues0 = new ContentValues(8);
        contentValues0.put("title", s);
        contentValues0.put("_display_name", s);
        contentValues0.put("date_added", v1);
        contentValues0.put("mime_type", "image/png");
        contentValues0.put("description", s2);
        contentValues0.put("orientation", 0);
        contentValues0.put("_data", s3);
        contentValues0.put("_size", v2);
        return this.getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues0) != null;
    }

    public boolean T(String s, String s1) {
        Bitmap bitmap0 = this.getChartBitmap();
        try {
            FileOutputStream fileOutputStream0 = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + s1 + "/" + s + ".png");
            bitmap0.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream0);
            fileOutputStream0.close();
            return true;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return false;
        }
    }

    public void U(float f, float f1, float f2, float f3) {
        this.setExtraLeftOffset(f);
        this.setExtraTopOffset(f1);
        this.setExtraRightOffset(f2);
        this.setExtraBottomOffset(f3);
    }

    public void V(Paint paint0, int v) {
        switch(v) {
            case 7: {
                this.h = paint0;
                return;
            }
            case 11: {
                this.g = paint0;
            }
        }
    }

    protected void W(float f, float f1) {
        float f2 = this.b == null || this.b.r() < 2 ? Math.max(Math.abs(f), Math.abs(f1)) : Math.abs(f1 - f);
        this.f.m(com.github.mikephil.charting.utils.k.r(f2));
    }

    private void X(View view0) {
        if(view0.getBackground() != null) {
            view0.getBackground().setCallback(null);
        }
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                this.X(((ViewGroup)view0).getChildAt(v));
            }
            ((ViewGroup)view0).removeAllViews();
        }
    }

    public boolean Y() {
        return this.A != null && this.A.length > 0 && this.A[0] != null;
    }

    public void g(Runnable runnable0) {
        if(this.t.B()) {
            this.post(runnable0);
            return;
        }
        this.E.add(runnable0);
    }

    public a getAnimator() {
        return this.u;
    }

    public com.github.mikephil.charting.utils.g getCenter() {
        return com.github.mikephil.charting.utils.g.c(((float)this.getWidth()) / 2.0f, ((float)this.getHeight()) / 2.0f);
    }

    @Override  // s1.e
    public com.github.mikephil.charting.utils.g getCenterOfView() {
        return this.getCenter();
    }

    @Override  // s1.e
    public com.github.mikephil.charting.utils.g getCenterOffsets() {
        return this.t.p();
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmap0 = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas0 = new Canvas(bitmap0);
        Drawable drawable0 = this.getBackground();
        if(drawable0 == null) {
            canvas0.drawColor(-1);
        }
        else {
            drawable0.draw(canvas0);
        }
        this.draw(canvas0);
        return bitmap0;
    }

    @Override  // s1.e
    public RectF getContentRect() {
        return this.t.q();
    }

    @Override  // s1.e
    public k getData() {
        return this.b;
    }

    @Override  // s1.e
    public com.github.mikephil.charting.formatter.l getDefaultValueFormatter() {
        return this.f;
    }

    public c getDescription() {
        return this.k;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.e;
    }

    public float getExtraBottomOffset() {
        return this.x;
    }

    public float getExtraLeftOffset() {
        return this.y;
    }

    public float getExtraRightOffset() {
        return this.w;
    }

    public float getExtraTopOffset() {
        return this.v;
    }

    public d[] getHighlighted() {
        return this.A;
    }

    public f getHighlighter() {
        return this.s;
    }

    public ArrayList getJobs() {
        return this.E;
    }

    public com.github.mikephil.charting.components.e getLegend() {
        return this.l;
    }

    public i getLegendRenderer() {
        return this.q;
    }

    public com.github.mikephil.charting.components.d getMarker() {
        return this.D;
    }

    @Deprecated
    public com.github.mikephil.charting.components.d getMarkerView() {
        return this.getMarker();
    }

    @Override  // s1.e
    public float getMaxHighlightDistance() {
        return this.B;
    }

    public com.github.mikephil.charting.listener.c getOnChartGestureListener() {
        return this.p;
    }

    public com.github.mikephil.charting.listener.b getOnTouchListener() {
        return this.n;
    }

    public g getRenderer() {
        return this.r;
    }

    public l getViewPortHandler() {
        return this.t;
    }

    public j getXAxis() {
        return this.i;
    }

    @Override  // s1.e
    public float getXChartMax() {
        return this.i.G;
    }

    @Override  // s1.e
    public float getXChartMin() {
        return this.i.H;
    }

    @Override  // s1.e
    public float getXRange() {
        return this.i.I;
    }

    public float getYMax() {
        return this.b.z();
    }

    public float getYMin() {
        return this.b.B();
    }

    @RequiresApi(11)
    public void h(int v) {
        this.u.a(v);
    }

    @RequiresApi(11)
    public void i(int v, C b$C0) {
        this.u.b(v, b$C0);
    }

    @RequiresApi(11)
    public void j(int v, int v1) {
        this.u.c(v, v1);
    }

    @RequiresApi(11)
    public void k(int v, int v1, C b$C0) {
        this.u.d(v, v1, b$C0);
    }

    @RequiresApi(11)
    public void l(int v, int v1, C b$C0, C b$C1) {
        this.u.e(v, v1, b$C0, b$C1);
    }

    @RequiresApi(11)
    public void m(int v) {
        this.u.f(v);
    }

    @RequiresApi(11)
    public void n(int v, C b$C0) {
        this.u.g(v, b$C0);
    }

    protected abstract void o();

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.F) {
            this.X(this);
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        if(this.b == null) {
            if(!TextUtils.isEmpty(this.o)) {
                com.github.mikephil.charting.utils.g g0 = this.getCenter();
                canvas0.drawText(this.o, g0.c, g0.d, this.h);
            }
            return;
        }
        if(!this.z) {
            this.p();
            this.z = true;
        }
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        for(int v4 = 0; v4 < this.getChildCount(); ++v4) {
            this.getChildAt(v4).layout(v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = (int)com.github.mikephil.charting.utils.k.e(50.0f);
        this.setMeasuredDimension(Math.max(this.getSuggestedMinimumWidth(), View.resolveSize(v2, v)), Math.max(this.getSuggestedMinimumHeight(), View.resolveSize(v2, v1)));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        if(this.a) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if(v > 0 && v1 > 0 && v < 10000 && v1 < 10000) {
            if(this.a) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + v + ", height: " + v1);
            }
            this.t.V(((float)v), ((float)v1));
        }
        else if(this.a) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + v + ", height: " + v1);
        }
        this.O();
        for(Object object0: this.E) {
            this.post(((Runnable)object0));
        }
        this.E.clear();
        super.onSizeChanged(v, v1, v2, v3);
    }

    protected abstract void p();

    public void q() {
        this.b = null;
        this.z = false;
        this.A = null;
        this.n.f(null);
        this.invalidate();
    }

    public void r() {
        this.E.clear();
    }

    public void s() {
        this.b.h();
        this.invalidate();
    }

    public void setData(k k0) {
        this.b = k0;
        this.z = false;
        if(k0 == null) {
            return;
        }
        this.W(k0.B(), k0.z());
        for(Object object0: this.b.q()) {
            t1.e e0 = (t1.e)object0;
            if(e0.b1() || e0.t0() == this.f) {
                e0.V(this.f);
            }
        }
        this.O();
        if(this.a) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(c c0) {
        this.k = c0;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.d = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f >= 1.0f) {
            f = 0.999f;
        }
        this.e = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        this.setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.C = z;
    }

    public void setExtraBottomOffset(float f) {
        this.x = com.github.mikephil.charting.utils.k.e(f);
    }

    public void setExtraLeftOffset(float f) {
        this.y = com.github.mikephil.charting.utils.k.e(f);
    }

    public void setExtraRightOffset(float f) {
        this.w = com.github.mikephil.charting.utils.k.e(f);
    }

    public void setExtraTopOffset(float f) {
        this.v = com.github.mikephil.charting.utils.k.e(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if(z) {
            this.setLayerType(2, null);
            return;
        }
        this.setLayerType(1, null);
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.c = z;
    }

    public void setHighlighter(com.github.mikephil.charting.highlight.b b0) {
        this.s = b0;
    }

    protected void setLastHighlighted(d[] arr_d) {
        if(arr_d != null && arr_d.length > 0) {
            d d0 = arr_d[0];
            if(d0 != null) {
                this.n.f(d0);
                return;
            }
        }
        this.n.f(null);
    }

    public void setLogEnabled(boolean z) {
        this.a = z;
    }

    public void setMarker(com.github.mikephil.charting.components.d d0) {
        this.D = d0;
    }

    @Deprecated
    public void setMarkerView(com.github.mikephil.charting.components.d d0) {
        this.setMarker(d0);
    }

    public void setMaxHighlightDistance(float f) {
        this.B = com.github.mikephil.charting.utils.k.e(f);
    }

    public void setNoDataText(String s) {
        this.o = s;
    }

    public void setNoDataTextColor(int v) {
        this.h.setColor(v);
    }

    public void setNoDataTextTypeface(Typeface typeface0) {
        this.h.setTypeface(typeface0);
    }

    public void setOnChartGestureListener(com.github.mikephil.charting.listener.c c0) {
        this.p = c0;
    }

    public void setOnChartValueSelectedListener(com.github.mikephil.charting.listener.d d0) {
        this.m = d0;
    }

    public void setOnTouchListener(com.github.mikephil.charting.listener.b b0) {
        this.n = b0;
    }

    public void setRenderer(g g0) {
        if(g0 != null) {
            this.r = g0;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.j = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.F = z;
    }

    public void t() {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
    }

    protected void u(Canvas canvas0) {
        float f1;
        float f;
        if(this.k != null && this.k.f()) {
            com.github.mikephil.charting.utils.g g0 = this.k.m();
            this.g.setTypeface(this.k.c());
            this.g.setTextSize(this.k.b());
            this.g.setColor(this.k.a());
            this.g.setTextAlign(this.k.o());
            if(g0 == null) {
                f = ((float)this.getWidth()) - this.t.Q() - this.k.d();
                f1 = ((float)this.getHeight()) - this.t.O() - this.k.e();
            }
            else {
                f1 = g0.d;
                f = g0.c;
            }
            canvas0.drawText("Description Label", f, f1, this.g);
        }
    }

    protected void v(Canvas canvas0) {
        if(this.D != null && this.K() && this.Y()) {
            for(int v = 0; true; ++v) {
                d[] arr_d = this.A;
                if(v >= arr_d.length) {
                    break;
                }
                d d0 = arr_d[v];
                t1.e e0 = this.b.k(d0.d());
                Entry entry0 = this.b.s(this.A[v]);
                if(entry0 != null && ((float)e0.e(entry0)) <= ((float)e0.N()) * this.u.h()) {
                    float[] arr_f = this.y(d0);
                    if(this.t.G(arr_f[0], arr_f[1])) {
                        this.D.b(entry0, d0);
                        this.D.a(canvas0, arr_f[0], arr_f[1]);
                    }
                }
            }
        }
    }

    public void w() {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(false);
        }
    }

    public d x(float f, float f1) {
        if(this.b == null) {
            Log.e("MPAndroidChart", "Can\'t select by touch. No data set.");
            return null;
        }
        return this.getHighlighter().a(f, f1);
    }

    protected float[] y(d d0) {
        return new float[]{d0.e(), d0.f()};
    }

    public Paint z(int v) {
        switch(v) {
            case 7: {
                return this.h;
            }
            case 11: {
                return this.g;
            }
            default: {
                return null;
            }
        }
    }
}

