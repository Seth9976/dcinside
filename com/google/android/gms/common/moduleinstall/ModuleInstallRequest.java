package com.google.android.gms.common.moduleinstall;

import O1.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class ModuleInstallRequest {
    public static class Builder {
        private final List zaa;
        @Nullable
        private InstallStatusListener zab;
        @Nullable
        private Executor zac;

        public Builder() {
            this.zaa = new ArrayList();
        }

        @a
        @NonNull
        public Builder addApi(@NonNull OptionalModuleApi optionalModuleApi0) {
            this.zaa.add(optionalModuleApi0);
            return this;
        }

        @NonNull
        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.zaa, this.zab, this.zac, true, null);
        }

        @a
        @NonNull
        public Builder setListener(@NonNull InstallStatusListener installStatusListener0) {
            return this.setListener(installStatusListener0, null);
        }

        @a
        @NonNull
        public Builder setListener(@NonNull InstallStatusListener installStatusListener0, @Nullable Executor executor0) {
            this.zab = installStatusListener0;
            this.zac = executor0;
            return this;
        }
    }

    private final List zaa;
    @Nullable
    private final InstallStatusListener zab;
    @Nullable
    private final Executor zac;

    ModuleInstallRequest(List list0, InstallStatusListener installStatusListener0, Executor executor0, boolean z, zac zac0) {
        Preconditions.checkNotNull(list0, "APIs must not be null.");
        Preconditions.checkArgument(!list0.isEmpty(), "APIs must not be empty.");
        if(executor0 != null) {
            Preconditions.checkNotNull(installStatusListener0, "Listener must not be null when listener executor is set.");
        }
        this.zaa = list0;
        this.zab = installStatusListener0;
        this.zac = executor0;
    }

    @NonNull
    public List getApis() {
        return this.zaa;
    }

    @Nullable
    public InstallStatusListener getListener() {
        return this.zab;
    }

    @Nullable
    public Executor getListenerExecutor() {
        return this.zac;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}

