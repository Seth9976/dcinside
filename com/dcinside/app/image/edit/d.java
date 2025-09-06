package com.dcinside.app.image.edit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import com.dcinside.app.internal.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.O;

public class d implements a {
    static class com.dcinside.app.image.edit.d.d {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            com.dcinside.app.image.edit.d.d.a = arr_v;
            try {
                arr_v[b.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.dcinside.app.image.edit.d.d.a[b.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.dcinside.app.image.edit.d.d.a[b.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static class e {
        private Context a;
        private ImageEditorView b;
        private ImageView c;
        private View d;
        private BrushDrawingView e;
        private Typeface f;
        private Typeface g;
        private boolean h;

        public e(Context context0, ImageEditorView imageEditorView0) {
            this.h = true;
            this.a = context0;
            this.b = imageEditorView0;
            this.c = imageEditorView0.getSource();
            this.e = imageEditorView0.getBrushDrawingView();
        }

        public d i() {
            return new d(this, null);
        }

        public e j(Typeface typeface0) {
            this.g = typeface0;
            return this;
        }

        public e k(Typeface typeface0) {
            this.f = typeface0;
            return this;
        }

        e l(View view0) {
            this.d = view0;
            return this;
        }

        public e m(boolean z) {
            this.h = z;
            return this;
        }
    }

    public interface f {
        void a(Bitmap arg1);

        void onFailure(Exception arg1);
    }

    public interface g {
        void onFailure(@NonNull Exception arg1);

        void onSuccess(@NonNull String arg1);
    }

    private final LayoutInflater a;
    private ImageEditorView b;
    private ImageView c;
    private View d;
    private BrushDrawingView e;
    private List f;
    private List g;
    private t h;
    private boolean i;
    private Typeface j;
    private Typeface k;

    private d(e d$e0) {
        this.b = d$e0.b;
        this.c = d$e0.c;
        this.d = d$e0.d;
        this.e = d$e0.e;
        this.i = d$e0.h;
        this.j = d$e0.f;
        this.k = d$e0.g;
        this.a = (LayoutInflater)d$e0.a.getSystemService("layout_inflater");
        this.e.setBrushViewChangeListener(this);
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    d(e d$e0, com.dcinside.app.image.edit.e e0) {
        this(d$e0);
    }

    @NonNull
    private com.dcinside.app.image.edit.f A() {
        View view0 = this.d;
        ImageView imageView0 = this.c;
        boolean z = this.i;
        return this.h == null ? new com.dcinside.app.image.edit.f(view0, imageView0, z, null) : new com.dcinside.app.image.edit.f(view0, imageView0, z, ((h)this.h.a()));
    }

    public ImageEditorView B() {
        return this.b;
    }

    public boolean C() {
        return this.g.size() != 0;
    }

    public boolean D() {
        return this.f.size() != 0;
    }

    public boolean E() {
        return this.f.size() == 0 && this.g.size() == 0;
    }

    // 检测为 Lambda 实现
    private void F(View view0, b b0, View view1) [...]

    public boolean G() {
        if(this.g.size() > 0) {
            View view0 = (View)this.g.get(this.g.size() - 1);
            if(view0 instanceof BrushDrawingView) {
                return this.e != null && this.e.c();
            }
            this.g.remove(this.g.size() - 1);
            this.b.addView(view0);
            this.f.add(view0);
            Object object0 = view0.getTag();
            t t0 = this.h;
            if(t0 != null) {
                h h0 = (h)t0.a();
                if(h0 != null) {
                    h0.j(((b)object0), this.f.size());
                }
            }
        }
        return this.C();
    }

    public static Bitmap H(Bitmap bitmap0) {
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int[] arr_v = new int[bitmap0.getWidth() * bitmap0.getHeight()];
        bitmap0.getPixels(arr_v, 0, bitmap0.getWidth(), 0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        int v2 = 0;
        int v3 = 0;
    alab1:
        while(true) {
            if(v3 >= bitmap0.getWidth()) {
                v3 = 0;
                break;
            }
            for(int v4 = 0; v4 < bitmap0.getHeight(); ++v4) {
                if(arr_v[bitmap0.getWidth() * v4 + v3] != 0) {
                    break alab1;
                }
            }
            ++v3;
        }
    alab2:
        for(int v5 = 0; v5 < bitmap0.getHeight(); ++v5) {
            for(int v6 = v3; v6 < bitmap0.getHeight(); ++v6) {
                if(arr_v[bitmap0.getWidth() * v5 + v6] != 0) {
                    v2 = v5;
                    break alab2;
                }
            }
        }
        int v7 = bitmap0.getWidth() - 1;
    alab3:
        while(v7 >= v3) {
            for(int v8 = bitmap0.getHeight() - 1; v8 >= v2; --v8) {
                if(arr_v[bitmap0.getWidth() * v8 + v7] != 0) {
                    v = v7;
                    break alab3;
                }
            }
            --v7;
        }
        for(int v9 = bitmap0.getHeight() - 1; v9 >= v2; --v9) {
            for(int v10 = bitmap0.getWidth() - 1; v10 >= v3; --v10) {
                if(arr_v[bitmap0.getWidth() * v9 + v10] != 0) {
                    return Bitmap.createBitmap(bitmap0, v3, v2, v - v3, v9 - v2);
                }
            }
        }
        return Bitmap.createBitmap(bitmap0, v3, v2, v - v3, v1 - v2);
    }

    public void I(@NonNull O o0, @NonNull String s, @NonNull j j0, @NonNull g d$g0) {
        WeakReference weakReference0 = new WeakReference(this);
        WeakReference weakReference1 = new WeakReference(d$g0);
        if(this.b.getSource().getDrawable() instanceof BitmapDrawable) {
            i.a(o0, weakReference0, s, j0, weakReference1);
            return;
        }
        g d$g1 = (g)weakReference1.get();
        if(d$g1 != null) {
            d$g1.onFailure(new NullPointerException("image is null."));
        }
    }

    public void J(@ColorInt int v) {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.setBrushColor(v);
        }
    }

    public void K(boolean z) {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.setBrushDrawingMode(z);
        }
    }

    void L(@ColorInt int v) {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.setBrushEraserColor(v);
        }
    }

    public void M(float f) {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.setBrushEraserSize(f);
        }
    }

    public void N(float f) {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.setBrushSize(f);
        }
    }

    public void O(@NonNull h h0) {
        this.h = new t(h0);
    }

    public void P(@IntRange(from = 0L, to = 100L) int v) {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.setOpacity(((int)(((double)v) / 100.0 * 255.0)));
        }
    }

