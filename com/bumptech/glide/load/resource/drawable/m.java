package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;
import java.util.List;

public class m implements l {
    private final Context a;
    public static final i b = null;
    private static final String c = "android";
    private static final int d = 0;
    private static final int e = 2;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 1;
    private static final int i;

    static {
        m.b = i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    }

    public m(Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.h(((Uri)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    @Nullable
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((Uri)object0), v, v1, j0);
    }

    @Nullable
    public v c(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        String s = uri0.getAuthority();
        if(TextUtils.isEmpty(s)) {
            throw new IllegalStateException("Package name for " + uri0 + " is null or empty");
        }
        Context context0 = this.d(uri0, s);
        int v2 = this.g(context0, uri0);
        Resources.Theme resources$Theme0 = ((String)com.bumptech.glide.util.m.e(s)).equals("com.dcinside.app.android") ? ((Resources.Theme)j0.c(m.b)) : null;
        return resources$Theme0 == null ? com.bumptech.glide.load.resource.drawable.l.c(com.bumptech.glide.load.resource.drawable.i.b(this.a, context0, v2)) : com.bumptech.glide.load.resource.drawable.l.c(com.bumptech.glide.load.resource.drawable.i.a(this.a, v2, resources$Theme0));
    }

    @NonNull
    private Context d(Uri uri0, @NonNull String s) {
        if(s.equals("com.dcinside.app.android")) {
            return this.a;
        }
        try {
            return this.a.createPackageContext(s, 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            if(!s.contains("com.dcinside.app.android")) {
                throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri0, packageManager$NameNotFoundException0);
            }
            return this.a;
        }
    }

    @DrawableRes
    private int e(Uri uri0) {
        List list0 = uri0.getPathSegments();
        try {
            return Integer.parseInt(((String)list0.get(0)));
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri0, numberFormatException0);
        }
    }

    @DrawableRes
    private int f(Context context0, Uri uri0) {
        List list0 = uri0.getPathSegments();
        String s = uri0.getAuthority();
        String s1 = (String)list0.get(0);
        String s2 = (String)list0.get(1);
        int v = context0.getResources().getIdentifier(s2, s1, s);
        if(v == 0) {
            v = Resources.getSystem().getIdentifier(s2, s1, "android");
        }
        if(v == 0) {
            throw new IllegalArgumentException("Failed to find resource id for: " + uri0);
        }
        return v;
    }

    @DrawableRes
    private int g(Context context0, Uri uri0) {
        List list0 = uri0.getPathSegments();
        if(list0.size() == 2) {
            return this.f(context0, uri0);
        }
        if(list0.size() != 1) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri0);
        }
        return this.e(uri0);
    }

    public boolean h(@NonNull Uri uri0, @NonNull j j0) {
        String s = uri0.getScheme();
        return s != null && s.equals("android.resource");
    }
}

