package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class e {
    private final Context a;
    private static final String b = "ManifestParser";
    private static final String c = "GlideModule";

    public e(Context context0) {
        this.a = context0;
    }

    @Nullable
    private ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80);
    }

    public List b() {
        if(Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        List list0 = new ArrayList();
        try {
            ApplicationInfo applicationInfo0 = this.a();
            if(applicationInfo0 == null || applicationInfo0.metaData == null) {
                if(Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return list0;
            }
            if(Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo0.metaData);
            }
            for(Object object0: applicationInfo0.metaData.keySet()) {
                String s = (String)object0;
                if("GlideModule".equals(applicationInfo0.metaData.get(s))) {
                    list0.add(e.c(s));
                    if(Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + s);
                    }
                }
            }
            if(Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
                return list0;
            }
            return list0;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        if(Log.isLoggable("ManifestParser", 6)) {
            Log.e("ManifestParser", "Failed to parse glide modules", packageManager$NameNotFoundException0);
        }
        return list0;
    }

    private static c c(String s) {
        Object object0;
        Class class0;
        try {
            class0 = Class.forName(s);
            object0 = null;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", classNotFoundException0);
        }
        try {
            object0 = class0.getDeclaredConstructor(null).newInstance(null);
        }
        catch(InstantiationException instantiationException0) {
            e.d(class0, instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            e.d(class0, illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            e.d(class0, noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            e.d(class0, invocationTargetException0);
        }
        if(!(object0 instanceof c)) {
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + object0);
        }
        return (c)object0;
    }

    private static void d(Class class0, Exception exception0) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + class0, exception0);
    }
}

