package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
public abstract class DataHolderNotifier implements Notifier {
    private final DataHolder zaa;

    @KeepForSdk
    protected DataHolderNotifier(@NonNull DataHolder dataHolder0) {
        this.zaa = dataHolder0;
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    @KeepForSdk
    public final void notifyListener(@NonNull Object object0) {
        this.notifyListener(object0, this.zaa);
    }

    @KeepForSdk
    protected abstract void notifyListener(@NonNull Object arg1, @NonNull DataHolder arg2);

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    @KeepForSdk
    public void onNotifyListenerFailed() {
        DataHolder dataHolder0 = this.zaa;
        if(dataHolder0 != null) {
            dataHolder0.close();
        }
    }
}

