package com.canhub.cropper;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore.Images.Media;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import kotlin.c0;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1896:1\n7#2,5:1897\n7#2,5:1905\n7#2,5:1910\n7#2,5:1915\n7#2,5:1920\n7#2,5:1925\n1#3:1902\n66#4:1903\n78#4:1904\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n*L\n1809#1:1897,5\n1134#1:1905,5\n1159#1:1910,5\n1165#1:1915,5\n1171#1:1920,5\n1187#1:1925,5\n1047#1:1903\n1047#1:1904\n*E\n"})
public final class CropImageView extends FrameLayout implements b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final int a(int v, int v1, int v2) {
            switch(v) {
                case 0x80000000: {
                    return Math.min(v2, v1);
                }
                case 0x40000000: {
                    return v1;
                }
                default: {
                    return v2;
                }
            }
        }
    }

    public static enum com.canhub.cropper.CropImageView.b {
        RECTANGLE,
        OVAL;

        private static final com.canhub.cropper.CropImageView.b[] c;
        private static final kotlin.enums.a d;

        static {
            com.canhub.cropper.CropImageView.b.c = arr_cropImageView$b;
            L.p(arr_cropImageView$b, "entries");
            com.canhub.cropper.CropImageView.b.d = new d(arr_cropImageView$b);
        }

        private static final com.canhub.cropper.CropImageView.b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return com.canhub.cropper.CropImageView.b.d;
        }
    }

    @s0({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView$CropResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1896:1\n1#2:1897\n*E\n"})
    public static class c {
        @m
        private final Bitmap a;
        @m
        private final Uri b;
        @m
        private final Bitmap c;
        @m
        private final Uri d;
        @m
        private final Exception e;
        @l
        private final float[] f;
        @m
        private final Rect g;
        @m
        private final Rect h;
        private final int i;
        private final int j;

        public c(@m Bitmap bitmap0, @m Uri uri0, @m Bitmap bitmap1, @m Uri uri1, @m Exception exception0, @l float[] arr_f, @m Rect rect0, @m Rect rect1, int v, int v1) {
            L.p(arr_f, "cropPoints");
            super();
            this.a = bitmap0;
            this.b = uri0;
            this.c = bitmap1;
            this.d = uri1;
            this.e = exception0;
            this.f = arr_f;
            this.g = rect0;
            this.h = rect1;
            this.i = v;
            this.j = v1;
        }

        @m
        public final Bitmap a() {
            return this.c;
        }

        @m
        public final Bitmap c(@l Context context0) {
            L.p(context0, "context");
            Bitmap bitmap0 = this.c;
            if(bitmap0 == null) {
                try {
                    if(Build.VERSION.SDK_INT >= 28) {
                        ContentResolver contentResolver0 = context0.getContentResolver();
                        L.m(this.d);
                        return ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver0, this.d));
                    }
                    return MediaStore.Images.Media.getBitmap(context0.getContentResolver(), this.d);
                }
                catch(Exception unused_ex) {
                    return null;
                }
            }
            return bitmap0;
        }

        @l
        public final float[] d() {
            return this.f;
        }

        @m
        public final Rect e() {
            return this.g;
        }

        @m
        public final Exception f() {
            return this.e;
        }

        @m
        public final Bitmap g() {
            return this.a;
        }

        @m
        public final Uri h() {
            return this.b;
        }

        public final int i() {
            return this.i;
        }

        public final int l() {
            return this.j;
        }

        @m
        public final Uri m() {
            return this.d;
        }

        @m
        public final String o(@l Context context0, boolean z) {
            L.p(context0, "context");
            return this.d == null ? null : I.a.d(context0, this.d, z);
        }

        public static String q(c cropImageView$c0, Context context0, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUriFilePath");
            }
            if((v & 2) != 0) {
                z = false;
            }
            return cropImageView$c0.o(context0, z);
        }

        @m
        public final Rect r() {
            return this.h;
        }

        public final boolean s() {
            return this.e == null;
        }
    }

    public static enum com.canhub.cropper.CropImageView.d {
        RECTANGLE,
        OVAL,
        RECTANGLE_VERTICAL_ONLY,
        RECTANGLE_HORIZONTAL_ONLY;

        private static final com.canhub.cropper.CropImageView.d[] e;
        private static final kotlin.enums.a f;

        static {
            com.canhub.cropper.CropImageView.d.e = arr_cropImageView$d;
            L.p(arr_cropImageView$d, "entries");
            com.canhub.cropper.CropImageView.d.f = new d(arr_cropImageView$d);
        }

        private static final com.canhub.cropper.CropImageView.d[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return com.canhub.cropper.CropImageView.d.f;
        }
    }

    public static enum e {
        OFF,
        ON_TOUCH,
        ON;

        private static final e[] d;
        private static final kotlin.enums.a e;

        static {
            e.d = arr_cropImageView$e;
            L.p(arr_cropImageView$e, "entries");
            e.e = new d(arr_cropImageView$e);
        }

        private static final e[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return e.e;
        }
    }

    public interface f {
        void q(@l CropImageView arg1, @l c arg2);
    }

    public interface g {
        void a(@m Rect arg1);
    }

    public interface h {
        void a(@m Rect arg1);
    }

    public interface i {
        void a();
    }

    public interface j {
        void v(@l CropImageView arg1, @l Uri arg2, @m Exception arg3);
    }

    public static enum k {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT;

        private static final k[] f;
        private static final kotlin.enums.a g;

        static {
            k.f = arr_cropImageView$k;
            L.p(arr_cropImageView$k, "entries");
            k.g = new d(arr_cropImageView$k);
        }

        private static final k[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return k.g;
        }
    }

    public static enum com.canhub.cropper.CropImageView.l {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;

        private static final com.canhub.cropper.CropImageView.l[] e;
        private static final kotlin.enums.a f;

        static {
            com.canhub.cropper.CropImageView.l.e = arr_cropImageView$l;
            L.p(arr_cropImageView$l, "entries");
            com.canhub.cropper.CropImageView.l.f = new d(arr_cropImageView$l);
        }

        private static final com.canhub.cropper.CropImageView.l[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return com.canhub.cropper.CropImageView.l.f;
        }
    }

    @m
    private h A;
    @m
    private g B;
    @m
    private i C;
    @m
    private j D;
    @m
    private f E;
    @m
    private Uri F;
    private int G;
    private float H;
    private float I;
    private float J;
    @m
    private RectF K;
    private int L;
    private boolean M;
    @m
    private WeakReference N;
    @m
    private WeakReference O;
    @m
    private Uri P;
    @l
    public static final a Q;
    @l
    private final ImageView a;
    @m
    private final CropOverlayView b;
    @l
    private final Matrix c;
    @l
    private final Matrix d;
    @l
    private final ProgressBar e;
    @l
    private final float[] f;
    @l
    private final float[] g;
    @m
    private com.canhub.cropper.k h;
    @m
    private Bitmap i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    @l
    private com.canhub.cropper.CropImageView.l q;
    private boolean r;
    private boolean s;
    private boolean t;
    @l
    private String u;
    private float v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    static {
        CropImageView.Q = new a(null);
    }

    @z3.j
    public CropImageView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @z3.j
    public CropImageView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        CropImageOptions cropImageOptions2;
        CropImageOptions cropImageOptions0;
        super(context0, attributeSet0);
        this.c = new Matrix();
        this.d = new Matrix();
        this.f = new float[8];
        this.g = new float[8];
        this.s = true;
        this.u = "";
        this.v = 20.0f;
        this.w = -1;
        this.x = true;
        this.y = true;
        this.G = 1;
        this.H = 1.0f;
        Parcelable parcelable0 = null;
        Activity activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
        if(activity0 == null) {
        label_26:
            if(attributeSet0 == null) {
                cropImageOptions0 = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 0x3F, null);
            }
            else {
                TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.CropImageView, 0, 0);
                L.o(typedArray0, "obtainStyledAttributes(...)");
                CropImageOptions cropImageOptions1 = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 0x3F, null);
                try {
                    this.r = typedArray0.getBoolean(styleable.CropImageView_cropSaveBitmapToInstanceState, this.r);
                    com.canhub.cropper.CropImageView.l[] arr_cropImageView$l = com.canhub.cropper.CropImageView.l.values();
                    com.canhub.cropper.CropImageView.l cropImageView$l0 = arr_cropImageView$l[typedArray0.getInt(styleable.CropImageView_cropScaleType, cropImageOptions1.i.ordinal())];
                    com.canhub.cropper.CropImageView.d[] arr_cropImageView$d = com.canhub.cropper.CropImageView.d.values();
                    com.canhub.cropper.CropImageView.d cropImageView$d0 = arr_cropImageView$d[typedArray0.getInt(styleable.CropImageView_cropShape, cropImageOptions1.c.ordinal())];
                    com.canhub.cropper.CropImageView.b[] arr_cropImageView$b = com.canhub.cropper.CropImageView.b.values();
                    com.canhub.cropper.CropImageView.b cropImageView$b0 = arr_cropImageView$b[typedArray0.getInt(styleable.CropImageView_cornerShape, cropImageOptions1.d.ordinal())];
                    e[] arr_cropImageView$e = e.values();
                    e cropImageView$e0 = arr_cropImageView$e[typedArray0.getInt(styleable.CropImageView_cropGuidelines, cropImageOptions1.h.ordinal())];
                    int v1 = typedArray0.getInteger(styleable.CropImageView_cropAspectRatioX, cropImageOptions1.u);
                    int v2 = typedArray0.getInteger(styleable.CropImageView_cropAspectRatioY, cropImageOptions1.v);
                    boolean z = typedArray0.getBoolean(styleable.CropImageView_cropAutoZoomEnabled, cropImageOptions1.n);
                    boolean z1 = typedArray0.getBoolean(styleable.CropImageView_cropMultiTouchEnabled, cropImageOptions1.o);
                    boolean z2 = typedArray0.getBoolean(styleable.CropImageView_cropCenterMoveEnabled, cropImageOptions1.p);
                    float f = typedArray0.getDimension(styleable.CropImageView_cropCornerRadius, cropImageOptions1.e);
                    float f1 = typedArray0.getDimension(styleable.CropImageView_cropSnapRadius, cropImageOptions1.f);
                    float f2 = typedArray0.getDimension(styleable.CropImageView_cropTouchRadius, cropImageOptions1.g);
                    float f3 = typedArray0.getFloat(styleable.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions1.s);
                    int v3 = typedArray0.getInteger(styleable.CropImageView_cropCornerCircleFillColor, cropImageOptions1.C);
                    float f4 = typedArray0.getDimension(styleable.CropImageView_cropBorderLineThickness, cropImageOptions1.w);
                    int v4 = typedArray0.getInteger(styleable.CropImageView_cropBorderLineColor, cropImageOptions1.x);
                    float f5 = typedArray0.getDimension(styleable.CropImageView_cropBorderCornerThickness, cropImageOptions1.y);
                    float f6 = typedArray0.getDimension(styleable.CropImageView_cropBorderCornerOffset, cropImageOptions1.z);
                    float f7 = typedArray0.getDimension(styleable.CropImageView_cropBorderCornerLength, cropImageOptions1.A);
                    int v5 = typedArray0.getInteger(styleable.CropImageView_cropBorderCornerColor, cropImageOptions1.B);
                    float f8 = typedArray0.getDimension(styleable.CropImageView_cropGuidelinesThickness, cropImageOptions1.D);
                    int v6 = typedArray0.getInteger(styleable.CropImageView_cropGuidelinesColor, cropImageOptions1.E);
                    int v7 = typedArray0.getInteger(styleable.CropImageView_cropBackgroundColor, cropImageOptions1.F);
                    int v8 = (int)typedArray0.getDimension(styleable.CropImageView_cropMinCropWindowWidth, ((float)cropImageOptions1.G));
                    int v9 = (int)typedArray0.getDimension(styleable.CropImageView_cropMinCropWindowHeight, ((float)cropImageOptions1.H));
                    int v10 = (int)typedArray0.getFloat(styleable.CropImageView_cropMinCropResultWidthPX, ((float)cropImageOptions1.I));
                    int v11 = (int)typedArray0.getFloat(styleable.CropImageView_cropMinCropResultHeightPX, ((float)cropImageOptions1.J));
                    int v12 = (int)typedArray0.getFloat(styleable.CropImageView_cropMaxCropResultWidthPX, ((float)cropImageOptions1.K));
                    int v13 = (int)typedArray0.getFloat(styleable.CropImageView_cropMaxCropResultHeightPX, ((float)cropImageOptions1.L));
                    boolean z3 = typedArray0.getBoolean(styleable.CropImageView_cropFlipHorizontally, cropImageOptions1.U8);
                    boolean z4 = typedArray0.getBoolean(styleable.CropImageView_cropFlipHorizontally, cropImageOptions1.V8);
                    float f9 = typedArray0.getDimension(styleable.CropImageView_cropperLabelTextSize, cropImageOptions1.c9);
                    int v14 = typedArray0.getInteger(styleable.CropImageView_cropperLabelTextColor, cropImageOptions1.d9);
                    boolean z5 = typedArray0.getBoolean(styleable.CropImageView_cropShowLabel, cropImageOptions1.k);
                    int v15 = typedArray0.getInteger(styleable.CropImageView_cropMaxZoom, cropImageOptions1.r);
                    boolean z6 = typedArray0.getBoolean(styleable.CropImageView_cropShowCropOverlay, cropImageOptions1.j);
                    boolean z7 = typedArray0.getBoolean(styleable.CropImageView_cropShowProgressBar, cropImageOptions1.l);
                    String s = typedArray0.getString(styleable.CropImageView_cropperLabelText);
                    cropImageOptions2 = new CropImageOptions(false, false, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z6, z5, z7, 0, z, z1, z2, false, v15, f3, typedArray0.getBoolean(styleable.CropImageView_cropFixAspectRatio, cropImageOptions1.t) || typedArray0.hasValue(1) && typedArray0.hasValue(1), v1, v2, f4, v4, f5, f6, f7, v5, v3, f8, v6, v7, v8, v9, v10, v11, v12, v13, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, z3, z4, null, 0, false, false, null, null, f9, v14, s, 0, null, null, null, null, 0x11003, 0x3F3FFFC0, 62, null);
                }
                finally {
                    typedArray0.recycle();
                }
                cropImageOptions0 = cropImageOptions2;
            }
        }
        else {
            Intent intent0 = activity0.getIntent();
            if(intent0 == null) {
                goto label_26;
            }
            else {
                Bundle bundle0 = intent0.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
                if(bundle0 == null) {
                    goto label_26;
                }
                else {
                    Parcelable parcelable1 = bundle0.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
                    if(parcelable1 instanceof CropImageOptions) {
                        parcelable0 = parcelable1;
                    }
                    cropImageOptions0 = (CropImageOptions)parcelable0;
                    if(cropImageOptions0 == null) {
                        goto label_26;
                    }
                }
            }
        }
        this.q = cropImageOptions0.i;
        this.y = cropImageOptions0.n;
        this.z = cropImageOptions0.r;
        this.v = cropImageOptions0.c9;
        this.t = cropImageOptions0.k;
        this.s = cropImageOptions0.j;
        this.x = cropImageOptions0.l;
        this.l = cropImageOptions0.U8;
        this.m = cropImageOptions0.V8;
        View view0 = LayoutInflater.from(context0).inflate(layout.crop_image_view, this, true);
        ImageView imageView0 = (ImageView)view0.findViewById(id.ImageView_image);
        this.a = imageView0;
        imageView0.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView0 = (CropOverlayView)view0.findViewById(id.CropOverlayView);
        this.b = cropOverlayView0;
        cropOverlayView0.setCropWindowChangeListener(this);
        cropOverlayView0.setInitialAttributeValues(cropImageOptions0);
        ProgressBar progressBar0 = (ProgressBar)view0.findViewById(id.CropProgressBar);
        this.e = progressBar0;
        progressBar0.setIndeterminateTintList(ColorStateList.valueOf(cropImageOptions0.m));
        this.L();
    }

    public CropImageView(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    private final void A() {
        this.f[0] = 0.0f;
        this.f[1] = 0.0f;
        Bitmap bitmap0 = this.i;
        L.m(bitmap0);
        this.f[2] = (float)bitmap0.getWidth();
        this.f[3] = 0.0f;
        Bitmap bitmap1 = this.i;
        L.m(bitmap1);
        this.f[4] = (float)bitmap1.getWidth();
        Bitmap bitmap2 = this.i;
        L.m(bitmap2);
        this.f[5] = (float)bitmap2.getHeight();
        this.f[6] = 0.0f;
        Bitmap bitmap3 = this.i;
        L.m(bitmap3);
        this.f[7] = (float)bitmap3.getHeight();
        this.c.mapPoints(this.f);
        this.g[0] = 0.0f;
        this.g[1] = 0.0f;
        this.g[2] = 100.0f;
        this.g[3] = 0.0f;
        this.g[4] = 100.0f;
        this.g[5] = 100.0f;
        this.g[6] = 0.0f;
        this.g[7] = 100.0f;
        this.c.mapPoints(this.g);
    }

    public final void B(@l com.canhub.cropper.a.a a$a0) {
        L.p(a$a0, "result");
        this.O = null;
        this.L();
        f cropImageView$f0 = this.E;
        if(cropImageView$f0 != null) {
            cropImageView$f0.q(this, new c(this.i, this.F, a$a0.g(), a$a0.j(), a$a0.h(), this.getCropPoints(), this.getCropRect(), this.getWholeImageRect(), this.getRotatedDegrees(), a$a0.i()));
        }
    }

    public final void C(@l com.canhub.cropper.b.a b$a0) {
        L.p(b$a0, "result");
        this.N = null;
        this.L();
        if(b$a0.l() == null) {
            this.j = b$a0.k();
            this.l = b$a0.m();
            this.m = b$a0.n();
            this.G(b$a0.j(), 0, b$a0.p(), b$a0.o(), b$a0.k());
        }
        j cropImageView$j0 = this.D;
        if(cropImageView$j0 != null) {
            cropImageView$j0.v(this, b$a0.p(), b$a0.l());
        }
    }

    public final void D() {
        this.H = 1.0f;
        this.I = 0.0f;
        this.J = 0.0f;
        this.k = this.j;
        this.l = false;
        this.m = false;
        this.d(((float)this.getWidth()), ((float)this.getHeight()), false, false);
        L.m(this.b);
        this.b.u();
    }

    public final void E(int v) {
        if(this.i != null) {
            int v1 = v >= 0 ? v % 360 : v % 360 + 360;
            L.m(this.b);
            boolean z = !this.b.o() && (46 <= v1 && v1 < 0x87 || 0xD8 <= v1 && v1 < 305);
            com.canhub.cropper.d d0 = com.canhub.cropper.d.a;
            d0.u().set(this.b.getCropWindowRect());
            RectF rectF0 = d0.u();
            float f = z ? rectF0.height() : rectF0.width();
            RectF rectF1 = d0.u();
            float f1 = z ? rectF1.width() : rectF1.height();
            if(z) {
                boolean z1 = this.l;
                this.l = this.m;
                this.m = z1;
            }
            this.c.invert(this.d);
            d0.s()[0] = d0.u().centerX();
            d0.s()[1] = d0.u().centerY();
            d0.s()[2] = 0.0f;
            d0.s()[3] = 0.0f;
            d0.s()[4] = 1.0f;
            d0.s()[5] = 0.0f;
            this.d.mapPoints(d0.s());
            this.k = (this.k + v1) % 360;
            this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
            this.c.mapPoints(d0.t(), d0.s());
            this.H = Math.max(this.H / ((float)Math.sqrt(Math.pow(d0.t()[4] - d0.t()[2], 2.0) + Math.pow(d0.t()[5] - d0.t()[3], 2.0))), 1.0f);
            this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
            this.c.mapPoints(d0.t(), d0.s());
            float f2 = (float)Math.sqrt(Math.pow(d0.t()[4] - d0.t()[2], 2.0) + Math.pow(d0.t()[5] - d0.t()[3], 2.0));
            float f3 = f / 2.0f * f2;
            float f4 = f1 / 2.0f * f2;
            d0.u().set(d0.t()[0] - f3, d0.t()[1] - f4, d0.t()[0] + f3, d0.t()[1] + f4);
            this.b.t();
            this.b.setCropWindowRect(d0.u());
            this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
            this.q(false, false);
            this.b.m();
        }
    }

    public final void F(int v, int v1) {
        L.m(this.b);
        this.b.setAspectRatioX(v);
        this.b.setAspectRatioY(v1);
        this.b.setFixedAspectRatio(true);
    }

    private final void G(Bitmap bitmap0, int v, Uri uri0, int v1, int v2) {
        if(this.i == null || !L.g(this.i, bitmap0)) {
            this.g();
            this.i = bitmap0;
            this.a.setImageBitmap(bitmap0);
            this.F = uri0;
            this.p = v;
            this.G = v1;
            this.k = v2;
            this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
            CropOverlayView cropOverlayView0 = this.b;
            if(cropOverlayView0 != null) {
                cropOverlayView0.t();
                this.H();
            }
        }
    }

    private final void H() {
        CropOverlayView cropOverlayView0 = this.b;
        if(cropOverlayView0 != null) {
            cropOverlayView0.setVisibility((!this.s || this.i == null ? 4 : 0));
        }
    }

    public final void I(@m Bitmap bitmap0, @m ExifInterface exifInterface0) {
        int v;
        Bitmap bitmap1;
        if(bitmap0 == null || exifInterface0 == null) {
            bitmap1 = bitmap0;
            v = 0;
        }
        else {
            com.canhub.cropper.d.b d$b0 = com.canhub.cropper.d.a.F(bitmap0, exifInterface0);
            this.l = d$b0.c();
            this.m = d$b0.d();
            this.j = d$b0.b();
            bitmap1 = d$b0.a();
            v = d$b0.b();
        }
        L.m(this.b);
        this.b.setInitialCropWindowRect(null);
        this.G(bitmap1, 0, null, 1, v);
    }

    public final void J(int v, int v1) {
        L.m(this.b);
        this.b.y(v, v1);
    }

    public final void K(int v, int v1) {
        L.m(this.b);
        this.b.z(v, v1);
    }

    private final void L() {
        int v = 0;
        ProgressBar progressBar0 = this.e;
        if(!this.x || (this.i != null || this.N == null) && this.O == null) {
            v = 4;
        }
        progressBar0.setVisibility(v);
    }

    public final void M(int v, int v1, @l k cropImageView$k0, @l Bitmap.CompressFormat bitmap$CompressFormat0, int v2, @m Uri uri0) {
        com.canhub.cropper.a a0;
        L.p(cropImageView$k0, "options");
        L.p(bitmap$CompressFormat0, "saveCompressFormat");
        Bitmap bitmap0 = this.i;
        if(bitmap0 != null) {
            WeakReference weakReference0 = this.O;
            if(weakReference0 == null) {
                a0 = null;
            }
            else {
                L.m(weakReference0);
                a0 = (com.canhub.cropper.a)weakReference0.get();
            }
            if(a0 != null) {
                a0.w();
            }
            Pair pair0 = this.G > 1 || cropImageView$k0 == k.b ? new Pair(((int)(bitmap0.getWidth() * this.G)), ((int)(bitmap0.getHeight() * this.G))) : new Pair(0, 0);
            Integer integer0 = (Integer)pair0.first;
            Integer integer1 = (Integer)pair0.second;
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            WeakReference weakReference1 = new WeakReference(this);
            Uri uri1 = this.F;
            float[] arr_f = this.getCropPoints();
            int v3 = this.k;
            L.m(integer0);
            L.m(integer1);
            L.m(this.b);
            WeakReference weakReference2 = new WeakReference(new com.canhub.cropper.a(context0, weakReference1, uri1, bitmap0, arr_f, v3, ((int)integer0), ((int)integer1), this.b.o(), this.b.getAspectRatioX(), this.b.getAspectRatioY(), (cropImageView$k0 == k.a ? 0 : v), (cropImageView$k0 == k.a ? 0 : v1), this.l, this.m, cropImageView$k0, bitmap$CompressFormat0, v2, (uri0 == null ? this.P : uri0)));
            this.O = weakReference2;
            L.m(weakReference2);
            Object object0 = weakReference2.get();
            L.m(object0);
            ((com.canhub.cropper.a)object0).y();
            this.L();
        }
    }

    private final void N(boolean z) {
        if(this.i != null && !z) {
            float f = ((float)this.G) * 100.0f;
            float f1 = com.canhub.cropper.d.a.D(this.g);
            float f2 = ((float)this.G) * 100.0f;
            float f3 = com.canhub.cropper.d.a.z(this.g);
            L.m(this.b);
            float f4 = (float)this.getWidth();
            float f5 = (float)this.getHeight();
            this.b.x(f4, f5, f / f1, f2 / f3);
        }
        L.m(this.b);
        this.b.v((z ? null : this.f), this.getWidth(), this.getHeight());
    }

    @Override  // com.canhub.cropper.CropOverlayView$b
    public void a(boolean z) {
        this.q(z, true);
        if(z) {
            g cropImageView$g0 = this.B;
            if(cropImageView$g0 != null) {
                cropImageView$g0.a(this.getCropRect());
            }
        }
        else {
            h cropImageView$h0 = this.A;
            if(cropImageView$h0 != null) {
                cropImageView$h0.a(this.getCropRect());
            }
        }
    }

    @m
    @z3.i(name = "-croppedImage")
    public final Bitmap b() {
        return this.o(0, 0, k.a);
    }

    @kotlin.k(message = "Please use getCroppedImage", replaceWith = @c0(expression = "getCroppedImage()", imports = {}))
    public static void c() {
    }

    private final void d(float f, float f1, boolean z, boolean z1) {
        float f2 = 0.0f;
        Bitmap bitmap0 = this.i;
        if(bitmap0 != null && f > 0.0f && f1 > 0.0f) {
            this.c.invert(this.d);
            L.m(this.b);
            RectF rectF0 = this.b.getCropWindowRect();
            this.d.mapRect(rectF0);
            this.c.reset();
            float f3 = (f - ((float)bitmap0.getWidth())) / 2.0f;
            float f4 = (f1 - ((float)bitmap0.getHeight())) / 2.0f;
            this.c.postTranslate(f3, f4);
            this.A();
            int v = this.k;
            if(v > 0) {
                float f5 = com.canhub.cropper.d.a.w(this.f);
                float f6 = com.canhub.cropper.d.a.x(this.f);
                this.c.postRotate(((float)v), f5, f6);
                this.A();
            }
            com.canhub.cropper.d d0 = com.canhub.cropper.d.a;
            float f7 = Math.min(f / d0.D(this.f), f1 / d0.z(this.f));
            com.canhub.cropper.CropImageView.l cropImageView$l0 = this.q;
            if(cropImageView$l0 == com.canhub.cropper.CropImageView.l.a || cropImageView$l0 == com.canhub.cropper.CropImageView.l.d && f7 < 1.0f || f7 > 1.0f && this.y) {
                float f8 = d0.w(this.f);
                float f9 = d0.x(this.f);
                this.c.postScale(f7, f7, f8, f9);
                this.A();
            }
            else if(cropImageView$l0 == com.canhub.cropper.CropImageView.l.c) {
                this.H = Math.max(((float)this.getWidth()) / d0.D(this.f), ((float)this.getHeight()) / d0.z(this.f));
            }
            float f10 = this.l ? -this.H : this.H;
            float f11 = this.m ? -this.H : this.H;
            float f12 = d0.w(this.f);
            float f13 = d0.x(this.f);
            this.c.postScale(f10, f11, f12, f13);
            this.A();
            this.c.mapRect(rectF0);
            if(this.q == com.canhub.cropper.CropImageView.l.c && z && !z1) {
                this.I = 0.0f;
                this.J = 0.0f;
            }
            else if(z) {
                this.I = f > d0.D(this.f) ? 0.0f : Math.max(Math.min(f / 2.0f - rectF0.centerX(), -d0.A(this.f)), ((float)this.getWidth()) - d0.B(this.f)) / f10;
                if(f1 <= d0.z(this.f)) {
                    f2 = Math.max(Math.min(f1 / 2.0f - rectF0.centerY(), -d0.C(this.f)), ((float)this.getHeight()) - d0.v(this.f)) / f11;
                }
                this.J = f2;
            }
            else {
                this.I = Math.min(Math.max(this.I * f10, -rectF0.left), f - rectF0.right) / f10;
                this.J = Math.min(Math.max(this.J * f11, -rectF0.top), f1 - rectF0.bottom) / f11;
            }
            this.c.postTranslate(this.I * f10, this.J * f11);
            rectF0.offset(this.I * f10, this.J * f11);
            this.b.setCropWindowRect(rectF0);
            this.A();
            this.b.invalidate();
            if(z1) {
                com.canhub.cropper.k k0 = this.h;
                L.m(k0);
                k0.a(this.f, this.c);
                this.a.startAnimation(this.h);
            }
            else {
                this.a.setImageMatrix(this.c);
            }
            this.N(false);
        }
    }

    public final void e() {
        L.m(this.b);
        this.b.setAspectRatioX(1);
        this.b.setAspectRatioY(1);
        this.setFixedAspectRatio(false);
    }

    public final void f() {
        this.g();
        CropOverlayView cropOverlayView0 = this.b;
        if(cropOverlayView0 != null) {
            cropOverlayView0.setInitialCropWindowRect(null);
        }
    }

    private final void g() {
        Bitmap bitmap0 = this.i;
        if(bitmap0 != null && (this.p > 0 || this.F != null)) {
            L.m(bitmap0);
            bitmap0.recycle();
        }
        this.i = null;
        this.p = 0;
        this.F = null;
        this.G = 1;
        this.k = 0;
        this.H = 1.0f;
        this.I = 0.0f;
        this.J = 0.0f;
        this.c.reset();
        this.K = null;
        this.L = 0;
        this.a.setImageBitmap(null);
        this.H();
    }

    @l
    public final Pair getAspectRatio() {
        L.m(this.b);
        return new Pair(this.b.getAspectRatioX(), this.b.getAspectRatioY());
    }

    @m
    public final com.canhub.cropper.CropImageView.b getCornerShape() {
        L.m(this.b);
        return this.b.getCornerShape();
    }

    @l
    public final String getCropLabelText() {
        return this.u;
    }

    public final int getCropLabelTextColor() {
        return this.w;
    }

    public final float getCropLabelTextSize() {
        return this.v;
    }

    @l
    public final float[] getCropPoints() {
        L.m(this.b);
        RectF rectF0 = this.b.getCropWindowRect();
        float[] arr_f = {rectF0.left, rectF0.top, rectF0.right, rectF0.top, rectF0.right, rectF0.bottom, rectF0.left, rectF0.bottom};
        this.c.invert(this.d);
        this.d.mapPoints(arr_f);
        float[] arr_f1 = new float[8];
        for(int v = 0; v < 8; ++v) {
            arr_f1[v] = arr_f[v] * ((float)this.G);
        }
        return arr_f1;
    }

    @m
    public final Rect getCropRect() {
        int v = this.G;
        Bitmap bitmap0 = this.i;
        if(bitmap0 == null) {
            return null;
        }
        float[] arr_f = this.getCropPoints();
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        L.m(this.b);
        return com.canhub.cropper.d.a.y(arr_f, v1 * v, v2 * v, this.b.o(), this.b.getAspectRatioX(), this.b.getAspectRatioY());
    }

    @m
    public final com.canhub.cropper.CropImageView.d getCropShape() {
        L.m(this.b);
        return this.b.getCropShape();
    }

    @m
    public final RectF getCropWindowRect() {
        return this.b == null ? null : this.b.getCropWindowRect();
    }

    @m
    @z3.j
    public final Bitmap getCroppedImage() {
        return CropImageView.p(this, 0, 0, null, 7, null);
    }

    @m
    public final Uri getCustomOutputUri() {
        return this.P;
    }

    @m
    public final e getGuidelines() {
        L.m(this.b);
        return this.b.getGuidelines();
    }

    public final int getImageResource() {
        return this.p;
    }

    @m
    public final Uri getImageUri() {
        return this.F;
    }

    public final int getMaxZoom() {
        return this.z;
    }

    public final int getRotatedDegrees() {
        return this.k;
    }

    @l
    public final com.canhub.cropper.CropImageView.l getScaleType() {
        return this.q;
    }

    @m
    public final Rect getWholeImageRect() {
        int v = this.G;
        Bitmap bitmap0 = this.i;
        return bitmap0 == null ? null : new Rect(0, 0, bitmap0.getWidth() * v, bitmap0.getHeight() * v);
    }

    public final void h(@l Bitmap.CompressFormat bitmap$CompressFormat0, int v, int v1, int v2, @l k cropImageView$k0, @m Uri uri0) {
        L.p(bitmap$CompressFormat0, "saveCompressFormat");
        L.p(cropImageView$k0, "options");
        if(this.E == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        this.M(v1, v2, cropImageView$k0, bitmap$CompressFormat0, v, uri0);
    }

    public static void i(CropImageView cropImageView0, Bitmap.CompressFormat bitmap$CompressFormat0, int v, int v1, int v2, k cropImageView$k0, Uri uri0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            bitmap$CompressFormat0 = Bitmap.CompressFormat.JPEG;
        }
        if((v3 & 16) != 0) {
            cropImageView$k0 = k.c;
        }
        if((v3 & 0x20) != 0) {
            uri0 = null;
        }
        cropImageView0.h(bitmap$CompressFormat0, ((v3 & 2) == 0 ? v : 90), ((v3 & 4) == 0 ? v1 : 0), ((v3 & 8) == 0 ? v2 : 0), cropImageView$k0, uri0);
    }

    @m
    public final Size j() {
        Rect rect0 = this.getCropRect();
        if(rect0 == null) {
            return null;
        }
        return this.getRotatedDegrees() == 0 || this.getRotatedDegrees() == 180 ? new Size(rect0.width(), rect0.height()) : new Size(rect0.height(), rect0.width());
    }

    public final void k() {
        this.l = !this.l;
        this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
    }

    public final void l() {
        this.m = !this.m;
        this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
    }

    @m
    @z3.j
    public final Bitmap m(int v) {
        return CropImageView.p(this, v, 0, null, 6, null);
    }

    @m
    @z3.j
    public final Bitmap n(int v, int v1) {
        return CropImageView.p(this, v, v1, null, 4, null);
    }

    @m
    @z3.j
    public final Bitmap o(int v, int v1, @l k cropImageView$k0) {
        Bitmap bitmap1;
        L.p(cropImageView$k0, "options");
        Bitmap bitmap0 = this.i;
        if(bitmap0 != null) {
            int v2 = cropImageView$k0 == k.a ? 0 : v;
            int v3 = cropImageView$k0 == k.a ? 0 : v1;
            if(this.F == null || this.G <= 1 && cropImageView$k0 != k.b) {
                float[] arr_f = this.getCropPoints();
                int v4 = this.k;
                L.m(this.b);
                bitmap1 = com.canhub.cropper.d.a.g(bitmap0, arr_f, v4, this.b.o(), this.b.getAspectRatioX(), this.b.getAspectRatioY(), this.l, this.m).a();
                return com.canhub.cropper.d.a.G(bitmap1, v2, v3, cropImageView$k0);
            }
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            Uri uri0 = this.F;
            float[] arr_f1 = this.getCropPoints();
            int v5 = this.k;
            Bitmap bitmap2 = this.i;
            L.m(bitmap2);
            int v6 = bitmap2.getWidth() * this.G;
            Bitmap bitmap3 = this.i;
            L.m(bitmap3);
            int v7 = bitmap3.getHeight() * this.G;
            L.m(this.b);
            bitmap1 = com.canhub.cropper.d.a.d(context0, uri0, arr_f1, v5, v6, v7, this.b.o(), this.b.getAspectRatioX(), this.b.getAspectRatioY(), v2, v3, this.l, this.m).a();
            return com.canhub.cropper.d.a.G(bitmap1, v2, v3, cropImageView$k0);
        }
        return null;
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.n <= 0 || this.o <= 0) {
            this.N(true);
        }
        else {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.width = this.n;
            viewGroup$LayoutParams0.height = this.o;
            this.setLayoutParams(viewGroup$LayoutParams0);
            if(this.i == null) {
                this.N(true);
                return;
            }
            float f = (float)(v2 - v);
            float f1 = (float)(v3 - v1);
            this.d(f, f1, true, false);
            RectF rectF0 = this.K;
            if(rectF0 != null) {
                int v4 = this.L;
                if(v4 != this.j) {
                    this.k = v4;
                    this.d(f, f1, true, false);
                    this.L = 0;
                }
                this.c.mapRect(this.K);
                CropOverlayView cropOverlayView0 = this.b;
                if(cropOverlayView0 != null) {
                    cropOverlayView0.setCropWindowRect(rectF0);
                }
                this.q(false, false);
                CropOverlayView cropOverlayView1 = this.b;
                if(cropOverlayView1 != null) {
                    cropOverlayView1.m();
                }
                this.K = null;
                return;
            }
            if(this.M) {
                this.M = false;
                this.q(false, false);
            }
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        int v7;
        int v6;
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        Bitmap bitmap0 = this.i;
        if(bitmap0 != null) {
            if(v5 == 0) {
                v5 = bitmap0.getHeight();
            }
            double f = v3 >= bitmap0.getWidth() ? Infinity : ((double)v3) / ((double)bitmap0.getWidth());
            double f1 = v5 >= bitmap0.getHeight() ? Infinity : ((double)v5) / ((double)bitmap0.getHeight());
            if(f == Infinity && f1 == Infinity) {
                v6 = bitmap0.getWidth();
                v7 = bitmap0.getHeight();
            }
            else if(f <= f1) {
                v7 = (int)(((double)bitmap0.getHeight()) * f);
                v6 = v3;
            }
            else {
                v6 = (int)(((double)bitmap0.getWidth()) * f1);
                v7 = v5;
            }
            int v8 = CropImageView.Q.a(v2, v3, v6);
            int v9 = CropImageView.Q.a(v4, v5, v7);
            this.n = v8;
            this.o = v9;
            this.setMeasuredDimension(v8, v9);
            return;
        }
        this.setMeasuredDimension(v3, v5);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(@l Parcelable parcelable0) {
        Bitmap bitmap0;
        Parcelable parcelable1 = null;
        L.p(parcelable0, "state");
        if(parcelable0 instanceof Bundle) {
            if(this.N == null && this.F == null && this.i == null && this.p == 0) {
                Parcelable parcelable2 = ((Bundle)parcelable0).getParcelable("LOADED_IMAGE_URI");
                if(!(parcelable2 instanceof Uri)) {
                    parcelable2 = null;
                }
                if(((Uri)parcelable2) == null) {
                    int v = ((Bundle)parcelable0).getInt("LOADED_IMAGE_RESOURCE");
                    if(v > 0) {
                        this.setImageResource(v);
                    }
                    else {
                        Parcelable parcelable3 = ((Bundle)parcelable0).getParcelable("LOADING_IMAGE_URI");
                        if(!(parcelable3 instanceof Uri)) {
                            parcelable3 = null;
                        }
                        if(((Uri)parcelable3) != null) {
                            this.setImageUriAsync(((Uri)parcelable3));
                        }
                    }
                }
                else {
                    String s = ((Bundle)parcelable0).getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if(s != null) {
                        com.canhub.cropper.d d0 = com.canhub.cropper.d.a;
                        Pair pair0 = d0.q();
                        if(pair0 == null) {
                            bitmap0 = null;
                        }
                        else {
                            bitmap0 = L.g(pair0.first, s) ? ((Bitmap)((WeakReference)pair0.second).get()) : null;
                        }
                        d0.I(null);
                        if(bitmap0 != null && !bitmap0.isRecycled()) {
                            this.G(bitmap0, 0, ((Uri)parcelable2), ((Bundle)parcelable0).getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if(this.F == null) {
                        this.setImageUriAsync(((Uri)parcelable2));
                    }
                }
                int v1 = ((Bundle)parcelable0).getInt("DEGREES_ROTATED");
                this.L = v1;
                this.k = v1;
                Parcelable parcelable4 = ((Bundle)parcelable0).getParcelable("INITIAL_CROP_RECT");
                if(!(parcelable4 instanceof Rect)) {
                    parcelable4 = null;
                }
                if(((Rect)parcelable4) != null && (((Rect)parcelable4).width() > 0 || ((Rect)parcelable4).height() > 0)) {
                    L.m(this.b);
                    this.b.setInitialCropWindowRect(((Rect)parcelable4));
                }
                Parcelable parcelable5 = ((Bundle)parcelable0).getParcelable("CROP_WINDOW_RECT");
                if(!(parcelable5 instanceof RectF)) {
                    parcelable5 = null;
                }
                if(((RectF)parcelable5) != null && (((RectF)parcelable5).width() > 0.0f || ((RectF)parcelable5).height() > 0.0f)) {
                    this.K = (RectF)parcelable5;
                }
                L.m(this.b);
                String s1 = ((Bundle)parcelable0).getString("CROP_SHAPE");
                L.m(s1);
                this.b.setCropShape(com.canhub.cropper.CropImageView.d.valueOf(s1));
                this.y = ((Bundle)parcelable0).getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.z = ((Bundle)parcelable0).getInt("CROP_MAX_ZOOM");
                this.l = ((Bundle)parcelable0).getBoolean("CROP_FLIP_HORIZONTALLY");
                this.m = ((Bundle)parcelable0).getBoolean("CROP_FLIP_VERTICALLY");
                boolean z = ((Bundle)parcelable0).getBoolean("SHOW_CROP_LABEL");
                this.t = z;
                this.b.setCropperTextLabelVisibility(z);
            }
            Parcelable parcelable6 = ((Bundle)parcelable0).getParcelable("instanceState");
            if(parcelable6 instanceof Parcelable) {
                parcelable1 = parcelable6;
            }
            super.onRestoreInstanceState(parcelable1);
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    @m
    public Parcelable onSaveInstanceState() {
        Uri uri0;
        if(this.F == null && this.i == null && this.p < 1) {
            return super.onSaveInstanceState();
        }
        Parcelable parcelable0 = new Bundle();
        if(!this.r || this.F != null || this.p >= 1) {
            uri0 = this.F;
        }
        else {
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            uri0 = com.canhub.cropper.d.a.K(context0, this.i, this.P);
        }
        if(uri0 != null && this.i != null) {
            L.o("59fe948a-fe1c-462e-a7ec-865dfbc67042", "toString(...)");
            Pair pair0 = new Pair("59fe948a-fe1c-462e-a7ec-865dfbc67042", new WeakReference(this.i));
            com.canhub.cropper.d.a.I(pair0);
            ((BaseBundle)parcelable0).putString("LOADED_IMAGE_STATE_BITMAP_KEY", "59fe948a-fe1c-462e-a7ec-865dfbc67042");
        }
        com.canhub.cropper.b b0 = this.N == null ? null : ((com.canhub.cropper.b)this.N.get());
        if(b0 != null) {
            ((Bundle)parcelable0).putParcelable("LOADING_IMAGE_URI", b0.h());
        }
        ((Bundle)parcelable0).putParcelable("instanceState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("LOADED_IMAGE_URI", uri0);
        ((BaseBundle)parcelable0).putInt("LOADED_IMAGE_RESOURCE", this.p);
        ((BaseBundle)parcelable0).putInt("LOADED_SAMPLE_SIZE", this.G);
        ((BaseBundle)parcelable0).putInt("DEGREES_ROTATED", this.k);
        L.m(this.b);
        ((Bundle)parcelable0).putParcelable("INITIAL_CROP_RECT", this.b.getInitialCropWindowRect());
        RectF rectF0 = this.b.getCropWindowRect();
        com.canhub.cropper.d.a.u().set(rectF0);
        this.c.invert(this.d);
        this.d.mapRect(com.canhub.cropper.d.a.u());
        ((Bundle)parcelable0).putParcelable("CROP_WINDOW_RECT", com.canhub.cropper.d.a.u());
        com.canhub.cropper.CropImageView.d cropImageView$d0 = this.b.getCropShape();
        L.m(cropImageView$d0);
        ((BaseBundle)parcelable0).putString("CROP_SHAPE", cropImageView$d0.name());
        ((Bundle)parcelable0).putBoolean("CROP_AUTO_ZOOM_ENABLED", this.y);
        ((BaseBundle)parcelable0).putInt("CROP_MAX_ZOOM", this.z);
        ((Bundle)parcelable0).putBoolean("CROP_FLIP_HORIZONTALLY", this.l);
        ((Bundle)parcelable0).putBoolean("CROP_FLIP_VERTICALLY", this.m);
        ((Bundle)parcelable0).putBoolean("SHOW_CROP_LABEL", this.t);
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.M = v2 > 0 && v3 > 0;
    }

    public static Bitmap p(CropImageView cropImageView0, int v, int v1, k cropImageView$k0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            cropImageView$k0 = k.c;
        }
        return cropImageView0.o(v, v1, cropImageView$k0);
    }

    private final void q(boolean z, boolean z1) {
        int v = this.getWidth();
        int v1 = this.getHeight();
        if(this.i != null && v > 0 && v1 > 0) {
            float f = 1.0f;
            L.m(this.b);
            RectF rectF0 = this.b.getCropWindowRect();
            if(!z) {
                if(this.y || this.H > 1.0f) {
                    float f1 = this.H >= ((float)this.z) || rectF0.width() >= ((float)v) * 0.5f || rectF0.height() >= 0.5f * ((float)v1) ? 0.0f : Math.min(this.z, Math.min(((float)v) / (rectF0.width() / this.H / 0.64f), ((float)v1) / (rectF0.height() / this.H / 0.64f)));
                    if(this.H > 1.0f && (rectF0.width() > ((float)v) * 0.65f || rectF0.height() > ((float)v1) * 0.65f)) {
                        f1 = Math.max(1.0f, Math.min(((float)v) / (rectF0.width() / this.H / 0.51f), ((float)v1) / (rectF0.height() / this.H / 0.51f)));
                    }
                    if(this.y) {
                        f = f1;
                    }
                    if(f > 0.0f && f != this.H) {
                        if(z1) {
                            if(this.h == null) {
                                this.h = new com.canhub.cropper.k(this.a, this.b);
                            }
                            com.canhub.cropper.k k0 = this.h;
                            L.m(k0);
                            k0.b(this.f, this.c);
                        }
                        this.H = f;
                        this.d(((float)v), ((float)v1), true, z1);
                    }
                }
            }
            else if(rectF0.left < 0.0f || rectF0.top < 0.0f || rectF0.right > ((float)v) || rectF0.bottom > ((float)v1)) {
                this.d(((float)v), ((float)v1), false, false);
            }
            i cropImageView$i0 = this.C;
            if(cropImageView$i0 != null && !z) {
                L.m(cropImageView$i0);
                cropImageView$i0.a();
            }
        }
    }

    public final boolean r() {
        return this.y;
    }

    public final boolean s() {
        L.m(this.b);
        return this.b.o();
    }

    public final void setAutoZoomEnabled(boolean z) {
        if(this.y != z) {
            this.y = z;
            this.q(false, false);
            L.m(this.b);
            this.b.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean z) {
        L.m(this.b);
        if(this.b.w(z)) {
            this.q(false, false);
            this.b.invalidate();
        }
    }

    public final void setCornerShape(@m com.canhub.cropper.CropImageView.b cropImageView$b0) {
        L.m(this.b);
        L.m(cropImageView$b0);
        this.b.setCropCornerShape(cropImageView$b0);
    }

    public final void setCropLabelText(@l String s) {
        L.p(s, "cropLabelText");
        this.u = s;
        CropOverlayView cropOverlayView0 = this.b;
        if(cropOverlayView0 != null) {
            cropOverlayView0.setCropLabelText(s);
        }
    }

    public final void setCropLabelTextColor(int v) {
        this.w = v;
        CropOverlayView cropOverlayView0 = this.b;
        if(cropOverlayView0 != null) {
            cropOverlayView0.setCropLabelTextColor(v);
        }
    }

    public final void setCropLabelTextSize(float f) {
        this.v = this.getCropLabelTextSize();
        CropOverlayView cropOverlayView0 = this.b;
        if(cropOverlayView0 != null) {
            cropOverlayView0.setCropLabelTextSize(f);
        }
    }

    public final void setCropRect(@m Rect rect0) {
        L.m(this.b);
        this.b.setInitialCropWindowRect(rect0);
    }

    public final void setCropShape(@m com.canhub.cropper.CropImageView.d cropImageView$d0) {
        L.m(this.b);
        L.m(cropImageView$d0);
        this.b.setCropShape(cropImageView$d0);
    }

    public final void setCustomOutputUri(@m Uri uri0) {
        this.P = uri0;
    }

    public final void setFixedAspectRatio(boolean z) {
        L.m(this.b);
        this.b.setFixedAspectRatio(z);
    }

    public final void setFlippedHorizontally(boolean z) {
        if(this.l != z) {
            this.l = z;
            this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
        }
    }

    public final void setFlippedVertically(boolean z) {
        if(this.m != z) {
            this.m = z;
            this.d(((float)this.getWidth()), ((float)this.getHeight()), true, false);
        }
    }

    public final void setGuidelines(@m e cropImageView$e0) {
        L.m(this.b);
        L.m(cropImageView$e0);
        this.b.setGuidelines(cropImageView$e0);
    }

    public final void setImageBitmap(@m Bitmap bitmap0) {
        L.m(this.b);
        this.b.setInitialCropWindowRect(null);
        this.G(bitmap0, 0, null, 1, 0);
    }

    public final void setImageCropOptions(@l CropImageOptions cropImageOptions0) {
        L.p(cropImageOptions0, "options");
        this.setScaleType(cropImageOptions0.i);
        this.P = cropImageOptions0.P;
        CropOverlayView cropOverlayView0 = this.b;
        if(cropOverlayView0 != null) {
            cropOverlayView0.setInitialAttributeValues(cropImageOptions0);
        }
        this.setMultiTouchEnabled(cropImageOptions0.o);
        this.setCenterMoveEnabled(cropImageOptions0.p);
        this.setShowCropOverlay(cropImageOptions0.j);
        this.setShowProgressBar(cropImageOptions0.l);
        this.setAutoZoomEnabled(cropImageOptions0.n);
        this.setMaxZoom(cropImageOptions0.r);
        this.setFlippedHorizontally(cropImageOptions0.U8);
        this.setFlippedVertically(cropImageOptions0.V8);
        this.y = cropImageOptions0.n;
        this.s = cropImageOptions0.j;
        this.x = cropImageOptions0.l;
        ColorStateList colorStateList0 = ColorStateList.valueOf(cropImageOptions0.m);
        this.e.setIndeterminateTintList(colorStateList0);
    }

    public final void setImageResource(int v) {
        if(v != 0) {
            L.m(this.b);
            this.b.setInitialCropWindowRect(null);
            this.G(BitmapFactory.decodeResource(this.getResources(), v), v, null, 1, 0);
        }
    }

    public final void setImageUriAsync(@m Uri uri0) {
        if(uri0 != null) {
            WeakReference weakReference0 = this.N;
            if(weakReference0 != null) {
                com.canhub.cropper.b b0 = (com.canhub.cropper.b)weakReference0.get();
                if(b0 != null) {
                    b0.g();
                }
            }
            this.g();
            L.m(this.b);
            this.b.setInitialCropWindowRect(null);
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            WeakReference weakReference1 = new WeakReference(new com.canhub.cropper.b(context0, this, uri0));
            this.N = weakReference1;
            com.canhub.cropper.b b1 = (com.canhub.cropper.b)weakReference1.get();
            if(b1 != null) {
                b1.j();
            }
            this.L();
        }
    }

    public final void setMaxZoom(int v) {
        if(this.z != v && v > 0) {
            this.z = v;
            this.q(false, false);
            L.m(this.b);
            this.b.invalidate();
        }
    }

    public final void setMultiTouchEnabled(boolean z) {
        L.m(this.b);
        if(this.b.A(z)) {
            this.q(false, false);
            this.b.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(@m f cropImageView$f0) {
        this.E = cropImageView$f0;
    }

    public final void setOnCropWindowChangedListener(@m i cropImageView$i0) {
        this.C = cropImageView$i0;
    }

    public final void setOnSetCropOverlayMovedListener(@m g cropImageView$g0) {
        this.B = cropImageView$g0;
    }

    public final void setOnSetCropOverlayReleasedListener(@m h cropImageView$h0) {
        this.A = cropImageView$h0;
    }

    public final void setOnSetImageUriCompleteListener(@m j cropImageView$j0) {
        this.D = cropImageView$j0;
    }

    public final void setRotatedDegrees(int v) {
        int v1 = this.k;
        if(v1 != v) {
            this.E(v - v1);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z) {
        this.r = z;
    }

    public final void setScaleType(@l com.canhub.cropper.CropImageView.l cropImageView$l0) {
        L.p(cropImageView$l0, "scaleType");
        if(cropImageView$l0 != this.q) {
            this.q = cropImageView$l0;
            this.H = 1.0f;
            this.J = 0.0f;
            this.I = 0.0f;
            CropOverlayView cropOverlayView0 = this.b;
            if(cropOverlayView0 != null) {
                cropOverlayView0.t();
            }
            this.requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z) {
        if(this.t != z) {
            this.t = z;
            CropOverlayView cropOverlayView0 = this.b;
            if(cropOverlayView0 != null) {
                cropOverlayView0.setCropperTextLabelVisibility(z);
            }
        }
    }

    public final void setShowCropOverlay(boolean z) {
        if(this.s != z) {
            this.s = z;
            this.H();
        }
    }

    public final void setShowProgressBar(boolean z) {
        if(this.x != z) {
            this.x = z;
            this.L();
        }
    }

    public final void setSnapRadius(float f) {
        if(f >= 0.0f) {
            L.m(this.b);
            this.b.setSnapRadius(f);
        }
    }

    public final boolean t() {
        return this.l;
    }

    public final boolean u() {
        return this.m;
    }

    public final boolean v() {
        return this.r;
    }

    @kotlin.k(message = "This functionality is deprecated, please remove it altogether or create an issue and explain WHY you need this.")
    public static void w() {
    }

    public final boolean x() {
        return this.t;
    }

    public final boolean y() {
        return this.s;
    }

    public final boolean z() {
        return this.x;
    }
}

