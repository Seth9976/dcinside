package com.canhub.cropper;

import O3.d;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Px;
import androidx.compose.foundation.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.m;
import z3.f;
import z3.j;

@d
@s0({"SMAP\nCropImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageOptions.kt\ncom/canhub/cropper/CropImageOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class CropImageOptions implements Parcelable {
    public static final class a implements Parcelable.Creator {
        public final CropImageOptions a(Parcel parcel0) {
            L.p(parcel0, "parcel");
            boolean z = parcel0.readInt() != 0;
            boolean z1 = parcel0.readInt() != 0;
            com.canhub.cropper.CropImageView.d cropImageView$d0 = com.canhub.cropper.CropImageView.d.valueOf(parcel0.readString());
            b cropImageView$b0 = b.valueOf(parcel0.readString());
            float f = parcel0.readFloat();
            float f1 = parcel0.readFloat();
            float f2 = parcel0.readFloat();
            e cropImageView$e0 = e.valueOf(parcel0.readString());
            l cropImageView$l0 = l.valueOf(parcel0.readString());
            boolean z2 = parcel0.readInt() != 0;
            boolean z3 = parcel0.readInt() != 0;
            boolean z4 = parcel0.readInt() != 0;
            int v = parcel0.readInt();
            boolean z5 = parcel0.readInt() != 0;
            boolean z6 = parcel0.readInt() != 0;
            boolean z7 = parcel0.readInt() != 0;
            boolean z8 = parcel0.readInt() != 0;
            int v1 = parcel0.readInt();
            float f3 = parcel0.readFloat();
            boolean z9 = parcel0.readInt() != 0;
            int v2 = parcel0.readInt();
            int v3 = parcel0.readInt();
            float f4 = parcel0.readFloat();
            int v4 = parcel0.readInt();
            float f5 = parcel0.readFloat();
            float f6 = parcel0.readFloat();
            float f7 = parcel0.readFloat();
            int v5 = parcel0.readInt();
            int v6 = parcel0.readInt();
            float f8 = parcel0.readFloat();
            int v7 = parcel0.readInt();
            int v8 = parcel0.readInt();
            int v9 = parcel0.readInt();
            int v10 = parcel0.readInt();
            int v11 = parcel0.readInt();
            int v12 = parcel0.readInt();
            int v13 = parcel0.readInt();
            int v14 = parcel0.readInt();
            Parcelable.Creator parcelable$Creator0 = TextUtils.CHAR_SEQUENCE_CREATOR;
            CharSequence charSequence0 = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
            int v15 = parcel0.readInt();
            Integer integer0 = parcel0.readInt() == 0 ? null : parcel0.readInt();
            Parcelable parcelable0 = parcel0.readParcelable(CropImageOptions.class.getClassLoader());
            Bitmap.CompressFormat bitmap$CompressFormat0 = Bitmap.CompressFormat.valueOf(parcel0.readString());
            int v16 = parcel0.readInt();
            int v17 = parcel0.readInt();
            int v18 = parcel0.readInt();
            k cropImageView$k0 = k.valueOf(parcel0.readString());
            boolean z10 = parcel0.readInt() != 0;
            Parcelable parcelable1 = parcel0.readParcelable(CropImageOptions.class.getClassLoader());
            int v19 = parcel0.readInt();
            boolean z11 = parcel0.readInt() != 0;
            boolean z12 = parcel0.readInt() != 0;
            boolean z13 = parcel0.readInt() != 0;
            int v20 = parcel0.readInt();
            boolean z14 = parcel0.readInt() != 0;
            boolean z15 = parcel0.readInt() != 0;
            Object object0 = parcelable$Creator0.createFromParcel(parcel0);
            int v21 = parcel0.readInt();
            boolean z16 = parcel0.readInt() != 0;
            boolean z17 = parcel0.readInt() != 0;
            String s = parcel0.readString();
            ArrayList arrayList0 = parcel0.createStringArrayList();
            float f9 = parcel0.readFloat();
            int v22 = parcel0.readInt();
            String s1 = parcel0.readString();
            int v23 = parcel0.readInt();
            Integer integer1 = parcel0.readInt() == 0 ? null : parcel0.readInt();
            Integer integer2 = parcel0.readInt() == 0 ? null : parcel0.readInt();
            Integer integer3 = parcel0.readInt() == 0 ? null : parcel0.readInt();
            return parcel0.readInt() == 0 ? new CropImageOptions(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, ((Uri)parcelable0), bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, ((Rect)parcelable1), v19, z11, z12, z13, v20, z14, z15, ((CharSequence)object0), v21, z16, z17, s, arrayList0, f9, v22, s1, v23, integer1, integer2, integer3, null) : new CropImageOptions(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, ((Uri)parcelable0), bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, ((Rect)parcelable1), v19, z11, z12, z13, v20, z14, z15, ((CharSequence)object0), v21, z16, z17, s, arrayList0, f9, v22, s1, v23, integer1, integer2, integer3, parcel0.readInt());
        }

        public final CropImageOptions[] b(int v) {
            return new CropImageOptions[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    @f
    public float A;
    @f
    public int B;
    @f
    public int C;
    @y4.l
    public static final Parcelable.Creator CREATOR;
    @f
    public float D;
    @f
    public int E;
    @f
    public int F;
    @f
    public int G;
    @f
    public int H;
    @f
    public int I;
    @f
    public int J;
    @f
    public int K;
    @f
    public int L;
    @y4.l
    @f
    public CharSequence M;
    @y4.l
    @f
    public k M8;
    @f
    public int N;
    @f
    public boolean N8;
    @m
    @f
    public Integer O;
    @m
    @f
    public Rect O8;
    @m
    @f
    public Uri P;
    @f
    public int P8;
    @y4.l
    @f
    public Bitmap.CompressFormat Q;
    @f
    public boolean Q8;
    @f
    public boolean R8;
    @f
    public boolean S8;
    @f
    public int T8;
    @f
    public boolean U8;
    @f
    public boolean V8;
    @m
    @f
    public CharSequence W8;
    @f
    public int X;
    @f
    public int X8;
    @f
    public int Y;
    @f
    public boolean Y8;
    @f
    public int Z;
    @f
    public boolean Z8;
    @f
    public boolean a;
    @m
    @f
    public String a9;
    @f
    public boolean b;
    @m
    @f
    public List b9;
    @y4.l
    @f
    public com.canhub.cropper.CropImageView.d c;
    @f
    public float c9;
    @y4.l
    @f
    public b d;
    @f
    public int d9;
    @f
    public float e;
    @m
    @f
    public String e9;
    @f
    public float f;
    @f
    public int f9;
    @f
    public float g;
    @m
    @f
    public Integer g9;
    @y4.l
    @f
    public e h;
    @m
    @f
    public Integer h9;
    @y4.l
    @f
    public l i;
    @m
    @f
    public Integer i9;
    @f
    public boolean j;
    @m
    @f
    public Integer j9;
    @f
    public boolean k;
    @f
    public boolean l;
    @f
    public int m;
    @f
    public boolean n;
    @f
    public boolean o;
    @f
    public boolean p;
    @f
    public boolean q;
    @f
    public int r;
    @f
    public float s;
    @f
    public boolean t;
    @f
    public int u;
    @f
    public int v;
    @f
    public float w;
    @f
    public int x;
    @f
    public float y;
    @f
    public float z;

    static {
        CropImageOptions.CREATOR = new a();
    }

    @j
    public CropImageOptions() {
        this(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z) {
        this(z, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -2, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1) {
        this(z, z1, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -4, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0) {
        L.p(cropImageView$d0, "cropShape");
        this(z, z1, cropImageView$d0, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -8, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        this(z, z1, cropImageView$d0, cropImageView$b0, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -16, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFFFE0, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFFFC0, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFFF80, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFFF00, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFFE00, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFFC00, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFF800, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFF000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFE000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFFC000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFF8000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFF0000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFE0000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFFC0000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFF80000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFF00000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFE00000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFFC00000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFF800000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFF000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFE000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xFC000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xF8000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xF0000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xE0000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0xC0000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0x80000000, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, -1, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, -2, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, -4, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, -8, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, -16, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFFFE0, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFFFC0, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFFF80, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFFF00, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFFE00, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFFC00, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFF800, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFF000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFE000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFFC000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFF8000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFF0000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFE0000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFFC0000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFF80000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFF00000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFE00000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFFC00000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFF800000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFF000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFE000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xFC000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, false, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xF8000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, null, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xF0000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, null, 0.0f, 0, null, 0, null, null, null, null, 0, 0xE0000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, 0.0f, 0, null, 0, null, null, null, null, 0, 0xC0000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, 0, null, 0, null, null, null, null, 0, 0x80000000, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, v22, null, 0, null, null, null, null, 0, 0, 0x3F, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22, @m String s1) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, v22, s1, 0, null, null, null, null, 0, 0, 62, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22, @m String s1, @ColorInt int v23) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, v22, s1, v23, null, null, null, null, 0, 0, 60, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22, @m String s1, @ColorInt int v23, @ColorInt @m Integer integer1) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, v22, s1, v23, integer1, null, null, null, 0, 0, 56, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22, @m String s1, @ColorInt int v23, @ColorInt @m Integer integer1, @ColorInt @m Integer integer2) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, v22, s1, v23, integer1, integer2, null, null, 0, 0, 0x30, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22, @m String s1, @ColorInt int v23, @ColorInt @m Integer integer1, @ColorInt @m Integer integer2, @ColorInt @m Integer integer3) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        this(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, v22, s1, v23, integer1, integer2, integer3, null, 0, 0, 0x20, null);
    }

    @j
    public CropImageOptions(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22, @m String s1, @ColorInt int v23, @ColorInt @m Integer integer1, @ColorInt @m Integer integer2, @ColorInt @m Integer integer3, @ColorInt @m Integer integer4) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        super();
        this.a = z;
        this.b = z1;
        this.c = cropImageView$d0;
        this.d = cropImageView$b0;
        this.e = f;
        this.f = f1;
        this.g = f2;
        this.h = cropImageView$e0;
        this.i = cropImageView$l0;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = v;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = v1;
        this.s = f3;
        this.t = z9;
        this.u = v2;
        this.v = v3;
        this.w = f4;
        this.x = v4;
        this.y = f5;
        this.z = f6;
        this.A = f7;
        this.B = v5;
        this.C = v6;
        this.D = f8;
        this.E = v7;
        this.F = v8;
        this.G = v9;
        this.H = v10;
        this.I = v11;
        this.J = v12;
        this.K = v13;
        this.L = v14;
        this.M = charSequence0;
        this.N = v15;
        this.O = integer0;
        this.P = uri0;
        this.Q = bitmap$CompressFormat0;
        this.X = v16;
        this.Y = v17;
        this.Z = v18;
        this.M8 = cropImageView$k0;
        this.N8 = z10;
        this.O8 = rect0;
        this.P8 = v19;
        this.Q8 = z11;
        this.R8 = z12;
        this.S8 = z13;
        this.T8 = v20;
        this.U8 = z14;
        this.V8 = z15;
        this.W8 = charSequence1;
        this.X8 = v21;
        this.Y8 = z16;
        this.Z8 = z17;
        this.a9 = s;
        this.b9 = list0;
        this.c9 = f9;
        this.d9 = v22;
        this.e9 = s1;
        this.f9 = v23;
        this.g9 = integer1;
        this.h9 = integer2;
        this.i9 = integer3;
        this.j9 = integer4;
        if(v1 < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if(f2 < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        if(f3 < 0.0f || ((double)f3) >= 0.5) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if(v2 <= 0 || v3 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if(f4 < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if(f5 < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if(f8 < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if(v10 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        if(v11 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        if(v12 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if(v13 < v11) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if(v14 < v12) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if(v17 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if(v18 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        if(v20 < 0 || v20 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    public CropImageOptions(boolean z, boolean z1, com.canhub.cropper.CropImageView.d cropImageView$d0, b cropImageView$b0, float f, float f1, float f2, e cropImageView$e0, l cropImageView$l0, boolean z2, boolean z3, boolean z4, int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, float f4, int v4, float f5, float f6, float f7, int v5, int v6, float f8, int v7, int v8, int v9, int v10, int v11, int v12, int v13, int v14, CharSequence charSequence0, int v15, Integer integer0, Uri uri0, Bitmap.CompressFormat bitmap$CompressFormat0, int v16, int v17, int v18, k cropImageView$k0, boolean z10, Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, CharSequence charSequence1, int v21, boolean z16, boolean z17, String s, List list0, float f9, int v22, String s1, int v23, Integer integer1, Integer integer2, Integer integer3, Integer integer4, int v24, int v25, int v26, w w0) {
        float f18;
        k cropImageView$k2;
        com.canhub.cropper.CropImageView.d cropImageView$d1 = (v24 & 4) == 0 ? cropImageView$d0 : com.canhub.cropper.CropImageView.d.a;
        b cropImageView$b1 = (v24 & 8) == 0 ? cropImageView$b0 : b.a;
        float f10 = (v24 & 16) == 0 ? f : TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics());
        float f11 = (v24 & 0x20) == 0 ? f1 : TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        float f12 = (v24 & 0x40) == 0 ? f2 : TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics());
        e cropImageView$e1 = (v24 & 0x80) == 0 ? cropImageView$e0 : e.c;
        l cropImageView$l1 = (v24 & 0x100) == 0 ? cropImageView$l0 : l.a;
        int v27 = (v24 & 0x1000) == 0 ? v : Color.rgb(0x99, 51, 0x99);
        float f13 = (v24 & 0x400000) == 0 ? f4 : TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        int v28 = (0x800000 & v24) == 0 ? v4 : Color.argb(170, 0xFF, 0xFF, 0xFF);
        float f14 = (v24 & 0x1000000) == 0 ? f5 : TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        float f15 = (0x2000000 & v24) == 0 ? f6 : TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
        float f16 = (0x4000000 & v24) == 0 ? f7 : TypedValue.applyDimension(1, 14.0f, Resources.getSystem().getDisplayMetrics());
        float f17 = (v24 & 0x20000000) == 0 ? f8 : TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
        int v29 = (0x40000000 & v24) == 0 ? v7 : Color.argb(170, 0xFF, 0xFF, 0xFF);
        int v30 = (v24 & 0x80000000) == 0 ? v8 : Color.argb(0x77, 0, 0, 0);
        int v31 = (v25 & 1) == 0 ? v9 : ((int)TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()));
        int v32 = (v25 & 2) == 0 ? v10 : ((int)TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()));
        CharSequence charSequence2 = (v25 & 0x40) == 0 ? charSequence0 : "";
        Integer integer5 = null;
        Bitmap.CompressFormat bitmap$CompressFormat1 = (v25 & 0x400) == 0 ? bitmap$CompressFormat0 : Bitmap.CompressFormat.JPEG;
        k cropImageView$k1 = (v25 & 0x4000) == 0 ? cropImageView$k0 : k.a;
        List list1 = (v25 & 0x20000000) == 0 ? list0 : u.H();
        if((v25 & 0x40000000) == 0) {
            cropImageView$k2 = cropImageView$k1;
            f18 = f9;
        }
        else {
            cropImageView$k2 = cropImageView$k1;
            f18 = TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics());
        }
        if((v26 & 0x20) == 0) {
            integer5 = integer4;
        }
        this(((v24 & 1) == 0 ? z : true), ((v24 & 2) == 0 ? z1 : true), cropImageView$d1, cropImageView$b1, f10, f11, f12, cropImageView$e1, cropImageView$l1, ((v24 & 0x200) == 0 ? z2 : true), ((v24 & 0x400) == 0 ? z3 : false), ((v24 & 0x800) == 0 ? z4 : true), v27, ((v24 & 0x2000) == 0 ? z5 : true), ((v24 & 0x4000) == 0 ? z6 : false), ((v24 & 0x8000) == 0 ? z7 : true), ((v24 & 0x10000) == 0 ? z8 : true), ((v24 & 0x20000) == 0 ? v1 : 4), ((v24 & 0x40000) == 0 ? f3 : 0.0f), ((v24 & 0x80000) == 0 ? z9 : false), ((v24 & 0x100000) == 0 ? v2 : 1), ((v24 & 0x200000) == 0 ? v3 : 1), f13, v28, f14, f15, f16, ((0x8000000 & v24) == 0 ? v5 : -1), ((v24 & 0x10000000) == 0 ? v6 : -1), f17, v29, v30, v31, v32, ((v25 & 4) == 0 ? v11 : 40), ((v25 & 8) == 0 ? v12 : 40), ((v25 & 16) == 0 ? v13 : 0x1869F), ((v25 & 0x20) == 0 ? v14 : 0x1869F), charSequence2, ((v25 & 0x80) == 0 ? v15 : 0), ((v25 & 0x100) == 0 ? integer0 : null), ((v25 & 0x200) == 0 ? uri0 : null), bitmap$CompressFormat1, ((v25 & 0x800) == 0 ? v16 : 90), ((v25 & 0x1000) == 0 ? v17 : 0), ((v25 & 0x2000) == 0 ? v18 : 0), cropImageView$k2, ((v25 & 0x8000) == 0 ? z10 : false), ((v25 & 0x10000) == 0 ? rect0 : null), ((v25 & 0x20000) == 0 ? v19 : -1), ((v25 & 0x40000) == 0 ? z11 : true), ((v25 & 0x80000) == 0 ? z12 : true), ((v25 & 0x100000) == 0 ? z13 : false), ((v25 & 0x200000) == 0 ? v20 : 90), ((v25 & 0x400000) == 0 ? z14 : false), ((v25 & 0x800000) == 0 ? z15 : false), ((v25 & 0x1000000) == 0 ? charSequence1 : null), ((v25 & 0x2000000) == 0 ? v21 : 0), ((v25 & 0x4000000) == 0 ? z16 : false), ((v25 & 0x8000000) == 0 ? z17 : false), ((v25 & 0x10000000) == 0 ? s : null), list1, f18, ((v25 & 0x80000000) == 0 ? v22 : -1), ((v26 & 1) == 0 ? s1 : ""), ((v26 & 2) == 0 ? v23 : -1), ((v26 & 4) == 0 ? integer1 : null), ((v26 & 8) == 0 ? integer2 : null), ((v26 & 16) == 0 ? integer3 : null), integer5);
    }

    public final int A() {
        return this.C;
    }

    @y4.l
    public final l A0() {
        return this.i;
    }

    @y4.l
    public final com.canhub.cropper.CropImageView.d B() {
        return this.c;
    }

    @y4.l
    public final CropImageOptions B0(boolean z, boolean z1, @y4.l com.canhub.cropper.CropImageView.d cropImageView$d0, @y4.l b cropImageView$b0, @Px float f, @Px float f1, @Px float f2, @y4.l e cropImageView$e0, @y4.l l cropImageView$l0, boolean z2, boolean z3, boolean z4, @ColorInt int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, @Px float f4, @ColorInt int v4, @Px float f5, @Px float f6, @Px float f7, @ColorInt int v5, @ColorInt int v6, @Px float f8, @ColorInt int v7, @ColorInt int v8, @Px int v9, @Px int v10, @Px int v11, @Px int v12, @Px int v13, @Px int v14, @y4.l CharSequence charSequence0, @ColorInt int v15, @ColorInt @m Integer integer0, @m Uri uri0, @y4.l Bitmap.CompressFormat bitmap$CompressFormat0, int v16, @Px int v17, @Px int v18, @y4.l k cropImageView$k0, boolean z10, @m Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, @m CharSequence charSequence1, @DrawableRes int v21, boolean z16, boolean z17, @m String s, @m List list0, @Px float f9, @ColorInt int v22, @m String s1, @ColorInt int v23, @ColorInt @m Integer integer1, @ColorInt @m Integer integer2, @ColorInt @m Integer integer3, @ColorInt @m Integer integer4) {
        L.p(cropImageView$d0, "cropShape");
        L.p(cropImageView$b0, "cornerShape");
        L.p(cropImageView$e0, "guidelines");
        L.p(cropImageView$l0, "scaleType");
        L.p(charSequence0, "activityTitle");
        L.p(bitmap$CompressFormat0, "outputCompressFormat");
        L.p(cropImageView$k0, "outputRequestSizeOptions");
        return new CropImageOptions(z, z1, cropImageView$d0, cropImageView$b0, f, f1, f2, cropImageView$e0, cropImageView$l0, z2, z3, z4, v, z5, z6, z7, z8, v1, f3, z9, v2, v3, f4, v4, f5, f6, f7, v5, v6, f8, v7, v8, v9, v10, v11, v12, v13, v14, charSequence0, v15, integer0, uri0, bitmap$CompressFormat0, v16, v17, v18, cropImageView$k0, z10, rect0, v19, z11, z12, z13, v20, z14, z15, charSequence1, v21, z16, z17, s, list0, f9, v22, s1, v23, integer1, integer2, integer3, integer4);
    }

    public final float C() {
        return this.D;
    }

    public static CropImageOptions C0(CropImageOptions cropImageOptions0, boolean z, boolean z1, com.canhub.cropper.CropImageView.d cropImageView$d0, b cropImageView$b0, float f, float f1, float f2, e cropImageView$e0, l cropImageView$l0, boolean z2, boolean z3, boolean z4, int v, boolean z5, boolean z6, boolean z7, boolean z8, int v1, float f3, boolean z9, int v2, int v3, float f4, int v4, float f5, float f6, float f7, int v5, int v6, float f8, int v7, int v8, int v9, int v10, int v11, int v12, int v13, int v14, CharSequence charSequence0, int v15, Integer integer0, Uri uri0, Bitmap.CompressFormat bitmap$CompressFormat0, int v16, int v17, int v18, k cropImageView$k0, boolean z10, Rect rect0, int v19, boolean z11, boolean z12, boolean z13, int v20, boolean z14, boolean z15, CharSequence charSequence1, int v21, boolean z16, boolean z17, String s, List list0, float f9, int v22, String s1, int v23, Integer integer1, Integer integer2, Integer integer3, Integer integer4, int v24, int v25, int v26, Object object0) {
        boolean z18 = (v24 & 1) == 0 ? z : cropImageOptions0.a;
        boolean z19 = (v24 & 2) == 0 ? z1 : cropImageOptions0.b;
        com.canhub.cropper.CropImageView.d cropImageView$d1 = (v24 & 4) == 0 ? cropImageView$d0 : cropImageOptions0.c;
        b cropImageView$b1 = (v24 & 8) == 0 ? cropImageView$b0 : cropImageOptions0.d;
        float f10 = (v24 & 16) == 0 ? f : cropImageOptions0.e;
        float f11 = (v24 & 0x20) == 0 ? f1 : cropImageOptions0.f;
        float f12 = (v24 & 0x40) == 0 ? f2 : cropImageOptions0.g;
        e cropImageView$e1 = (v24 & 0x80) == 0 ? cropImageView$e0 : cropImageOptions0.h;
        l cropImageView$l1 = (v24 & 0x100) == 0 ? cropImageView$l0 : cropImageOptions0.i;
        boolean z20 = (v24 & 0x200) == 0 ? z2 : cropImageOptions0.j;
        boolean z21 = (v24 & 0x400) == 0 ? z3 : cropImageOptions0.k;
        boolean z22 = (v24 & 0x800) == 0 ? z4 : cropImageOptions0.l;
        int v27 = (v24 & 0x1000) == 0 ? v : cropImageOptions0.m;
        boolean z23 = (v24 & 0x2000) == 0 ? z5 : cropImageOptions0.n;
        boolean z24 = (v24 & 0x4000) == 0 ? z6 : cropImageOptions0.o;
        boolean z25 = (v24 & 0x8000) == 0 ? z7 : cropImageOptions0.p;
        boolean z26 = (v24 & 0x10000) == 0 ? z8 : cropImageOptions0.q;
        int v28 = (v24 & 0x20000) == 0 ? v1 : cropImageOptions0.r;
        float f13 = (v24 & 0x40000) == 0 ? f3 : cropImageOptions0.s;
        boolean z27 = (v24 & 0x80000) == 0 ? z9 : cropImageOptions0.t;
        int v29 = (v24 & 0x100000) == 0 ? v2 : cropImageOptions0.u;
        int v30 = (v24 & 0x200000) == 0 ? v3 : cropImageOptions0.v;
        float f14 = (v24 & 0x400000) == 0 ? f4 : cropImageOptions0.w;
        int v31 = (v24 & 0x800000) == 0 ? v4 : cropImageOptions0.x;
        float f15 = (v24 & 0x1000000) == 0 ? f5 : cropImageOptions0.y;
        float f16 = (v24 & 0x2000000) == 0 ? f6 : cropImageOptions0.z;
        float f17 = (v24 & 0x4000000) == 0 ? f7 : cropImageOptions0.A;
        int v32 = (v24 & 0x8000000) == 0 ? v5 : cropImageOptions0.B;
        int v33 = (v24 & 0x10000000) == 0 ? v6 : cropImageOptions0.C;
        float f18 = (v24 & 0x20000000) == 0 ? f8 : cropImageOptions0.D;
        int v34 = (v24 & 0x40000000) == 0 ? v7 : cropImageOptions0.E;
        int v35 = (v24 & 0x80000000) == 0 ? v8 : cropImageOptions0.F;
        int v36 = (v25 & 1) == 0 ? v9 : cropImageOptions0.G;
        int v37 = (v25 & 2) == 0 ? v10 : cropImageOptions0.H;
        int v38 = (v25 & 4) == 0 ? v11 : cropImageOptions0.I;
        int v39 = (v25 & 8) == 0 ? v12 : cropImageOptions0.J;
        int v40 = (v25 & 16) == 0 ? v13 : cropImageOptions0.K;
        int v41 = (v25 & 0x20) == 0 ? v14 : cropImageOptions0.L;
        CharSequence charSequence2 = (v25 & 0x40) == 0 ? charSequence0 : cropImageOptions0.M;
        int v42 = (v25 & 0x80) == 0 ? v15 : cropImageOptions0.N;
        Integer integer5 = (v25 & 0x100) == 0 ? integer0 : cropImageOptions0.O;
        Uri uri1 = (v25 & 0x200) == 0 ? uri0 : cropImageOptions0.P;
        Bitmap.CompressFormat bitmap$CompressFormat1 = (v25 & 0x400) == 0 ? bitmap$CompressFormat0 : cropImageOptions0.Q;
        int v43 = (v25 & 0x800) == 0 ? v16 : cropImageOptions0.X;
        int v44 = (v25 & 0x1000) == 0 ? v17 : cropImageOptions0.Y;
        int v45 = (v25 & 0x2000) == 0 ? v18 : cropImageOptions0.Z;
        k cropImageView$k1 = (v25 & 0x4000) == 0 ? cropImageView$k0 : cropImageOptions0.M8;
        boolean z28 = (v25 & 0x8000) == 0 ? z10 : cropImageOptions0.N8;
        Rect rect1 = (v25 & 0x10000) == 0 ? rect0 : cropImageOptions0.O8;
        int v46 = (v25 & 0x20000) == 0 ? v19 : cropImageOptions0.P8;
        boolean z29 = (v25 & 0x40000) == 0 ? z11 : cropImageOptions0.Q8;
        boolean z30 = (v25 & 0x80000) == 0 ? z12 : cropImageOptions0.R8;
        boolean z31 = (v25 & 0x100000) == 0 ? z13 : cropImageOptions0.S8;
        int v47 = (v25 & 0x200000) == 0 ? v20 : cropImageOptions0.T8;
        boolean z32 = (v25 & 0x400000) == 0 ? z14 : cropImageOptions0.U8;
        boolean z33 = (v25 & 0x800000) == 0 ? z15 : cropImageOptions0.V8;
        CharSequence charSequence3 = (v25 & 0x1000000) == 0 ? charSequence1 : cropImageOptions0.W8;
        int v48 = (v25 & 0x2000000) == 0 ? v21 : cropImageOptions0.X8;
        boolean z34 = (v25 & 0x4000000) == 0 ? z16 : cropImageOptions0.Y8;
        boolean z35 = (v25 & 0x8000000) == 0 ? z17 : cropImageOptions0.Z8;
        String s2 = (v25 & 0x10000000) == 0 ? s : cropImageOptions0.a9;
        List list1 = (v25 & 0x20000000) == 0 ? list0 : cropImageOptions0.b9;
        float f19 = (v25 & 0x40000000) == 0 ? f9 : cropImageOptions0.c9;
        int v49 = (v25 & 0x80000000) == 0 ? v22 : cropImageOptions0.d9;
        String s3 = (v26 & 1) == 0 ? s1 : cropImageOptions0.e9;
        int v50 = (v26 & 2) == 0 ? v23 : cropImageOptions0.f9;
        Integer integer6 = (v26 & 4) == 0 ? integer1 : cropImageOptions0.g9;
        Integer integer7 = (v26 & 8) == 0 ? integer2 : cropImageOptions0.h9;
        Integer integer8 = (v26 & 16) == 0 ? integer3 : cropImageOptions0.i9;
        return (v26 & 0x20) == 0 ? cropImageOptions0.B0(z18, z19, cropImageView$d1, cropImageView$b1, f10, f11, f12, cropImageView$e1, cropImageView$l1, z20, z21, z22, v27, z23, z24, z25, z26, v28, f13, z27, v29, v30, f14, v31, f15, f16, f17, v32, v33, f18, v34, v35, v36, v37, v38, v39, v40, v41, charSequence2, v42, integer5, uri1, bitmap$CompressFormat1, v43, v44, v45, cropImageView$k1, z28, rect1, v46, z29, z30, z31, v47, z32, z33, charSequence3, v48, z34, z35, s2, list1, f19, v49, s3, v50, integer6, integer7, integer8, integer4) : cropImageOptions0.B0(z18, z19, cropImageView$d1, cropImageView$b1, f10, f11, f12, cropImageView$e1, cropImageView$l1, z20, z21, z22, v27, z23, z24, z25, z26, v28, f13, z27, v29, v30, f14, v31, f15, f16, f17, v32, v33, f18, v34, v35, v36, v37, v38, v39, v40, v41, charSequence2, v42, integer5, uri1, bitmap$CompressFormat1, v43, v44, v45, cropImageView$k1, z28, rect1, v46, z29, z30, z31, v47, z32, z33, charSequence3, v48, z34, z35, s2, list1, f19, v49, s3, v50, integer6, integer7, integer8, cropImageOptions0.j9);
    }

    public final int D() {
        return this.E;
    }

    public final int E() {
        return this.F;
    }

    public final int F() {
        return this.G;
    }

    public final int G() {
        return this.H;
    }

    public final int H() {
        return this.I;
    }

    public final int I() {
        return this.J;
    }

    public final int J() {
        return this.K;
    }

    public final int K() {
        return this.L;
    }

    @y4.l
    public final CharSequence L() {
        return this.M;
    }

    @y4.l
    public final b M() {
        return this.d;
    }

    public final int N() {
        return this.N;
    }

    @m
    public final Integer O() {
        return this.O;
    }

    @m
    public final Uri P() {
        return this.P;
    }

    @y4.l
    public final Bitmap.CompressFormat S() {
        return this.Q;
    }

    public final int U() {
        return this.X;
    }

    public final int V() {
        return this.Y;
    }

    public final int W() {
        return this.Z;
    }

    @y4.l
    public final k X() {
        return this.M8;
    }

    public final boolean Y() {
        return this.N8;
    }

    @m
    public final Rect Z() {
        return this.O8;
    }

    public final boolean a() {
        return this.a;
    }

    public final float a0() {
        return this.e;
    }

    public final int b0() {
        return this.P8;
    }

    public final boolean c() {
        return this.j;
    }

    public final boolean c0() {
        return this.Q8;
    }

    public final boolean d() {
        return this.k;
    }

    public final boolean d0() {
        return this.R8;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.l;
    }

    public final boolean e0() {
        return this.S8;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions0 = (CropImageOptions)object0;
        if(this.a != cropImageOptions0.a) {
            return false;
        }
        if(this.b != cropImageOptions0.b) {
            return false;
        }
        if(this.c != cropImageOptions0.c) {
            return false;
        }
        if(this.d != cropImageOptions0.d) {
            return false;
        }
        if(Float.compare(this.e, cropImageOptions0.e) != 0) {
            return false;
        }
        if(Float.compare(this.f, cropImageOptions0.f) != 0) {
            return false;
        }
        if(Float.compare(this.g, cropImageOptions0.g) != 0) {
            return false;
        }
        if(this.h != cropImageOptions0.h) {
            return false;
        }
        if(this.i != cropImageOptions0.i) {
            return false;
        }
        if(this.j != cropImageOptions0.j) {
            return false;
        }
        if(this.k != cropImageOptions0.k) {
            return false;
        }
        if(this.l != cropImageOptions0.l) {
            return false;
        }
        if(this.m != cropImageOptions0.m) {
            return false;
        }
        if(this.n != cropImageOptions0.n) {
            return false;
        }
        if(this.o != cropImageOptions0.o) {
            return false;
        }
        if(this.p != cropImageOptions0.p) {
            return false;
        }
        if(this.q != cropImageOptions0.q) {
            return false;
        }
        if(this.r != cropImageOptions0.r) {
            return false;
        }
        if(Float.compare(this.s, cropImageOptions0.s) != 0) {
            return false;
        }
        if(this.t != cropImageOptions0.t) {
            return false;
        }
        if(this.u != cropImageOptions0.u) {
            return false;
        }
        if(this.v != cropImageOptions0.v) {
            return false;
        }
        if(Float.compare(this.w, cropImageOptions0.w) != 0) {
            return false;
        }
        if(this.x != cropImageOptions0.x) {
            return false;
        }
        if(Float.compare(this.y, cropImageOptions0.y) != 0) {
            return false;
        }
        if(Float.compare(this.z, cropImageOptions0.z) != 0) {
            return false;
        }
        if(Float.compare(this.A, cropImageOptions0.A) != 0) {
            return false;
        }
        if(this.B != cropImageOptions0.B) {
            return false;
        }
        if(this.C != cropImageOptions0.C) {
            return false;
        }
        if(Float.compare(this.D, cropImageOptions0.D) != 0) {
            return false;
        }
        if(this.E != cropImageOptions0.E) {
            return false;
        }
        if(this.F != cropImageOptions0.F) {
            return false;
        }
        if(this.G != cropImageOptions0.G) {
            return false;
        }
        if(this.H != cropImageOptions0.H) {
            return false;
        }
        if(this.I != cropImageOptions0.I) {
            return false;
        }
        if(this.J != cropImageOptions0.J) {
            return false;
        }
        if(this.K != cropImageOptions0.K) {
            return false;
        }
        if(this.L != cropImageOptions0.L) {
            return false;
        }
        if(!L.g(this.M, cropImageOptions0.M)) {
            return false;
        }
        if(this.N != cropImageOptions0.N) {
            return false;
        }
        if(!L.g(this.O, cropImageOptions0.O)) {
            return false;
        }
        if(!L.g(this.P, cropImageOptions0.P)) {
            return false;
        }
        if(this.Q != cropImageOptions0.Q) {
            return false;
        }
        if(this.X != cropImageOptions0.X) {
            return false;
        }
        if(this.Y != cropImageOptions0.Y) {
            return false;
        }
        if(this.Z != cropImageOptions0.Z) {
            return false;
        }
        if(this.M8 != cropImageOptions0.M8) {
            return false;
        }
        if(this.N8 != cropImageOptions0.N8) {
            return false;
        }
        if(!L.g(this.O8, cropImageOptions0.O8)) {
            return false;
        }
        if(this.P8 != cropImageOptions0.P8) {
            return false;
        }
        if(this.Q8 != cropImageOptions0.Q8) {
            return false;
        }
        if(this.R8 != cropImageOptions0.R8) {
            return false;
        }
        if(this.S8 != cropImageOptions0.S8) {
            return false;
        }
        if(this.T8 != cropImageOptions0.T8) {
            return false;
        }
        if(this.U8 != cropImageOptions0.U8) {
            return false;
        }
        if(this.V8 != cropImageOptions0.V8) {
            return false;
        }
        if(!L.g(this.W8, cropImageOptions0.W8)) {
            return false;
        }
        if(this.X8 != cropImageOptions0.X8) {
            return false;
        }
        if(this.Y8 != cropImageOptions0.Y8) {
            return false;
        }
        if(this.Z8 != cropImageOptions0.Z8) {
            return false;
        }
        if(!L.g(this.a9, cropImageOptions0.a9)) {
            return false;
        }
        if(!L.g(this.b9, cropImageOptions0.b9)) {
            return false;
        }
        if(Float.compare(this.c9, cropImageOptions0.c9) != 0) {
            return false;
        }
        if(this.d9 != cropImageOptions0.d9) {
            return false;
        }
        if(!L.g(this.e9, cropImageOptions0.e9)) {
            return false;
        }
        if(this.f9 != cropImageOptions0.f9) {
            return false;
        }
        if(!L.g(this.g9, cropImageOptions0.g9)) {
            return false;
        }
        if(!L.g(this.h9, cropImageOptions0.h9)) {
            return false;
        }
        return L.g(this.i9, cropImageOptions0.i9) ? L.g(this.j9, cropImageOptions0.j9) : false;
    }

    public final int f() {
        return this.m;
    }

    public final int f0() {
        return this.T8;
    }

    public final boolean g() {
        return this.n;
    }

    public final boolean g0() {
        return this.U8;
    }

    public final boolean h() {
        return this.o;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((c.a(this.a) * 0x1F + c.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f)) * 0x1F + Float.floatToIntBits(this.g)) * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode()) * 0x1F + c.a(this.j)) * 0x1F + c.a(this.k)) * 0x1F + c.a(this.l)) * 0x1F + this.m) * 0x1F + c.a(this.n)) * 0x1F + c.a(this.o)) * 0x1F + c.a(this.p)) * 0x1F + c.a(this.q)) * 0x1F + this.r) * 0x1F + Float.floatToIntBits(this.s)) * 0x1F + c.a(this.t)) * 0x1F + this.u) * 0x1F + this.v) * 0x1F + Float.floatToIntBits(this.w)) * 0x1F + this.x) * 0x1F + Float.floatToIntBits(this.y)) * 0x1F + Float.floatToIntBits(this.z)) * 0x1F + Float.floatToIntBits(this.A)) * 0x1F + this.B) * 0x1F + this.C) * 0x1F + Float.floatToIntBits(this.D)) * 0x1F + this.E) * 0x1F + this.F) * 0x1F + this.G) * 0x1F + this.H) * 0x1F + this.I) * 0x1F + this.J) * 0x1F + this.K) * 0x1F + this.L) * 0x1F + this.M.hashCode()) * 0x1F + this.N) * 0x1F + (this.O == null ? 0 : this.O.hashCode())) * 0x1F + (this.P == null ? 0 : this.P.hashCode())) * 0x1F + this.Q.hashCode()) * 0x1F + this.X) * 0x1F + this.Y) * 0x1F + this.Z) * 0x1F + this.M8.hashCode()) * 0x1F + c.a(this.N8)) * 0x1F + (this.O8 == null ? 0 : this.O8.hashCode())) * 0x1F + this.P8) * 0x1F + c.a(this.Q8)) * 0x1F + c.a(this.R8)) * 0x1F + c.a(this.S8)) * 0x1F + this.T8) * 0x1F + c.a(this.U8)) * 0x1F + c.a(this.V8)) * 0x1F + (this.W8 == null ? 0 : this.W8.hashCode())) * 0x1F + this.X8) * 0x1F + c.a(this.Y8)) * 0x1F + c.a(this.Z8)) * 0x1F + (this.a9 == null ? 0 : this.a9.hashCode())) * 0x1F + (this.b9 == null ? 0 : this.b9.hashCode())) * 0x1F + Float.floatToIntBits(this.c9)) * 0x1F + this.d9) * 0x1F + (this.e9 == null ? 0 : this.e9.hashCode())) * 0x1F + this.f9) * 0x1F;
        int v2 = this.g9 == null ? 0 : this.g9.hashCode();
        int v3 = this.h9 == null ? 0 : this.h9.hashCode();
        int v4 = this.i9 == null ? 0 : this.i9.hashCode();
        Integer integer0 = this.j9;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    public final boolean i() {
        return this.p;
    }

    public final boolean i0() {
        return this.V8;
    }

    @m
    public final CharSequence j0() {
        return this.W8;
    }

    public final int k0() {
        return this.X8;
    }

    public final boolean l() {
        return this.q;
    }

    public final boolean l0() {
        return this.Y8;
    }

    public final int m() {
        return this.r;
    }

    public final float m0() {
        return this.f;
    }

    public final boolean n0() {
        return this.Z8;
    }

    public final float o() {
        return this.s;
    }

    @m
    public final String o0() {
        return this.a9;
    }

    @m
    public final List p0() {
        return this.b9;
    }

    public final boolean q() {
        return this.b;
    }

    public final float q0() {
        return this.c9;
    }

    public final boolean r() {
        return this.t;
    }

    public final int r0() {
        return this.d9;
    }

    public final int s() {
        return this.u;
    }

    @m
    public final String s0() {
        return this.e9;
    }

    public final int t() {
        return this.v;
    }

    public final int t0() {
        return this.f9;
    }

    @Override
    @y4.l
    public String toString() {
        return "CropImageOptions(imageSourceIncludeGallery=" + this.a + ", imageSourceIncludeCamera=" + this.b + ", cropShape=" + this.c + ", cornerShape=" + this.d + ", cropCornerRadius=" + this.e + ", snapRadius=" + this.f + ", touchRadius=" + this.g + ", guidelines=" + this.h + ", scaleType=" + this.i + ", showCropOverlay=" + this.j + ", showCropLabel=" + this.k + ", showProgressBar=" + this.l + ", progressBarColor=" + this.m + ", autoZoomEnabled=" + this.n + ", multiTouchEnabled=" + this.o + ", centerMoveEnabled=" + this.p + ", canChangeCropWindow=" + this.q + ", maxZoom=" + this.r + ", initialCropWindowPaddingRatio=" + this.s + ", fixAspectRatio=" + this.t + ", aspectRatioX=" + this.u + ", aspectRatioY=" + this.v + ", borderLineThickness=" + this.w + ", borderLineColor=" + this.x + ", borderCornerThickness=" + this.y + ", borderCornerOffset=" + this.z + ", borderCornerLength=" + this.A + ", borderCornerColor=" + this.B + ", circleCornerFillColorHexValue=" + this.C + ", guidelinesThickness=" + this.D + ", guidelinesColor=" + this.E + ", backgroundColor=" + this.F + ", minCropWindowWidth=" + this.G + ", minCropWindowHeight=" + this.H + ", minCropResultWidth=" + this.I + ", minCropResultHeight=" + this.J + ", maxCropResultWidth=" + this.K + ", maxCropResultHeight=" + this.L + ", activityTitle=" + this.M + ", activityMenuIconColor=" + this.N + ", activityMenuTextColor=" + this.O + ", customOutputUri=" + this.P + ", outputCompressFormat=" + this.Q + ", outputCompressQuality=" + this.X + ", outputRequestWidth=" + this.Y + ", outputRequestHeight=" + this.Z + ", outputRequestSizeOptions=" + this.M8 + ", noOutputImage=" + this.N8 + ", initialCropWindowRectangle=" + this.O8 + ", initialRotation=" + this.P8 + ", allowRotation=" + this.Q8 + ", allowFlipping=" + this.R8 + ", allowCounterRotation=" + this.S8 + ", rotationDegrees=" + this.T8 + ", flipHorizontally=" + this.U8 + ", flipVertically=" + this.V8 + ", cropMenuCropButtonTitle=" + this.W8 + ", cropMenuCropButtonIcon=" + this.X8 + ", skipEditing=" + this.Y8 + ", showIntentChooser=" + this.Z8 + ", intentChooserTitle=" + this.a9 + ", intentChooserPriorityList=" + this.b9 + ", cropperLabelTextSize=" + this.c9 + ", cropperLabelTextColor=" + this.d9 + ", cropperLabelText=" + this.e9 + ", activityBackgroundColor=" + this.f9 + ", toolbarColor=" + this.g9 + ", toolbarTitleColor=" + this.h9 + ", toolbarBackButtonColor=" + this.i9 + ", toolbarTintColor=" + this.j9 + ")";
    }

    public final float u() {
        return this.w;
    }

    @m
    public final Integer u0() {
        return this.g9;
    }

    public final int v() {
        return this.x;
    }

    @m
    public final Integer v0() {
        return this.h9;
    }

    public final float w() {
        return this.y;
    }

    @m
    public final Integer w0() {
        return this.i9;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@y4.l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeInt(((int)this.a));
        parcel0.writeInt(((int)this.b));
        parcel0.writeString(this.c.name());
        parcel0.writeString(this.d.name());
        parcel0.writeFloat(this.e);
        parcel0.writeFloat(this.f);
        parcel0.writeFloat(this.g);
        parcel0.writeString(this.h.name());
        parcel0.writeString(this.i.name());
        parcel0.writeInt(((int)this.j));
        parcel0.writeInt(((int)this.k));
        parcel0.writeInt(((int)this.l));
        parcel0.writeInt(this.m);
        parcel0.writeInt(((int)this.n));
        parcel0.writeInt(((int)this.o));
        parcel0.writeInt(((int)this.p));
        parcel0.writeInt(((int)this.q));
        parcel0.writeInt(this.r);
        parcel0.writeFloat(this.s);
        parcel0.writeInt(((int)this.t));
        parcel0.writeInt(this.u);
        parcel0.writeInt(this.v);
        parcel0.writeFloat(this.w);
        parcel0.writeInt(this.x);
        parcel0.writeFloat(this.y);
        parcel0.writeFloat(this.z);
        parcel0.writeFloat(this.A);
        parcel0.writeInt(this.B);
        parcel0.writeInt(this.C);
        parcel0.writeFloat(this.D);
        parcel0.writeInt(this.E);
        parcel0.writeInt(this.F);
        parcel0.writeInt(this.G);
        parcel0.writeInt(this.H);
        parcel0.writeInt(this.I);
        parcel0.writeInt(this.J);
        parcel0.writeInt(this.K);
        parcel0.writeInt(this.L);
        TextUtils.writeToParcel(this.M, parcel0, v);
        parcel0.writeInt(this.N);
        Integer integer0 = this.O;
        if(integer0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer0));
        }
        parcel0.writeParcelable(this.P, v);
        parcel0.writeString(this.Q.name());
        parcel0.writeInt(this.X);
        parcel0.writeInt(this.Y);
        parcel0.writeInt(this.Z);
        parcel0.writeString(this.M8.name());
        parcel0.writeInt(((int)this.N8));
        parcel0.writeParcelable(this.O8, v);
        parcel0.writeInt(this.P8);
        parcel0.writeInt(((int)this.Q8));
        parcel0.writeInt(((int)this.R8));
        parcel0.writeInt(((int)this.S8));
        parcel0.writeInt(this.T8);
        parcel0.writeInt(((int)this.U8));
        parcel0.writeInt(((int)this.V8));
        TextUtils.writeToParcel(this.W8, parcel0, v);
        parcel0.writeInt(this.X8);
        parcel0.writeInt(((int)this.Y8));
        parcel0.writeInt(((int)this.Z8));
        parcel0.writeString(this.a9);
        parcel0.writeStringList(this.b9);
        parcel0.writeFloat(this.c9);
        parcel0.writeInt(this.d9);
        parcel0.writeString(this.e9);
        parcel0.writeInt(this.f9);
        Integer integer1 = this.g9;
        if(integer1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer1));
        }
        Integer integer2 = this.h9;
        if(integer2 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer2));
        }
        Integer integer3 = this.i9;
        if(integer3 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer3));
        }
        Integer integer4 = this.j9;
        if(integer4 == null) {
            parcel0.writeInt(0);
            return;
        }
        parcel0.writeInt(1);
        parcel0.writeInt(((int)integer4));
    }

    public final float x() {
        return this.z;
    }

    public final float x0() {
        return this.g;
    }

    public final float y() {
        return this.A;
    }

    @m
    public final Integer y0() {
        return this.j9;
    }

    public final int z() {
        return this.B;
    }

    @y4.l
    public final e z0() {
        return this.h;
    }
}

