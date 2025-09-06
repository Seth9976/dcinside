package com.bytedance.sdk.component.cz.PjT.ReZ;

import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.JQp;
import com.bytedance.sdk.component.cz.PjT.Zh.cr;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    private static int Au;
    private static final Map JQp;
    private static final LinkedList PjT;
    private static final LinkedList ReZ;
    private static int SM;
    private static String XX;
    private static final LinkedList Zh;
    private static final LinkedList cr;
    private static HashMap cz;

    static {
        PjT.PjT = new LinkedList();
        PjT.Zh = new LinkedList();
        PjT.ReZ = new LinkedList();
        PjT.cr = new LinkedList();
        PjT.JQp = new HashMap();
        PjT.cz = null;
        PjT.XX = "upload_init";
        PjT.Au = 0;
        PjT.SM = 0;
    }

    public static long Au(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null || pjT0.XX() == null || !PjT.Zh()) {
            return 0L;
        }
        try {
            return new JSONObject(pjT0.XX().optString("ad_extra_data")).optLong("sdk_event_index");
        }
        catch(Exception exception0) {
            exception0.getMessage();
            return 0L;
        }
    }

    public static void DWo(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        try {
            if(!PjT.Zh()) {
                return;
            }
            JQp jQp0 = Au.XX().xE();
            if(!TextUtils.isEmpty(pjT0.ReZ())) {
                Zh.PjT(cr.cr.zZ(), 1);
            }
            if(jQp0 != null && jQp0.Zh()) {
                switch(pjT0.cr()) {
                    case 0: {
                        if(pjT0.Zh() == 3) {
                            if(pjT0.XX() != null) {
                                pjT0.XX().optString("event");
                                PjT.Au(pjT0);
                                PjT.SM(pjT0);
                                pjT0.ReZ();
                                PjT.qj(pjT0);
                            }
                            return;
                        }
                        if(PjT.SM(pjT0) != 0L) {
                        }
                        PjT.PjT(pjT0);
                        PjT.Au(pjT0);
                        pjT0.ReZ();
                        PjT.qj(pjT0);
                        break;
                    }
                    case 1: {
                        PjT.Zh(pjT0);
                        PjT.ReZ(pjT0);
                        pjT0.ReZ();
                        PjT.qj(pjT0);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static String JQp(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null || pjT0.XX() == null || PjT.ReZ()) {
            return null;
        }
        String s = pjT0.XX().optString("log_extra");
        if(!TextUtils.isEmpty(s)) {
            try {
                return new JSONObject(s).optString("req_id");
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public static boolean JQp() {
        return PjT.Zh() || PjT.cr();
    }

    public static String PjT(int v) {
        switch(v) {
            case 1: {
                return "flush once";
            }
            case 2: {
                return "flush memory db";
            }
            case 3: {
                return "flush memory";
            }
            case 4: {
                return "new event";
            }
            case 5: {
                return "server busy";
            }
            case 6: {
                return "empty message";
            }
            case 7: {
                return "net error";
            }
            default: {
                return "default";
            }
        }
    }

    public static String PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null || pjT0.XX() == null || PjT.ReZ()) {
            return null;
        }
        return pjT0.Zh() == 3 ? pjT0.XX().optString("event") : pjT0.XX().optString("label");
    }

    public static void PjT() {
        if(PjT.cz != null) {
            return;
        }
        PjT.cz = new HashMap(446);
        for(int v = 0; v < 446; ++v) {
            PjT.cz.put(new String[]{"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", "render_time", "splash_ad", "preload_start", "mute", "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", "unmute", "preload_success", "show_failed", "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", "client_false_show", "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", "request", "response", "parse_finished", "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", "network_type", "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", "triggered", "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", "undefined", "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", "track", "custom_event", "rd_landing_page_stat", "update_local_data", "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", "push_launch", "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", "service_description_page_duration", "enter_business_qualification_page ", "service_description_page_show", "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", "bidding_receive", "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", "click_anchor_gift_card", "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", "auto_open", "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", "check_closed_type", "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"}[v], 1);
        }
    }

    public static void PjT(int v, List list0, long v1) {
        if(Au.XX().xE().XX()) {
            long v2 = System.currentTimeMillis() - v1;
            if(v == 200) {
                cr.cr.yks().getAndAdd(v2);
                cr.cr.zYH().incrementAndGet();
                cr.cr.xu().getAndAdd(((long)list0.size()));
                cr.cr.kph().getAndAdd(((long)list0.size()));
                return;
            }
            if(v == -1) {
                cr.cr.CY().getAndAdd(((long)list0.size()));
            }
            else {
                cr.cr.tY().getAndAdd(((long)list0.size()));
            }
            cr.cr.Xtz().getAndAdd(v2);
            cr.cr.wKV().incrementAndGet();
        }
    }

    private static void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, String s, JQp jQp0) {
        String s1 = PjT.PjT(pjT0);
        if(!PjT.PjT(s1)) {
            String s2 = PjT.JQp(pjT0);
            if(pjT0.cr() == 0 && jQp0.PjT()) {
                PjT.cr((s1 + "_" + PjT.SM(pjT0) + "_" + s2 + "_" + s));
            }
        }
    }

    public static void PjT(List list0, int v) {
        try {
            if(Au.XX().xE().XX()) {
                for(Object object0: list0) {
                    com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)object0;
                    if(pjT0 != null && pjT0.SM() != 0L) {
                        long v1 = pjT0.SM();
                        cr.cr.xH().incrementAndGet();
                        cr.cr.oG().getAndAdd(System.currentTimeMillis() - v1);
                        pjT0.ReZ(System.currentTimeMillis());
                    }
                    if(pjT0 != null) {
                        PjT.cz(pjT0);
                    }
                }
                cr.cr.MWx().getAndAdd(((long)list0.size()));
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static void PjT(List list0, int v, String s) {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 != null && jQp0.Zh() && list0 != null && !PjT.ReZ()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            boolean z = false;
            for(Object object0: list0) {
                com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)object0;
                if(pjT0.cr() == 0) {
                    JSONObject jSONObject0 = pjT0.XX();
                    String s1 = PjT.PjT(pjT0);
                    if(pjT0.Zh() == 3) {
                        if(jSONObject0 != null) {
                            s1 = jSONObject0.optString("event");
                        }
                        stringBuilder0.append(" [v3:");
                        stringBuilder0.append(s1);
                    }
                    else {
                        long v1 = PjT.Au(pjT0);
                        long v2 = PjT.SM(pjT0);
                        int v3 = PjT.cr(pjT0);
                        stringBuilder0.append(" [");
                        stringBuilder0.append(v1);
                        stringBuilder0.append("_");
                        stringBuilder0.append(s1);
                        if(v2 != 0L) {
                            stringBuilder0.append("_");
                            stringBuilder0.append(v2);
                        }
                        if(v3 != 0) {
                            stringBuilder0.append("_");
                            stringBuilder0.append(v3);
                        }
                    }
                    stringBuilder0.append("] ");
                    z = true;
                }
                else if(pjT0.cr() == 1) {
                    String s2 = PjT.Zh(pjT0);
                    int v4 = PjT.ReZ(pjT0);
                    stringBuilder0.append(" [");
                    stringBuilder0.append(v4);
                    stringBuilder0.append("_");
                    stringBuilder0.append(s2);
                    stringBuilder0.append("] ");
                }
            }
            if(z) {
                PjT.PjT(v);
                return;
            }
            PjT.PjT(v);
        }
    }

    public static void PjT(List list0, String s) {
        try {
            JQp jQp0 = Au.XX().xE();
            if(jQp0 == null) {
                return;
            }
            if(jQp0.XX() && list0 != null) {
                for(Object object0: list0) {
                    com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)object0;
                    if(pjT0 != null) {
                        PjT.PjT(pjT0, s, jQp0);
                    }
                }
            }
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
    }

    public static void PjT(JSONObject jSONObject0, com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT pjT0) {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 != null && jQp0.Zh() && PjT.JQp()) {
            jSONObject0.optString("label");
        }
    }

    public static void PjT(boolean z, int v, com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        JQp jQp0 = Au.XX().xE();
        if(PjT.ReZ()) {
            return;
        }
        if(jQp0 != null && jQp0.Zh()) {
            PjT.PjT(v);
            TextUtils.isEmpty(PjT.Zh(pjT0));
            TextUtils.isEmpty(PjT.PjT(pjT0));
        }
    }

    public static boolean PjT(String s) {
        return PjT.cz == null || s == null ? false : PjT.cz.containsKey(s);
    }

    public static int ReZ(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null || pjT0.XX() == null || !PjT.Zh()) {
            return -1;
        }
        String s = pjT0.XX().optString("event_extra");
        try {
            return new JSONObject(s).optInt("stats_index");
        }
        catch(JSONException unused_ex) {
            return -1;
        }
    }

    private static String ReZ(String s) {
        StringBuilder stringBuilder0;
        synchronized(PjT.class) {
            LinkedList linkedList0 = PjT.ReZ;
            if(((long)linkedList0.size()) >= 10L) {
                linkedList0.removeFirst();
            }
            linkedList0.add(s);
            stringBuilder0 = new StringBuilder();
            for(Object object0: linkedList0) {
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(",");
            }
        }
        return stringBuilder0.toString();
    }

    public static boolean ReZ() {
        JQp jQp0 = Au.XX().xE();
        return jQp0 != null && jQp0.cz() == 2;
    }

    public static long SM(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null || pjT0.XX() == null || !PjT.Zh()) {
            return 0L;
        }
        try {
            return new JSONObject(pjT0.XX().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        }
        catch(Exception exception0) {
            exception0.getMessage();
            return 0L;
        }
    }

    public static void XX(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        try {
            if(Au.XX().xE().XX()) {
                long v = pjT0.Au();
                cr.cr.PjT(System.currentTimeMillis() - v);
                pjT0.Zh(System.currentTimeMillis());
                if(pjT0.cr() == 0 && Au.XX().xE() != null && Au.XX().xE().PjT()) {
                    String s = PjT.PjT(pjT0);
                    if(!PjT.PjT(s)) {
                        JSONObject jSONObject0 = pjT0.XX();
                        String s1 = pjT0.XX().optString("ad_extra_data");
                        if(!TextUtils.isEmpty(s1)) {
                            JSONObject jSONObject1 = new JSONObject(s1);
                            if(TextUtils.isEmpty(jSONObject1.optString("save_success_labels"))) {
                                jSONObject1.put("save_success_labels", PjT.Zh((s + "_" + PjT.SM(pjT0))));
                            }
                            jSONObject0.put("ad_extra_data", jSONObject1.toString());
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("save_success_labels", PjT.Zh((s + "_" + PjT.SM(pjT0))));
                        jSONObject0.put("ad_extra_data", jSONObject2.toString());
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    public static String Zh(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        return pjT0 != null && pjT0.XX() != null && !PjT.ReZ() ? pjT0.XX().optString("type") : null;
    }

    private static String Zh(String s) {
        StringBuilder stringBuilder0;
        synchronized(PjT.class) {
            LinkedList linkedList0 = PjT.Zh;
            if(((long)linkedList0.size()) >= 10L) {
                linkedList0.removeFirst();
            }
            linkedList0.add(s);
            stringBuilder0 = new StringBuilder();
            for(Object object0: linkedList0) {
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(",");
            }
        }
        return stringBuilder0.toString();
    }

    public static boolean Zh() {
        JQp jQp0 = Au.XX().xE();
        return jQp0 != null && jQp0.cz() == 0;
    }

    public static int cr(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        synchronized(PjT.class) {
            if(pjT0 != null && pjT0.XX() != null) {
                if(!PjT.Zh()) {
                    return 0;
                }
                try {
                    return new JSONObject(pjT0.XX().optString("ad_extra_data")).optInt("sdk_event_self_count");
                }
                catch(Exception unused_ex) {
                    return 0;
                }
            }
            return 0;
        }
    }

    private static void cr(String s) {
        synchronized(PjT.class) {
            LinkedList linkedList0 = PjT.cr;
            if(((long)linkedList0.size()) >= 10L) {
                linkedList0.removeFirst();
                linkedList0.add(s);
                return;
            }
            linkedList0.add(s);
        }
    }

    public static boolean cr() {
        JQp jQp0 = Au.XX().xE();
        return jQp0 != null && jQp0.cz() == 1;
    }

    private static String cz() [...] // 潜在的解密器

    public static void cz(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        try {
            if(pjT0.cr() == 0 && Au.XX().xE() != null && Au.XX().xE().PjT()) {
                JSONObject jSONObject0 = pjT0.XX();
                String s = PjT.PjT(pjT0);
                if(!PjT.PjT(s)) {
                    PjT.JQp(pjT0);
                    String s1 = jSONObject0.optString("ad_extra_data");
                    if(!TextUtils.isEmpty(s1)) {
                        JSONObject jSONObject1 = new JSONObject(s1);
                        if(TextUtils.isEmpty(jSONObject1.optString("will_send_labels"))) {
                            jSONObject1.put("will_send_labels", PjT.ReZ((s + "_" + PjT.SM(pjT0))));
                            jSONObject1.put("send_success_valid_labels", "");
                        }
                        jSONObject0.put("ad_extra_data", jSONObject1.toString());
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("will_send_labels", PjT.ReZ((s + "_" + PjT.SM(pjT0))));
                    jSONObject2.put("send_success_valid_labels", "");
                    jSONObject0.put("ad_extra_data", jSONObject2.toString());
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private static String qj(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(pjT0 == null || pjT0.XX() == null || !PjT.Zh()) {
            return null;
        }
        JSONObject jSONObject0 = pjT0.XX();
        String s = pjT0.cr() == 1 ? jSONObject0.optString("event_extra") : jSONObject0.optString("ad_extra_data");
        try {
            return new JSONObject(s).optString("sdk_session_id");
        }
        catch(JSONException jSONException0) {
            jSONException0.getMessage();
            return null;
        }
    }
}

