package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class AndroidStorageManager implements StorageManager {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    static {
        AndroidStorageManager.Companion = new Companion(null);
    }

    @Override  // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(@l StorageType storageManager$StorageType0, @l String s) {
        L.p(storageManager$StorageType0, "type");
        L.p(s, "fileName");
        com.unity3d.services.core.device.StorageManager.addStorageLocation(storageManager$StorageType0, s);
    }

    @Override  // com.unity3d.ads.core.data.manager.StorageManager
    @l
    public Storage getStorage(@l StorageType storageManager$StorageType0) {
        L.p(storageManager$StorageType0, "type");
        Storage storage0 = com.unity3d.services.core.device.StorageManager.getStorage(storageManager$StorageType0);
        L.o(storage0, "getStorage(type)");
        return storage0;
    }

    @Override  // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage0 = this.getStorage(StorageType.PRIVATE);
        storage0.set("configuration.hasInitialized", Boolean.TRUE);
        storage0.writeStorage();
    }

    @Override  // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(@l StorageType storageManager$StorageType0) {
        L.p(storageManager$StorageType0, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(storageManager$StorageType0);
    }

    @Override  // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(@l Context context0) {
        L.p(context0, "context");
        return com.unity3d.services.core.device.StorageManager.init(context0);
    }

    @Override  // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(@l StorageType storageManager$StorageType0) {
        L.p(storageManager$StorageType0, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(storageManager$StorageType0);
    }

    @Override  // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(@l StorageType storageManager$StorageType0) {
        L.p(storageManager$StorageType0, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(storageManager$StorageType0);
    }
}

