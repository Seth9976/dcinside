package com.unity3d.services.core.device;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage\n*L\n78#1:101,2\n*E\n"})
public final class Storage extends JsonStorage {
    @s0({"SMAP\nStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage$Companion\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,100:1\n230#2,5:101\n230#2,5:106\n*S KotlinDebug\n*F\n+ 1 Storage.kt\ncom/unity3d/services/core/device/Storage$Companion\n*L\n96#1:101,5\n97#1:106,5\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final void addStorageEventCallback(@l Function1 function10) {
            L.p(function10, "callback");
            E e0 = Storage.onStorageEventCallbacks;
            do {
                Object object0 = e0.getValue();
            }
            while(!e0.compareAndSet(object0, u.E4(((List)object0), function10)));
        }

        public final void removeStorageEventCallback(@l Function1 function10) {
            L.p(function10, "callback");
            E e0 = Storage.onStorageEventCallbacks;
            do {
                Object object0 = e0.getValue();
            }
            while(!e0.compareAndSet(object0, u.q4(((List)object0), function10)));
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final String _targetFileName;
    @l
    private static final E onStorageEventCallbacks;
    @l
    private final StorageType type;

    static {
        Storage.Companion = new Companion(null);
        Storage.onStorageEventCallbacks = W.a(u.H());
    }

    public Storage(@l String s, @l StorageType storageManager$StorageType0) {
        L.p(s, "_targetFileName");
        L.p(storageManager$StorageType0, "type");
        super();
        this._targetFileName = s;
        this.type = storageManager$StorageType0;
    }

    public final boolean clearStorage() {
        synchronized(this) {
            this.clearData();
            return new File(this._targetFileName).delete();
        }
    }

    @l
    public final StorageType getType() {
        return this.type;
    }

    public final boolean initStorage() {
        synchronized(this) {
            this.readStorage();
            super.initData();
            return true;
        }
    }

    public final boolean readStorage() {
        boolean z = true;
        synchronized(this) {
            File file0 = new File(this._targetFileName);
            try {
                byte[] arr_b = Utilities.readFileBytes(file0);
                if(arr_b != null) {
                    this.setData(new JSONObject(new String(arr_b, f.b)));
                    return z;
                }
                return false;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                DeviceLog.debug("Storage JSON file not found in local cache:", new Object[]{fileNotFoundException0});
            }
            catch(Exception exception0) {
                DeviceLog.debug("Failed to read storage JSON file:", new Object[]{exception0});
            }
            return false;
        }
    }

    public final void sendEvent(@m StorageEvent storageEvent0, @m Object object0) {
        boolean z = false;
        synchronized(this) {
            List list0 = (List)Storage.onStorageEventCallbacks.getValue();
            if(!list0.isEmpty()) {
                L.m(storageEvent0);
                StorageEventInfo storageEventInfo0 = new StorageEventInfo(storageEvent0, this.type, object0);
                for(Object object1: list0) {
                    ((Function1)object1).invoke(storageEventInfo0);
                }
                return;
            }
            if(WebViewApp.getCurrentApp() != null) {
                z = WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent0, new Object[]{this.type.name(), object0});
            }
            if(!z) {
                DeviceLog.debug("Couldn\'t send storage event to WebApp");
            }
        }
    }

    public final boolean storageFileExists() {
        synchronized(this) {
            return new File(this._targetFileName).exists();
        }
    }

    public final boolean writeStorage() {
        synchronized(this) {
            File file0 = new File(this._targetFileName);
            return this.getData() != null ? Utilities.writeFile(file0, this.getData().toString()) : false;
        }
    }
}

