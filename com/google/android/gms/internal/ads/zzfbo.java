package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzw;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbo {
    @Nullable
    public final zzbxr zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfcm zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    @Nullable
    public final zzbtk zzad;
    @Nullable
    public final zzu zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    @Nullable
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    @Nullable
    public final zzv zzax;
    @Nullable
    public final zzw zzay;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    @Nullable
    public final zzbwi zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    @Nullable
    public final zzfbt zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    // This method was un-flattened
    zzfbo(JsonReader jsonReader0) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list20;
        List list19;
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        List list2 = Collections.emptyList();
        List list3 = Collections.emptyList();
        List list4 = Collections.emptyList();
        List list5 = Collections.emptyList();
        List list6 = Collections.emptyList();
        List list7 = Collections.emptyList();
        List list8 = Collections.emptyList();
        List list9 = Collections.emptyList();
        List list10 = Collections.emptyList();
        List list11 = Collections.emptyList();
        List list12 = Collections.emptyList();
        List list13 = Collections.emptyList();
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        HashMap hashMap0 = new HashMap();
        jsonReader0.beginObject();
        JSONObject jSONObject6 = jSONObject1;
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        List list14 = zzfxn.zzn();
        Map map0 = hashMap0;
        zzfbt zzfbt0 = null;
        zzbxr zzbxr0 = null;
        zzbtk zzbtk0 = null;
        zzu zzu0 = null;
        String s = null;
        zzv zzv0 = null;
        zzw zzw0 = null;
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        String s7 = "";
        String s8 = "";
        String s9 = "";
        String s10 = "";
        String s11 = "";
        String s12 = "";
        String s13 = "";
        String s14 = "";
        String s15 = "";
        String s16 = "";
        String s17 = "";
        String s18 = "";
        int v = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int v1 = -1;
        int v2 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int v3 = 0;
        int v4 = -1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int v5 = 0;
        boolean z18 = false;
        List list15 = list10;
        List list16 = list11;
        List list17 = list12;
        List list18 = list13;
        JSONObject jSONObject11 = jSONObject0;
        zzbwi zzbwi0 = null;
        String s19 = "";
        String s20 = "";
        int v6 = 0;
        int v7 = 0;
        while(jsonReader0.hasNext()) {
            String s21 = jsonReader0.nextName();
            String s22 = s21 == null ? "" : s21;
            switch(s22.hashCode()) {
                case 0x808DB56D: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_source_instance_name")) {
                        s13 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x89F2A0DF: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("debug_signals")) {
                        jSONObject6 = zzbs.zzi(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x8AD8AA29: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("omid_settings")) {
                        jSONObject8 = zzbs.zzi(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x8AE45F82: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("offline_ad_config")) {
                        if(((Boolean)zzbcl.zziw.zzj()).booleanValue()) {
                            zzw0 = zzw.zzd(zzbs.zzi(jsonReader0));
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_505;
                    }
                    break;
                }
                case 0x90744ED9: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("recursive_server_response_data")) {
                        s16 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x9223AA05: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_consent")) {
                        z17 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0x92FFBE1E: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("network_ping_config")) {
                        if(((Boolean)zzbcl.zziu.zzj()).booleanValue()) {
                            zzv0 = zzv.zza(zzbs.zzi(jsonReader0));
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_505;
                    }
                    break;
                }
                case 0x93FE39FC: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("play_prewarm_options")) {
                        zzbtk0 = zzbtk.zza(zzbs.zzi(jsonReader0));
                        goto label_505;
                    }
                    break;
                }
                case 0x959AA027: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("parallel_key")) {
                        s18 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x9615F213: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_source_name")) {
                        s11 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x9CE0CAC1: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_interscroller")) {
                        z11 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case -1620470467: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("backend_query_id")) {
                        s8 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case -1550155393: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("nofill_urls")) {
                        list8 = zzbs.zzd(jsonReader0);
                        list9 = list20;
                        continue;
                    }
                    break;
                }
                case -1440104884: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_custom_close_blocked")) {
                        z5 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0xAA32F5D0: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("orientation")) {
                        v1 = zzfbo.zzd(jsonReader0.nextString());
                        goto label_505;
                    }
                    break;
                }
                case 0xAAD3A8B5: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("enable_omid")) {
                        z7 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case -1406227629: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("buffer_click_url_as_ready_to_ping")) {
                        z15 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0xAC540548: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("showable_impression_type")) {
                        v3 = jsonReader0.nextInt();
                        goto label_505;
                    }
                    break;
                }
                case 0xAE04DC9B: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_cover")) {
                        jSONObject9 = zzbs.zzi(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -1360811658: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_sizes")) {
                        list18 = zzfbp.zza(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -1306015996: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("adapters")) {
                        list17 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -1303332046: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("test_mode_enabled")) {
                        z4 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case -1289032093: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("extras")) {
                        jSONObject7 = zzbs.zzi(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -1240082064: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_event_value")) {
                        zzu0 = zzu.zza(zzbs.zzi(jsonReader0));
                        goto label_505;
                    }
                    break;
                }
                case 0xB66FE42D: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("allow_pub_rendered_attribution")) {
                        z = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0xBA5F9700: {
                    list19 = list8;
                    if(s22.equals("presentation_error_urls")) {
                        list9 = zzbs.zzd(jsonReader0);
                        goto label_506;
                    }
                    else {
                        list20 = list9;
                        break;
                    }
                    goto label_235;
                }
                case -1152230954: {
                label_235:
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_type")) {
                        v6 = zzfbo.zzc(jsonReader0.nextString());
                        goto label_505;
                    }
                    break;
                }
                case 0xBBA94761: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_scroll_aware")) {
                        z9 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0xBD7DA620: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("fill_urls")) {
                        list7 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0xBF82F4DA: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("allocation_id")) {
                        s1 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case -1078050970: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("video_complete_urls")) {
                        list6 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -1051269058: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("active_view")) {
                        s4 = zzbs.zzi(jsonReader0).toString();
                        goto label_505;
                    }
                    break;
                }
                case -982608540: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("valid_from_timestamp")) {
                        s19 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0xC60F987D: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_source_instance_id")) {
                        s14 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0xD1B2113B: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("click_urls")) {
                        list1 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -570101180: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("late_load_urls")) {
                        list14 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0xDF8FE939: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("safe_browsing")) {
                        zzbxr0 = zzbxr.zza(zzbs.zzi(jsonReader0));
                        goto label_505;
                    }
                    break;
                }
                case 0xE5F30977: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("imp_urls")) {
                        list2 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -404433734: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("rtb_native_required_assets")) {
                        jSONObject10 = zzbs.zzi(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case -404326515: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("render_timeout_ms")) {
                        v2 = jsonReader0.nextInt();
                        goto label_505;
                    }
                    break;
                }
                case 0xE84B81F5: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_close_time_ms")) {
                        v4 = jsonReader0.nextInt();
                        goto label_505;
                    }
                    break;
                }
                case -388807511: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("content_url")) {
                        s = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0xE9F5B450: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_close_button_enabled")) {
                        jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0xF347050C: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("force_disable_hardware_acceleration")) {
                        z14 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case -213424028: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("watermark")) {
                        s7 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case -180214626: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("native_required_asset_viewability")) {
                        z13 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0xF6C8BE34: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_offline_ad")) {
                        z12 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0xFE40547A: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("allow_custom_click_gesture")) {
                        z2 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 3107: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad")) {
                        zzfbt0 = new zzfbt(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0xD1B: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("id")) {
                        s2 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 3076010: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("data")) {
                        jSONObject11 = zzbs.zzi(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x23640CB: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("request_id")) {
                        s15 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x3C44B50: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("render_test_label")) {
                        z3 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0x6674F9B: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("qdata")) {
                        s3 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 230323073: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_load_urls")) {
                        list3 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x18F0294B: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_closable_area_disabled")) {
                        z6 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0x2052155C: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("consent_form_action_identifier")) {
                        v5 = jsonReader0.nextInt();
                        goto label_505;
                    }
                    break;
                }
                case 0x20BBC660: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("presentation_error_timeout_ms")) {
                        v = jsonReader0.nextInt();
                        goto label_505;
                    }
                    break;
                }
                case 0x239CB9FC: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("debug_dialog_string")) {
                        s5 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x2CFEAB54: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("container_sizes")) {
                        list16 = zzfbp.zza(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x2F2793B0: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("impression_type")) {
                        v7 = zzfbo.zze(jsonReader0.nextInt());
                        goto label_505;
                    }
                    break;
                }
                case 0x2FFCC875: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("analytics_event_name_to_parameters_map")) {
                        if(((Boolean)zzbcl.zzam.zzj()).booleanValue()) {
                            map0 = zzbs.zze(jsonReader0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_505;
                    }
                    break;
                }
                case 1010584092: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("transaction_id")) {
                        s20 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 1100650276: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("rewards")) {
                        zzbwi0 = zzbwi.zza(zzbs.zzf(jsonReader0));
                        goto label_505;
                    }
                    break;
                }
                case 1141602460: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("adapter_response_info_key")) {
                        s17 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 1186014765: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("cache_hit_urls")) {
                        zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x4EC7DC6F: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("allow_pub_owned_ad_view")) {
                        z1 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0x54C7EC75: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_collapsible")) {
                        z16 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0x55AAC6A3: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_source_id")) {
                        s12 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x619B1543: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("bid_response")) {
                        s6 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x61B080E5: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("video_start_urls")) {
                        list4 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x6483313F: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("ad_network_class_name")) {
                        s10 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 0x64A20A30: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("video_reward_urls")) {
                        list5 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 1799285870: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("use_third_party_container_height")) {
                        z10 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 0x6DA6D810: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("renderers")) {
                        list0 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 0x6FC8B8D3: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("is_analytics_logging_enabled")) {
                        z8 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                case 2068142375: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("rule_line_external_id")) {
                        s9 = jsonReader0.nextString();
                        goto label_505;
                    }
                    break;
                }
                case 2072888499: {
                    list19 = list8;
                    list20 = list9;
                    if(s22.equals("manual_tracking_urls")) {
                        list15 = zzbs.zzd(jsonReader0);
                        goto label_505;
                    }
                    break;
                }
                case 2075506442: {
                    list20 = list9;
                    list19 = list8;
                    if(s22.equals("render_serially")) {
                        z18 = jsonReader0.nextBoolean();
                        goto label_505;
                    }
                    break;
                }
                default: {
                    list19 = list8;
                    list20 = list9;
                }
            }
            jsonReader0.skipValue();
        label_505:
            list9 = list20;
        label_506:
            list8 = list19;
        }
        jsonReader0.endObject();
        this.zza = list0;
        this.zzb = v6;
        this.zzc = list1;
        this.zzd = list2;
        this.zzf = list3;
        this.zze = v7;
        this.zzg = list4;
        this.zzh = list5;
        this.zzi = list6;
        this.zzj = s20;
        this.zzk = s19;
        this.zzl = zzbwi0;
        this.zzm = list7;
        this.zzn = list8;
        this.zzo = list9;
        this.zzp = list15;
        this.zzq = v;
        this.zzr = list16;
        this.zzs = zzfbt0;
        this.zzt = list17;
        this.zzu = list18;
        this.zzw = s1;
        this.zzv = jSONObject11;
        this.zzx = s2;
        this.zzy = s3;
        this.zzz = s4;
        this.zzA = zzbxr0;
        this.zzB = s5;
        this.zzC = jSONObject6;
        this.zzD = jSONObject7;
        this.zzJ = z;
        this.zzK = z1;
        this.zzL = z2;
        this.zzM = z3;
        this.zzN = z4;
        this.zzO = z5;
        this.zzP = z6;
        this.zzQ = v1;
        this.zzR = v2;
        this.zzT = z7;
        this.zzU = s6;
        this.zzV = new zzfcm(jSONObject8);
        this.zzW = z8;
        this.zzX = z9;
        this.zzY = v3;
        this.zzZ = s7;
        this.zzaa = v4;
        this.zzab = s8;
        this.zzac = z10;
        this.zzad = zzbtk0;
        this.zzae = zzu0;
        this.zzaf = s9;
        this.zzag = z11;
        this.zzah = jSONObject9;
        this.zzE = s10;
        this.zzF = s11;
        this.zzG = s12;
        this.zzH = s13;
        this.zzI = s14;
        this.zzai = z12;
        this.zzaj = jSONObject10;
        this.zzak = z13;
        this.zzal = s;
        this.zzam = z14;
        this.zzS = z15;
        this.zzan = s15;
        this.zzao = s16;
        this.zzap = s17;
        this.zzaq = z16;
        this.zzar = z17;
        this.zzas = v5;
        this.zzau = list14;
        this.zzat = s18;
        this.zzav = z18;
        this.zzaw = map0;
        this.zzax = zzv0;
        this.zzay = zzw0;
    }

    public static String zza(int v) {
        switch(v) {
            case 1: {
                return "BANNER";
            }
            case 2: {
                return "INTERSTITIAL";
            }
            case 3: {
                return "NATIVE_EXPRESS";
            }
            case 4: {
                return "NATIVE";
            }
            case 5: {
                return "REWARDED";
            }
            case 6: {
                return "APP_OPEN_AD";
            }
            case 7: {
                return "REWARDED_INTERSTITIAL";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }

    private static int zzc(String s) {
        if("banner".equals(s)) {
            return 1;
        }
        if("interstitial".equals(s)) {
            return 2;
        }
        if("native_express".equals(s)) {
            return 3;
        }
        if("native".equals(s)) {
            return 4;
        }
        if("rewarded".equals(s)) {
            return 5;
        }
        if("app_open_ad".equals(s)) {
            return 6;
        }
        return "rewarded_interstitial".equals(s) ? 7 : 0;
    }

    private static int zzd(String s) {
        if("landscape".equalsIgnoreCase(s)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(s) ? 7 : -1;
    }

    private static int zze(int v) {
        return v == 0 || v == 1 || v == 3 ? v : 0;
    }
}

