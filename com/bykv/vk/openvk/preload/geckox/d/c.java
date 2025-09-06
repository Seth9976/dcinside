package com.bykv.vk.openvk.preload.geckox.d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.Group;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.LocalChannel;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.model.Response;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.io.File;
import java.io.FileFilter;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class c extends d {
    public static final class a extends RuntimeException {
        a(String s) {
            super(s);
        }
    }

    public static final class b extends RuntimeException {
        b(String s, Throwable throwable0) {
            super(s, throwable0);
        }
    }

    public static final class com.bykv.vk.openvk.preload.geckox.d.c.c extends RuntimeException {
        com.bykv.vk.openvk.preload.geckox.d.c.c(String s, Throwable throwable0) {
            super(s, throwable0);
        }
    }

    private com.bykv.vk.openvk.preload.geckox.b d;
    private Map e;
    private Map f;
    private com.bykv.vk.openvk.preload.geckox.e.a g;
    private String h;
    private com.bykv.vk.openvk.preload.geckox.buffer.a.a i;

    public c() {
        this.i = new com.bykv.vk.openvk.preload.geckox.buffer.a.a();
    }

    private static long a(List list0, String s) {
        for(Object object0: list0) {
            Pair pair0 = (Pair)object0;
            if(((String)pair0.first).equals(s)) {
                return (long)(((Long)pair0.second));
            }
            if(false) {
                break;
            }
        }
        return 0L;
    }

    private Object a(com.bykv.vk.openvk.preload.b.b b0, Map map0) throws Throwable {
        List list0;
        Object object3;
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start get server channel version[v3]... local channel version:", map0});
        Map map1 = this.a(map0);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
        for(Object object0: map1.entrySet()) {
            Iterator iterator1 = ((List)((Map.Entry)object0).getValue()).iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                UpdatePackage updatePackage0 = (UpdatePackage)object1;
                long v = updatePackage0.getLocalVersion();
                long v1 = updatePackage0.getVersion();
                if(v1 < v) {
                    GeckoLogger.d("gecko-debug-tag", new Object[]{updatePackage0.getChannel(), "rollback：", v, "->", v1});
                    File[] arr_file = new File(this.d.n(), updatePackage0.getAccessKey() + "/" + updatePackage0.getChannel()).listFiles(new FileFilter() {
                        @Override
                        public final boolean accept(File file0) {
                            return file0.isDirectory();
                        }
                    });
                    if(arr_file != null && arr_file.length != 0) {
                        int v2 = arr_file.length;
                        int v3 = 0;
                        while(v3 < v2) {
                            File file0 = arr_file[v3];
                            try {
                                int v4 = Long.compare(Long.parseLong(file0.getName()), v1);
                                if(v4 > 0) {
                                    goto label_22;
                                }
                                else {
                                    goto label_26;
                                }
                            }
                            catch(Exception unused_ex) {
                            }
                            goto label_28;
                        label_22:
                            File file1 = new File(file0.getParent(), file0.getName() + "--pending-delete");
                            file0.renameTo(file1);
                            com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() {
                                @Override
                                public final void run() {
                                    com.bykv.vk.openvk.preload.geckox.utils.b.a(this.a);
                                }
                            });
                            goto label_28;
                        label_26:
                            if(v4 == 0) {
                                iterator1.remove();
                            }
                        label_28:
                            ++v3;
                        }
                    }
                }
            }
            if(false) {
                break;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: map1.entrySet()) {
            arrayList0.addAll(((Collection)((Map.Entry)object2).getValue()));
        }
        try {
            object3 = null;
            list0 = null;
            list0 = this.c(arrayList0);
            object3 = b0.a(arrayList0);
        }
        catch(Throwable throwable0) {
            GeckoLogger.e("gecko-debug-tag", "filterChannel:", throwable0);
        }
        finally {
            c.b(list0);
            GeckoLogger.d("gecko-debug-tag", new Object[]{"all channel update finished"});
        }
        this.a(arrayList0);
        return object3;
    }

    private Map a(Map map0) throws Exception {
        Response response1;
        String s5;
        String s = this.b(map0);
        String s1 = "https://" + this.d.j() + "/gecko/server/v3/package";
        try {
            String s2 = "";
            com.bykv.vk.openvk.preload.geckox.buffer.a.a a0 = this.i;
            a0.f = e.a(this.d.a());
            com.bykv.vk.openvk.preload.geckox.net.Response response0 = this.d.i().doPost(s1, s);
            com.bykv.vk.openvk.preload.geckox.buffer.a.a a1 = this.i;
            a1.g = response0.code;
            a1.d = response0.msg;
            Map map1 = response0.headers;
            if(map1 != null && !map1.isEmpty()) {
                String s3 = (String)map1.get("x-tt-logid");
                if(TextUtils.isEmpty(s3)) {
                    s3 = (String)map1.get("X-Tt-Logid");
                    if(TextUtils.isEmpty(s3)) {
                        String s4 = (String)map1.get("X-TT-LOGID");
                        if(!TextUtils.isEmpty(s4)) {
                            s2 = s4;
                        }
                    }
                    else {
                        s2 = s3;
                    }
                }
                else {
                    s2 = s3;
                }
            }
            a1.e = s2;
            if(response0.code != 200) {
                throw new NetworkErrorException("net work get failed, code: " + response0.code + ", url:" + s1);
            }
            s5 = response0.body;
            GeckoLogger.d("gecko-debug-tag", new Object[]{"response:", s5});
            goto label_31;
        }
        catch(Exception exception0) {
        }
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
        throw new com.bykv.vk.openvk.preload.geckox.d.c.c("request failed：url:" + s1 + ", caused by:" + exception0.getMessage(), exception0);
        try {
        label_31:
            Type type0 = new com.bykv.vk.openvk.preload.geckox.d.c.3().b();
            response1 = (Response)(s5 == null ? null : com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(new StringReader(s5), type0));
            int v = response1.status;
        }
        catch(Throwable throwable0) {
            this.i.d = "json parse failed：" + throwable0.getMessage();
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
            throw new b("json parse failed：" + s5 + " caused by:" + throwable0.getMessage(), throwable0);
        }
        if(v == 0) {
            if(response1.data != null) {
                com.bykv.vk.openvk.preload.geckox.a.a.a(this.d.a(), ((ComponentModel)response1.data).getUniversalStrategies(), this.d.n(), this.g);
                Map map2 = ((ComponentModel)response1.data).getPackages();
                if(map2 != null && !map2.isEmpty()) {
                    for(Object object0: this.d.e()) {
                        String s6 = (String)object0;
                        List list0 = (List)map2.get(s6);
                        if(list0 != null && !list0.isEmpty()) {
                            for(Object object1: list0) {
                                ((UpdatePackage)object1).setAccessKey(s6);
                                ((UpdatePackage)object1).setLocalVersion(c.a(((List)map0.get(s6)), ((UpdatePackage)object1).getChannel()));
                            }
                        }
                    }
                    return map2;
                }
                com.bykv.vk.openvk.preload.geckox.a.a.a(this.d);
                return new HashMap();
            }
            this.i.d = "check update error：response.data==null";
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
            throw new a("check update error：response.data==null");
        }
        if(v == 2000) {
            com.bykv.vk.openvk.preload.geckox.a.a.a(this.d);
            return new HashMap();
        }
        String s7 = "check update error，unknow status code，response.status：" + response1.status;
        this.i.d = s7;
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
        throw new a(s7);

        final class com.bykv.vk.openvk.preload.geckox.d.c.3 extends com.bykv.vk.openvk.preload.a.c.a {
        }

    }

    private void a(List list0) {
        if(list0.isEmpty()) {
            return;
        }
        for(Object object0: list0) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.d.n(), ((UpdatePackage)object0).getAccessKey()), ((UpdatePackage)object0).getChannel()).getAbsolutePath());
        }
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(com.bykv.vk.openvk.preload.b.b b0, Object object0) throws Throwable {
        return this.a(b0, ((Map)object0));
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object[] arr_object) {
        super.a(arr_object);
        this.d = (com.bykv.vk.openvk.preload.geckox.b)arr_object[0];
        this.e = (Map)arr_object[1];
        this.f = (Map)arr_object[2];
        this.g = (com.bykv.vk.openvk.preload.geckox.e.a)arr_object[3];
        this.h = (String)arr_object[4];
    }

    private String b(Map map0) {
        CheckRequestBodyModel checkRequestBodyModel0 = new CheckRequestBodyModel();
        Context context0 = this.d.a();
        checkRequestBodyModel0.setCommon(new Common(this.d.k(), this.d.o(), this.d.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(context0), e.a(context0), this.d.l(), this.d.m()));
        HashMap hashMap0 = new HashMap();
        for(Object object0: map0.entrySet()) {
            HashMap hashMap1 = new HashMap();
            for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                LocalChannel checkRequestBodyModel$LocalChannel0 = new LocalChannel();
                checkRequestBodyModel$LocalChannel0.localVersion = (Long)((Pair)object1).second;
                hashMap1.put(((Pair)object1).first, checkRequestBodyModel$LocalChannel0);
            }
            hashMap0.put(((Map.Entry)object0).getKey(), hashMap1);
        }
        try {
            com.bykv.vk.openvk.preload.a.d d0 = com.bykv.vk.openvk.preload.geckox.c.b.a().b();
            com.bykv.vk.openvk.preload.geckox.buffer.a.a a0 = this.i;
            a0.a = d0.a(hashMap0);
            checkRequestBodyModel0.setLocal(hashMap0);
            HashMap hashMap2 = new HashMap();
            for(Object object2: this.d.e()) {
                String s = (String)object2;
                Group checkRequestBodyModel$Group0 = new Group();
                checkRequestBodyModel$Group0.groupName = this.h;
                if(this.f != null && !this.f.isEmpty()) {
                    List list0 = (List)this.f.get(s);
                    if(list0 != null && !list0.isEmpty()) {
                        ArrayList arrayList0 = new ArrayList();
                        checkRequestBodyModel$Group0.targetChannels = arrayList0;
                        arrayList0.addAll(list0);
                    }
                }
                hashMap2.put(s, checkRequestBodyModel$Group0);
            }
            com.bykv.vk.openvk.preload.geckox.buffer.a.a a1 = this.i;
            a1.b = d0.a(hashMap2);
            checkRequestBodyModel0.setDeployments(hashMap2);
            Map map1 = this.e;
            if(map1 != null) {
                com.bykv.vk.openvk.preload.geckox.buffer.a.a a2 = this.i;
                a2.c = d0.a(map1);
                checkRequestBodyModel0.setCustom(this.e);
            }
            return d0.a(checkRequestBodyModel0);
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    private static void b(List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            Pair pair0 = (Pair)object0;
            try {
                ((com.bykv.vk.openvk.preload.geckox.g.a)pair0.second).a();
            }
            catch(Exception exception0) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", exception0);
            }
        }
    }

    private List c(List list0) {
        if(list0.isEmpty()) {
            return Collections.emptyList();
        }
        List list1 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            UpdatePackage updatePackage0 = (UpdatePackage)object0;
            try {
                File file0 = new File(new File(this.d.n(), updatePackage0.getAccessKey()), updatePackage0.getChannel());
                if(file0.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(file0);
                }
                if(!file0.mkdirs() && !file0.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", new Object[]{"can not create channel dir：", file0.getAbsolutePath()});
                    throw new RuntimeException("can not create channel dir:" + file0.getAbsolutePath());
                }
                com.bykv.vk.openvk.preload.geckox.g.a a0 = com.bykv.vk.openvk.preload.geckox.g.a.a((file0.getAbsolutePath() + "/" + "update.lock"));
                if(a0 == null) {
                    continue;
                }
                list1.add(new Pair(updatePackage0.getChannel(), a0));
                arrayList0.add(updatePackage0);
                continue;
            }
            catch(Exception exception0) {
            }
            GeckoLogger.e("gecko-debug-tag", "filterChannel:", exception0);
        }
        list0.clear();
        list0.addAll(arrayList0);
        return list1;
    }
}