    public boolean Q() {
        if(this.f.size() > 0) {
            View view0 = (View)this.f.get(this.f.size() - 1);
            if(view0 instanceof BrushDrawingView) {
                return this.e != null && this.e.i();
            }
            this.f.remove(this.f.size() - 1);
            this.b.removeView(view0);
            this.g.add(view0);
            t t0 = this.h;
            if(t0 != null) {
                h h0 = (h)t0.a();
                if(h0 != null) {
                    Object object0 = view0.getTag();
                    if(object0 instanceof b) {
                        h0.N(((b)object0), this.f.size());
                    }
                }
            }
        }
        return this.D();
    }

    private void R(View view0, b b0) {
        if(this.f.size() > 0 && this.f.contains(view0)) {
            this.b.removeView(view0);
            this.f.remove(view0);
            this.g.add(view0);
            t t0 = this.h;
            if(t0 != null) {
                h h0 = (h)t0.a();
                if(h0 != null) {
                    h0.N(b0, this.f.size());
                }
            }
        }
    }

    @Override  // com.dcinside.app.image.edit.BrushDrawingView$a
    public void a() {
        t t0 = this.h;
        if(t0 != null) {
            h h0 = (h)t0.a();
            if(h0 != null) {
                h0.I(b.a);
            }
        }
    }

