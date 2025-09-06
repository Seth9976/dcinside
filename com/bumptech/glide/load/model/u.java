package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.j;
import java.io.InputStream;
import java.util.List;

public final class u implements o {
    static final class a implements p {
        private final Context a;

        a(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            o o0 = s0.d(Integer.class, AssetFileDescriptor.class);
            return new u(this.a, o0);
        }
    }

    static final class b implements p {
        private final Context a;

        b(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            o o0 = s0.d(Integer.class, InputStream.class);
            return new u(this.a, o0);
        }
    }

    private final Context a;
    private final o b;
    private static final int c = 0;
    private static final String d = "ResourceUriLoader";

    u(Context context0, o o0) {
        this.a = context0.getApplicationContext();
        this.b = o0;
    }

    @Override  // com.bumptech.glide.load.model.o
    @Nullable
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((Uri)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((Uri)object0));
    }

    @Nullable
    public com.bumptech.glide.load.model.o.a c(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        List list0 = uri0.getPathSegments();
        if(list0.size() == 1) {
            return this.g(uri0, v, v1, j0);
        }
        if(list0.size() == 2) {
            return this.h(uri0, v, v1, j0);
        }
        if(Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri0);
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public boolean d(@NonNull Uri uri0) {
        return "android.resource".equals(uri0.getScheme()) && "com.dcinside.app.android".equals(uri0.getAuthority());
    }

    public static p e(Context context0) {
        return new a(context0);
    }

    public static p f(Context context0) {
        return new b(context0);
    }

    @Nullable
    private com.bumptech.glide.load.model.o.a g(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        try {
            int v2 = Integer.parseInt(((String)uri0.getPathSegments().get(0)));
            if(v2 == 0) {
                if(Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri0);
                    return null;
                }
                return null;
            }
            return this.b.a(v2, v, v1, j0);
        }
        catch(NumberFormatException numberFormatException0) {
        }
        if(Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri0, numberFormatException0);
        }
        return null;
    }

    @Nullable
    private com.bumptech.glide.load.model.o.a h(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        List list0 = uri0.getPathSegments();
        String s = (String)list0.get(0);
        String s1 = (String)list0.get(1);
        int v2 = this.a.getResources().getIdentifier(s1, s, "com.dcinside.app.android");
        if(v2 == 0) {
            if(Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri0);
            }
            return null;
        }
        return this.b.a(v2, v, v1, j0);
    }
}

