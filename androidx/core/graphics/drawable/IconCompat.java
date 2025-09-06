package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent.ShortcutIconResource;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    @RequiresApi(23)
    static class Api23Impl {
        static IconCompat a(Context context0, Icon icon0) {
            switch(Api23Impl.e(icon0)) {
                case 2: {
                    String s = Api23Impl.d(icon0);
                    try {
                        return IconCompat.s(IconCompat.w(context0, s), s, Api23Impl.c(icon0));
                    }
                    catch(Resources.NotFoundException unused_ex) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                }
                case 4: {
                    return IconCompat.o(Api23Impl.f(icon0));
                }
                case 6: {
                    return IconCompat.l(Api23Impl.f(icon0));
                }
                default: {
                    IconCompat iconCompat0 = new IconCompat(-1);
                    iconCompat0.b = icon0;
                    return iconCompat0;
                }
            }
        }

        static IconCompat b(Object object0) {
            Preconditions.l(object0);
            switch(Api23Impl.e(object0)) {
                case 2: {
                    return IconCompat.s(null, Api23Impl.d(object0), Api23Impl.c(object0));
                }
                case 4: {
                    return IconCompat.o(Api23Impl.f(object0));
                }
                case 6: {
                    return IconCompat.l(Api23Impl.f(object0));
                }
                default: {
                    IconCompat iconCompat0 = new IconCompat(-1);
                    iconCompat0.b = object0;
                    return iconCompat0;
                }
            }
        }

        @DrawableRes
        @IdRes
        static int c(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.a(object0);
            }
            try {
                return (int)(((Integer)object0.getClass().getMethod("getResId", null).invoke(object0, null)));
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon resource", illegalAccessException0);
                return 0;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon resource", invocationTargetException0);
                return 0;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon resource", noSuchMethodException0);
                return 0;
            }
        }

        static String d(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.b(object0);
            }
            try {
                return (String)object0.getClass().getMethod("getResPackage", null).invoke(object0, null);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon package", illegalAccessException0);
                return null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon package", invocationTargetException0);
                return null;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon package", noSuchMethodException0);
                return null;
            }
        }

        static int e(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.c(object0);
            }
            try {
                return (int)(((Integer)object0.getClass().getMethod("getType", null).invoke(object0, null)));
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon type " + object0, illegalAccessException0);
                return -1;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon type " + object0, invocationTargetException0);
                return -1;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon type " + object0, noSuchMethodException0);
                return -1;
            }
        }

        static Uri f(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.d(object0);
            }
            try {
                return (Uri)object0.getClass().getMethod("getUri", null).invoke(object0, null);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon uri", illegalAccessException0);
                return null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon uri", invocationTargetException0);
                return null;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon uri", noSuchMethodException0);
                return null;
            }
        }

        static Drawable g(Icon icon0, Context context0) {
            return icon0.loadDrawable(context0);
        }

        static Icon h(IconCompat iconCompat0, Context context0) {
            Icon icon0;
            switch(iconCompat0.a) {
                case -1: {
                    return (Icon)iconCompat0.b;
                }
                case 1: {
                    icon0 = Icon.createWithBitmap(((Bitmap)iconCompat0.b));
                    goto label_24;
                }
                case 2: {
                    icon0 = Icon.createWithResource(iconCompat0.v(), iconCompat0.e);
                    goto label_24;
                }
                case 3: {
                    icon0 = Icon.createWithData(((byte[])iconCompat0.b), iconCompat0.e, iconCompat0.f);
                    goto label_24;
                }
                case 4: {
                    icon0 = Icon.createWithContentUri(((String)iconCompat0.b));
                    goto label_24;
                }
                case 5: {
                    if(Build.VERSION.SDK_INT >= 26) {
                        icon0 = Api26Impl.b(((Bitmap)iconCompat0.b));
                        goto label_24;
                    }
                    icon0 = Icon.createWithBitmap(IconCompat.j(((Bitmap)iconCompat0.b), false));
                    goto label_24;
                }
                case 6: {
                    int v = Build.VERSION.SDK_INT;
                    if(v >= 30) {
                        icon0 = Api30Impl.a(iconCompat0.z());
                    }
                    else {
                        if(context0 == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat0.z());
                        }
                        InputStream inputStream0 = iconCompat0.A(context0);
                        if(inputStream0 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat0.z());
                        }
                        icon0 = v < 26 ? Icon.createWithBitmap(IconCompat.j(BitmapFactory.decodeStream(inputStream0), false)) : Api26Impl.b(BitmapFactory.decodeStream(inputStream0));
                    }
                label_24:
                    ColorStateList colorStateList0 = iconCompat0.g;
                    if(colorStateList0 != null) {
                        icon0.setTintList(colorStateList0);
                    }
                    PorterDuff.Mode porterDuff$Mode0 = iconCompat0.h;
                    if(porterDuff$Mode0 != IconCompat.G) {
                        icon0.setTintMode(porterDuff$Mode0);
                    }
                    return icon0;
                }
                default: {
                    throw new IllegalArgumentException("Unknown type");
                }
            }
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static Drawable a(Drawable drawable0, Drawable drawable1) {
            return new AdaptiveIconDrawable(drawable0, drawable1);
        }

        static Icon b(Bitmap bitmap0) {
            return Icon.createWithAdaptiveBitmap(bitmap0);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static int a(Object object0) {
            return ((Icon)object0).getResId();
        }

        static String b(Object object0) {
            return ((Icon)object0).getResPackage();
        }

        static int c(Object object0) {
            return ((Icon)object0).getType();
        }

        static Uri d(Object object0) {
            return ((Icon)object0).getUri();
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static Icon a(Uri uri0) {
            return Icon.createWithAdaptiveBitmapContentUri(uri0);
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    @VisibleForTesting
    static final String A = "obj";
    @VisibleForTesting
    static final String B = "int1";
    @VisibleForTesting
    static final String C = "int2";
    @VisibleForTesting
    static final String D = "tint_list";
    @VisibleForTesting
    static final String E = "tint_mode";
    @VisibleForTesting
    static final String F = "string1";
    static final PorterDuff.Mode G = null;
    @RestrictTo({Scope.c})
    public int a;
    Object b;
    @RestrictTo({Scope.a})
    public byte[] c;
    @RestrictTo({Scope.a})
    public Parcelable d;
    @RestrictTo({Scope.a})
    public int e;
    @RestrictTo({Scope.a})
    public int f;
    @RestrictTo({Scope.a})
    public ColorStateList g;
    PorterDuff.Mode h;
    @RestrictTo({Scope.a})
    public String i;
    @RestrictTo({Scope.a})
    public String j;
    private static final String k = "IconCompat";
    public static final int l = -1;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    private static final float s = 0.25f;
    private static final float t = 0.666667f;
    private static final float u = 0.916667f;
    private static final float v = 0.010417f;
    private static final float w = 0.020833f;
    private static final int x = 61;
    private static final int y = 30;
    @VisibleForTesting
    static final String z = "type";

    static {
        IconCompat.G = PorterDuff.Mode.SRC_IN;
    }

    @RestrictTo({Scope.a})
    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.G;
        this.i = null;
    }

    IconCompat(int v) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.G;
        this.i = null;
        this.a = v;
    }

    @RestrictTo({Scope.b})
    public InputStream A(Context context0) {
        Uri uri0 = this.z();
        String s = uri0.getScheme();
        if(!"content".equals(s) && !"file".equals(s)) {
            try {
                return new FileInputStream(new File(((String)this.b)));
            }
            catch(FileNotFoundException fileNotFoundException0) {
                Log.w("IconCompat", "Unable to load image from path: " + uri0, fileNotFoundException0);
                return null;
            }
        }
        try {
            return context0.getContentResolver().openInputStream(uri0);
        }
        catch(Exception exception0) {
            Log.w("IconCompat", "Unable to load image from URI: " + uri0, exception0);
            return null;
        }
    }

    public Drawable B(Context context0) {
        this.e(context0);
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.g(this.I(context0), context0);
        }
        Drawable drawable0 = this.C(context0);
        if(drawable0 != null && (this.g != null || this.h != IconCompat.G)) {
            drawable0.mutate();
            DrawableCompat.o(drawable0, this.g);
            DrawableCompat.p(drawable0, this.h);
        }
        return drawable0;
    }

    private Drawable C(Context context0) {
        switch(this.a) {
            case 1: {
                return new BitmapDrawable(context0.getResources(), ((Bitmap)this.b));
            }
            case 2: {
                String s = this.v();
                if(TextUtils.isEmpty(s)) {
                    s = "com.dcinside.app.android";
                }
                Resources resources0 = IconCompat.w(context0, s);
                try {
                    return ResourcesCompat.g(resources0, this.e, context0.getTheme());
                }
                catch(RuntimeException runtimeException0) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", this.e, this.b), runtimeException0);
                    return null;
                }
            }
            case 3: {
                return new BitmapDrawable(context0.getResources(), BitmapFactory.decodeByteArray(((byte[])this.b), this.e, this.f));
            }
            case 4: {
                InputStream inputStream0 = this.A(context0);
                if(inputStream0 != null) {
                    return new BitmapDrawable(context0.getResources(), BitmapFactory.decodeStream(inputStream0));
                }
                break;
            }
            case 5: {
                return new BitmapDrawable(context0.getResources(), IconCompat.j(((Bitmap)this.b), false));
            }
            case 6: {
                InputStream inputStream1 = this.A(context0);
                if(inputStream1 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? Api26Impl.a(null, new BitmapDrawable(context0.getResources(), BitmapFactory.decodeStream(inputStream1))) : new BitmapDrawable(context0.getResources(), IconCompat.j(BitmapFactory.decodeStream(inputStream1), false));
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    public IconCompat D(@ColorInt int v) {
        return this.E(ColorStateList.valueOf(v));
    }

    public IconCompat E(ColorStateList colorStateList0) {
        this.g = colorStateList0;
        return this;
    }

    public IconCompat F(PorterDuff.Mode porterDuff$Mode0) {
        this.h = porterDuff$Mode0;
        return this;
    }

    public Bundle G() {
        Bundle bundle0 = new Bundle();
        switch(this.a) {
            case -1: {
                bundle0.putParcelable("obj", ((Parcelable)this.b));
                break;
            }
            case 3: {
                bundle0.putByteArray("obj", ((byte[])this.b));
                break;
            }
            case 1: 
            case 5: {
                bundle0.putParcelable("obj", ((Bitmap)this.b));
                break;
            }
            case 2: 
            case 4: 
            case 6: {
                bundle0.putString("obj", ((String)this.b));
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        bundle0.putInt("type", this.a);
        bundle0.putInt("int1", this.e);
        bundle0.putInt("int2", this.f);
        bundle0.putString("string1", this.j);
        ColorStateList colorStateList0 = this.g;
        if(colorStateList0 != null) {
            bundle0.putParcelable("tint_list", colorStateList0);
        }
        PorterDuff.Mode porterDuff$Mode0 = this.h;
        if(porterDuff$Mode0 != IconCompat.G) {
            bundle0.putString("tint_mode", porterDuff$Mode0.name());
        }
        return bundle0;
    }

    @RequiresApi(23)
    @Deprecated
    public Icon H() {
        return this.I(null);
    }

    @RequiresApi(23)
    public Icon I(Context context0) {
        if(Build.VERSION.SDK_INT < 23) {
            throw new UnsupportedOperationException("This method is only supported on API level 23+");
        }
        return Api23Impl.h(this, context0);
    }

    private static String J(int v) {
        switch(v) {
            case 1: {
                return "BITMAP";
            }
            case 2: {
                return "RESOURCE";
            }
            case 3: {
                return "DATA";
            }
            case 4: {
                return "URI";
            }
            case 5: {
                return "BITMAP_MASKABLE";
            }
            case 6: {
                return "URI_MASKABLE";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    @Override  // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch(this.a) {
            case -1: {
                Parcelable parcelable0 = this.d;
                if(parcelable0 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.b = parcelable0;
                return;
            }
            case 3: {
                this.b = this.c;
                return;
            }
            case 1: 
            case 5: {
                Parcelable parcelable1 = this.d;
                if(parcelable1 != null) {
                    this.b = parcelable1;
                    return;
                }
                this.b = this.c;
                this.a = 3;
                this.e = 0;
                this.f = this.c.length;
                return;
            }
            case 2: 
            case 4: 
            case 6: {
                String s = new String(this.c, Charset.forName("UTF-16"));
                this.b = s;
                if(this.a == 2 && this.j == null) {
                    this.j = s.split(":", -1)[0];
                }
            }
        }
    }

    @Override  // androidx.versionedparcelable.CustomVersionedParcelable
    public void b(boolean z) {
        this.i = this.h.name();
        switch(this.a) {
            case -1: {
                if(z) {
                    throw new IllegalArgumentException("Can\'t serialize Icon created with IconCompat#createFromIcon");
                }
                this.d = (Parcelable)this.b;
                return;
            }
            case 2: {
                this.c = ((String)this.b).getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 3: {
                this.c = (byte[])this.b;
                return;
            }
            case 1: 
            case 5: {
                if(z) {
                    Bitmap bitmap0 = (Bitmap)this.b;
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    bitmap0.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream0);
                    this.c = byteArrayOutputStream0.toByteArray();
                    return;
                }
                this.d = (Parcelable)this.b;
                return;
            }
            case 4: 
            case 6: {
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
            }
        }
    }

    @RestrictTo({Scope.c})
    public void c(Intent intent0, Drawable drawable0, Context context0) {
        Bitmap bitmap0;
        this.e(context0);
        switch(this.a) {
            case 1: {
                bitmap0 = (Bitmap)this.b;
                if(drawable0 != null) {
                    bitmap0 = bitmap0.copy(bitmap0.getConfig(), true);
                }
                break;
            }
            case 2: {
                try {
                    Context context1 = context0.createPackageContext(this.v(), 0);
                    if(drawable0 == null) {
                        intent0.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context1, this.e));
                        return;
                    }
                    Drawable drawable1 = ContextCompat.getDrawable(context1, this.e);
                    if(drawable1.getIntrinsicWidth() <= 0 || drawable1.getIntrinsicHeight() <= 0) {
                        int v = ((ActivityManager)context1.getSystemService("activity")).getLauncherLargeIconSize();
                        bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
                    }
                    else {
                        bitmap0 = Bitmap.createBitmap(drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    }
                    drawable1.setBounds(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
                    drawable1.draw(new Canvas(bitmap0));
                    break;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                }
                throw new IllegalArgumentException("Can\'t find package " + this.b, packageManager$NameNotFoundException0);
            }
            case 5: {
                bitmap0 = IconCompat.j(((Bitmap)this.b), true);
                break;
            }
            default: {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
        }
        if(drawable0 != null) {
            int v1 = bitmap0.getWidth();
            int v2 = bitmap0.getHeight();
            drawable0.setBounds(v1 / 2, v2 / 2, v1, v2);
            drawable0.draw(new Canvas(bitmap0));
        }
        intent0.putExtra("android.intent.extra.shortcut.ICON", bitmap0);
    }

    @RestrictTo({Scope.c})
    public void e(Context context0) {
        if(this.a == 2) {
            Object object0 = this.b;
            if(object0 == null || !((String)object0).contains(":")) {
                return;
            }
            String s = ((String)object0).split(":", -1)[1];
            String s1 = s.split("/", -1)[0];
            String s2 = s.split("/", -1)[1];
            String s3 = ((String)object0).split(":", -1)[0];
            if("0_resource_name_obfuscated".equals(s2)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String s4 = this.v();
            int v = IconCompat.w(context0, s4).getIdentifier(s2, s1, s3);
            if(this.e != v) {
                Log.i("IconCompat", "Id has changed for " + s4 + " " + ((String)object0));
                this.e = v;
            }
        }
    }

    public static IconCompat f(Bundle bundle0) {
        int v = bundle0.getInt("type");
        IconCompat iconCompat0 = new IconCompat(v);
        iconCompat0.e = bundle0.getInt("int1");
        iconCompat0.f = bundle0.getInt("int2");
        iconCompat0.j = bundle0.getString("string1");
        if(bundle0.containsKey("tint_list")) {
            iconCompat0.g = (ColorStateList)bundle0.getParcelable("tint_list");
        }
        if(bundle0.containsKey("tint_mode")) {
            iconCompat0.h = PorterDuff.Mode.valueOf(bundle0.getString("tint_mode"));
        }
        switch(v) {
            case 3: {
                iconCompat0.b = bundle0.getByteArray("obj");
                return iconCompat0;
            }
            case -1: 
            case 1: 
            case 5: {
                iconCompat0.b = bundle0.getParcelable("obj");
                return iconCompat0;
            }
            case 2: 
            case 4: 
            case 6: {
                iconCompat0.b = bundle0.getString("obj");
                return iconCompat0;
            }
            default: {
                Log.w("IconCompat", "Unknown type " + v);
                return null;
            }
        }
    }

    @RequiresApi(23)
    public static IconCompat g(Context context0, Icon icon0) {
        Preconditions.l(icon0);
        return Api23Impl.a(context0, icon0);
    }

    @RequiresApi(23)
    @RestrictTo({Scope.c})
    public static IconCompat h(Icon icon0) {
        return Api23Impl.b(icon0);
    }

    @RequiresApi(23)
    @RestrictTo({Scope.c})
    public static IconCompat i(Icon icon0) {
        return Api23Impl.e(icon0) != 2 || Api23Impl.c(icon0) != 0 ? Api23Impl.b(icon0) : null;
    }

    @VisibleForTesting
    static Bitmap j(Bitmap bitmap0, boolean z) {
        int v = (int)(((float)Math.min(bitmap0.getWidth(), bitmap0.getHeight())) * 0.666667f);
        Bitmap bitmap1 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint(3);
        float f = 0.5f * ((float)v);
        if(z) {
            paint0.setColor(0);
            paint0.setShadowLayer(0.010417f * ((float)v), 0.0f, ((float)v) * 0.020833f, 0x3D000000);
            canvas0.drawCircle(f, f, 0.916667f * f, paint0);
            paint0.setShadowLayer(0.010417f * ((float)v), 0.0f, 0.0f, 0x1E000000);
            canvas0.drawCircle(f, f, 0.916667f * f, paint0);
            paint0.clearShadowLayer();
        }
        paint0.setColor(0xFF000000);
        BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix0 = new Matrix();
        matrix0.setTranslate(((float)(-(bitmap0.getWidth() - v))) / 2.0f, ((float)(-(bitmap0.getHeight() - v))) / 2.0f);
        bitmapShader0.setLocalMatrix(matrix0);
        paint0.setShader(bitmapShader0);
        canvas0.drawCircle(f, f, 0.916667f * f, paint0);
        canvas0.setBitmap(null);
        return bitmap1;
    }

    public static IconCompat k(Bitmap bitmap0) {
        ObjectsCompat.d(bitmap0);
        IconCompat iconCompat0 = new IconCompat(5);
        iconCompat0.b = bitmap0;
        return iconCompat0;
    }

    public static IconCompat l(Uri uri0) {
        ObjectsCompat.d(uri0);
        return IconCompat.m(uri0.toString());
    }

    public static IconCompat m(String s) {
        ObjectsCompat.d(s);
        IconCompat iconCompat0 = new IconCompat(6);
        iconCompat0.b = s;
        return iconCompat0;
    }

    public static IconCompat n(Bitmap bitmap0) {
        ObjectsCompat.d(bitmap0);
        IconCompat iconCompat0 = new IconCompat(1);
        iconCompat0.b = bitmap0;
        return iconCompat0;
    }

    public static IconCompat o(Uri uri0) {
        ObjectsCompat.d(uri0);
        return IconCompat.p(uri0.toString());
    }

    public static IconCompat p(String s) {
        ObjectsCompat.d(s);
        IconCompat iconCompat0 = new IconCompat(4);
        iconCompat0.b = s;
        return iconCompat0;
    }

    public static IconCompat q(byte[] arr_b, int v, int v1) {
        ObjectsCompat.d(arr_b);
        IconCompat iconCompat0 = new IconCompat(3);
        iconCompat0.b = arr_b;
        iconCompat0.e = v;
        iconCompat0.f = v1;
        return iconCompat0;
    }

    public static IconCompat r(Context context0, @DrawableRes int v) {
        ObjectsCompat.d(context0);
        return IconCompat.s(context0.getResources(), "com.dcinside.app.android", v);
    }

    @RestrictTo({Scope.c})
    public static IconCompat s(Resources resources0, String s, @DrawableRes int v) {
        ObjectsCompat.d(s);
        if(v == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat0 = new IconCompat(2);
        iconCompat0.e = v;
        if(resources0 == null) {
            iconCompat0.b = s;
        }
        else {
            try {
                iconCompat0.b = resources0.getResourceName(v);
            }
            catch(Resources.NotFoundException unused_ex) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        iconCompat0.j = s;
        return iconCompat0;
    }

    @RestrictTo({Scope.c})
    public Bitmap t() {
        int v = this.a;
        if(v == -1 && Build.VERSION.SDK_INT >= 23) {
            return this.b instanceof Bitmap ? ((Bitmap)this.b) : null;
        }
        switch(v) {
            case 1: {
                return (Bitmap)this.b;
            }
            case 5: {
                return IconCompat.j(((Bitmap)this.b), true);
            }
            default: {
                throw new IllegalStateException("called getBitmap() on " + this);
            }
        }
    }

    @Override
    public String toString() {
        if(this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Icon(typ=");
        stringBuilder0.append(IconCompat.J(this.a));
        switch(this.a) {
            case 2: {
                stringBuilder0.append(" pkg=");
                stringBuilder0.append(this.j);
                stringBuilder0.append(" id=");
                stringBuilder0.append(String.format("0x%08x", this.u()));
                break;
            }
            case 3: {
                stringBuilder0.append(" len=");
                stringBuilder0.append(this.e);
                if(this.f != 0) {
                    stringBuilder0.append(" off=");
                    stringBuilder0.append(this.f);
                }
                break;
            }
            case 1: 
            case 5: {
                stringBuilder0.append(" size=");
                stringBuilder0.append(((Bitmap)this.b).getWidth());
                stringBuilder0.append("x");
                stringBuilder0.append(((Bitmap)this.b).getHeight());
                break;
            }
            case 4: 
            case 6: {
                stringBuilder0.append(" uri=");
                stringBuilder0.append(this.b);
            }
        }
        if(this.g != null) {
            stringBuilder0.append(" tint=");
            stringBuilder0.append(this.g);
        }
        if(this.h != IconCompat.G) {
            stringBuilder0.append(" mode=");
            stringBuilder0.append(this.h);
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @DrawableRes
    public int u() {
        int v = this.a;
        if(v == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.c(this.b);
        }
        if(v != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.e;
    }

    public String v() {
        int v = this.a;
        if(v == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.d(this.b);
        }
        if(v != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return this.j == null || TextUtils.isEmpty(this.j) ? ((String)this.b).split(":", -1)[0] : this.j;
    }

    static Resources w(Context context0, String s) {
        if("android".equals(s)) {
            return Resources.getSystem();
        }
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(s, 0x2000);
            return applicationInfo0 == null ? null : packageManager0.getResourcesForApplication(applicationInfo0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", s), packageManager$NameNotFoundException0);
            return null;
        }
    }

    public int y() {
        return this.a != -1 || Build.VERSION.SDK_INT < 23 ? this.a : Api23Impl.e(this.b);
    }

    public Uri z() {
        int v = this.a;
        if(v == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.f(this.b);
        }
        if(v != 4 && v != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse(((String)this.b));
    }
}