    @Override  // com.dcinside.app.image.edit.BrushDrawingView$a
    public void b(BrushDrawingView brushDrawingView0) {
        if(this.g.size() > 0) {
            this.g.remove(this.g.size() - 1);
        }
        this.f.add(brushDrawingView0);
        t t0 = this.h;
        if(t0 != null) {
            h h0 = (h)t0.a();
            if(h0 != null) {
                h0.j(b.a, this.f.size());
            }
        }
    }

    @Override  // com.dcinside.app.image.edit.BrushDrawingView$a
    public void c(BrushDrawingView brushDrawingView0) {
        if(this.f.size() > 0) {
            View view0 = (View)this.f.remove(this.f.size() - 1);
            if(!(view0 instanceof BrushDrawingView)) {
                this.b.removeView(view0);
            }
            this.g.add(view0);
        }
        t t0 = this.h;
        if(t0 != null) {
            h h0 = (h)t0.a();
            if(h0 != null) {
                h0.N(b.a, this.f.size());
            }
        }
    }

    @Override  // com.dcinside.app.image.edit.BrushDrawingView$a
    public void d() {
        t t0 = this.h;
        if(t0 != null) {
            h h0 = (h)t0.a();
            if(h0 != null) {
                h0.P(b.a);
            }
        }
    }

    public void g(Typeface typeface0, String s) {
        class c implements com.dcinside.app.image.edit.f.b {
            final FrameLayout a;
            final ImageView b;
            final d c;

            c(FrameLayout frameLayout0, ImageView imageView0) {
                this.a = frameLayout0;
                this.b = imageView0;
                super();
            }

            @Override  // com.dcinside.app.image.edit.f$b
            public void a() {
            }

            @Override  // com.dcinside.app.image.edit.f$b
            public void onClick() {
                d.this.q();
                this.a.setBackgroundResource(0x7F0805AC);  // drawable:rounded_border_tv
                this.b.setVisibility(0);
                this.a.setTag(Boolean.TRUE);
            }
        }

        this.e.setBrushDrawingMode(false);
        b b0 = b.d;
        View view0 = this.z(b0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0FEC);  // id:tvPhotoEditorText
        FrameLayout frameLayout0 = (FrameLayout)view0.findViewById(0x7F0B04C1);  // id:frmBorder
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B062B);  // id:imgPhotoEditorClose
        if(typeface0 != null) {
            textView0.setTypeface(typeface0);
        }
        textView0.setTextSize(56.0f);
        textView0.setText(s);
        com.dcinside.app.image.edit.f f0 = this.A();
        f0.k(new c(this, frameLayout0, imageView0));
        view0.setOnTouchListener(f0);
        this.l(view0, b0);
    }

    public void h(String s) {
        this.g(null, s);
    }

