package org.chromium.net;

import android.content.Context;
import android.util.Log;
import j..util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class CronetProvider {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    static {
    }

    protected CronetProvider(Context context0) {
        if(context0 == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mContext = context0;
    }

    private static boolean addCronetProviderFromResourceFile(Context context0, Set set0) {
        int v = context0.getResources().getIdentifier("CronetProviderClassName", "string", "com.dcinside.app.android");
        boolean z = false;
        if(v == 0) {
            return false;
        }
        String s = context0.getResources().getString(v);
        if(s != null && !s.equals("com.google.android.gms.net.PlayServicesCronetProvider") && !s.equals("com.google.android.gms.net.GmsCoreCronetProvider") && !s.equals("org.chromium.net.impl.JavaCronetProvider") && !s.equals("org.chromium.net.impl.NativeCronetProvider")) {
            z = true;
            if(!CronetProvider.addCronetProviderImplByClassName(context0, s, set0, true)) {
                Log.e("CronetProvider", "Unable to instantiate Cronet implementation class " + s + " that is listed as in the app string resource file under " + "CronetProviderClassName" + " key");
            }
        }
        return z;
    }

    private static boolean addCronetProviderImplByClassName(Context context0, String s, Set set0, boolean z) {
        ClassLoader classLoader0 = context0.getClassLoader();
        try {
            set0.add(classLoader0.loadClass(s).asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context0));
            return true;
        }
        catch(InstantiationException instantiationException0) {
            CronetProvider.logReflectiveOperationException(s, z, instantiationException0);
            return false;
        }
        catch(InvocationTargetException invocationTargetException0) {
            CronetProvider.logReflectiveOperationException(s, z, invocationTargetException0);
            return false;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            CronetProvider.logReflectiveOperationException(s, z, noSuchMethodException0);
            return false;
        }
        catch(IllegalAccessException illegalAccessException0) {
            CronetProvider.logReflectiveOperationException(s, z, illegalAccessException0);
            return false;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            CronetProvider.logReflectiveOperationException(s, z, classNotFoundException0);
            return false;
        }
    }

    public abstract Builder createBuilder();

    public static List getAllProviders(Context context0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        CronetProvider.addCronetProviderFromResourceFile(context0, linkedHashSet0);
        CronetProvider.addCronetProviderImplByClassName(context0, "com.google.android.gms.net.PlayServicesCronetProvider", linkedHashSet0, false);
        CronetProvider.addCronetProviderImplByClassName(context0, "com.google.android.gms.net.GmsCoreCronetProvider", linkedHashSet0, false);
        CronetProvider.addCronetProviderImplByClassName(context0, "org.chromium.net.impl.NativeCronetProvider", linkedHashSet0, false);
        CronetProvider.addCronetProviderImplByClassName(context0, "org.chromium.net.impl.JavaCronetProvider", linkedHashSet0, false);
        return DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet0));
    }

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    private static void logReflectiveOperationException(String s, boolean z, Exception exception0) {
        if(z) {
            Log.e("CronetProvider", "Unable to load provider class: " + s, exception0);
            return;
        }
        if(Log.isLoggable("CronetProvider", 3)) {
            Log.d("CronetProvider", "Tried to load " + s + " provider class but it wasn\'t" + " included in the app classpath");
        }
    }

    @Override
    public String toString() {
        return "[class=" + this.getClass().getName() + ", " + "name=" + this.getName() + ", " + "version=" + this.getVersion() + ", " + "enabled=" + this.isEnabled() + "]";
    }
}

