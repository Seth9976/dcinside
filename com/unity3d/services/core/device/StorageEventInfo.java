package com.unity3d.services.core.device;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class StorageEventInfo {
    @l
    private final StorageEvent eventType;
    @l
    private final StorageType storageType;
    @m
    private final Object value;

    public StorageEventInfo(@l StorageEvent storageEvent0, @l StorageType storageManager$StorageType0, @m Object object0) {
        L.p(storageEvent0, "eventType");
        L.p(storageManager$StorageType0, "storageType");
        super();
        this.eventType = storageEvent0;
        this.storageType = storageManager$StorageType0;
        this.value = object0;
    }

    @l
    public final StorageEvent component1() {
        return this.eventType;
    }

    @l
    public final StorageType component2() {
        return this.storageType;
    }

    @m
    public final Object component3() {
        return this.value;
    }

    @l
    public final StorageEventInfo copy(@l StorageEvent storageEvent0, @l StorageType storageManager$StorageType0, @m Object object0) {
        L.p(storageEvent0, "eventType");
        L.p(storageManager$StorageType0, "storageType");
        return new StorageEventInfo(storageEvent0, storageManager$StorageType0, object0);
    }

    public static StorageEventInfo copy$default(StorageEventInfo storageEventInfo0, StorageEvent storageEvent0, StorageType storageManager$StorageType0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            storageEvent0 = storageEventInfo0.eventType;
        }
        if((v & 2) != 0) {
            storageManager$StorageType0 = storageEventInfo0.storageType;
        }
        if((v & 4) != 0) {
            object0 = storageEventInfo0.value;
        }
        return storageEventInfo0.copy(storageEvent0, storageManager$StorageType0, object0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof StorageEventInfo)) {
            return false;
        }
        if(this.eventType != ((StorageEventInfo)object0).eventType) {
            return false;
        }
        return this.storageType == ((StorageEventInfo)object0).storageType ? L.g(this.value, ((StorageEventInfo)object0).value) : false;
    }

    @l
    public final StorageEvent getEventType() {
        return this.eventType;
    }

    @l
    public final StorageType getStorageType() {
        return this.storageType;
    }

    @m
    public final Object getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = this.eventType.hashCode();
        int v1 = this.storageType.hashCode();
        return this.value == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.value.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "StorageEventInfo(eventType=" + this.eventType + ", storageType=" + this.storageType + ", value=" + this.value + ')';
    }
}