    public void i(Bitmap bitmap0) {
        class com.dcinside.app.image.edit.d.a implements com.dcinside.app.image.edit.f.b {
            final FrameLayout a;
            final ImageView b;
            final d c;

            com.dcinside.app.image.edit.d.a(FrameLayout frameLayout0, ImageView imageView0) {
                this.a = frameLayout0;
                this.b = imageView0;
                super();
            }

            @Override  // com.dcinside.app.image.edit.f$b
            public void a() {
            }

            @Override  // com.dcinside.app.image.edit.f$b
            public void onClick() {
                d.this.q();
                this.a.setBackgroundResource(0x7F0805AC);  // drawable:rounded_border_tv
                this.b.setVisibility(0);
                this.a.setTag(Boolean.TRUE);
            }
        }

        View view0 = this.z(b.c);
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B062C);  // id:imgPhotoEditorImage
        FrameLayout frameLayout0 = (FrameLayout)view0.findViewById(0x7F0B04C1);  // id:frmBorder
        ImageView imageView1 = (ImageView)view0.findViewById(0x7F0B062B);  // id:imgPhotoEditorClose
        imageView0.setImageBitmap(bitmap0);
        com.dcinside.app.image.edit.f f0 = this.A();
        f0.k(new com.dcinside.app.image.edit.d.a(this, frameLayout0, imageView1));
        view0.setOnTouchListener(f0);
        this.l(view0, b.c);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void j(@Nullable Typeface typeface0, String s, int v) {
        class com.dcinside.app.image.edit.d.b implements com.dcinside.app.image.edit.f.b {
            final FrameLayout a;
            final ImageView b;
            final TextView c;
            final View d;
            final d e;

            com.dcinside.app.image.edit.d.b(FrameLayout frameLayout0, ImageView imageView0, TextView textView0, View view0) {
                this.a = frameLayout0;
                this.b = imageView0;
                this.c = textView0;
                this.d = view0;
                super();
            }

            @Override  // com.dcinside.app.image.edit.f$b
            public void a() {
            }

            @Override  // com.dcinside.app.image.edit.f$b
            public void onClick() {
                d.this.q();
                this.a.setBackgroundResource(0x7F0805AC);  // drawable:rounded_border_tv
                this.b.setVisibility(0);
                this.a.setTag(Boolean.TRUE);
                String s = this.c.getText().toString();
                int v = this.c.getCurrentTextColor();
                if(d.this.h != null) {
                    h h0 = (h)d.this.h.a();
                    if(h0 != null) {
                        h0.f(this.d, s, v);
                    }
                }
            }
        }

        this.e.setBrushDrawingMode(false);
        b b0 = b.b;
        View view0 = this.z(b0);
        View view1 = view0.findViewById(0x7F0B0FEC);  // id:tvPhotoEditorText
        View view2 = view0.findViewById(0x7F0B062B);  // id:imgPhotoEditorClose
        View view3 = view0.findViewById(0x7F0B04C1);  // id:frmBorder
        ((TextView)view1).setText(s);
        ((TextView)view1).setTextColor(v);
        if(typeface0 != null) {
            ((TextView)view1).setTypeface(typeface0);
        }
        com.dcinside.app.image.edit.f f0 = this.A();
        f0.k(new com.dcinside.app.image.edit.d.b(this, ((FrameLayout)view3), ((ImageView)view2), ((TextView)view1), view0));
        view0.setOnTouchListener(f0);
        this.l(view0, b0);
        String s1 = ((TextView)view1).getText().toString();
        int v1 = ((TextView)view1).getCurrentTextColor();
        t t0 = this.h;
        if(t0 != null) {
            h h0 = (h)t0.a();
            if(h0 != null) {
                h0.f(view0, s1, v1);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void k(String s, int v) {
        this.j(null, s, v);
    }

    private void l(View view0, b b0) {
        this.q();
        LayoutParams constraintLayout$LayoutParams0 = new LayoutParams(-2, -2);
        constraintLayout$LayoutParams0.t = 0;
        constraintLayout$LayoutParams0.v = 0;
        constraintLayout$LayoutParams0.i = 0;
        constraintLayout$LayoutParams0.l = 0;
        this.b.addView(view0, constraintLayout$LayoutParams0);
        this.f.add(view0);
        t t0 = this.h;
        if(t0 != null) {
            h h0 = (h)t0.a();
            if(h0 != null) {
                h0.j(b0, this.f.size());
            }
        }
    }

    public void m() {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.a();
        }
    }

    public void n() {
        for(int v = 0; v < this.f.size(); ++v) {
            this.b.removeView(((View)this.f.get(v)));
        }
        if(this.f.contains(this.e)) {
            this.b.addView(this.e);
        }
        this.f.clear();
        this.g.clear();
        this.o();
    }

    private void o() {
        BrushDrawingView brushDrawingView0 = this.e;
        if(brushDrawingView0 != null) {
            brushDrawingView0.b();
        }
    }

    @UiThread
    public void p() {
        for(int v = 0; v < this.b.getChildCount(); ++v) {
            View view0 = this.b.getChildAt(v);
            FrameLayout frameLayout0 = (FrameLayout)view0.findViewById(0x7F0B04C1);  // id:frmBorder
            if(frameLayout0 != null) {
                frameLayout0.setBackgroundResource(0);
            }
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B062B);  // id:imgPhotoEditorClose
            if(imageView0 != null) {
                imageView0.setVisibility(8);
            }
        }
    }

    public void q() {
        for(Object object0: this.f) {
            ((View)object0).findViewById(0x7F0B062B).setVisibility(8);  // id:imgPhotoEditorClose
            View view0 = ((View)object0).findViewById(0x7F0B04C1);  // id:frmBorder
            view0.setBackgroundResource(0);
            view0.setTag(Boolean.FALSE);
        }
    }

    private static String r(String s) {
        try {
            return new String(Character.toChars(Integer.parseInt(s.substring(2), 16)));
        }
        catch(NumberFormatException unused_ex) {
            return "";
        }
    }

    public void s(View view0, Typeface typeface0, String s, int v) {
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0FEC);  // id:tvPhotoEditorText
        if(textView0 != null && this.f.contains(view0) && !TextUtils.isEmpty(s)) {
            textView0.setText(s);
            if(typeface0 != null) {
                textView0.setTypeface(typeface0);
            }
            textView0.setTextColor(v);
            this.b.updateViewLayout(view0, view0.getLayoutParams());
            int v1 = this.f.indexOf(view0);
            if(v1 > -1) {
                this.f.set(v1, view0);
            }
        }
    }

