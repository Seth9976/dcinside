package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.c;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    public static List a(Context context0) {
        return b.a(context0).a();
    }

    public static void a(Context context0, Map map0, File file0, com.bykv.vk.openvk.preload.geckox.e.a a0) {
        ArrayList arrayList0;
        if(map0 != null && !map0.isEmpty()) {
            try {
                arrayList0 = new ArrayList();
                Iterator iterator0 = map0.entrySet().iterator();
                while(true) {
                label_3:
                    if(!iterator0.hasNext()) {
                        goto label_26;
                    }
                    Object object0 = iterator0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    File file1 = new File(file0, ((String)map$Entry0.getKey()));
                    if(file1.isDirectory()) {
                        com.bykv.vk.openvk.preload.geckox.model.ComponentModel.b componentModel$b0 = (com.bykv.vk.openvk.preload.geckox.model.ComponentModel.b)map$Entry0.getValue();
                        if(componentModel$b0 != null && (componentModel$b0.a != null && !componentModel$b0.a.isEmpty())) {
                            List list0 = componentModel$b0.a;
                            HashSet hashSet0 = new HashSet();
                            for(Object object1: list0) {
                                String s = ((com.bykv.vk.openvk.preload.geckox.model.ComponentModel.a)object1).a;
                                if(!hashSet0.contains(s)) {
                                    hashSet0.add(s);
                                    new File(file1, s);
                                }
                            }
                        }
                    }
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                arrayList0 = null;
                goto label_26;
            }
            goto label_3;
        label_26:
            if(arrayList0 == null) {
                return;
            }
            c.a().execute(new Runnable() {
                @Override
                public final void run() {
                    try {
                        List list0 = arrayList0;
                        if(list0 != null && !list0.isEmpty()) {
                            Iterator iterator0 = list0.iterator();
                            if(!iterator0.hasNext()) {
                                return;
                            }
                            iterator0.next();
                            throw null;
                        }
                    }
                    catch(Exception exception0) {
                        GeckoLogger.w("clean-channel", "", exception0);
                    }
                }
            });
        }
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b b0) {
        if(!b0.c()) {
            return;
        }
        Common common0 = new Common(b0.k(), b0.o(), b0.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(b0.a()), e.a(b0.a()), b0.l(), b0.m());
        StatisticModel statisticModel0 = new StatisticModel();
        statisticModel0.common = common0;
        statisticModel0.packages.addAll(b.a(b0.a()).a());
        if(statisticModel0.packages.isEmpty()) {
            return;
        }
        try {
            String s = "https://" + b0.j() + "/gecko/server/packages/stats";
            Response response0 = b0.i().doPost(s, com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(statisticModel0));
            if(response0.code != 200) {
                throw new NetworkErrorException("net work get failed, code: " + response0.code + ", url:" + s);
            }
            if(new JSONObject(response0.body).getInt("status") != 0) {
                throw new RuntimeException("upload failed");
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        throwable0.printStackTrace();
    }
}

