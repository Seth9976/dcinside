package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class DWo {
    private static final Map PjT;
    private static Integer Zh;

    static {
        DWo.PjT = new HashMap();
        DWo.Zh = null;
    }

    public static Drawable PjT(Context context0, int v) {
        return DWo.PjT(context0, Color.parseColor("#1A73E8"), v);
    }

    public static Drawable PjT(Context context0, int v, int v1) {
        Drawable drawable0 = new GradientDrawable();
        ((GradientDrawable)drawable0).setColor(v);
        ((GradientDrawable)drawable0).setCornerRadius(((float)qZS.Zh(context0, ((float)v1))));
        return drawable0;
    }

    public static Drawable PjT(Context context0, String s) {
        return DWo.PjT(context0, s, true);
    }

    public static Drawable PjT(Context context0, String s, boolean z) {
        DWo.Zh = ub.cr().RV();
        "drawable name is: ".concat(String.valueOf(s));
        Map map0 = DWo.PjT;
        map0.size();
        if(map0.containsKey(s)) {
            Pair pair0 = (Pair)map0.get(s);
            if(pair0 != null) {
                Drawable drawable0 = (Drawable)pair0.first;
                map0.put(s, new Pair(drawable0, ((int)(((int)(((Integer)pair0.second))) + 1))));
                return drawable0;
            }
        }
        DWo.PjT();
        return DWo.PjT(s, context0, z);
    }

    private static Drawable PjT(String s, Context context0, boolean z) {
        Drawable drawable0;
        LayerDrawable layerDrawable0;
        s.hashCode();
        switch(s) {
            case "tt_ad_cover_btn_begin_bg": {
                drawable0 = DWo.PjT(DWo.PjT(0, Lrd.XX(context0, "tt_2a90d7"), new int[]{qZS.Zh(context0, 6.0f)}, null, qZS.Zh(context0, 1.0f), Lrd.XX(context0, "@color/tt_7f2a90d7")), DWo.PjT(0, Lrd.XX(context0, "tt_2a90d7"), new int[]{qZS.Zh(context0, 6.0f)}, null, qZS.Zh(context0, 1.0f), Lrd.XX(context0, "@color/tt_2a90d7")));
                break;
            }
            case "tt_ad_landing_loading_three_left": {
                drawable0 = DWo.PjT(0, null, new int[]{qZS.Zh(context0, 6.0f), 0, 0, qZS.Zh(context0, 6.0f)}, null, qZS.Zh(context0, 1.5f), Color.parseColor("#ABACB0"));
                break;
            }
            case "tt_ad_landing_loading_three_mid": {
                drawable0 = DWo.PjT(0, null, null, null, qZS.Zh(context0, 1.5f), Color.parseColor("#ABACB0"));
                break;
            }
            case "tt_ad_landing_loading_three_right": {
                drawable0 = DWo.PjT(0, null, new int[]{0, qZS.Zh(context0, 6.0f), qZS.Zh(context0, 6.0f), 0}, null, qZS.Zh(context0, 1.5f), Color.parseColor("#ABACB0"));
                break;
            }
            case "tt_ad_loading_rect": {
                drawable0 = DWo.PjT(0, Color.parseColor("#33FFFFFF"), new int[]{qZS.Zh(context0, 15.0f)}, null, null, null);
                break;
            }
            case "tt_ad_loading_three_left": {
                drawable0 = DWo.PjT(0, null, new int[]{qZS.Zh(context0, 6.0f), 0, 0, qZS.Zh(context0, 6.0f)}, null, qZS.Zh(context0, 1.5f), -1);
                break;
            }
            case "tt_ad_loading_three_mid": {
                drawable0 = DWo.PjT(0, null, null, null, qZS.Zh(context0, 1.5f), -1);
                break;
            }
            case "tt_ad_loading_three_right": {
                drawable0 = DWo.PjT(0, null, new int[]{0, qZS.Zh(context0, 6.0f), qZS.Zh(context0, 6.0f), 0}, null, qZS.Zh(context0, 1.5f), -1);
                break;
            }
            case "tt_ad_report_info_bg": {
                drawable0 = DWo.PjT(0, -1, new int[]{qZS.Zh(context0, 12.0f), qZS.Zh(context0, 12.0f), 0, 0}, null, null, null);
                break;
            }
            case "tt_ad_report_info_button_bg": {
                drawable0 = DWo.PjT(DWo.PjT(0, Color.parseColor("#0D000000"), new int[]{qZS.Zh(context0, 2.0f)}, null, qZS.Zh(context0, 1.0f), Color.parseColor("#1F000000")), DWo.PjT(0, -1, new int[]{qZS.Zh(context0, 2.0f)}, null, qZS.Zh(context0, 1.0f), Color.parseColor("#1618231F")));
                break;
            }
            case "tt_ad_skip_btn_bg2": {
                drawable0 = DWo.PjT(0, Color.parseColor("#66161823"), new int[]{qZS.Zh(context0, 14.0f)}, null, null, null);
                break;
            }
            case "tt_backup_btn_1": {
                drawable0 = DWo.PjT(DWo.PjT(0, Color.parseColor("#33f32830"), new int[]{qZS.Zh(context0, 4.0f)}, null, null, null), DWo.PjT(0, Color.parseColor("#f32830"), new int[]{qZS.Zh(context0, 4.0f)}, null, null, null));
                break;
            }
            case "tt_browser_download_selector": {
                drawable0 = DWo.PjT(DWo.PjT(0, Color.parseColor("#2582c3"), null, null, null, null), DWo.PjT(0, Color.parseColor("#2a90d7"), null, null, null, null));
                break;
            }
            case "tt_browser_progress_style": {
                drawable0 = new LayerDrawable(new Drawable[]{DWo.PjT(0, -1, new int[]{0}, null, null, null), new ClipDrawable(DWo.PjT(0, Color.parseColor("#1A73E8"), new int[]{0}, null, null, null), 3, 1)});
                break;
            }
            case "tt_circle_solid_mian": {
                drawable0 = DWo.PjT(1, Lrd.XX(context0, "tt_e0e0e0"), null, null, null, null);
                break;
            }
            case "tt_close_move_detail": {
                drawable0 = DWo.PjT(Lrd.ReZ(context0, "tt_close_move_details_pressed"), Lrd.ReZ(context0, "tt_close_move_details_normal"));
                break;
            }
            case "tt_comment_tv": {
                drawable0 = DWo.PjT(0, -1, new int[]{qZS.Zh(context0, 4.0f)}, null, qZS.Zh(context0, 1.0f), Color.parseColor("#0F161823"));
                break;
            }
            case "tt_custom_dialog_bg": {
                drawable0 = DWo.PjT(0, -1, new int[]{qZS.Zh(context0, 6.0f)}, null, qZS.Zh(context0, 0.8f), -1);
                break;
            }
            case "tt_detail_video_btn_bg": {
                drawable0 = DWo.PjT(0, Color.parseColor("#26000000"), new int[]{qZS.Zh(context0, 4.0f)}, null, null, null);
                break;
            }
            case "tt_dislike_bottom_seletor": {
                drawable0 = DWo.PjT(DWo.PjT(0, Lrd.XX(context0, "tt_fde6e6e6"), new int[]{0, 0, qZS.Zh(context0, 5.0f), qZS.Zh(context0, 5.0f)}, null, null, null), DWo.PjT(0, Lrd.XX(context0, "tt_fdffffff"), new int[]{0, 0, qZS.Zh(context0, 5.0f), qZS.Zh(context0, 5.0f)}, null, null, null));
                break;
            }
            case "tt_dislike_dialog_bg": {
                drawable0 = DWo.PjT(0, -1, new int[]{qZS.Zh(context0, 8.0f)}, null, null, null);
                break;
            }
            case "tt_dislike_middle_seletor": {
                drawable0 = DWo.PjT(DWo.PjT(0, Lrd.XX(context0, "tt_fde6e6e6"), null, null, null, null), DWo.PjT(0, Lrd.XX(context0, "tt_fdffffff"), null, null, null, null));
                break;
            }
            case "tt_dislike_top_bg": {
                drawable0 = DWo.PjT(0, Lrd.XX(context0, "tt_fdffffff"), new int[]{qZS.Zh(context0, 5.0f), qZS.Zh(context0, 5.0f), 0, 0}, null, null, null);
                break;
            }
            case "tt_dislike_top_seletor": {
                drawable0 = DWo.PjT(DWo.PjT(0, Lrd.XX(context0, "tt_fde6e6e6"), new int[]{qZS.Zh(context0, 5.0f), qZS.Zh(context0, 5.0f), 0, 0}, null, null, null), DWo.PjT(0, Lrd.XX(context0, "tt_fdffffff"), new int[]{qZS.Zh(context0, 5.0f), qZS.Zh(context0, 5.0f), 0, 0}, null, null, null));
                break;
            }
            case "tt_download_corner_bg": {
                drawable0 = DWo.PjT(0, Lrd.XX(context0, "tt_4a90e2"), new int[]{qZS.Zh(context0, 4.0f)}, null, null, null);
                break;
            }
            case "tt_full_reward_loading_progress_style": {
                GradientDrawable gradientDrawable2 = DWo.PjT(0, Color.parseColor("#EAEAEA"), new int[]{qZS.Zh(context0, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(((float)qZS.Zh(context0, 15.0f)));
                gradientDrawable3.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawable0 = new LayerDrawable(new Drawable[]{gradientDrawable2, new ScaleDrawable(gradientDrawable3, 0x800003, 1.0f, -1.0f)});
                break;
            }
            case "tt_landingpage_loading_text_rect": {
                drawable0 = DWo.PjT(0, Color.parseColor("#141A73E8"), new int[]{qZS.Zh(context0, 5.0f)}, null, null, null);
                break;
            }
            case "tt_leftbackbutton_titlebar_photo_preview": {
                drawable0 = DWo.PjT(Lrd.ReZ(context0, "tt_white_lefterbackicon_titlebar_press"), Lrd.ReZ(context0, "tt_white_lefterbackicon_titlebar"));
                break;
            }
            case "tt_leftbackicon_selector": {
                drawable0 = Lrd.ReZ(context0, "tt_lefterbackicon_titlebar");
                break;
            }
            case "tt_leftbackicon_selector_for_dark": {
                drawable0 = DWo.PjT(Lrd.ReZ(context0, "tt_lefterbackicon_titlebar_press_for_dark"), Lrd.ReZ(context0, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            }
            case "tt_lefterbackicon_titlebar_press_wrapper": {
                Drawable drawable4 = Lrd.ReZ(context0, "tt_lefterbackicon_titlebar_press");
                layerDrawable0 = new StateListDrawable();
                ((StateListDrawable)layerDrawable0).addState(new int[0], drawable4);
                layerDrawable0.setAutoMirrored(true);
                drawable0 = layerDrawable0;
                break;
            }
            case "tt_mute_btn_bg": {
                drawable0 = DWo.PjT(1, Color.parseColor("#99333333"), null, new int[]{qZS.Zh(context0, 28.0f), qZS.Zh(context0, 28.0f)}, null, null);
                break;
            }
            case "tt_mute_wrapper": {
                Drawable drawable1 = Lrd.ReZ(context0, "tt_mute");
                layerDrawable0 = new StateListDrawable();
                ((StateListDrawable)layerDrawable0).addState(new int[0], drawable1);
                layerDrawable0.setAutoMirrored(true);
                drawable0 = layerDrawable0;
                break;
            }
            case "tt_pangle_ad_close_btn_bg": {
                drawable0 = DWo.PjT(1, Color.parseColor("#30333333"), null, new int[]{qZS.Zh(context0, 28.0f), qZS.Zh(context0, 28.0f)}, null, null);
                break;
            }
            case "tt_pangle_ad_mute_btn_bg": {
                drawable0 = DWo.PjT(1, Color.parseColor("#99333333"), null, new int[]{qZS.Zh(context0, 28.0f), qZS.Zh(context0, 28.0f)}, null, null);
                break;
            }
            case "tt_pangle_banner_btn_bg": {
                drawable0 = DWo.PjT(0, Color.parseColor("#ff2f87f8"), new int[]{qZS.Zh(context0, 2.0f)}, new int[]{qZS.Zh(context0, 98.0f), qZS.Zh(context0, 25.0f)}, null, null);
                break;
            }
            case "tt_pangle_btn_bg": {
                layerDrawable0 = new GradientDrawable();
                ((GradientDrawable)layerDrawable0).setShape(0);
                ((GradientDrawable)layerDrawable0).setSize(qZS.Zh(context0, 280.0f), qZS.Zh(context0, 38.0f));
                ((GradientDrawable)layerDrawable0).setCornerRadius(((float)qZS.Zh(context0, 19.0f)));
                ((GradientDrawable)layerDrawable0).setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                ((GradientDrawable)layerDrawable0).setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                ((GradientDrawable)layerDrawable0).setGradientType(0);
                ((GradientDrawable)layerDrawable0).setUseLevel(true);
                drawable0 = layerDrawable0;
                break;
            }
            case "tt_play_movebar_textpage": {
                drawable0 = DWo.PjT(Lrd.ReZ(context0, "tt_new_play_video"), Lrd.ReZ(context0, "tt_new_play_video"));
                break;
            }
            case "tt_playable_btn_bk": {
                drawable0 = DWo.PjT(0, Lrd.XX(context0, "tt_00000000"), new int[]{qZS.Zh(context0, 30.0f)}, null, qZS.Zh(context0, 1.0f), -1);
                break;
            }
            case "tt_playable_progress_style": {
                drawable0 = new LayerDrawable(new Drawable[]{DWo.PjT(0, Color.parseColor("#4DFC625C"), new int[]{qZS.Zh(context0, 3.0f)}, null, null, null), new ClipDrawable(DWo.PjT(0, Color.parseColor("#FC625C"), new int[]{qZS.Zh(context0, 3.0f)}, null, null, null), 0x800003, 1)});
                break;
            }
            case "tt_privacy_btn_bg": {
                layerDrawable0 = new GradientDrawable();
                ((GradientDrawable)layerDrawable0).setShape(0);
                ((GradientDrawable)layerDrawable0).setSize(qZS.Zh(context0, 258.0f), qZS.Zh(context0, 43.0f));
                ((GradientDrawable)layerDrawable0).setCornerRadius(((float)qZS.Zh(context0, 22.0f)));
                ((GradientDrawable)layerDrawable0).setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                ((GradientDrawable)layerDrawable0).setGradientType(0);
                drawable0 = layerDrawable0;
                break;
            }
            case "tt_privacy_progress_style": {
                drawable0 = new LayerDrawable(new Drawable[]{DWo.PjT(0, Color.parseColor("#33007AFF"), null, null, null, null), new ClipDrawable(DWo.PjT(0, Color.parseColor("#007AFF"), null, null, null, null), 0x800003, 1)});
                break;
            }
            case "tt_privacy_webview_bg": {
                drawable0 = DWo.PjT(0, -1, new int[]{qZS.Zh(context0, 14.5f)}, null, null, null);
                break;
            }
            case "tt_refreshing_video_textpage": {
                drawable0 = DWo.PjT(Lrd.ReZ(context0, "tt_refreshing_video_textpage_pressed"), Lrd.ReZ(context0, "tt_refreshing_video_textpage_normal"));
                break;
            }
            case "tt_reward_countdown_bg": {
                drawable0 = DWo.PjT(1, Color.parseColor("#99333333"), null, new int[]{qZS.Zh(context0, 28.0f), qZS.Zh(context0, 28.0f)}, null, null);
                break;
            }
            case "tt_reward_full_new_bar_bg": {
                drawable0 = DWo.PjT(0, Color.parseColor("#ccffffff"), new int[]{qZS.Zh(context0, 18.0f)}, null, null, null);
                break;
            }
            case "tt_reward_full_video_backup_btn_bg": {
                drawable0 = DWo.PjT(0, Color.parseColor("#ff0088ff"), new int[]{qZS.Zh(context0, 6.0f)}, null, null, null);
                break;
            }
            case "tt_reward_video_download_btn_bg": {
                drawable0 = DWo.PjT(0, Color.parseColor("#ff007aff"), new int[]{qZS.Zh(context0, 18.0f)}, null, null, null);
                break;
            }
            case "tt_seek_progress": {
                drawable0 = new LayerDrawable(new Drawable[]{DWo.PjT(0, Color.parseColor("#A5FFFFFF"), new int[]{qZS.Zh(context0, 1.5f)}, new int[]{-1, qZS.Zh(context0, 1.0f)}, null, null), new ClipDrawable(DWo.PjT(0, -1, new int[]{qZS.Zh(context0, 1.5f)}, new int[]{-1, qZS.Zh(context0, 1.0f)}, null, null), 0x800003, 1), new ClipDrawable(DWo.PjT(0, Color.parseColor("#fff85959"), new int[]{qZS.Zh(context0, 1.5f)}, new int[]{-1, qZS.Zh(context0, 1.0f)}, null, null), 0x800003, 1)});
                break;
            }
            case "tt_seek_thumb": {
                GradientDrawable gradientDrawable0 = DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 15.0f), qZS.Zh(context0, 15.0f)}, qZS.Zh(context0, 1.0f), 0);
                drawable0 = DWo.PjT(DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 22.0f), qZS.Zh(context0, 22.0f)}, qZS.Zh(context0, 1.0f), 0), gradientDrawable0);
                break;
            }
            case "tt_seek_thumb_fullscreen": {
                drawable0 = DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 18.0f), qZS.Zh(context0, 18.0f)}, null, null);
                break;
            }
            case "tt_seek_thumb_fullscreen_press": {
                drawable0 = DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 18.0f), qZS.Zh(context0, 18.0f)}, qZS.Zh(context0, 1.0f), 0);
                break;
            }
            case "tt_seek_thumb_fullscreen_selector": {
                GradientDrawable gradientDrawable1 = DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 18.0f), qZS.Zh(context0, 18.0f)}, qZS.Zh(context0, 1.0f), 0);
                drawable0 = DWo.PjT(DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 18.0f), qZS.Zh(context0, 18.0f)}, qZS.Zh(context0, 1.0f), 0), gradientDrawable1);
                break;
            }
            case "tt_seek_thumb_normal": {
                drawable0 = DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 15.0f), qZS.Zh(context0, 15.0f)}, qZS.Zh(context0, 1.0f), 0);
                break;
            }
            case "tt_seek_thumb_press": {
                drawable0 = DWo.PjT(1, -1, null, new int[]{qZS.Zh(context0, 22.0f), qZS.Zh(context0, 22.0f)}, qZS.Zh(context0, 1.0f), 0);
                break;
            }
            case "tt_shadow_btn_back": {
                Drawable drawable5 = Lrd.ReZ(context0, "tt_shadow_lefterback_titlebar_press");
                drawable0 = DWo.PjT(drawable5, Lrd.ReZ(context0, "tt_shadow_lefterback_titlebar"));
                ((StateListDrawable)drawable0).addState(new int[]{0xFEFEFF62}, drawable5);
                break;
            }
            case "tt_shadow_btn_back_withoutnight": {
                Drawable drawable3 = Lrd.ReZ(context0, "tt_shadow_lefterback_titlebar_press_withoutnight");
                drawable0 = DWo.PjT(drawable3, Lrd.ReZ(context0, "tt_shadow_lefterback_titlebar_withoutnight"));
                ((StateListDrawable)drawable0).addState(new int[]{0xFEFEFF62}, drawable3);
                break;
            }
            case "tt_stop_movebar_textpage": {
                drawable0 = DWo.PjT(Lrd.ReZ(context0, "tt_new_pause_video_press"), Lrd.ReZ(context0, "tt_new_pause_video"));
                break;
            }
            case "tt_titlebar_close_seletor": {
                drawable0 = Lrd.ReZ(context0, "tt_titlebar_close_drawable");
                break;
            }
            case "tt_titlebar_close_seletor_for_dark": {
                drawable0 = DWo.PjT(Lrd.ReZ(context0, "tt_titlebar_close_press_for_dark"), Lrd.ReZ(context0, "tt_titlebar_close_for_dark"));
                break;
            }
            case "tt_unmute_wrapper": {
                Drawable drawable2 = Lrd.ReZ(context0, "tt_unmute");
                layerDrawable0 = new StateListDrawable();
                ((StateListDrawable)layerDrawable0).addState(new int[0], drawable2);
                layerDrawable0.setAutoMirrored(true);
                drawable0 = layerDrawable0;
                break;
            }
            case "tt_video_black_desc_gradient": {
                layerDrawable0 = new GradientDrawable();
                ((GradientDrawable)layerDrawable0).setShape(0);
                ((GradientDrawable)layerDrawable0).setGradientType(0);
                ((GradientDrawable)layerDrawable0).setColors(new int[]{Lrd.XX(context0, "tt_ff1a1a1a"), Lrd.XX(context0, "tt_00000000")});
                ((GradientDrawable)layerDrawable0).setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                drawable0 = layerDrawable0;
                break;
            }
            case "tt_video_loading_progress_bar": {
                layerDrawable0 = new RotateDrawable();
                ((RotateDrawable)layerDrawable0).setDrawable(Lrd.ReZ(context0, "tt_normalscreen_loading"));
                ((RotateDrawable)layerDrawable0).setFromDegrees(0.0f);
                ((RotateDrawable)layerDrawable0).setToDegrees(360.0f);
                ((RotateDrawable)layerDrawable0).setPivotX(0.5f);
                ((RotateDrawable)layerDrawable0).setPivotY(0.5f);
                drawable0 = layerDrawable0;
                break;
            }
            default: {
                drawable0 = null;
            }
        }
        if(z) {
            Pair pair0 = new Pair(drawable0, 1);
            DWo.PjT.put(s, pair0);
        }
        return drawable0;
    }

    private static GradientDrawable PjT(int v, Integer integer0, int[] arr_v, int[] arr_v1, Integer integer1, Integer integer2) {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(v);
        if(integer0 != null) {
            gradientDrawable0.setColor(((int)integer0));
        }
        int v1 = arr_v == null ? 0 : arr_v.length;
        if(v1 == 1) {
            gradientDrawable0.setCornerRadius(((float)arr_v[0]));
        }
        else if(v1 == 4) {
            gradientDrawable0.setCornerRadii(new float[]{((float)arr_v[0]), ((float)arr_v[0]), ((float)arr_v[1]), ((float)arr_v[1]), ((float)arr_v[2]), ((float)arr_v[2]), ((float)arr_v[3]), ((float)arr_v[3])});
        }
        if(arr_v1 != null && arr_v1.length == 2) {
            gradientDrawable0.setSize(arr_v1[0], arr_v1[1]);
        }
        if(integer1 != null && integer2 != null) {
            gradientDrawable0.setStroke(((int)integer1), ((int)integer2));
        }
        return gradientDrawable0;
    }

    private static StateListDrawable PjT(Drawable drawable0, Drawable drawable1) {
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        if(drawable0 != null) {
            stateListDrawable0.addState(new int[]{0x10100A7}, drawable0);
        }
        if(drawable1 != null) {
            stateListDrawable0.addState(new int[0], drawable1);
        }
        return stateListDrawable0;
    }

    private static void PjT() {
        Map map0 = DWo.PjT;
        if(map0.size() < ((int)DWo.Zh)) {
            return;
        }
        String s = null;
        int v = 0x7FFFFFFF;
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((int)(((Integer)((Pair)map$Entry0.getValue()).second))) < v) {
                s = (String)map$Entry0.getKey();
                v = (int)(((Integer)((Pair)map$Entry0.getValue()).second));
                if(v == 1) {
                    break;
                }
            }
        }
        DWo.PjT.remove(s);
    }
}

