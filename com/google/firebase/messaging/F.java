package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.concurrent.TimeUnit;

public final class f {
    public static final class a {
        public static final String a = "google.c.a.";
        public static final String b = "google.c.a.e";
        public static final String c = "google.c.a.c_id";
        public static final String d = "google.c.a.c_l";
        public static final String e = "google.c.a.ts";
        public static final String f = "google.c.a.udt";
        public static final String g = "google.c.a.tc";
        public static final String h = "google.c.a.abt";
        public static final String i = "google.c.a.m_l";
        public static final String j = "google.c.a.m_c";

    }

    public static final class b {
        public static final String a = "FCM_CLIENT_EVENT_LOGGING";

    }

    public static final class c {
        public static final String A = "gcm.n.click_action";
        public static final String B = "gcm.n.link";
        public static final String C = "gcm.n.link_android";
        public static final String D = "gcm.n.android_channel_id";
        public static final String E = "gcm.n.analytics_data";
        public static final String F = "_loc_key";
        public static final String G = "_loc_args";
        public static final String a = "gcm.";
        public static final String b = "gcm.n.";
        public static final String c = "gcm.notification.";
        public static final String d = "gcm.n.e";
        public static final String e = "gcm.n.dnp";
        public static final String f = "gcm.n.noui";
        public static final String g = "gcm.n.title";
        public static final String h = "gcm.n.body";
        public static final String i = "gcm.n.icon";
        public static final String j = "gcm.n.image";
        public static final String k = "gcm.n.tag";
        public static final String l = "gcm.n.color";
        public static final String m = "gcm.n.ticker";
        public static final String n = "gcm.n.local_only";
        public static final String o = "gcm.n.sticky";
        public static final String p = "gcm.n.notification_priority";
        public static final String q = "gcm.n.default_sound";
        public static final String r = "gcm.n.default_vibrate_timings";
        public static final String s = "gcm.n.default_light_settings";
        public static final String t = "gcm.n.notification_count";
        public static final String u = "gcm.n.visibility";
        public static final String v = "gcm.n.vibrate_timings";
        public static final String w = "gcm.n.light_settings";
        public static final String x = "gcm.n.event_time";
        public static final String y = "gcm.n.sound2";
        public static final String z = "gcm.n.sound";

    }

    public static final class d {
        public static final String a = "google.";
        public static final String b = "from";
        public static final String c = "rawData";
        public static final String d = "message_type";
        public static final String e = "collapse_key";
        public static final String f = "message_id";
        public static final String g = "google.to";
        public static final String h = "google.message_id";
        public static final String i = "google.ttl";
        public static final String j = "google.sent_time";
        public static final String k = "google.original_priority";
        public static final String l = "google.delivered_priority";
        public static final String m = "google.priority";
        public static final String n = "google.priority_reduced";
        public static final String o = "google.product_id";
        public static final String p = "google.c.";
        public static final String q = "google.c.sender.id";

        public static ArrayMap a(Bundle bundle0) {
            ArrayMap arrayMap0 = new ArrayMap();
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = bundle0.get(s);
                if(object1 instanceof String && !s.startsWith("google.") && !s.startsWith("gcm.") && !s.equals("from") && !s.equals("message_type") && !s.equals("collapse_key")) {
                    arrayMap0.put(s, ((String)object1));
                }
            }
            return arrayMap0;
        }
    }

    public static final class e {
        public static final String a = "gcm";
        public static final String b = "deleted_messages";
        public static final String c = "send_event";
        public static final String d = "send_error";

    }

    public static final class com.google.firebase.messaging.f.f {
        public @interface com.google.firebase.messaging.f.f.a {
            public static final String k1 = "data";
            public static final String l1 = "display";

        }

        public static final String a = "fcm";
        public static final String b = "source";
        public static final String c = "medium";
        public static final String d = "label";
        public static final String e = "_nt";
        public static final String f = "campaign";
        public static final String g = "_nmn";
        public static final String h = "_nmt";
        public static final String i = "_ndt";
        public static final String j = "message_channel";
        public static final String k = "_nmc";
        public static final String l = "_cmp";
        public static final String m = "_nr";
        public static final String n = "_no";
        public static final String o = "_nd";
        public static final String p = "_nf";
        public static final String q = "_ln";
        static final String r = "_nmid";

    }

    public static final String a = "FirebaseMessaging";
    public static final String b = "wake:com.google.firebase.messaging";
    public static final long c = 0L;
    public static final String d = "error";

    static {
        f.c = TimeUnit.MINUTES.toMillis(3L);
    }
}

