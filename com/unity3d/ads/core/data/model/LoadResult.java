package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class LoadResult {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final class Failure extends LoadResult {
        @l
        private final UnityAdsLoadError error;
        private final boolean isScarAd;
        @m
        private final String message;
        @l
        private final String reason;
        @m
        private final String reasonDebug;
        @m
        private final Throwable throwable;

        public Failure(@l UnityAdsLoadError unityAds$UnityAdsLoadError0, @m String s, @m Throwable throwable0, @l String s1, @m String s2, boolean z) {
            L.p(unityAds$UnityAdsLoadError0, "error");
            L.p(s1, "reason");
            super(null);
            this.error = unityAds$UnityAdsLoadError0;
            this.message = s;
            this.throwable = throwable0;
            this.reason = s1;
            this.reasonDebug = s2;
            this.isScarAd = z;
        }

        public Failure(UnityAdsLoadError unityAds$UnityAdsLoadError0, String s, Throwable throwable0, String s1, String s2, boolean z, int v, w w0) {
            this(unityAds$UnityAdsLoadError0, ((v & 2) == 0 ? s : null), ((v & 4) == 0 ? throwable0 : null), s1, ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? z : false));
        }

        @l
        public final UnityAdsLoadError component1() {
            return this.error;
        }

        @m
        public final String component2() {
            return this.message;
        }

        @m
        public final Throwable component3() {
            return this.throwable;
        }

        @l
        public final String component4() {
            return this.reason;
        }

        @m
        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        @l
        public final Failure copy(@l UnityAdsLoadError unityAds$UnityAdsLoadError0, @m String s, @m Throwable throwable0, @l String s1, @m String s2, boolean z) {
            L.p(unityAds$UnityAdsLoadError0, "error");
            L.p(s1, "reason");
            return new Failure(unityAds$UnityAdsLoadError0, s, throwable0, s1, s2, z);
        }

        public static Failure copy$default(Failure loadResult$Failure0, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s, Throwable throwable0, String s1, String s2, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                unityAds$UnityAdsLoadError0 = loadResult$Failure0.error;
            }
            if((v & 2) != 0) {
                s = loadResult$Failure0.message;
            }
            if((v & 4) != 0) {
                throwable0 = loadResult$Failure0.throwable;
            }
            if((v & 8) != 0) {
                s1 = loadResult$Failure0.reason;
            }
            if((v & 16) != 0) {
                s2 = loadResult$Failure0.reasonDebug;
            }
            if((v & 0x20) != 0) {
                z = loadResult$Failure0.isScarAd;
            }
            return loadResult$Failure0.copy(unityAds$UnityAdsLoadError0, s, throwable0, s1, s2, z);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Failure)) {
                return false;
            }
            if(this.error != ((Failure)object0).error) {
                return false;
            }
            if(!L.g(this.message, ((Failure)object0).message)) {
                return false;
            }
            if(!L.g(this.throwable, ((Failure)object0).throwable)) {
                return false;
            }
            if(!L.g(this.reason, ((Failure)object0).reason)) {
                return false;
            }
            return L.g(this.reasonDebug, ((Failure)object0).reasonDebug) ? this.isScarAd == ((Failure)object0).isScarAd : false;
        }

        @l
        public final UnityAdsLoadError getError() {
            return this.error;
        }

        @m
        public final String getMessage() {
            return this.message;
        }

        @l
        public final String getReason() {
            return this.reason;
        }

        @m
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @m
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @Override
        public int hashCode() {
            int v = this.error.hashCode();
            int v1 = 0;
            int v2 = this.message == null ? 0 : this.message.hashCode();
            int v3 = this.throwable == null ? 0 : this.throwable.hashCode();
            int v4 = this.reason.hashCode();
            String s = this.reasonDebug;
            if(s != null) {
                v1 = s.hashCode();
            }
            int v5 = this.isScarAd;
            if(v5) {
                v5 = 1;
            }
            return ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F + v5;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        @Override
        @l
        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", isScarAd=" + this.isScarAd + ')';
        }
    }

    public static final class Success extends LoadResult {
        @l
        private final AdObject adObject;

        public Success(@l AdObject adObject0) {
            L.p(adObject0, "adObject");
            super(null);
            this.adObject = adObject0;
        }

        @l
        public final AdObject component1() {
            return this.adObject;
        }

        @l
        public final Success copy(@l AdObject adObject0) {
            L.p(adObject0, "adObject");
            return new Success(adObject0);
        }

        public static Success copy$default(Success loadResult$Success0, AdObject adObject0, int v, Object object0) {
            if((v & 1) != 0) {
                adObject0 = loadResult$Success0.adObject;
            }
            return loadResult$Success0.copy(adObject0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Success ? L.g(this.adObject, ((Success)object0).adObject) : false;
        }

        @l
        public final AdObject getAdObject() {
            return this.adObject;
        }

        @Override
        public int hashCode() {
            return this.adObject.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    @l
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    @l
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    @l
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    @l
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    @l
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    @l
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    @l
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    @l
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    @l
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    @l
    public static final String MSG_OPPORTUNITY_ID = "[UnityAds] Object ID cannot be null";
    @l
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    @l
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    @l
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    static {
        LoadResult.Companion = new Companion(null);
    }

    private LoadResult() {
    }

    public LoadResult(w w0) {
    }
}

