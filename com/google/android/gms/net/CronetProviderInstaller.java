package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import p3.a;

public class CronetProviderInstaller {
    @NonNull
    public static final String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final String zza = "CronetProviderInstaller";
    private static final GoogleApiAvailabilityLight zzb;
    private static final Object zzc;
    @Nullable
    @a("lock")
    private static DynamiteModule zzd;
    @a("lock")
    private static String zze;

    static {
        CronetProviderInstaller.zzb = GoogleApiAvailabilityLight.getInstance();
        CronetProviderInstaller.zzc = new Object();
        CronetProviderInstaller.zzd = null;
        CronetProviderInstaller.zze = "0";
    }

    @NonNull
    public static Task installProvider(@NonNull Context context0) {
        Preconditions.checkNotNull(context0, "Context must not be null");
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        if(CronetProviderInstaller.isInstalled()) {
            taskCompletionSource0.setResult(null);
            return taskCompletionSource0.getTask();
        }
        new Thread(new zza(context0, taskCompletionSource0)).start();
        return taskCompletionSource0.getTask();
    }

    public static boolean isInstalled() {
        return CronetProviderInstaller.zza() != null;
    }

    @Nullable
    static DynamiteModule zza() {
        synchronized(CronetProviderInstaller.zzc) {
        }
        return CronetProviderInstaller.zzd;
    }

    static String zzb() [...] // 潜在的解密器

    @ShowFirstParty
    @Deprecated
    public static void zzc(@NonNull Context context0) throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        int v1;
        DynamiteModule dynamiteModule0;
        synchronized(CronetProviderInstaller.zzc) {
            if(CronetProviderInstaller.isInstalled()) {
                return;
            }
            Preconditions.checkNotNull(context0, "Context must not be null");
            ClassLoader classLoader0 = (ClassLoader)Preconditions.checkNotNull(CronetProviderInstaller.class.getClassLoader());
            try {
                classLoader0.loadClass("org.chromium.net.CronetEngine");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.e("CronetProviderInstaller", "Cronet API is not available. Have you included all required dependencies?");
                throw (GooglePlayServicesNotAvailableException)new GooglePlayServicesNotAvailableException(10).initCause(classNotFoundException0);
            }
            GoogleApiAvailabilityLight googleApiAvailabilityLight0 = CronetProviderInstaller.zzb;
            googleApiAvailabilityLight0.verifyGooglePlayServicesIsAvailable(context0, 11925000);
            try {
                dynamiteModule0 = DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cronet_dynamite");
            }
            catch(LoadingException dynamiteModule$LoadingException0) {
                Log.e("CronetProviderInstaller", "Unable to load Cronet module", dynamiteModule$LoadingException0);
                throw (GooglePlayServicesNotAvailableException)new GooglePlayServicesNotAvailableException(8).initCause(dynamiteModule$LoadingException0);
            }
            try {
                Class class0 = dynamiteModule0.getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                if(class0.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                    Log.e("CronetProviderInstaller", "ImplVersion class is missing from Cronet module.");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
                Method method0 = class0.getMethod("getApiLevel", null);
                Method method1 = class0.getMethod("getCronetVersion", null);
                v1 = (int)(((Integer)Preconditions.checkNotNull(((Integer)method0.invoke(null, null)))));
                CronetProviderInstaller.zze = (String)Preconditions.checkNotNull(((String)method1.invoke(null, null)));
            }
            catch(Exception exception0) {
                Log.e("CronetProviderInstaller", "Unable to read Cronet version from the Cronet module ", exception0);
                throw (GooglePlayServicesNotAvailableException)new GooglePlayServicesNotAvailableException(8).initCause(exception0);
            }
            if(3 > v1) {
                Intent intent0 = googleApiAvailabilityLight0.getErrorResolutionIntent(context0, 2, "cr");
                if(intent0 != null) {
                    throw new GooglePlayServicesRepairableException(2, "Google Play Services update is required. The API Level of the client is " + 3 + ". The API Level of the implementation is " + v1 + ". The Cronet implementation version is " + "0", intent0);
                }
                Log.e("CronetProviderInstaller", "Unable to fetch error resolution intent");
                throw new GooglePlayServicesNotAvailableException(2);
            }
            CronetProviderInstaller.zzd = dynamiteModule0;
        }
    }
}

