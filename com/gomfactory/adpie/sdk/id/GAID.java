package com.gomfactory.adpie.sdk.id;

import android.content.Context;
import android.text.TextUtils;
import com.gomfactory.adpie.sdk.pref.Preference;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.AsyncTaskUtil;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GAID {
    public static final String TAG = "GAID";
    private String mId;
    private boolean mIsDoNotTracking;
    private boolean mIsInitialized;
    private static GAID ourInstance;

    static {
        GAID.ourInstance = new GAID();
    }

    public void getAdvertisingId(Context context0, OnGAIDListener onGAIDListener0) {
        try {
            this.mIsInitialized = false;
            String s = Preference.getStringValue(context0, "UDID_GAID", "");
            boolean z = Preference.getBooleanValue(context0, "DO_NOT_TRACKING", false);
            if(!TextUtils.isEmpty(s)) {
                this.mId = s;
                this.mIsDoNotTracking = z;
                AdPieLog.d("GAID", "saved gaid:" + this.mId);
                AdPieLog.d("GAID", "saved mIsDoNotTracking:" + this.mIsDoNotTracking);
                this.mIsInitialized = true;
                if(onGAIDListener0 != null) {
                    onGAIDListener0.onCompleted(this.mId, this.mIsDoNotTracking);
                }
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("GAID", exception0);
        }
        new AsyncTaskUtil() {
            @Override  // com.gomfactory.adpie.sdk.util.AsyncTaskUtil
            public void doInBackground() {
                Exception exception1;
                IllegalAccessException illegalAccessException1;
                InvocationTargetException invocationTargetException1;
                NoSuchMethodException noSuchMethodException1;
                ClassNotFoundException classNotFoundException1;
                String s;
                Method method1;
                Info advertisingIdClient$Info0;
                CharSequence charSequence0;
                boolean z = false;
                try {
                    charSequence0 = null;
                    advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(context0);
                    if(advertisingIdClient$Info0 != null) {
                        try {
                            Method method0 = advertisingIdClient$Info0.getClass().getDeclaredMethod("getId", null);
                            method1 = advertisingIdClient$Info0.getClass().getDeclaredMethod("isLimitAdTrackingEnabled", null);
                            s = null;
                            s = (String)method0.invoke(advertisingIdClient$Info0, null);
                            goto label_28;
                        }
                        catch(ClassNotFoundException classNotFoundException0) {
                            s = null;
                            classNotFoundException1 = classNotFoundException0;
                            goto label_35;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            s = null;
                            noSuchMethodException1 = noSuchMethodException0;
                            goto label_38;
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            s = null;
                            invocationTargetException1 = invocationTargetException0;
                            goto label_41;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            illegalAccessException1 = illegalAccessException0;
                            goto label_44;
                        }
                    }
                    goto label_49;
                }
                catch(Exception exception0) {
                    s = null;
                    exception1 = exception0;
                    goto label_47;
                }
                try {
                label_28:
                    z = ((Boolean)method1.invoke(advertisingIdClient$Info0, null)).booleanValue();
                    Preference.putString(context0, "UDID_GAID", s);
                    Preference.putBoolean(context0, "DO_NOT_TRACKING", z);
                    AdPieLog.d("GAID", "gaid:" + s);
                    AdPieLog.d("GAID", "mIsDoNotTracking:" + z);
                    goto label_48;
                }
                catch(ClassNotFoundException classNotFoundException1) {
                label_35:
                    AdPieLog.e("GAID", classNotFoundException1);
                    goto label_48;
                }
                catch(NoSuchMethodException noSuchMethodException1) {
                label_38:
                    AdPieLog.e("GAID", noSuchMethodException1);
                    goto label_48;
                }
                catch(InvocationTargetException invocationTargetException1) {
                label_41:
                    AdPieLog.e("GAID", invocationTargetException1);
                    goto label_48;
                }
                catch(IllegalAccessException illegalAccessException1) {
                label_44:
                    AdPieLog.e("GAID", illegalAccessException1);
                    goto label_48;
                }
                catch(Exception exception1) {
                }
            label_47:
                AdPieLog.e("GAID", exception1);
            label_48:
                charSequence0 = s;
            label_49:
                if(!GAID.this.mIsInitialized) {
                    GAID.this.mIsInitialized = true;
                    if(TextUtils.isEmpty(charSequence0)) {
                        OnGAIDListener onGAIDListener1 = onGAIDListener0;
                        if(onGAIDListener1 != null) {
                            onGAIDListener1.onFailed();
                        }
                    }
                    else {
                        GAID.this.mId = (String)charSequence0;
                        GAID.this.mIsDoNotTracking = z;
                        OnGAIDListener onGAIDListener0 = onGAIDListener0;
                        if(onGAIDListener0 != null) {
                            onGAIDListener0.onCompleted(GAID.this.mId, GAID.this.mIsDoNotTracking);
                        }
                    }
                }
            }
        }.execute();
    }

    public String getId() {
        return this.mId;
    }

    public static GAID getInstance() {
        return GAID.ourInstance;
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    public boolean isIsDoNotTracking() {
        return this.mIsDoNotTracking;
    }
}

