package V2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.util.p;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.J;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class c {
    public static enum a {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK;

        private static final a[] $values() [...] // Inlined contents
    }

    public final class b {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[a.values().length];
            arr_v[a.DISABLE_ID.ordinal()] = 1;
            arr_v[a.FALLBACK.ordinal()] = 2;
            arr_v[a.ALLOW_ID.ordinal()] = 3;
            b.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[com.vungle.ads.internal.model.h.h.c.values().length];
            arr_v1[com.vungle.ads.internal.model.h.h.c.DISABLE_ID.ordinal()] = 1;
            arr_v1[com.vungle.ads.internal.model.h.h.c.ALLOW_ID.ordinal()] = 2;
            arr_v1[com.vungle.ads.internal.model.h.h.c.LEGACY.ordinal()] = 3;
            b.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @l
    public static final c INSTANCE;
    @m
    private static V2.b ccpaConsent;
    @l
    private static final AtomicReference coppaStatus;
    @l
    private static final AtomicReference disableAdId;
    @m
    private static com.vungle.ads.internal.persistence.b filePreferences;
    @m
    private static String gdprConsent;
    @m
    private static String gdprConsentMessageVersion;
    @m
    private static String gdprConsentSource;
    @m
    private static Long gdprConsentTimestamp;
    @l
    private static final AtomicBoolean initialized;
    @m
    private static SharedPreferences sharedPreferences;

    static {
        c.INSTANCE = new c();
        c.disableAdId = new AtomicReference();
        c.coppaStatus = new AtomicReference();
        c.initialized = new AtomicBoolean(false);
    }

    @l
    public final a allowDeviceIDFromTCF() {
        Boolean boolean0 = this.getGdprAppliesFromPreferences();
        if(L.g(boolean0, Boolean.TRUE)) {
            com.vungle.ads.internal.model.h.h.c h$h$c0 = k.INSTANCE.getTcfStatus();
            switch((h$h$c0 == null ? -1 : b.$EnumSwitchMapping$1[h$h$c0.ordinal()])) {
                case 1: {
                    return a.DISABLE_ID;
                }
                case 2: {
                    return a.ALLOW_ID;
                }
                case -1: 
                case 3: {
                    return a.FALLBACK;
                }
                default: {
                    throw new J();
                }
            }
        }
        return boolean0 == null ? a.FALLBACK : a.ALLOW_ID;
    }

    @l
    public final String getCcpaStatus() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @l
    public final String getConsentMessageVersion() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @l
    public final String getConsentSource() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @l
    public final String getConsentStatus() [...] // 潜在的解密器

    public final long getConsentTimestamp() [...] // 潜在的解密器

    @l
    public final V2.a getCoppaStatus() {
        AtomicReference atomicReference0 = c.coppaStatus;
        if(atomicReference0.get() == null) {
            return V2.a.COPPA_NOTSET;
        }
        if(L.g(atomicReference0.get(), Boolean.TRUE)) {
            return V2.a.COPPA_ENABLED;
        }
        return L.g(atomicReference0.get(), Boolean.FALSE) ? V2.a.COPPA_DISABLED : V2.a.COPPA_NOTSET;
    }

    @VisibleForTesting
    @m
    public final Boolean getDisableAdId$vungle_ads_release() {
        return (Boolean)c.disableAdId.get();
    }

    @m
    public final Boolean getGdprAppliesFromPreferences() {
        Integer integer2;
        Integer integer1;
        Integer integer0;
        try {
            integer0 = c.sharedPreferences == null ? null : c.sharedPreferences.getInt("IABTCF_gdprApplies", -1);
        }
        catch(Throwable throwable0) {
            integer0 = e0.b(f0.a(throwable0));
        }
        if(e0.e(integer0) != null) {
            try {
                SharedPreferences sharedPreferences0 = c.sharedPreferences;
                if(sharedPreferences0 == null) {
                    integer1 = null;
                }
                else {
                    String s = sharedPreferences0.getString("IABTCF_gdprApplies", "-1");
                    if(s == null) {
                        integer1 = null;
                    }
                    else {
                        L.o(s, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                        integer1 = Integer.parseInt(s);
                    }
                }
                integer2 = integer1;
            }
            catch(Throwable throwable1) {
                integer2 = e0.b(f0.a(throwable1));
            }
            integer0 = integer2;
        }
        if(e0.i(integer0)) {
            integer0 = null;
        }
        if(integer0 != null && ((int)integer0) == 1) {
            return true;
        }
        return integer0 == null || ((int)integer0) != 0 ? null : false;
    }

    @l
    public final String getIABTCFString() [...] // 潜在的解密器

    @m
    public final String getPreviousTcfToken() {
        return c.filePreferences == null ? null : c.filePreferences.getString("previous_tcf_token", "");
    }

    @m
    public final SharedPreferences getSharedPreferences() {
        return c.sharedPreferences;
    }

    public final void init(@l Context context0) {
        synchronized(this) {
            L.p(context0, "context");
            AtomicBoolean atomicBoolean0 = c.initialized;
            if(atomicBoolean0.get()) {
                p.Companion.w("PrivacyManager", "PrivacyManager already initialized");
                return;
            }
            c.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context0);
            com.vungle.ads.internal.persistence.b b0 = (com.vungle.ads.internal.persistence.b)ServiceLocator.Companion.getInstance(context0).getService(com.vungle.ads.internal.persistence.b.class);
            c.filePreferences = b0;
            AtomicReference atomicReference0 = c.disableAdId;
            Boolean boolean0 = (Boolean)atomicReference0.get();
            if(boolean0 == null) {
                Boolean boolean1 = b0.getBoolean("disable_ad_id");
                if(boolean1 != null) {
                    atomicReference0.set(boolean1);
                }
            }
            else {
                this.saveDisableAdId(boolean0.booleanValue());
            }
            String s = c.gdprConsent;
            long v1 = 0L;
            if(s == null) {
                String s1 = b0.getString("gdpr_status");
                V2.b b1 = V2.b.OPT_IN;
                if(L.g(s1, "opted_in")) {
                    s1 = b1.getValue();
                }
                else {
                    V2.b b2 = V2.b.OPT_OUT;
                    if(L.g(s1, "opted_out")) {
                        s1 = b2.getValue();
                    }
                }
                c.gdprConsent = s1;
                c.gdprConsentSource = b0.getString("gdpr_source");
                c.gdprConsentMessageVersion = b0.getString("gdpr_message_version");
                c.gdprConsentTimestamp = b0.getLong("gdpr_timestamp", 0L);
            }
            else {
                Long long0 = c.gdprConsentTimestamp;
                if(long0 != null) {
                    v1 = (long)long0;
                }
                this.saveGdprConsent(s, "", "", v1);
            }
            V2.b b3 = c.ccpaConsent;
            if(b3 == null) {
                c.ccpaConsent = L.g("opted_out", b0.getString("ccpa_status")) ? V2.b.OPT_OUT : V2.b.OPT_IN;
            }
            else {
                this.saveCcpaConsent(b3);
            }
            AtomicReference atomicReference1 = c.coppaStatus;
            Boolean boolean2 = (Boolean)atomicReference1.get();
            if(boolean2 == null) {
                Boolean boolean3 = b0.getBoolean("is_coppa");
                if(boolean3 != null) {
                    atomicReference1.set(boolean3);
                }
            }
            else {
                this.saveCoppaConsent(boolean2.booleanValue());
            }
            atomicBoolean0.set(true);
        }
    }

    private final void saveCcpaConsent(V2.b b0) {
        com.vungle.ads.internal.persistence.b b1 = c.filePreferences;
        if(b1 != null) {
            com.vungle.ads.internal.persistence.b b2 = b1.put("ccpa_status", b0.getValue());
            if(b2 != null) {
                b2.apply();
            }
        }
    }

    private final void saveCoppaConsent(boolean z) {
        com.vungle.ads.internal.persistence.b b0 = c.filePreferences;
        if(b0 != null) {
            com.vungle.ads.internal.persistence.b b1 = b0.put("is_coppa", z);
            if(b1 != null) {
                b1.apply();
            }
        }
    }

    @VisibleForTesting
    public final void saveDisableAdId(boolean z) {
        com.vungle.ads.internal.persistence.b b0 = c.filePreferences;
        if(b0 != null) {
            com.vungle.ads.internal.persistence.b b1 = b0.put("disable_ad_id", z);
            if(b1 != null) {
                b1.apply();
            }
        }
    }

    private final void saveGdprConsent(String s, String s1, String s2, long v) {
        com.vungle.ads.internal.persistence.b b0 = c.filePreferences;
        if(b0 != null) {
            com.vungle.ads.internal.persistence.b b1 = b0.put("gdpr_status", s);
            if(b1 != null) {
                com.vungle.ads.internal.persistence.b b2 = b1.put("gdpr_source", s1);
                if(b2 != null) {
                    com.vungle.ads.internal.persistence.b b3 = b2.put("gdpr_message_version", s2);
                    if(b3 != null) {
                        com.vungle.ads.internal.persistence.b b4 = b3.put("gdpr_timestamp", v);
                        if(b4 != null) {
                            b4.apply();
                        }
                    }
                }
            }
        }
    }

    public final void setPreviousTcfToken(@m String s) {
        if(s != null && s.length() != 0) {
            com.vungle.ads.internal.persistence.b b0 = c.filePreferences;
            if(b0 != null) {
                com.vungle.ads.internal.persistence.b b1 = b0.put("previous_tcf_token", s);
                if(b1 != null) {
                    b1.apply();
                }
            }
        }
    }

    public final void setSharedPreferences(@m SharedPreferences sharedPreferences0) {
        c.sharedPreferences = sharedPreferences0;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        if(!L.g(this.getPreviousTcfToken(), "")) {
            this.setPreviousTcfToken("");
            return true;
        }
        return false;
    }

    public final boolean shouldSendAdIds() {
        switch(this.allowDeviceIDFromTCF()) {
            case 1: {
                return false;
            }
            case 2: 
            case 3: {
                Boolean boolean0 = this.getDisableAdId$vungle_ads_release();
                return boolean0 != null && !boolean0.booleanValue();
            }
            default: {
                throw new J();
            }
        }
    }

    public final boolean shouldSendTCFString() {
        if(L.g(this.getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            com.vungle.ads.internal.model.h.h.c h$h$c0 = k.INSTANCE.getTcfStatus();
            switch((h$h$c0 == null ? -1 : b.$EnumSwitchMapping$1[h$h$c0.ordinal()])) {
                case 1: 
                case 2: {
                    return true;
                }
                case -1: 
                case 3: {
                    return this.shouldReturnTrueForLegacy$vungle_ads_release();
                }
                default: {
                    throw new J();
                }
            }
        }
        return false;
    }

    public final void updateCcpaConsent(@l V2.b b0) {
        L.p(b0, "consent");
        c.ccpaConsent = b0;
        this.saveCcpaConsent(b0);
    }

    public final void updateCoppaConsent(boolean z) {
        c.coppaStatus.set(Boolean.valueOf(z));
        this.saveCoppaConsent(z);
    }

    public final void updateDisableAdId(boolean z) {
        c.disableAdId.set(Boolean.valueOf(z));
        this.saveDisableAdId(z);
    }

    public final void updateGdprConsent(@l String s, @l String s1, @m String s2) {
        L.p(s, "consent");
        L.p(s1, "source");
        c.gdprConsent = s;
        c.gdprConsentSource = s1;
        c.gdprConsentMessageVersion = s2;
        long v = System.currentTimeMillis();
        c.gdprConsentTimestamp = (long)(v / 1000L);
        this.saveGdprConsent(s, s1, "", v / 1000L);
    }
}

