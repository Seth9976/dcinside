package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.j;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    public static enum a {
        @NonNull
        GRANTED,
        @NonNull
        DENIED;

    }

    public static enum b {
        @NonNull
        AD_STORAGE,
        @NonNull
        ANALYTICS_STORAGE,
        @NonNull
        AD_USER_DATA,
        @NonNull
        AD_PERSONALIZATION;

    }

    public static class c {
        @NonNull
        public static final String A = "screen_view";
        @NonNull
        public static final String B = "remove_from_cart";
        @NonNull
        public static final String C = "add_shipping_info";
        @NonNull
        public static final String D = "purchase";
        @NonNull
        public static final String E = "refund";
        @NonNull
        public static final String F = "select_item";
        @NonNull
        public static final String G = "select_promotion";
        @NonNull
        public static final String H = "view_cart";
        @NonNull
        public static final String I = "view_promotion";
        @NonNull
        public static final String a = "ad_impression";
        @NonNull
        public static final String b = "add_payment_info";
        @NonNull
        public static final String c = "add_to_cart";
        @NonNull
        public static final String d = "add_to_wishlist";
        @NonNull
        public static final String e = "app_open";
        @NonNull
        public static final String f = "begin_checkout";
        @NonNull
        public static final String g = "campaign_details";
        @NonNull
        public static final String h = "generate_lead";
        @NonNull
        public static final String i = "join_group";
        @NonNull
        public static final String j = "level_end";
        @NonNull
        public static final String k = "level_start";
        @NonNull
        public static final String l = "level_up";
        @NonNull
        public static final String m = "login";
        @NonNull
        public static final String n = "post_score";
        @NonNull
        public static final String o = "search";
        @NonNull
        public static final String p = "select_content";
        @NonNull
        public static final String q = "share";
        @NonNull
        public static final String r = "sign_up";
        @NonNull
        public static final String s = "spend_virtual_currency";
        @NonNull
        public static final String t = "tutorial_begin";
        @NonNull
        public static final String u = "tutorial_complete";
        @NonNull
        public static final String v = "unlock_achievement";
        @NonNull
        public static final String w = "view_item";
        @NonNull
        public static final String x = "view_item_list";
        @NonNull
        public static final String y = "view_search_results";
        @NonNull
        public static final String z = "earn_virtual_currency";

    }

    public static class d {
        @NonNull
        public static final String A = "origin";
        @NonNull
        public static final String B = "price";
        @NonNull
        public static final String C = "quantity";
        @NonNull
        public static final String D = "score";
        @NonNull
        public static final String E = "shipping";
        @NonNull
        public static final String F = "transaction_id";
        @NonNull
        public static final String G = "search_term";
        @NonNull
        public static final String H = "success";
        @NonNull
        public static final String I = "tax";
        @NonNull
        public static final String J = "value";
        @NonNull
        public static final String K = "virtual_currency_name";
        @NonNull
        public static final String L = "campaign";
        @NonNull
        public static final String M = "source";
        @NonNull
        public static final String N = "medium";
        @NonNull
        public static final String O = "term";
        @NonNull
        public static final String P = "content";
        @NonNull
        public static final String Q = "aclid";
        @NonNull
        public static final String R = "cp1";
        @NonNull
        public static final String S = "campaign_id";
        @NonNull
        public static final String T = "source_platform";
        @NonNull
        public static final String U = "creative_format";
        @NonNull
        public static final String V = "marketing_tactic";
        @NonNull
        public static final String W = "item_brand";
        @NonNull
        public static final String X = "item_variant";
        @NonNull
        public static final String Y = "creative_name";
        @NonNull
        public static final String Z = "creative_slot";
        @NonNull
        public static final String a = "achievement_id";
        @NonNull
        public static final String a0 = "affiliation";
        @NonNull
        public static final String b = "ad_format";
        @NonNull
        public static final String b0 = "index";
        @NonNull
        public static final String c = "ad_platform";
        @NonNull
        public static final String c0 = "discount";
        @NonNull
        public static final String d = "ad_source";
        @NonNull
        public static final String d0 = "item_category2";
        @NonNull
        public static final String e = "ad_unit_name";
        @NonNull
        public static final String e0 = "item_category3";
        @NonNull
        public static final String f = "character";
        @NonNull
        public static final String f0 = "item_category4";
        @NonNull
        public static final String g = "travel_class";
        @NonNull
        public static final String g0 = "item_category5";
        @NonNull
        public static final String h = "content_type";
        @NonNull
        public static final String h0 = "item_list_id";
        @NonNull
        public static final String i = "currency";
        @NonNull
        public static final String i0 = "item_list_name";
        @NonNull
        public static final String j = "coupon";
        @NonNull
        public static final String j0 = "items";
        @NonNull
        public static final String k = "start_date";
        @NonNull
        public static final String k0 = "location_id";
        @NonNull
        public static final String l = "end_date";
        @NonNull
        public static final String l0 = "payment_type";
        @NonNull
        public static final String m = "extend_session";
        @NonNull
        public static final String m0 = "promotion_id";
        @NonNull
        public static final String n = "flight_number";
        @NonNull
        public static final String n0 = "promotion_name";
        @NonNull
        public static final String o = "group_id";
        @NonNull
        public static final String o0 = "screen_class";
        @NonNull
        public static final String p = "item_category";
        @NonNull
        public static final String p0 = "screen_name";
        @NonNull
        public static final String q = "item_id";
        @NonNull
        public static final String q0 = "shipping_tier";
        @NonNull
        public static final String r = "item_name";
        @NonNull
        public static final String s = "location";
        @NonNull
        public static final String t = "level";
        @NonNull
        public static final String u = "level_name";
        @NonNull
        public static final String v = "method";
        @NonNull
        public static final String w = "number_of_nights";
        @NonNull
        public static final String x = "number_of_passengers";
        @NonNull
        public static final String y = "number_of_rooms";
        @NonNull
        public static final String z = "destination";

    }

    public static class e {
        @NonNull
        public static final String a = "sign_up_method";
        @NonNull
        public static final String b = "allow_personalized_ads";

    }

    private final zzdy a;
    private ExecutorService b;
    private static volatile FirebaseAnalytics c;

    private FirebaseAnalytics(zzdy zzdy0) {
        Preconditions.checkNotNull(zzdy0);
        this.a = zzdy0;
    }

    @NonNull
    public final Task a() {
        try {
            return Tasks.call(this.l(), new g(this));
        }
        catch(RuntimeException runtimeException0) {
            this.a.zza(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(runtimeException0);
        }
    }

    @NonNull
    public final Task b() {
        try {
            return Tasks.call(this.l(), new f(this));
        }
        catch(RuntimeException runtimeException0) {
            this.a.zza(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(runtimeException0);
        }
    }

    public final void c(@NonNull @Size(max = 40L, min = 1L) String s, @Nullable Bundle bundle0) {
        this.a.zza(s, bundle0);
    }

    public final void d() {
        this.a.zzj();
    }

    public final void e(boolean z) {
        this.a.zza(Boolean.valueOf(z));
    }

    public final void f(@NonNull Map map0) {
        Bundle bundle0 = new Bundle();
        a firebaseAnalytics$a0 = (a)map0.get(b.a);
        if(firebaseAnalytics$a0 != null) {
            switch(firebaseAnalytics$a0.ordinal()) {
                case 0: {
                    bundle0.putString("ad_storage", "granted");
                    break;
                }
                case 1: {
                    bundle0.putString("ad_storage", "denied");
                }
            }
        }
        a firebaseAnalytics$a1 = (a)map0.get(b.b);
        if(firebaseAnalytics$a1 != null) {
            switch(firebaseAnalytics$a1.ordinal()) {
                case 0: {
                    bundle0.putString("analytics_storage", "granted");
                    break;
                }
                case 1: {
                    bundle0.putString("analytics_storage", "denied");
                }
            }
        }
        a firebaseAnalytics$a2 = (a)map0.get(b.c);
        if(firebaseAnalytics$a2 != null) {
            switch(firebaseAnalytics$a2.ordinal()) {
                case 0: {
                    bundle0.putString("ad_user_data", "granted");
                    break;
                }
                case 1: {
                    bundle0.putString("ad_user_data", "denied");
                }
            }
        }
        a firebaseAnalytics$a3 = (a)map0.get(b.d);
        if(firebaseAnalytics$a3 != null) {
            switch(firebaseAnalytics$a3.ordinal()) {
                case 0: {
                    bundle0.putString("ad_personalization", "granted");
                    break;
                }
                case 1: {
                    bundle0.putString("ad_personalization", "denied");
                }
            }
        }
        this.a.zzc(bundle0);
    }

    public final void g(@Nullable Bundle bundle0) {
        if(bundle0 != null) {
            bundle0 = new Bundle(bundle0);
        }
        this.a.zzd(bundle0);
    }

    @Keep
    @NonNull
    public final String getFirebaseInstanceId() {
        try {
            return (String)Tasks.await(j.u().getId(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new IllegalStateException(executionException0.getCause());
        }
        catch(TimeoutException unused_ex) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    @Keep
    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static FirebaseAnalytics getInstance(@NonNull Context context0) {
        if(FirebaseAnalytics.c == null) {
            Class class0 = FirebaseAnalytics.class;
            synchronized(class0) {
                if(FirebaseAnalytics.c == null) {
                    FirebaseAnalytics.c = new FirebaseAnalytics(zzdy.zza(context0));
                }
            }
        }
        return FirebaseAnalytics.c;
    }

    @Keep
    @Nullable
    public static zzlb getScionFrontendApiImplementation(Context context0, @Nullable Bundle bundle0) {
        zzdy zzdy0 = zzdy.zza(context0, null, null, null, bundle0);
        return zzdy0 == null ? null : new h(zzdy0);
    }

    public final void h(long v) {
        this.a.zza(v);
    }

    public final void i(@Nullable String s) {
        this.a.zzd(s);
    }

    public final void j(@NonNull @Size(max = 24L, min = 1L) String s, @Nullable @Size(max = 36L) String s1) {
        this.a.zzb(s, s1);
    }

    @h4.d({"this.executor"})
    private final ExecutorService l() {
        synchronized(FirebaseAnalytics.class) {
            if(this.b == null) {
                this.b = new com.google.firebase.analytics.e(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            return this.b;
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity0, @Nullable @Size(max = 36L, min = 1L) String s, @Nullable @Size(max = 36L, min = 1L) String s1) {
        this.a.zza(activity0, s, s1);
    }
}

