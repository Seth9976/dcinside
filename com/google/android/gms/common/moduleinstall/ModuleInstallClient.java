package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public interface ModuleInstallClient extends HasApiKey {
    @NonNull
    Task areModulesAvailable(@NonNull OptionalModuleApi[] arg1);

    @NonNull
    Task deferredInstall(@NonNull OptionalModuleApi[] arg1);

    @NonNull
    Task getInstallModulesIntent(@NonNull OptionalModuleApi[] arg1);

    @NonNull
    @ResultIgnorabilityUnspecified
    Task installModules(@NonNull ModuleInstallRequest arg1);

    @NonNull
    Task releaseModules(@NonNull OptionalModuleApi[] arg1);

    @NonNull
    @ResultIgnorabilityUnspecified
    Task unregisterListener(@NonNull InstallStatusListener arg1);
}

