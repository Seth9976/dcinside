package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import j..util.Objects;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

@Class(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    public @interface MessagePriority {
    }

    @NonNull
    public static final Parcelable.Creator CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN;
    @NonNull
    @Field(id = 1)
    final Intent zza;
    private Map zzb;

    static {
        CloudMessage.CREATOR = new zza();
    }

    @KeepForSdk
    @Constructor
    public CloudMessage(@NonNull @Param(id = 1) Intent intent0) {
        this.zza = intent0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.zza.getStringExtra("collapse_key");
    }

    @NonNull
    public Map getData() {
        synchronized(this) {
            if(this.zzb == null) {
                Bundle bundle0 = this.zza.getExtras();
                ArrayMap arrayMap0 = new ArrayMap();
                if(bundle0 != null) {
                    for(Object object0: bundle0.keySet()) {
                        String s = (String)object0;
                        Object object1 = bundle0.get(s);
                        if(object1 instanceof String && !s.startsWith("google.") && !s.equals("from") && !s.equals("message_type") && !s.equals("collapse_key")) {
                            arrayMap0.put(s, ((String)object1));
                        }
                    }
                }
                this.zzb = arrayMap0;
            }
            return this.zzb;
        }
    }

    @Nullable
    public String getFrom() {
        return this.zza.getStringExtra("from");
    }

    @NonNull
    public Intent getIntent() {
        return this.zza;
    }

    @Nullable
    public String getMessageId() {
        String s = this.zza.getStringExtra("google.message_id");
        return s == null ? this.zza.getStringExtra("message_id") : s;
    }

    @Nullable
    public String getMessageType() {
        return this.zza.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        String s = this.zza.getStringExtra("google.original_priority");
        if(s == null) {
            s = this.zza.getStringExtra("google.priority");
        }
        return CloudMessage.zzb(s);
    }

    public int getPriority() {
        String s = this.zza.getStringExtra("google.delivered_priority");
        if(s == null) {
            if(Objects.equals(this.zza.getStringExtra("google.priority_reduced"), "1")) {
                return 2;
            }
            s = this.zza.getStringExtra("google.priority");
        }
        return CloudMessage.zzb(s);
    }

    @Nullable
    public byte[] getRawData() {
        return this.zza.getByteArrayExtra("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.zza.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        Bundle bundle0 = this.zza.getExtras();
        Object object0 = bundle0 == null ? null : bundle0.get("google.sent_time");
        if(object0 instanceof Long) {
            return (long)(((Long)object0));
        }
        if(object0 instanceof String) {
            try {
                return Long.parseLong(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("CloudMessage", "Invalid sent time: " + object0);
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.zza.getStringExtra("google.to");
    }

    public int getTtl() {
        Bundle bundle0 = this.zza.getExtras();
        Object object0 = bundle0 == null ? null : bundle0.get("google.ttl");
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        if(object0 instanceof String) {
            try {
                return Integer.parseInt(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("CloudMessage", "Invalid TTL: " + object0);
            }
        }
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.zza, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    // 去混淆评级： 低(20)
    @Nullable
    final Integer zza() {
        return this.zza.hasExtra("google.product_id") ? this.zza.getIntExtra("google.product_id", 0) : null;
    }

    private static int zzb(@Nullable String s) {
        if(Objects.equals(s, "high")) {
            return 1;
        }
        return Objects.equals(s, "normal") ? 2 : 0;
    }
}

