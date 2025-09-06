package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map.Entry;
import java.util.Map;

@Class(creator = "RemoteMessageCreator")
@Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    static class a {
    }

    public static class b {
        private final Bundle a;
        private final Map b;

        public b(@NonNull String s) {
            Bundle bundle0 = new Bundle();
            this.a = bundle0;
            this.b = new ArrayMap();
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("Invalid to: " + s);
            }
            bundle0.putString("google.to", s);
        }

        @NonNull
        public b a(@NonNull String s, @Nullable String s1) {
            this.b.put(s, s1);
            return this;
        }

        @NonNull
        public RemoteMessage b() {
            Bundle bundle0 = new Bundle();
            for(Object object0: this.b.entrySet()) {
                bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            bundle0.putAll(this.a);
            this.a.remove("from");
            return new RemoteMessage(bundle0);
        }

        @NonNull
        public b c() {
            this.b.clear();
            return this;
        }

        @Nullable
        public String d() {
            return this.a.getString("message_type");
        }

        @NonNull
        public Map e() {
            return this.b;
        }

        @NonNull
        public String f() {
            return this.a.getString("google.message_id", "");
        }

        @Nullable
        public String g() {
            return this.a.getString("message_type");
        }

        @IntRange(from = 0L, to = 86400L)
        public int h() {
            return Integer.parseInt(this.a.getString("message_type", "0"));
        }

        @NonNull
        public b i(@Nullable String s) {
            this.a.putString("collapse_key", s);
            return this;
        }

        @NonNull
        public b j(@NonNull Map map0) {
            this.b.clear();
            this.b.putAll(map0);
            return this;
        }

        @NonNull
        public b k(@NonNull String s) {
            this.a.putString("google.message_id", s);
            return this;
        }

        @NonNull
        public b l(@Nullable String s) {
            this.a.putString("message_type", s);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public b m(byte[] arr_b) {
            this.a.putByteArray("rawData", arr_b);
            return this;
        }

        @NonNull
        public b n(@IntRange(from = 0L, to = 86400L) int v) {
            this.a.putString("google.ttl", String.valueOf(v));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static class d {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final String o;
        private final Integer p;
        private final Integer q;
        private final Integer r;
        private final int[] s;
        private final Long t;
        private final boolean u;
        private final boolean v;
        private final boolean w;
        private final boolean x;
        private final boolean y;
        private final long[] z;

        private d(S s0) {
            this.a = s0.p("gcm.n.title");
            this.b = s0.h("gcm.n.title");
            this.c = d.p(s0, "gcm.n.title");
            this.d = s0.p("gcm.n.body");
            this.e = s0.h("gcm.n.body");
            this.f = d.p(s0, "gcm.n.body");
            this.g = s0.p("gcm.n.icon");
            this.i = s0.o();
            this.j = s0.p("gcm.n.tag");
            this.k = s0.p("gcm.n.color");
            this.l = s0.p("gcm.n.click_action");
            this.m = s0.p("gcm.n.android_channel_id");
            this.n = s0.f();
            this.h = s0.p("gcm.n.image");
            this.o = s0.p("gcm.n.ticker");
            this.p = s0.b("gcm.n.notification_priority");
            this.q = s0.b("gcm.n.visibility");
            this.r = s0.b("gcm.n.notification_count");
            this.u = s0.a("gcm.n.sticky");
            this.v = s0.a("gcm.n.local_only");
            this.w = s0.a("gcm.n.default_sound");
            this.x = s0.a("gcm.n.default_vibrate_timings");
            this.y = s0.a("gcm.n.default_light_settings");
            this.t = s0.j("gcm.n.event_time");
            this.s = s0.e();
            this.z = s0.q();
        }

        d(S s0, a remoteMessage$a0) {
            this(s0);
        }

        @Nullable
        public Integer A() {
            return this.q;
        }

        @Nullable
        public String a() {
            return this.d;
        }

        @Nullable
        public String[] b() {
            return this.f;
        }

        @Nullable
        public String c() {
            return this.e;
        }

        @Nullable
        public String d() {
            return this.m;
        }

        @Nullable
        public String e() {
            return this.l;
        }

        @Nullable
        public String f() {
            return this.k;
        }

        public boolean g() {
            return this.y;
        }

        public boolean h() {
            return this.w;
        }

        public boolean i() {
            return this.x;
        }

        @Nullable
        public Long j() {
            return this.t;
        }

        @Nullable
        public String k() {
            return this.g;
        }

        @Nullable
        public Uri l() {
            return this.h == null ? null : Uri.parse(this.h);
        }

        @Nullable
        public int[] m() {
            return this.s;
        }

        @Nullable
        public Uri n() {
            return this.n;
        }

        public boolean o() {
            return this.v;
        }

        private static String[] p(S s0, String s1) {
            Object[] arr_object = s0.g(s1);
            if(arr_object == null) {
                return null;
            }
            String[] arr_s = new String[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                arr_s[v] = String.valueOf(arr_object[v]);
            }
            return arr_s;
        }

        @Nullable
        public Integer q() {
            return this.r;
        }

        @Nullable
        public Integer r() {
            return this.p;
        }

        @Nullable
        public String s() {
            return this.i;
        }

        public boolean t() {
            return this.u;
        }

        @Nullable
        public String u() {
            return this.j;
        }

        @Nullable
        public String v() {
            return this.o;
        }

        @Nullable
        public String w() {
            return this.a;
        }

        @Nullable
        public String[] x() {
            return this.c;
        }

        @Nullable
        public String y() {
            return this.b;
        }

        @Nullable
        public long[] z() {
            return this.z;
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    @Field(id = 2)
    Bundle a;
    private Map b;
    private d c;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;

    static {
        RemoteMessage.CREATOR = new a0();
    }

    @Constructor
    public RemoteMessage(@Param(id = 2) Bundle bundle0) {
        this.a = bundle0;
    }

    private int a(String s) {
        if("high".equals(s)) {
            return 1;
        }
        return "normal".equals(s) ? 2 : 0;
    }

    @Nullable
    public d c() {
        if(this.c == null && S.v(this.a)) {
            this.c = new d(new S(this.a), null);
        }
        return this.c;
    }

    @Nullable
    public String getCollapseKey() {
        return this.a.getString("collapse_key");
    }

    @NonNull
    public Map getData() {
        if(this.b == null) {
            this.b = com.google.firebase.messaging.f.d.a(this.a);
        }
        return this.b;
    }

    @Nullable
    public String getFrom() {
        return this.a.getString("from");
    }

    @Nullable
    public String getMessageId() {
        String s = this.a.getString("google.message_id");
        return s == null ? this.a.getString("message_id") : s;
    }

    @Nullable
    public String getMessageType() {
        return this.a.getString("message_type");
    }

    public int getOriginalPriority() {
        String s = this.a.getString("google.original_priority");
        if(s == null) {
            s = this.a.getString("google.priority");
        }
        return this.a(s);
    }

    public int getPriority() {
        String s = this.a.getString("google.delivered_priority");
        if(s == null) {
            if("1".equals(this.a.getString("google.priority_reduced"))) {
                return 2;
            }
            s = this.a.getString("google.priority");
        }
        return this.a(s);
    }

    @Nullable
    @ShowFirstParty
    public byte[] getRawData() {
        return this.a.getByteArray("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.a.getString("google.c.sender.id");
    }

    public long getSentTime() {
        Object object0 = this.a.get("google.sent_time");
        if(object0 instanceof Long) {
            return (long)(((Long)object0));
        }
        if(object0 instanceof String) {
            try {
                return Long.parseLong(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + object0);
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.a.getString("google.to");
    }

    public int getTtl() {
        Object object0 = this.a.get("google.ttl");
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        if(object0 instanceof String) {
            try {
                return Integer.parseInt(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + object0);
            }
        }
        return 0;
    }

    void i(Intent intent0) {
        intent0.putExtras(this.a);
    }

    @KeepForSdk
    public Intent t() {
        Intent intent0 = new Intent();
        intent0.putExtras(this.a);
        return intent0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        a0.c(this, parcel0, v);
    }
}