    public void t(View view0, String s, int v) {
        this.s(view0, null, s, v);
    }

    public int u() {
        return this.e == null ? 0 : this.e.getBrushColor();
    }

    public Boolean v() {
        return this.e == null || !this.e.getBrushDrawingMode() ? false : true;
    }

    public float w() {
        return this.e == null ? 0.0f : this.e.getBrushSize();
    }

    public static ArrayList x(Context context0) {
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = context0.getResources().getStringArray(0x7F030009);  // array:emoji_list
        for(int v = 0; v < arr_s.length; ++v) {
            arrayList0.add(d.r(arr_s[v]));
        }
        return arrayList0;
    }

    public float y() {
        return this.e == null ? 0.0f : this.e.getEraserSize();
    }

    private View z(b b0) {
        View view0 = null;
        switch(b0) {
            case 1: {
                view0 = this.a.inflate(0x7F0E01DF, this.b, false);  // layout:view_image_edit_attach_txt
                TextView textView0 = (TextView)view0.findViewById(0x7F0B0FEC);  // id:tvPhotoEditorText
                if(textView0 != null && this.j != null) {
                    textView0.setGravity(17);
                    if(this.k != null) {
                        textView0.setTypeface(this.j);
                    }
                }
                break;
            }
            case 2: {
                view0 = this.a.inflate(0x7F0E01DE, this.b, false);  // layout:view_image_edit_attach_img
                break;
            }
            case 3: {
                View view1 = this.a.inflate(0x7F0E01DF, this.b, false);  // layout:view_image_edit_attach_txt
                TextView textView1 = (TextView)view1.findViewById(0x7F0B0FEC);  // id:tvPhotoEditorText
                if(textView1 != null) {
                    Typeface typeface0 = this.k;
                    if(typeface0 != null) {
                        textView1.setTypeface(typeface0);
                    }
                    textView1.setGravity(17);
                    textView1.setLayerType(1, null);
                }
                view0 = view1;
            }
        }
        if(view0 != null) {
            view0.setTag(b0);
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B062B);  // id:imgPhotoEditorClose
            if(imageView0 != null) {
                imageView0.setOnClickListener((View view1) -> this.R(view0, b0));
            }
        }
        return view0;
    }
}

