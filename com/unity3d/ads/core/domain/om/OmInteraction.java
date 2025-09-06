package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.coroutines.d;
import org.json.JSONObject;
import y4.l;
import y4.m;

public interface OmInteraction {
    public static final class Companion {
        static final Companion $$INSTANCE = null;
        @l
        public static final String OMID_CREATIVE_TYPE = "creativeType";
        @l
        public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
        @l
        public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
        @l
        public static final String OMID_IMPRESSION_TYPE = "impressionType";
        @l
        public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
        @l
        public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
        @l
        public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String OMID_CREATIVE_TYPE = "creativeType";
    @l
    public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
    @l
    public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
    @l
    public static final String OMID_IMPRESSION_TYPE = "impressionType";
    @l
    public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
    @l
    public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
    @l
    public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

    static {
        OmInteraction.Companion = Companion.$$INSTANCE;
    }

    @l
    OmidOptions getOMidOptions(@l JSONObject arg1);

    @m
    WebView getWebview(@l AdObject arg1);

    @m
    Object invoke(@l AdObject arg1, @l JSONObject arg2, @l d arg3);
}

