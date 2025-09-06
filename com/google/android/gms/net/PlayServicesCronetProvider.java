package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o3.h;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.CronetProvider;
import org.chromium.net.ICronetEngineBuilder;

@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@NonNull Context context0) {
        super(context0);
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    @NonNull
    public Builder createBuilder() {
        Builder cronetEngine$Builder0;
        ClassNotFoundException classNotFoundException0;
        try {
            CronetProviderInstaller.zzc(this.mContext);
            classNotFoundException0 = null;
        }
        catch(GooglePlayServicesRepairableException googlePlayServicesRepairableException0) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", googlePlayServicesRepairableException0);
        }
        catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", googlePlayServicesNotAvailableException0);
        }
        try {
            cronetEngine$Builder0 = new org.chromium.net.ExperimentalCronetEngine.Builder(((ICronetEngineBuilder)((ClassLoader)Preconditions.checkNotNull(((DynamiteModule)Preconditions.checkNotNull(CronetProviderInstaller.zza())).getModuleContext().getClassLoader())).loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext)));
        }
        catch(ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException classNotFoundException1) {
            cronetEngine$Builder0 = null;
            classNotFoundException0 = classNotFoundException1;
        }
        if(classNotFoundException0 != null) {
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", classNotFoundException0);
        }
        Preconditions.checkNotNull(cronetEngine$Builder0, "The value of the constructed builder should never be null");
        return cronetEngine$Builder0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@h Object object0) {
        return object0 == this || object0 instanceof PlayServicesCronetProvider && this.mContext.equals(((PlayServicesCronetProvider)object0).mContext);
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    @NonNull
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    @NonNull
    public String getVersion() {
        this.tryToInstallCronetProvider();
        return "0";
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        this.tryToInstallCronetProvider();
        return CronetProviderInstaller.isInstalled();
    }

    private void tryToInstallCronetProvider() {
        try {
            CronetProviderInstaller.zzc(this.mContext);
        }
        catch(GooglePlayServicesRepairableException unused_ex) {
            if(Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
        catch(GooglePlayServicesNotAvailableException unused_ex) {
            if(Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }
}

