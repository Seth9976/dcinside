package com.google.android.gms.internal.measurement;

public enum zzcj implements zzjy {
    UNSPECIFIED_TYPE(0),
    RAW_FILE_IO_TYPE(1),
    MOBSTORE_TYPE(2),
    SQLITE_OPEN_HELPER_TYPE(3),
    LEVEL_DB_TYPE(5),
    ROOM_TYPE(6),
    SHARED_PREFS_TYPE(7),
    PROTO_DATA_STORE_TYPE(8),
    UNRECOGNIZED(-1);

    private final int zzk;

    private zzcj(int v1) {
        this.zzk = v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("<");
        stringBuilder0.append("com.google.android.gms.internal.measurement.zzcj");
        stringBuilder0.append('@');
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this != zzcj.zzi) {
            stringBuilder0.append(" number=");
            stringBuilder0.append(this.zza());
        }
        stringBuilder0.append(" name=");
        stringBuilder0.append(this.name());
        stringBuilder0.append('>');
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.measurement.zzjy
    public final int zza() {
        if(this == zzcj.zzi) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.zzk;
    }
}

