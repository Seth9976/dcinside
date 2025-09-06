package com.bytedance.sdk.openadsdk.XX;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.Zh.PjT.ReZ;
import com.bytedance.sdk.component.Zh.PjT.SM;
import com.bytedance.sdk.component.Zh.PjT.Zh;
import com.bytedance.sdk.component.Zh.PjT.cz;
import com.bytedance.sdk.component.Zh.PjT.fDm;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xs;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PjT implements INetWork {
    protected qj PjT;
    protected qj Zh;

    public PjT() {
        com.bytedance.sdk.component.Zh.PjT.qj.PjT qj$PjT0 = new com.bytedance.sdk.component.Zh.PjT.qj.PjT();
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        this.PjT = qj$PjT0.PjT(10L, timeUnit0).Zh(10L, timeUnit0).ReZ(10L, timeUnit0).PjT();
        this.Zh = new com.bytedance.sdk.component.Zh.PjT.qj.PjT().PjT(10L, timeUnit0).Zh(30L, timeUnit0).ReZ(30L, timeUnit0).PjT();
    }

    private Map PjT(cz cz0) {
        if(cz0 == null) {
            return null;
        }
        Map map0 = new HashMap();
        for(int v = 0; v < cz0.PjT(); ++v) {
            map0.put(cz0.PjT(v), cz0.Zh(v));
        }
        return map0;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String s) throws Exception {
        xs xs0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT().PjT().Zh(s).Zh();
        qla qla0 = this.PjT.PjT(xs0).Zh();
        Map map0 = this.PjT(qla0.XX());
        return qla0.ReZ() == 200 ? new Response(map0, qla0.cz().Zh(), qla0.ReZ(), qla0.JQp()) : new Response(map0, null, qla0.ReZ(), qla0.JQp());
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String s, String s1) throws Exception {
        fDm fDm0 = fDm.PjT(SM.PjT("application/json; charset=utf-8"), s1);
        xs xs0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT().Zh(s).PjT(fDm0).Zh();
        qla qla0 = this.PjT.PjT(xs0).Zh();
        Map map0 = this.PjT(qla0.XX());
        return qla0.ReZ() == 200 ? new Response(map0, qla0.cz().Zh(), qla0.ReZ(), qla0.JQp()) : new Response(map0, null, qla0.ReZ(), qla0.JQp());
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String s, List list0) throws Exception {
        com.bytedance.sdk.component.Zh.PjT.JQp.PjT jQp$PjT0 = new com.bytedance.sdk.component.Zh.PjT.JQp.PjT();
        if(list0 != null) {
            for(Object object0: list0) {
                jQp$PjT0.PjT(((String)((Pair)object0).first), ((String)((Pair)object0).second));
            }
        }
        xs xs0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT().Zh(s).PjT(jQp$PjT0.PjT()).Zh();
        qla qla0 = this.PjT.PjT(xs0).Zh();
        Map map0 = this.PjT(qla0.XX());
        return qla0.ReZ() == 200 ? new Response(map0, qla0.cz().Zh(), qla0.ReZ(), qla0.JQp()) : new Response(map0, null, qla0.ReZ(), qla0.JQp());
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String s, long v, BufferOutputStream bufferOutputStream0) throws Exception {
        Exception exception1;
        BufferedInputStream bufferedInputStream0;
        int v2;
        qla qla0;
        int v1;
        Closeable closeable0;
        try {
            try {
                closeable0 = null;
                v1 = 0;
                xs xs0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT().PjT().Zh(s).Zh();
                qla0 = this.Zh.PjT(xs0).Zh();
                v2 = qla0.ReZ();
            }
            catch(Exception exception0) {
                bufferedInputStream0 = null;
                exception1 = exception0;
                throw new RuntimeException("downloadFile failed, code: " + v1 + ", url:" + s + ", caused by:" + exception1.getMessage(), exception1);
            }
            try {
                bufferedInputStream0 = null;
                bufferedInputStream0 = new BufferedInputStream(qla0.cz().ReZ());
            }
            catch(Exception exception2) {
                exception1 = exception2;
                v1 = v2;
                throw new RuntimeException("downloadFile failed, code: " + v1 + ", url:" + s + ", caused by:" + exception1.getMessage(), exception1);
            }
        }
        catch(Throwable throwable0) {
            CloseableUtils.close(closeable0);
            throw throwable0;
        }
        try {
            try {
                byte[] arr_b = new byte[0x800];
                while(true) {
                    int v3 = bufferedInputStream0.read(arr_b, 0, 0x800);
                    if(v3 == -1) {
                        goto label_30;
                    }
                    bufferOutputStream0.write(arr_b, 0, v3);
                }
            }
            catch(Exception exception1) {
            }
            v1 = v2;
            throw new RuntimeException("downloadFile failed, code: " + v1 + ", url:" + s + ", caused by:" + exception1.getMessage(), exception1);
        }
        catch(Throwable throwable0) {
            closeable0 = bufferedInputStream0;
        }
        CloseableUtils.close(closeable0);
        throw throwable0;
    label_30:
        CloseableUtils.close(bufferedInputStream0);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(String s) {
        xs xs0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT().PjT().Zh(s).Zh();
        this.PjT.PjT(xs0).PjT(new ReZ() {
            final PjT Zh;

            @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
            public void PjT(Zh zh0, qla qla0) throws IOException {
            }

            @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
            public void PjT(Zh zh0, IOException iOException0) {
            }
        });
    }
}

