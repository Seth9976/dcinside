package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.b;
import com.bykv.vk.openvk.preload.geckox.buffer.a.a;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class c {
    private static Integer a(List list0) {
        return list0 == null || list0.isEmpty() ? null : list0.size();
    }

    public static void a(b b0, a a0) {
        IStatisticMonitor iStatisticMonitor0 = b0.q();
        if(iStatisticMonitor0 != null) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("params_for_special", "gecko");
                jSONObject0.put("device_id", b0.r());
                jSONObject0.put("os", 0);
                jSONObject0.put("app_version", b0.o());
                jSONObject0.put("api_version", "v3");
                jSONObject0.put("aid", b0.k());
                jSONObject0.put("x_tt_logid", a0.e);
                jSONObject0.put("http_status", a0.g);
                jSONObject0.put("err_msg", a0.d);
                if(TextUtils.isEmpty(a0.e)) {
                    jSONObject0.put("deployments_info", a0.b);
                    jSONObject0.put("local_info", a0.a);
                    jSONObject0.put("custom_info", a0.c);
                }
                else {
                    jSONObject0.put("deployments_info", "");
                    jSONObject0.put("local_info", "");
                    jSONObject0.put("custom_info", "");
                }
                new StringBuilder().append(Build.VERSION.SDK_INT);
                jSONObject0.put("os_version", "33");
                jSONObject0.put("device_platform", "android");
                jSONObject0.put("device_model", Build.MODEL);
                jSONObject0.put("ac", a0.f);
                iStatisticMonitor0.upload("geckosdk_query_pkgs", jSONObject0);
                return;
            }
            catch(Throwable throwable0) {
            }
            GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", throwable0);
        }
    }

    public static void a(b b0, com.bykv.vk.openvk.preload.geckox.statistic.a a0) {
        StatisticModel statisticModel0;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: a0.a()) {
            com.bykv.vk.openvk.preload.geckox.statistic.model.a a1 = (com.bykv.vk.openvk.preload.geckox.statistic.model.a)object0;
            if(a1.d != null || a1.f != 0L) {
                if(!a1.h || !a1.i) {
                label_58:
                    PackageStatisticModel statisticModel$PackageStatisticModel4 = new PackageStatisticModel();
                    arrayList0.add(statisticModel$PackageStatisticModel4);
                    statisticModel$PackageStatisticModel4.statsType = 101;
                    statisticModel$PackageStatisticModel4.accessKey = a1.a;
                    statisticModel$PackageStatisticModel4.groupName = a1.b;
                    statisticModel$PackageStatisticModel4.channel = a1.c;
                    statisticModel$PackageStatisticModel4.ac = a1.n;
                    statisticModel$PackageStatisticModel4.patchId = a1.o;
                    statisticModel$PackageStatisticModel4.id = a1.p;
                    statisticModel$PackageStatisticModel4.downloadRetryTimes = c.a(a1.e);
                    statisticModel$PackageStatisticModel4.downloadUrl = a1.d;
                    statisticModel$PackageStatisticModel4.downloadFailRecords = c.b(a1.e);
                    if(!a1.h) {
                        statisticModel$PackageStatisticModel4.errCode = "301";
                        if(a1.e != null && !a1.e.isEmpty()) {
                            statisticModel$PackageStatisticModel4.errMsg = ((DownloadFailRecords)a1.e.get(0)).reason;
                        }
                    }
                    else if(!a1.i) {
                        statisticModel$PackageStatisticModel4.errCode = "402";
                        statisticModel$PackageStatisticModel4.errMsg = a1.q;
                    }
                    c.a(a1, arrayList0);
                    continue;
                }
                else {
                    PackageStatisticModel statisticModel$PackageStatisticModel0 = new PackageStatisticModel();
                    arrayList0.add(statisticModel$PackageStatisticModel0);
                    statisticModel$PackageStatisticModel0.statsType = 100;
                    statisticModel$PackageStatisticModel0.groupName = a1.b;
                    statisticModel$PackageStatisticModel0.accessKey = a1.a;
                    statisticModel$PackageStatisticModel0.channel = a1.c;
                    statisticModel$PackageStatisticModel0.ac = a1.n;
                    statisticModel$PackageStatisticModel0.id = a1.p;
                    statisticModel$PackageStatisticModel0.patchId = a1.o;
                    statisticModel$PackageStatisticModel0.downloadRetryTimes = c.a(a1.e);
                    statisticModel$PackageStatisticModel0.downloadUrl = a1.d;
                    statisticModel$PackageStatisticModel0.downloadFailRecords = c.b(a1.e);
                    statisticModel$PackageStatisticModel0.downloadDuration = (long)(a1.g - a1.f);
                    if(a1.j) {
                        if(a1.k) {
                            PackageStatisticModel statisticModel$PackageStatisticModel2 = new PackageStatisticModel();
                            arrayList0.add(statisticModel$PackageStatisticModel2);
                            statisticModel$PackageStatisticModel2.accessKey = a1.a;
                            statisticModel$PackageStatisticModel2.groupName = a1.b;
                            statisticModel$PackageStatisticModel2.statsType = 102;
                            statisticModel$PackageStatisticModel2.patchId = a1.o;
                            statisticModel$PackageStatisticModel2.id = a1.p;
                            statisticModel$PackageStatisticModel2.channel = a1.c;
                            statisticModel$PackageStatisticModel2.activeCheckDuration = (long)(a1.l - a1.g);
                            statisticModel$PackageStatisticModel2.applyDuration = (long)(a1.m - a1.l);
                        }
                        else {
                            PackageStatisticModel statisticModel$PackageStatisticModel3 = new PackageStatisticModel();
                            arrayList0.add(statisticModel$PackageStatisticModel3);
                            statisticModel$PackageStatisticModel3.accessKey = a1.a;
                            statisticModel$PackageStatisticModel3.groupName = a1.b;
                            statisticModel$PackageStatisticModel3.statsType = 103;
                            statisticModel$PackageStatisticModel3.errCode = "501";
                            statisticModel$PackageStatisticModel3.channel = a1.c;
                            statisticModel$PackageStatisticModel3.patchId = a1.o;
                            statisticModel$PackageStatisticModel3.id = a1.p;
                            statisticModel$PackageStatisticModel3.errMsg = a1.s;
                            c.a(a1, arrayList0);
                        }
                        continue;
                    }
                    else {
                        PackageStatisticModel statisticModel$PackageStatisticModel1 = new PackageStatisticModel();
                        arrayList0.add(statisticModel$PackageStatisticModel1);
                        statisticModel$PackageStatisticModel1.statsType = 100;
                        statisticModel$PackageStatisticModel1.channel = a1.c;
                        statisticModel$PackageStatisticModel1.errCode = "403";
                        statisticModel$PackageStatisticModel1.errMsg = a1.r;
                        statisticModel$PackageStatisticModel1.ac = a1.n;
                        statisticModel$PackageStatisticModel1.patchId = a1.o;
                        statisticModel$PackageStatisticModel1.id = a1.p;
                        statisticModel$PackageStatisticModel1.downloadRetryTimes = c.a(a1.e);
                        statisticModel$PackageStatisticModel1.downloadUrl = a1.d;
                        statisticModel$PackageStatisticModel1.downloadFailRecords = c.b(a1.e);
                        goto label_80;
                    }
                    goto label_58;
                }
            }
        label_80:
            c.a(a1, arrayList0);
        }
        Context context0 = b0.a();
        arrayList0.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(context0));
        if(arrayList0.isEmpty()) {
            statisticModel0 = null;
        }
        else {
            Common common0 = new Common(b0.k(), b0.o(), b0.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(context0), e.a(context0), b0.l(), b0.m());
            StatisticModel statisticModel1 = new StatisticModel();
            statisticModel1.common = common0;
            statisticModel1.packages = arrayList0;
            for(Object object1: arrayList0) {
                ((PackageStatisticModel)object1).logId = "0e48c517-e8b7-4a46-ab8b-86e9de86c409";
            }
            statisticModel0 = statisticModel1;
        }
        if(statisticModel0 != null && statisticModel0.packages != null) {
            IStatisticMonitor iStatisticMonitor0 = b0.q();
            if(iStatisticMonitor0 != null) {
                try {
                    for(Object object2: statisticModel0.packages) {
                        Common common1 = statisticModel0.common;
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("params_for_special", "gecko");
                        jSONObject0.put("region", common1.region);
                        jSONObject0.put("err_code", ((PackageStatisticModel)object2).errCode);
                        jSONObject0.put("err_msg", ((PackageStatisticModel)object2).errMsg);
                        jSONObject0.put("sdk_version", common1.sdkVersion);
                        jSONObject0.put("access_key", ((PackageStatisticModel)object2).accessKey);
                        jSONObject0.put("stats_type", ((PackageStatisticModel)object2).statsType);
                        jSONObject0.put("device_id", common1.deviceId);
                        Long long0 = ((PackageStatisticModel)object2).patchId;
                        jSONObject0.put("patch_id", (long0 == null ? 0L : ((long)long0)));
                        jSONObject0.put("group_name", ((PackageStatisticModel)object2).groupName);
                        jSONObject0.put("os", common1.os);
                        jSONObject0.put("app_version", common1.appVersion);
                        jSONObject0.put("device_model", common1.deviceModel);
                        jSONObject0.put("channel", ((PackageStatisticModel)object2).channel);
                        Long long1 = ((PackageStatisticModel)object2).id;
                        jSONObject0.put("id", (long1 == null ? 0L : ((long)long1)));
                        jSONObject0.put("ac", common1.ac);
                        Integer integer0 = ((PackageStatisticModel)object2).downloadRetryTimes;
                        String s = "";
                        jSONObject0.put("download_retry_times", (integer0 == null ? 0 : ((int)integer0)));
                        String s1 = ((PackageStatisticModel)object2).downloadUrl;
                        if(s1 == null) {
                            s1 = "";
                        }
                        jSONObject0.put("download_url", s1);
                        jSONObject0.put("download_duration", ((PackageStatisticModel)object2).downloadDuration);
                        List list0 = ((PackageStatisticModel)object2).downloadFailRecords;
                        if(list0 != null) {
                            s = list0;
                        }
                        jSONObject0.put("download_fail_records", s);
                        jSONObject0.put("log_id", ((PackageStatisticModel)object2).logId);
                        Long long2 = ((PackageStatisticModel)object2).activeCheckDuration;
                        jSONObject0.put("active_check_duration", (long2 == null ? 0L : ((long)long2)));
                        Long long3 = ((PackageStatisticModel)object2).applyDuration;
                        jSONObject0.put("apply_duration", (long3 == null ? 0L : ((long)long3)));
                        iStatisticMonitor0.upload("geckosdk_update_stats", jSONObject0);
                    }
                }
                catch(Throwable throwable0) {
                    GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", throwable0);
                }
            }
            if(b0.c()) {
                try {
                    String s2 = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(statisticModel0);
                    if(TextUtils.isEmpty(s2)) {
                        return;
                    }
                    b.g().execute(new Runnable() {
                        @Override
                        public final void run() {
                            for(int v = 0; v < 3; ++v) {
                                try {
                                    Response response0 = b0.i().doPost("https://" + b0.j() + "/gecko/server/packages/stats", s2);
                                    if(response0.code != 200) {
                                        throw new NetworkErrorException("net work get failed, code: " + response0.code + ", url:" + "https://" + b0.j() + "/gecko/server/packages/stats");
                                    }
                                    if(new JSONObject(response0.body).getInt("status") == 0) {
                                        return;
                                    }
                                }
                                catch(Exception exception0) {
                                    GeckoLogger.w("gecko-debug-tag", "upload statistic:", exception0);
                                }
                            }
                        }
                    });
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a a0, List list0) {
        if(a0.z && a0.A) {
            PackageStatisticModel statisticModel$PackageStatisticModel0 = new PackageStatisticModel();
            list0.add(statisticModel$PackageStatisticModel0);
            statisticModel$PackageStatisticModel0.statsType = 0;
            statisticModel$PackageStatisticModel0.accessKey = a0.a;
            statisticModel$PackageStatisticModel0.groupName = a0.b;
            statisticModel$PackageStatisticModel0.channel = a0.c;
            statisticModel$PackageStatisticModel0.ac = a0.n;
            statisticModel$PackageStatisticModel0.id = a0.p;
            statisticModel$PackageStatisticModel0.downloadRetryTimes = c.a(a0.u);
            statisticModel$PackageStatisticModel0.downloadUrl = a0.t;
            statisticModel$PackageStatisticModel0.downloadFailRecords = c.b(a0.u);
            statisticModel$PackageStatisticModel0.downloadDuration = (long)(a0.w - a0.v);
            if(a0.B) {
                PackageStatisticModel statisticModel$PackageStatisticModel1 = new PackageStatisticModel();
                list0.add(statisticModel$PackageStatisticModel1);
                statisticModel$PackageStatisticModel1.accessKey = a0.a;
                statisticModel$PackageStatisticModel1.groupName = a0.b;
                statisticModel$PackageStatisticModel1.statsType = 2;
                statisticModel$PackageStatisticModel1.id = a0.p;
                statisticModel$PackageStatisticModel1.channel = a0.c;
                statisticModel$PackageStatisticModel1.activeCheckDuration = (long)(a0.x - a0.w);
                statisticModel$PackageStatisticModel1.applyDuration = (long)(a0.y - a0.x);
                return;
            }
            PackageStatisticModel statisticModel$PackageStatisticModel2 = new PackageStatisticModel();
            list0.add(statisticModel$PackageStatisticModel2);
            statisticModel$PackageStatisticModel2.statsType = 3;
            statisticModel$PackageStatisticModel2.accessKey = a0.a;
            statisticModel$PackageStatisticModel2.groupName = a0.b;
            statisticModel$PackageStatisticModel2.errCode = "500";
            statisticModel$PackageStatisticModel2.id = a0.p;
            statisticModel$PackageStatisticModel2.channel = a0.c;
            statisticModel$PackageStatisticModel2.errMsg = a0.D;
            return;
        }
        PackageStatisticModel statisticModel$PackageStatisticModel3 = new PackageStatisticModel();
        list0.add(statisticModel$PackageStatisticModel3);
        statisticModel$PackageStatisticModel3.statsType = 1;
        statisticModel$PackageStatisticModel3.accessKey = a0.a;
        statisticModel$PackageStatisticModel3.groupName = a0.b;
        statisticModel$PackageStatisticModel3.channel = a0.c;
        statisticModel$PackageStatisticModel3.ac = a0.n;
        statisticModel$PackageStatisticModel3.id = a0.p;
        statisticModel$PackageStatisticModel3.downloadRetryTimes = c.a(a0.u);
        statisticModel$PackageStatisticModel3.downloadUrl = a0.t;
        statisticModel$PackageStatisticModel3.downloadFailRecords = c.b(a0.u);
        if(!a0.z) {
            statisticModel$PackageStatisticModel3.errCode = "300";
            if(a0.u != null && !a0.u.isEmpty()) {
                statisticModel$PackageStatisticModel3.errMsg = ((DownloadFailRecords)a0.u.get(0)).reason;
            }
        }
        else if(!a0.A) {
            statisticModel$PackageStatisticModel3.errCode = "450";
            statisticModel$PackageStatisticModel3.errMsg = a0.C;
        }
    }

    private static List b(List list0) {
        return list0 == null || list0.isEmpty() ? null : list0;
    }
}

