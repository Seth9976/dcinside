package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.iZZ;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.Lrd;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DWo extends xf {
    private Set JQp;
    public boolean ReZ;
    static final ArrayList cr;

    static {
        DWo.cr = new ArrayList(Arrays.asList(new String[]{"ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"}));
    }

    public DWo(PjT xf$PjT0) {
        super("tt_sdk_settings_sr.prop", xf$PjT0);
        this.JQp = DesugarCollections.synchronizedSet(new HashSet());
    }

    public static Set PjT(Set set0) {
        try {
            if(set0 == null) {
                return new HashSet();
            }
            Set set1 = new HashSet();
            for(Object object0: set0) {
                String s = (String)object0;
                if(!TextUtils.isEmpty(s)) {
                    set1.add(s);
                }
            }
            return set1;
        }
        catch(Throwable unused_ex) {
            return new HashSet();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp
    public void PjT(JSONObject jSONObject0) {
        com.bytedance.sdk.openadsdk.core.settings.JQp.PjT jQp$PjT0 = this.PjT();
        JSONObject jSONObject1 = xs.Gr().JQp();
        JSONObject jSONObject2 = jSONObject0.optJSONObject("digest");
        this.ReZ = jSONObject2 != null && jSONObject1 != null && jSONObject2.toString().equals(jSONObject1.toString());
        if(jSONObject2 == null) {
            jQp$PjT0.PjT("digest");
        }
        else {
            jQp$PjT0.PjT("digest", jSONObject2.toString());
        }
        jQp$PjT0.PjT("data_time", jSONObject0.optLong("data_time"));
        if(jSONObject0.has("req_inter_min")) {
            long v = jSONObject0.optLong("req_inter_min", 10L) * 60000L;
            if(v < 0L || v > 86400000L) {
                v = 600000L;
            }
            jQp$PjT0.PjT("req_inter_min", v);
        }
        if(jSONObject0.has("lp_new_style")) {
            jQp$PjT0.PjT("landingpage_new_style", jSONObject0.optInt("lp_new_style", 0x7FFFFFFF));
        }
        if(jSONObject0.has("blank_detect_rate")) {
            int v1 = jSONObject0.optInt("blank_detect_rate", 30);
            if(v1 < 0 || v1 > 100) {
                v1 = 30;
            }
            jQp$PjT0.PjT("blank_detect_rate", v1);
        }
        JSONObject jSONObject3 = jSONObject0.optJSONObject("feq_policy");
        if(jSONObject3 != null) {
            if(jSONObject3.has("duration")) {
                jQp$PjT0.PjT("duration", jSONObject3.optLong("duration") * 1000L);
            }
            if(jSONObject3.has("max")) {
                jQp$PjT0.PjT("max", jSONObject3.optInt("max"));
            }
        }
        if(jSONObject0.has("vbtt")) {
            jQp$PjT0.PjT("vbtt", jSONObject0.optInt("vbtt", 5));
        }
        JSONObject jSONObject4 = jSONObject0.optJSONObject("abtest");
        if(jSONObject4 == null) {
            xs.Gr().XX();
        }
        else {
            if(jSONObject4.has("version")) {
                jQp$PjT0.PjT("ab_test_version", jSONObject4.optString("version"));
            }
            if(jSONObject4.has("param")) {
                jQp$PjT0.PjT("ab_test_param", jSONObject4.optString("param"));
            }
        }
        JSONObject jSONObject5 = jSONObject0.optJSONObject("log_rate_conf");
        if(jSONObject5 != null && jSONObject5.has("global_rate")) {
            jQp$PjT0.PjT("global_rate", ((float)jSONObject5.optDouble("global_rate", 1.0)));
        }
        if(jSONObject0.has("pyload_h5")) {
            jQp$PjT0.PjT("pyload_h5", jSONObject0.optString("pyload_h5"));
        }
        if(jSONObject0.has("pure_pyload_h5")) {
            jQp$PjT0.PjT("playableLoadH5Url", jSONObject0.optString("pure_pyload_h5"));
        }
        if(jSONObject0.has("ads_url")) {
            jQp$PjT0.PjT("ads_url", jSONObject0.optString("ads_url"));
        }
        if(jSONObject0.has("settings_url")) {
            jQp$PjT0.PjT("settings_url", jSONObject0.optString("settings_url"));
        }
        if(jSONObject0.has("app_log_url")) {
            jQp$PjT0.PjT("app_log_url", jSONObject0.optString("app_log_url"));
        }
        if(jSONObject0.has("privacy_url")) {
            jQp$PjT0.PjT("policy_url", jSONObject0.optString("privacy_url"));
        }
        if(jSONObject0.has("consent_url")) {
            jQp$PjT0.PjT("consent_url", jSONObject0.optString("consent_url"));
        }
        if(jSONObject0.has("ivrv_downward")) {
            jQp$PjT0.PjT("ivrv_downward", jSONObject0.optInt("ivrv_downward", 0));
        }
        if(jSONObject0.has("dc")) {
            jQp$PjT0.PjT("dc", jSONObject0.optString("dc"));
        }
        xs.Gr().PjT(jSONObject0, jQp$PjT0);
        xs.Gr().Zh(jSONObject0, jQp$PjT0);
        if(jSONObject0.has("if_both_open")) {
            jQp$PjT0.PjT("if_both_open", jSONObject0.optInt("if_both_open", 0));
        }
        if(jSONObject0.has("support_tnc")) {
            jQp$PjT0.PjT("support_tnc", jSONObject0.optInt("support_tnc", 1));
        }
        if(jSONObject0.has("insert_js_config")) {
            jQp$PjT0.PjT("insert_js_config", jSONObject0.optString("insert_js_config", ""));
        }
        if(jSONObject0.has("max_tpl_cnts")) {
            jQp$PjT0.PjT("max_tpl_cnts", jSONObject0.optInt("max_tpl_cnts", 100));
        }
        JSONObject jSONObject6 = jSONObject0.optJSONObject("app_common_config");
        if(jSONObject6 != null) {
            if(jSONObject6.has("force_language")) {
                String s = jSONObject6.optString("force_language");
                if(!TextUtils.isEmpty(s) && DWo.cr.contains(s)) {
                    jQp$PjT0.PjT("force_language", s);
                }
            }
            if(jSONObject6.has("fetch_tpl_timeout_ctrl")) {
                jQp$PjT0.PjT("fetch_tpl_timeout_ctrl", jSONObject6.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if(jSONObject6.has("fetch_tpl_second")) {
                jQp$PjT0.PjT("fetch_tpl_second", jSONObject6.optInt("fetch_tpl_second", 0));
            }
            if(jSONObject6.has("support_gzip")) {
                jQp$PjT0.PjT("support_gzip", jSONObject6.optBoolean("support_gzip", false));
            }
            if(jSONObject6.has("aes_key")) {
                jQp$PjT0.PjT("aes_key", jSONObject6.optString("aes_key"));
            }
            if(jSONObject6.has("support_rtl")) {
                jQp$PjT0.PjT("support_rtl", jSONObject6.optBoolean("support_rtl", false));
            }
            if(jSONObject6.has("ad_revenue_enable")) {
                jQp$PjT0.PjT("ad_revenue_enable", jSONObject6.optBoolean("ad_revenue_enable", true));
            }
            if(jSONObject6.has("gecko_hosts")) {
                try {
                    this.JQp.clear();
                    JSONArray jSONArray0 = jSONObject6.optJSONArray("gecko_hosts");
                    if(jSONArray0 != null && jSONArray0.length() != 0) {
                        for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                            this.JQp.add(jSONArray0.getString(v2));
                        }
                    }
                    this.JQp = DWo.PjT(this.JQp);
                    jQp$PjT0.PjT("gecko_hosts", jSONArray0.toString());
                    goto label_100;
                }
                catch(Throwable throwable0) {
                }
                RD.Zh(("GeckoLog: settings json error " + throwable0), new Object[0]);
            }
        }
    label_100:
        if(jSONObject0.has("read_video_from_cache")) {
            jQp$PjT0.PjT("read_video_from_cache", jSONObject0.optInt("read_video_from_cache", 1));
        }
        ReZ.PjT(jSONObject0.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObject7 = jSONObject0.optJSONObject("privacy");
        if(jSONObject7 != null) {
            if(jSONObject7.has("ad_enable")) {
                jQp$PjT0.PjT("privacy_ad_enable", jSONObject7.optInt("ad_enable", 0x7FFFFFFF));
            }
            if(jSONObject7.has("personalized_ad")) {
                jQp$PjT0.PjT("privacy_personalized_ad", jSONObject7.optInt("personalized_ad", 0x7FFFFFFF));
            }
            if(jSONObject7.has("sladar_enable")) {
                jQp$PjT0.PjT("privacy_sladar_enable", jSONObject7.optInt("sladar_enable", 0x7FFFFFFF));
            }
            if(jSONObject7.has("app_log_enable")) {
                jQp$PjT0.PjT("privacy_app_log_enable", jSONObject7.optInt("app_log_enable", 0x7FFFFFFF));
            }
            if(jSONObject7.has("debug_unlock")) {
                jQp$PjT0.PjT("privacy_debug_unlock", jSONObject7.optInt("debug_unlock", 0x7FFFFFFF));
            }
            if(jSONObject7.has("fields_allowed")) {
                String s1 = jSONObject7.optString("fields_allowed", "");
                if(TextUtils.isEmpty(s1)) {
                    jQp$PjT0.PjT("privacy_fields_allowed");
                }
                else {
                    jQp$PjT0.PjT("privacy_fields_allowed", s1);
                }
            }
            if(jSONObject7.has("app_reg")) {
                int v3 = jSONObject7.optInt("app_reg", 1);
                if(v3 == 0 && iZZ.PjT().cr() == 1) {
                    Jo.PjT(new Runnable() {
                        final DWo PjT;

                        @Override
                        public void run() {
                            Toast.makeText(ub.PjT(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                jQp$PjT0.PjT("privacy_app_reg", v3 != 0);
            }
        }
        if(jSONObject0.has("video_cache_config")) {
            jQp$PjT0.PjT("video_cache_config", jSONObject0.optString("video_cache_config"));
        }
        if(jSONObject0.has("loaded_recall_time")) {
            int v4 = jSONObject0.optInt("loaded_recall_time", 0);
            if(v4 != 0 && v4 != 1) {
                v4 = 0;
            }
            jQp$PjT0.PjT("loadedCallbackOpportunity", v4);
        }
        if(jSONObject0.has("load_strategy")) {
            int v5 = jSONObject0.optInt("load_strategy", 0);
            if(v5 != 0 && v5 != 1) {
                v5 = 0;
            }
            jQp$PjT0.PjT("load_callback_strategy", v5);
        }
        if(jSONObject0.has("splash_video_load_strategy")) {
            int v6 = jSONObject0.optInt("splash_video_load_strategy", 0);
            if(v6 < 0 || v6 > 3) {
                v6 = 0;
            }
            jQp$PjT0.PjT("splash_video_load_strategy", v6);
        }
        if(jSONObject0.has("allow_blind_mode_request_ad")) {
            jQp$PjT0.PjT("allow_blind_mode_request_ad", jSONObject0.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObject8 = jSONObject0.optJSONObject("bus_con");
        if(jSONObject8 != null) {
            if(jSONObject8.has("bus_con_send_log_type")) {
                jQp$PjT0.PjT("bus_con_send_log_type", jSONObject8.optInt("bus_con_send_log_type", 1));
            }
            if(jSONObject8.has("bus_con_sec_type")) {
                jQp$PjT0.PjT("bus_con_sec_type", jSONObject8.optInt("bus_con_sec_type", 0x7FFFFFFF));
            }
            if(jSONObject8.has("bus_con_dislike_report_raw")) {
                jQp$PjT0.PjT("bus_con_dislike_report_raw", jSONObject8.optBoolean("bus_con_dislike_report_raw", false));
            }
            if(jSONObject8.has("bus_con_adshow_check_enable")) {
                jQp$PjT0.PjT("bus_con_adshow_check_enable", jSONObject8.optBoolean("bus_con_adshow_check_enable", true));
            }
            if(jSONObject8.has("bus_con_tnc_interval")) {
                jQp$PjT0.PjT("bus_con_tnc_interval", jSONObject8.optLong("bus_con_tnc_interval", 600000L));
            }
            if(jSONObject8.has("bus_con_token_thread_count")) {
                jQp$PjT0.PjT("bus_con_token_thread_count", jSONObject8.optInt("bus_con_token_thread_count", 4));
            }
            if(jSONObject8.has("bus_con_video_keep_screen_on")) {
                jQp$PjT0.PjT("bus_con_video_keep_screen_on", jSONObject8.optInt("bus_con_video_keep_screen_on", 1));
            }
            if(jSONObject8.has("bus_con_auto_click_delay")) {
                jQp$PjT0.PjT("bus_con_auto_click_delay", jSONObject8.optInt("bus_con_auto_click_delay", 3000));
            }
            if(jSONObject8.has("bus_con_express_host")) {
                jQp$PjT0.PjT("bus_con_express_host", jSONObject8.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if(jSONObject8.has("bus_con_rewardedfull_link")) {
                jQp$PjT0.PjT("bus_con_rewardedfull_link", jSONObject8.optInt("bus_con_rewardedfull_link", 0));
            }
            if(jSONObject8.has("bus_con_check_clz")) {
                jQp$PjT0.PjT("bus_con_check_clz", jSONObject8.optString("bus_con_check_clz", ""));
            }
            if(jSONObject8.has("bus_con_url_check")) {
                jQp$PjT0.PjT("bus_con_url_check", jSONObject8.optInt("bus_con_url_check", 1));
            }
            if(jSONObject8.has("bus_con_behavior_count")) {
                jQp$PjT0.PjT("bus_con_behavior_count", jSONObject8.optInt("bus_con_behavior_count", 300));
            }
            if(jSONObject8.has("bus_con_collect_arbitrage")) {
                jQp$PjT0.PjT("bus_con_collect_arbitrage", jSONObject8.optBoolean("bus_con_collect_arbitrage", false));
            }
            if(jSONObject8.has("bus_con_arbitrage_loading_timeout")) {
                jQp$PjT0.PjT("bus_con_arbitrage_loading_timeout", jSONObject8.optInt("bus_con_arbitrage_loading_timeout", 10000));
            }
            if(jSONObject8.has("bus_con_arbitrage_loading_alpha")) {
                jQp$PjT0.PjT("bus_con_arbitrage_loading_alpha", ((float)jSONObject8.optDouble("bus_con_arbitrage_loading_alpha", 1.0)));
            }
        }
        if(jSONObject0.has("perf_con")) {
            try {
                JSONObject jSONObject9 = jSONObject0.optJSONObject("perf_con");
                if(jSONObject9 != null) {
                    if(jSONObject9.has("perf_con_stats_rate")) {
                        String s2 = jSONObject9.optString("perf_con_stats_rate");
                        if(!TextUtils.isEmpty(s2)) {
                            jQp$PjT0.PjT("perf_con_stats_rate", s2);
                        }
                    }
                    if(jSONObject9.has("perf_con_applog_send")) {
                        String s3 = jSONObject9.optString("perf_con_applog_send");
                        if(!TextUtils.isEmpty(s3)) {
                            jQp$PjT0.PjT("perf_con_applog_send", s3);
                        }
                    }
                    if(jSONObject9.has("perf_con_apm_native")) {
                        jQp$PjT0.PjT("perf_con_apm_native", jSONObject9.optInt("perf_con_apm_native"));
                    }
                    if(jSONObject9.has("perf_con_webview_preload_cache")) {
                        jQp$PjT0.PjT("perf_con_webview_preload_cache", jSONObject9.optInt("perf_con_webview_preload_cache"));
                    }
                    if(jSONObject9.has("perf_con_webview_preload_cache_v3")) {
                        jQp$PjT0.PjT("perf_con_webview_preload_cache_v3", jSONObject9.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if(jSONObject9.has("perf_con_webview_cache_count")) {
                        jQp$PjT0.PjT("perf_con_webview_cache_count", jSONObject9.optInt("perf_con_webview_cache_count", 0));
                    }
                    if(jSONObject9.has("perf_con_webview_cache_count_v3")) {
                        jQp$PjT0.PjT("perf_con_webview_cache_count_v3", jSONObject9.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if(jSONObject9.has("perf_con_thread_stack_size")) {
                        int v7 = jSONObject9.optInt("perf_con_thread_stack_size");
                        if(v7 >= 0xFFF80000 && v7 <= 0) {
                            jQp$PjT0.PjT("perf_con_thread_stack_size", v7);
                        }
                    }
                    if(jSONObject9.has("perf_con_use_new_thread_pool")) {
                        jQp$PjT0.PjT("perf_con_use_new_thread_pool", jSONObject9.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if(jSONObject9.has("perf_con_thread_pool_config")) {
                        String s4 = jSONObject9.optString("perf_con_thread_pool_config");
                        if(!TextUtils.isEmpty(s4)) {
                            jQp$PjT0.PjT("perf_con_thread_pool_config", s4);
                        }
                    }
                    if(jSONObject9.has("perf_con_is_new_net_thread")) {
                        jQp$PjT0.PjT("perf_con_is_new_net_thread", jSONObject9.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if(jSONObject9.has("perf_con_use_prop")) {
                        Lrd.PjT(jSONObject9.optInt("perf_con_use_prop", 1));
                    }
                    if(jSONObject9.has("perf_con_adlog_expire_time")) {
                        jQp$PjT0.PjT("perf_con_adlog_expire_time", jSONObject9.optLong("perf_con_adlog_expire_time"));
                    }
                    if(jSONObject9.has("perf_con_adlog_turn_off_retry_ad")) {
                        jQp$PjT0.PjT("perf_con_adlog_turn_off_retry_ad", jSONObject9.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if(jSONObject9.has("perf_con_adlog_turn_off_retry_stats")) {
                        jQp$PjT0.PjT("perf_con_adlog_turn_off_retry_stats", jSONObject9.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if(jSONObject9.has("perf_con_applog_rate")) {
                        jQp$PjT0.PjT("perf_con_applog_rate", jSONObject9.optString("perf_con_applog_rate"));
                    }
                    if(jSONObject9.has("perf_con_track_url_strategy")) {
                        jQp$PjT0.PjT("perf_con_track_url_strategy", jSONObject9.optString("perf_con_track_url_strategy"));
                    }
                    if(jSONObject9.has("perf_con_drawable_code")) {
                        jQp$PjT0.PjT("perf_con_drawable_code", jSONObject9.optInt("perf_con_drawable_code", 0));
                    }
                    if(jSONObject9.has("perf_con_close_button_delay_check_time")) {
                        jQp$PjT0.PjT("perf_con_close_button_delay_check_time", jSONObject9.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if(jSONObject9.has("perf_con_drop2rt_skip_label_list")) {
                        jQp$PjT0.PjT("perf_con_drop2rt_skip_label_list", jSONObject9.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if(jSONObject9.has("perf_con_crypt_V4_get_ad")) {
                        jQp$PjT0.PjT("perf_con_crypt_V4_get_ad", jSONObject9.optBoolean("perf_con_crypt_V4_get_ad", false));
                    }
                    if(jSONObject9.has("perf_con_crypt_V4_applog")) {
                        jQp$PjT0.PjT("perf_con_crypt_V4_applog", jSONObject9.optBoolean("perf_con_crypt_V4_applog", false));
                    }
                    if(jSONObject9.has("perf_con_crypt_V4")) {
                        jQp$PjT0.PjT("perf_con_crypt_V4", jSONObject9.optBoolean("perf_con_crypt_V4", false));
                    }
                }
                goto label_239;
            }
            catch(Throwable throwable1) {
            }
            RD.Zh("SettingsDefaultRepository", throwable1.getMessage());
        }
    label_239:
        JSONObject jSONObject10 = new JSONObject();
        try {
            jSONObject10.put("app_common_config", jSONObject6);
            jSONObject10.put("perf_con", jSONObject0.optJSONObject("perf_con"));
            jSONObject10.put("bus_con", jSONObject0.optJSONObject("bus_con"));
        }
        catch(JSONException jSONException0) {
            RD.Zh("SettingsDefaultRepository", new Object[]{"coreSettingJson", jSONException0.getMessage()});
        }
        jQp$PjT0.PjT("core_settings", jSONObject10.toString());
        if(jSONObject0.has("dual_event_url")) {
            jQp$PjT0.PjT("dual_event_url", jSONObject0.optString("dual_event_url"));
        }
        if(jSONObject0.has("token_enable")) {
            jQp$PjT0.PjT("token_enable", jSONObject0.optInt("token_enable"));
        }
        if(jSONObject0.has("token_adx_ids")) {
            String s5 = jSONObject0.optString("token_adx_ids", "");
            if(TextUtils.isEmpty(s5)) {
                jQp$PjT0.PjT("token_adx_ids");
            }
            else {
                jQp$PjT0.PjT("token_adx_ids", s5);
            }
        }
        jQp$PjT0.PjT();
        xs.Gr().iZZ();
        this.cr();
    }
}

