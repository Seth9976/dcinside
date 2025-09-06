package com.leinardi.android.speeddial;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SpeedDialActionItem implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public SpeedDialActionItem a(Parcel parcel0) {
            return new SpeedDialActionItem(parcel0);
        }

        public SpeedDialActionItem[] b(int v) {
            return new SpeedDialActionItem[v];
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

    public static class b {
        @IdRes
        private final int a;
        @DrawableRes
        private final int b;
        @Nullable
        private Drawable c;
        @ColorInt
        private int d;
        private boolean e;
        private String f;
        @Nullable
        private String g;
        @StringRes
        private int h;
        @Nullable
        private String i;
        @StringRes
        private int j;
        @ColorInt
        private int k;
        @ColorInt
        private int l;
        @ColorInt
        private int m;
        private boolean n;
        private int o;
        @StyleRes
        private int p;

        public b(@IdRes int v, @DrawableRes int v1) {
            this.d = 0x80000000;
            this.e = true;
            this.f = "normal";
            this.h = 0x80000000;
            this.j = 0x80000000;
            this.k = 0x80000000;
            this.l = 0x80000000;
            this.m = 0x80000000;
            this.n = true;
            this.o = -1;
            this.p = 0x80000000;
            this.a = v;
            this.b = v1;
            this.c = null;
        }

        public b(@IdRes int v, @Nullable Drawable drawable0) {
            this.d = 0x80000000;
            this.e = true;
            this.f = "normal";
            this.h = 0x80000000;
            this.j = 0x80000000;
            this.k = 0x80000000;
            this.l = 0x80000000;
            this.m = 0x80000000;
            this.n = true;
            this.o = -1;
            this.p = 0x80000000;
            this.a = v;
            this.c = drawable0;
            this.b = 0x80000000;
        }

        public b(SpeedDialActionItem speedDialActionItem0) {
            this.a = speedDialActionItem0.a;
            this.g = speedDialActionItem0.b;
            this.h = speedDialActionItem0.c;
            this.i = speedDialActionItem0.d;
            this.j = speedDialActionItem0.e;
            this.b = speedDialActionItem0.f;
            this.c = speedDialActionItem0.g;
            this.d = speedDialActionItem0.h;
            this.e = speedDialActionItem0.i;
            this.f = speedDialActionItem0.j;
            this.k = speedDialActionItem0.k;
            this.l = speedDialActionItem0.l;
            this.m = speedDialActionItem0.m;
            this.n = speedDialActionItem0.n;
            this.o = speedDialActionItem0.o;
            this.p = speedDialActionItem0.p;
        }

        public b A(boolean z) {
            this.n = z;
            return this;
        }

        public b B(@ColorInt int v) {
            this.l = v;
            return this;
        }

        public b C(int v) {
            this.p = v;
            return this;
        }

        public SpeedDialActionItem q() {
            return new SpeedDialActionItem(this, null);
        }

        public b r(@StringRes int v) {
            this.j = v;
            return this;
        }

        public b s(@Nullable String s) {
            this.i = s;
            return this;
        }

        public b t(@ColorInt int v) {
            this.k = v;
            return this;
        }

        public b u(@ColorInt @Nullable Integer integer0) {
            if(integer0 == null) {
                this.e = false;
                return this;
            }
            this.e = true;
            this.d = (int)integer0;
            return this;
        }

        public b v(int v) {
            this.o = v;
            return this;
        }

        public b w(@c String s) {
            this.f = s;
            return this;
        }

        public b x(@StringRes int v) {
            this.h = v;
            if(this.i == null || this.j == 0x80000000) {
                this.j = v;
            }
            return this;
        }

        public b y(@Nullable String s) {
            this.g = s;
            if(this.i == null || this.j == 0x80000000) {
                this.i = s;
            }
            return this;
        }

        public b z(@ColorInt int v) {
            this.m = v;
            return this;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    public static final Parcelable.Creator CREATOR = null;
    @IdRes
    private final int a;
    @Nullable
    private final String b;
    @StringRes
    private final int c;
    @Nullable
    private final String d;
    @StringRes
    private final int e;
    @DrawableRes
    private final int f;
    @Nullable
    private final Drawable g;
    @ColorInt
    private final int h;
    private final boolean i;
    private final String j;
    @ColorInt
    private final int k;
    @ColorInt
    private final int l;
    @ColorInt
    private final int m;
    private final boolean n;
    private final int o;
    @StyleRes
    private final int p;
    public static final int q = 0x80000000;
    public static final String r = "normal";
    public static final String s = "fill";

    static {
        SpeedDialActionItem.CREATOR = new a();
    }

    protected SpeedDialActionItem(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.b = parcel0.readString();
        this.c = parcel0.readInt();
        this.d = parcel0.readString();
        this.e = parcel0.readInt();
        this.f = parcel0.readInt();
        this.g = null;
        this.h = parcel0.readInt();
        boolean z = false;
        this.i = parcel0.readByte() != 0;
        this.j = parcel0.readString();
        this.k = parcel0.readInt();
        this.l = parcel0.readInt();
        this.m = parcel0.readInt();
        if(parcel0.readByte() != 0) {
            z = true;
        }
        this.n = z;
        this.o = parcel0.readInt();
        this.p = parcel0.readInt();
    }

    private SpeedDialActionItem(b speedDialActionItem$b0) {
        this.a = speedDialActionItem$b0.a;
        this.b = speedDialActionItem$b0.g;
        this.c = speedDialActionItem$b0.h;
        this.d = speedDialActionItem$b0.i;
        this.e = speedDialActionItem$b0.j;
        this.h = speedDialActionItem$b0.d;
        this.i = speedDialActionItem$b0.e;
        this.j = speedDialActionItem$b0.f;
        this.f = speedDialActionItem$b0.b;
        this.g = speedDialActionItem$b0.c;
        this.k = speedDialActionItem$b0.k;
        this.l = speedDialActionItem$b0.l;
        this.m = speedDialActionItem$b0.m;
        this.n = speedDialActionItem$b0.n;
        this.o = speedDialActionItem$b0.o;
        this.p = speedDialActionItem$b0.p;
    }

    SpeedDialActionItem(b speedDialActionItem$b0, a speedDialActionItem$a0) {
        this(speedDialActionItem$b0);
    }

    @ColorInt
    public int A() {
        return this.h;
    }

    public int B() {
        return this.o;
    }

    @c
    public String C() {
        return this.j;
    }

    public int D() {
        return this.a;
    }

    @Nullable
    public String E(Context context0) {
        String s = this.b;
        if(s != null) {
            return s;
        }
        return this.c == 0x80000000 ? null : context0.getString(this.c);
    }

    public int F() {
        return this.m;
    }

    @ColorInt
    public int G() {
        return this.l;
    }

    @StyleRes
    public int H() {
        return this.p;
    }

    public boolean I() {
        return this.n;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FabWithLabelView v(Context context0) {
        int v = this.H();
        FabWithLabelView fabWithLabelView0 = v == 0x80000000 ? new FabWithLabelView(context0) : new FabWithLabelView(new ContextThemeWrapper(context0, v), null, v);
        fabWithLabelView0.setSpeedDialActionItem(this);
        return fabWithLabelView0;
    }

    @Nullable
    public String w(Context context0) {
        String s = this.d;
        if(s != null) {
            return s;
        }
        return this.e == 0x80000000 ? null : context0.getString(this.e);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeString(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeInt(this.h);
        parcel0.writeByte(((byte)this.i));
        parcel0.writeString(this.j);
        parcel0.writeInt(this.k);
        parcel0.writeInt(this.l);
        parcel0.writeInt(this.m);
        parcel0.writeByte(((byte)this.n));
        parcel0.writeInt(this.o);
        parcel0.writeInt(this.p);
    }

    @ColorInt
    public int x() {
        return this.k;
    }

    @Nullable
    public Drawable y(Context context0) {
        Drawable drawable0 = this.g;
        if(drawable0 != null) {
            return drawable0;
        }
        return this.f == 0x80000000 ? null : AppCompatResources.b(context0, this.f);
    }

    public boolean z() {
        return this.i;
    }
}

