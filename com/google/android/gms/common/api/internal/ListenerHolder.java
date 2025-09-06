package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

@KeepForSdk
public final class ListenerHolder {
    @KeepForSdk
    public static final class ListenerKey {
        private final Object zaa;
        private final String zab;

        @KeepForSdk
        ListenerKey(Object object0, String s) {
            this.zaa = object0;
            this.zab = s;
        }

        @Override
        @KeepForSdk
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ListenerKey ? this.zaa == ((ListenerKey)object0).zaa && this.zab.equals(((ListenerKey)object0).zab) : false;
        }

        @Override
        @KeepForSdk
        public int hashCode() {
            return System.identityHashCode(this.zaa) * 0x1F + this.zab.hashCode();
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            return this.zab + "@" + System.identityHashCode(this.zaa);
        }
    }

    @KeepForSdk
    public interface Notifier {
        @KeepForSdk
        void notifyListener(@NonNull Object arg1);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    private final Executor zaa;
    @Nullable
    private volatile Object zab;
    @Nullable
    private volatile ListenerKey zac;

    @KeepForSdk
    ListenerHolder(@NonNull Looper looper0, @NonNull Object object0, @NonNull String s) {
        this.zaa = new HandlerExecutor(looper0);
        this.zab = Preconditions.checkNotNull(object0, "Listener must not be null");
        this.zac = new ListenerKey(object0, Preconditions.checkNotEmpty(s));
    }

    @KeepForSdk
    ListenerHolder(@NonNull Executor executor0, @NonNull Object object0, @NonNull String s) {
        this.zaa = (Executor)Preconditions.checkNotNull(executor0, "Executor must not be null");
        this.zab = Preconditions.checkNotNull(object0, "Listener must not be null");
        this.zac = new ListenerKey(object0, Preconditions.checkNotEmpty(s));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.zab != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull Notifier listenerHolder$Notifier0) {
        Preconditions.checkNotNull(listenerHolder$Notifier0, "Notifier must not be null");
        zacb zacb0 = () -> {
            Object object0 = this.zab;
            if(object0 == null) {
                listenerHolder$Notifier0.onNotifyListenerFailed();
                return;
            }
            try {
                listenerHolder$Notifier0.notifyListener(object0);
            }
            catch(RuntimeException runtimeException0) {
                listenerHolder$Notifier0.onNotifyListenerFailed();
                throw runtimeException0;
            }
        };
        this.zaa.execute(zacb0);
    }

    // 检测为 Lambda 实现
    final void zaa(Notifier listenerHolder$Notifier0) [...]
}

