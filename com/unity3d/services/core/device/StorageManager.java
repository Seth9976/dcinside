package com.unity3d.services.core.device;

import android.content.Context;
import j..util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageManager {
    public static enum StorageType {
        PRIVATE,
        PUBLIC;

        private static StorageType[] $values() [...] // Inlined contents
    }

    private static final Map _storageFileMap;
    private static final List _storages;

    static {
        StorageManager._storageFileMap = DesugarCollections.synchronizedMap(new HashMap());
        StorageManager._storages = DesugarCollections.synchronizedList(new ArrayList());
    }

    public static void addStorageLocation(StorageType storageManager$StorageType0, String s) {
        synchronized(StorageManager.class) {
            Map map0 = StorageManager._storageFileMap;
            if(!map0.containsKey(storageManager$StorageType0)) {
                map0.put(storageManager$StorageType0, s);
            }
        }
    }

    public static Storage getStorage(StorageType storageManager$StorageType0) {
        List list0 = StorageManager._storages;
        if(list0 != null) {
            synchronized(list0) {
                for(Object object0: list0) {
                    Storage storage0 = (Storage)object0;
                    if(storage0.getType().equals(storageManager$StorageType0)) {
                        return storage0;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    public static boolean hasStorage(StorageType storageManager$StorageType0) {
        List list0 = StorageManager._storages;
        if(list0 != null) {
            synchronized(list0) {
                for(Object object0: list0) {
                    if(((Storage)object0).getType().equals(storageManager$StorageType0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static boolean init(Context context0) {
        if(context0 == null) {
            return false;
        }
        File file0 = context0.getFilesDir();
        if(file0 == null) {
            return false;
        }
        StorageManager.addStorageLocation(StorageType.PUBLIC, file0 + "/" + "UnityAdsStorage-" + "public-data.json");
        if(!StorageManager.setupStorage(StorageType.PUBLIC)) {
            return false;
        }
        StorageManager.addStorageLocation(StorageType.PRIVATE, file0 + "/" + "UnityAdsStorage-" + "private-data.json");
        return StorageManager.setupStorage(StorageType.PRIVATE);
    }

    public static void initStorage(StorageType storageManager$StorageType0) {
        if(StorageManager.hasStorage(storageManager$StorageType0)) {
            Storage storage0 = StorageManager.getStorage(storageManager$StorageType0);
            if(storage0 != null) {
                storage0.initStorage();
            }
        }
        else {
            Map map0 = StorageManager._storageFileMap;
            if(map0.containsKey(storageManager$StorageType0)) {
                Storage storage1 = new Storage(((String)map0.get(storageManager$StorageType0)), storageManager$StorageType0);
                storage1.initStorage();
                StorageManager._storages.add(storage1);
            }
        }
    }

    public static void removeStorage(StorageType storageManager$StorageType0) {
        synchronized(StorageManager.class) {
            if(StorageManager.getStorage(storageManager$StorageType0) != null) {
                Storage storage0 = StorageManager.getStorage(storageManager$StorageType0);
                StorageManager._storages.remove(storage0);
            }
            Map map0 = StorageManager._storageFileMap;
            if(map0 != null) {
                map0.remove(storageManager$StorageType0);
            }
        }
    }

    private static boolean setupStorage(StorageType storageManager$StorageType0) {
        if(!StorageManager.hasStorage(storageManager$StorageType0)) {
            StorageManager.initStorage(storageManager$StorageType0);
            Storage storage0 = StorageManager.getStorage(storageManager$StorageType0);
            if(storage0 != null && !storage0.storageFileExists()) {
                storage0.writeStorage();
            }
            return storage0 != null;
        }
        return true;
    }
}

