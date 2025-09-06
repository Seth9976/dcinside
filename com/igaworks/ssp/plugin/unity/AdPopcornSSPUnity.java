package com.igaworks.ssp.plugin.unity;

import android.app.Activity;
import com.igaworks.ssp.AdPopcornSSP;
import com.igaworks.ssp.E;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.common.model.RewardAdPlusPlacementStatusModel;
import com.igaworks.ssp.part.video.listener.IRewardPlusSettingEventCallbackListener;
import com.igaworks.ssp.part.video.listener.IRewardPlusSettingPageCallbackListener;
import com.igaworks.ssp.rewardplus.listener.IRewardAdEventCallbackListener;
import com.igaworks.ssp.rewardplus.listener.IRewardAdPlusUserStatusCallbackListener;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdPopcornSSPUnity extends UnityPlayerActivity {
    public static void destroy() {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.destroy();
            }
        });
    }

    public static void gdprConsentAvailable(boolean z) {
        AdPopcornSSP.gdprConsentAvailable(z);
    }

    public static void getRewardAdPlusUserStatus(String s, AdPopcornSSPUnityRewardAdPlusUserStatusEventListener adPopcornSSPUnityRewardAdPlusUserStatusEventListener0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                E e0 = E.g();
                Activity activity0 = UnityPlayer.currentActivity;
                com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.14.1 adPopcornSSPUnity$14$10 = new IRewardAdPlusUserStatusCallbackListener() {
                    final com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.14 a;

                    @Override  // com.igaworks.ssp.rewardplus.listener.IRewardAdPlusUserStatusCallbackListener
                    public void OnRewardAdPlusUserMediaStatus(boolean z, int v, List list0) {
                        AdPopcornSSPUnityRewardAdPlusUserStatusEventListener adPopcornSSPUnityRewardAdPlusUserStatusEventListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.14.this.b;
                        if(adPopcornSSPUnityRewardAdPlusUserStatusEventListener0 != null) {
                            try {
                                if(list0 != null) {
                                    String s = this.a(list0).toString();
                                    com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.14.this.b.OnRewardAdPlusUserMediaStatus(z, v, s);
                                    return;
                                }
                                adPopcornSSPUnityRewardAdPlusUserStatusEventListener0.OnRewardAdPlusUserMediaStatus(z, v, "");
                            }
                            catch(Exception unused_ex) {
                                com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.14.this.b.OnRewardAdPlusUserMediaStatus(z, v, "");
                            }
                        }
                    }

                    @Override  // com.igaworks.ssp.rewardplus.listener.IRewardAdPlusUserStatusCallbackListener
                    public void OnRewardAdPlusUserPlacementStatus(boolean z, String s, int v, int v1) {
                        AdPopcornSSPUnityRewardAdPlusUserStatusEventListener adPopcornSSPUnityRewardAdPlusUserStatusEventListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.14.this.b;
                        if(adPopcornSSPUnityRewardAdPlusUserStatusEventListener0 != null) {
                            adPopcornSSPUnityRewardAdPlusUserStatusEventListener0.OnRewardAdPlusUserPlacementStatus(z, s, v, v1);
                        }
                    }

                    private JSONArray a(List list0) {
                        JSONArray jSONArray0 = new JSONArray();
                        for(int v = 0; v < list0.size(); ++v) {
                            RewardAdPlusPlacementStatusModel rewardAdPlusPlacementStatusModel0 = (RewardAdPlusPlacementStatusModel)list0.get(v);
                            JSONObject jSONObject0 = new JSONObject();
                            jSONObject0.put("placementId", rewardAdPlusPlacementStatusModel0.getPlacementId());
                            jSONObject0.put("dailyUserLimit", rewardAdPlusPlacementStatusModel0.getDailyUserLimit());
                            jSONObject0.put("dailyUserCount", rewardAdPlusPlacementStatusModel0.getDailyUserCount());
                            jSONArray0.put(jSONObject0);
                        }
                        return jSONArray0;
                    }
                };
                e0.a(activity0, s, adPopcornSSPUnity$14$10);
            }
        });
    }

    public static void getRewardPlusUserSetting(AdPopcornSSPUnityRewardPlusSettingListener adPopcornSSPUnityRewardPlusSettingListener0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.getRewardPlusUserSetting(new IRewardPlusSettingEventCallbackListener() {
                    final com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.8 a;

                    @Override  // com.igaworks.ssp.part.video.listener.IRewardPlusSettingEventCallbackListener
                    public void OnRewardPlusUserSettingInfo(String s, int v, int v1) {
                        AdPopcornSSPUnityRewardPlusSettingListener adPopcornSSPUnityRewardPlusSettingListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.8.this.a;
                        if(adPopcornSSPUnityRewardPlusSettingListener0 != null) {
                            adPopcornSSPUnityRewardPlusSettingListener0.OnRewardPlusUserSettingInfo(s, v, v1);
                        }
                    }
                });
            }
        });
    }

    public static void init() {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.init(UnityPlayer.currentActivity);
            }
        });
    }

    public static void init(String s) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.init(UnityPlayer.currentActivity, s);
            }
        });
    }

    public static void initWithListener(AdPopcornSSPUnityInitListener adPopcornSSPUnityInitListener0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.init(UnityPlayer.currentActivity, new SdkInitListener() {
                    final com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.3 a;

                    @Override  // com.igaworks.ssp.SdkInitListener
                    public void onInitializationFinished() {
                        AdPopcornSSPUnityInitListener adPopcornSSPUnityInitListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.3.this.a;
                        if(adPopcornSSPUnityInitListener0 != null) {
                            adPopcornSSPUnityInitListener0.OnInitializationFinished();
                        }
                    }
                });
            }
        });
    }

    public static void initWithListener(String s, AdPopcornSSPUnityInitListener adPopcornSSPUnityInitListener0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Activity activity0 = UnityPlayer.currentActivity;
                com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.4.1 adPopcornSSPUnity$4$10 = new SdkInitListener() {
                    final com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.4 a;

                    @Override  // com.igaworks.ssp.SdkInitListener
                    public void onInitializationFinished() {
                        AdPopcornSSPUnityInitListener adPopcornSSPUnityInitListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.4.this.b;
                        if(adPopcornSSPUnityInitListener0 != null) {
                            adPopcornSSPUnityInitListener0.OnInitializationFinished();
                        }
                    }
                };
                AdPopcornSSP.init(activity0, s, adPopcornSSPUnity$4$10);
            }
        });
    }

    public static void openRewardAdPlusPage(String s) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                E.g().b(UnityPlayer.currentActivity, s);
            }
        });
    }

    public static void openRewardPlusSetting() {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.openRewardPlusSetting(UnityPlayer.currentActivity);
            }
        });
    }

    public static void openRewardPlusSetting(AdPopcornSSPUnityRewardPlusSettingPageListener adPopcornSSPUnityRewardPlusSettingPageListener0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.openRewardPlusSetting(UnityPlayer.currentActivity, new IRewardPlusSettingPageCallbackListener() {
                    final com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.7 a;

                    @Override  // com.igaworks.ssp.part.video.listener.IRewardPlusSettingPageCallbackListener
                    public void OnClosedSettingPage() {
                        AdPopcornSSPUnityRewardPlusSettingPageListener adPopcornSSPUnityRewardPlusSettingPageListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.7.this.a;
                        if(adPopcornSSPUnityRewardPlusSettingPageListener0 != null) {
                            adPopcornSSPUnityRewardPlusSettingPageListener0.OnClosedSettingPage();
                        }
                    }
                });
            }
        });
    }

    public static void openRewardVideoCSPage(String s) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.openRewardVideoCSPage(UnityPlayer.currentActivity, s);
            }
        });
    }

    public static void setRewardAdPlusEventListener(AdPopcornSSPUnityRewardAdPlusEventListener adPopcornSSPUnityRewardAdPlusEventListener0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                E.g().a(new IRewardAdEventCallbackListener() {
                    final com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.12 a;

                    @Override  // com.igaworks.ssp.rewardplus.listener.IRewardAdEventCallbackListener
                    public void OnClosedRewardAdPlusPage() {
                        AdPopcornSSPUnityRewardAdPlusEventListener adPopcornSSPUnityRewardAdPlusEventListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.12.this.a;
                        if(adPopcornSSPUnityRewardAdPlusEventListener0 != null) {
                            adPopcornSSPUnityRewardAdPlusEventListener0.OnClosedRewardAdPlusPage();
                        }
                    }

                    @Override  // com.igaworks.ssp.rewardplus.listener.IRewardAdEventCallbackListener
                    public void OnEventResult(int v, String s) {
                        AdPopcornSSPUnityRewardAdPlusEventListener adPopcornSSPUnityRewardAdPlusEventListener0 = com.igaworks.ssp.plugin.unity.AdPopcornSSPUnity.12.this.a;
                        if(adPopcornSSPUnityRewardAdPlusEventListener0 != null) {
                            adPopcornSSPUnityRewardAdPlusEventListener0.OnEventResult(v, s);
                        }
                    }
                });
            }
        });
    }

    public static void setUIDIdentifier(int v, String s) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.setUIDIdentifier(UnityPlayer.currentActivity, v, s);
            }
        });
    }

    public static void setUserId(String s) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdPopcornSSP.setUserId(UnityPlayer.currentActivity, s);
            }
        });
    }
}

