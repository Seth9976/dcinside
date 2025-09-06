package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import y4.l;

public interface StorageManager {
    void addStorageLocation(@l StorageType arg1, @l String arg2);

    @l
    Storage getStorage(@l StorageType arg1);

    void hasInitialized();

    boolean hasStorage(@l StorageType arg1);

    boolean init(@l Context arg1);

    void initStorage(@l StorageType arg1);

    void removeStorage(@l StorageType arg1);
}

