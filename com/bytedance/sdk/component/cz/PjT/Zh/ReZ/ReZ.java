package com.bytedance.sdk.component.cz.PjT.Zh.ReZ;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.JQp;
import com.bytedance.sdk.component.cz.PjT.PjT.Zh;
import com.bytedance.sdk.component.cz.PjT.PjT.cr;
import com.bytedance.sdk.component.cz.PjT.Zh.PjT.PjT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReZ extends HandlerThread implements Handler.Callback {
    private volatile long Au;
    private final long DWo;
    private final PriorityBlockingQueue JQp;
    private final int Owx;
    protected cr PjT;
    private final int RD;
    private final Object ReZ;
    private final AtomicInteger SM;
    private final int Sks;
    private volatile long XX;
    private volatile boolean Zh;
    private com.bytedance.sdk.component.cz.PjT.Zh.ReZ cr;
    private volatile int cz;
    private final List fDm;
    private long gK;
    private static int ltE = 200;
    private final long qj;
    private final AtomicInteger qla;
    private static int ub = 10;
    private final AtomicInteger xE;
    private final AtomicInteger xf;
    private volatile Handler xs;

    static {
    }

    public ReZ(PriorityBlockingQueue priorityBlockingQueue0) {
        super("csj_log");
        this.Zh = true;
        this.ReZ = new Object();
        this.XX = 0L;
        this.Au = 0L;
        this.SM = new AtomicInteger(0);
        this.DWo = 5000L;
        this.qj = 5000000000L;
        this.xf = new AtomicInteger(0);
        this.fDm = new ArrayList();
        this.qla = new AtomicInteger(0);
        this.xE = new AtomicInteger(0);
        this.gK = 60000L;
        this.Owx = 1;
        this.RD = 2;
        this.Sks = 3;
        this.JQp = priorityBlockingQueue0;
        this.PjT = new Zh();
        if(!com.bytedance.sdk.component.cz.PjT.Zh.Zh()) {
            long v = Au.XX().xE().qla();
            if(v > 0L) {
                this.gK = v;
            }
        }
    }

    private boolean Au() [...] // 潜在的解密器

    private void DWo() {
        if(this.xs.hasMessages(11)) {
            this.SM();
        }
        else {
            this.JQp(1);
        }
        PjT pjT0 = com.bytedance.sdk.component.cz.PjT.Zh.cr.cr;
        com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.Zh(), 1);
        if(this.cz == 2) {
            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.XX(), 1);
            Object object0 = this.ReZ;
            __monitor_enter(object0);
            try {
                try {
                    this.ReZ.wait(5000L);
                    if(!com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.Zh && !com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.ReZ) {
                        com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.Zd(), 1);
                        this.ReZ(2);
                        goto label_20;
                    }
                    com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.qj(), 1);
                }
                catch(InterruptedException unused_ex) {
                    goto label_20;
                }
                __monitor_exit(object0);
                return;
                try {
                }
                catch(InterruptedException unused_ex) {
                label_20:
                    __monitor_exit(object0);
                    return;
                }
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        }
    }

    private void JQp() {
        while(this.PjT()) {
            try {
                PjT pjT0 = com.bytedance.sdk.component.cz.PjT.Zh.cr.cr;
                com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.Au(), 1);
                com.bytedance.sdk.component.cz.PjT.cr.PjT pjT1 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)this.JQp.poll(this.gK, TimeUnit.MILLISECONDS);
                int v = this.JQp.size();
                if(!(pjT1 instanceof com.bytedance.sdk.component.cz.PjT.cr.Zh)) {
                    if(pjT1 == null) {
                        int v1 = this.SM.incrementAndGet();
                        com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.OMu(), 1);
                        if(this.cr(v1)) {
                            this.cz();
                            return;
                        }
                        if(v1 >= 4) {
                            continue;
                        }
                        this.cz = 1;
                        this.Zh(null);
                    }
                    else {
                        this.PjT(pjT1);
                        this.Zh(pjT1);
                    }
                    continue;
                }
                this.PjT(pjT1, v);
            }
            catch(Throwable unused_ex) {
                com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.ig(), 1);
            }
        }
    }

    private void JQp(int v) {
        if(this.PjT()) {
            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.PjT(), 1);
        }
        else {
            if(this.xs == null) {
                return;
            }
            PjT pjT0 = com.bytedance.sdk.component.cz.PjT.Zh.cr.cr;
            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.ReZ(), 1);
            if(!this.xs.hasMessages(1)) {
                if(v == 1) {
                    com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.cz(), 1);
                }
                else {
                    switch(v) {
                        case 2: {
                            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.cr(), 1);
                            break;
                        }
                        case 3: {
                            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(pjT0.JQp(), 1);
                        }
                    }
                }
                this.xs.sendEmptyMessage(1);
            }
        }
    }

    public static void PjT(int v) {
        ReZ.ub = v;
    }

    private void PjT(int v, List list0, long v1) {
        synchronized(this.ReZ) {
            if(list0 == null || this.xs == null) {
                return;
            }
            com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT(v, list0, v1);
            this.PjT.PjT(v, list0);
            Au.XX().xE();
            if(v == -2) {
            label_26:
                com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.Zh = false;
                com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.ReZ = true;
                if(this.xs.hasMessages(3)) {
                    return;
                }
                if(System.currentTimeMillis() - this.Au < 15000L) {
                    return;
                }
                this.Au = System.currentTimeMillis();
                if(this.xs.hasMessages(2)) {
                    this.xs.removeMessages(2);
                }
                this.PjT(3, 15000L);
                goto label_51;
            label_39:
                com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.Zh = true;
                com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.ReZ = false;
                if(this.xs.hasMessages(2)) {
                    return;
                }
                if(System.currentTimeMillis() - this.XX < 30000L) {
                    return;
                }
                this.XX = System.currentTimeMillis();
                if(this.xs.hasMessages(3)) {
                    this.xs.removeMessages(3);
                }
                this.PjT(2, 30000L);
            }
            else {
                switch(v) {
                    case 0: {
                        goto label_26;
                    }
                    case -1: 
                    case 200: {
                        com.bytedance.sdk.component.cz.PjT.Zh.cr cr0 = com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT;
                        if(cr0.Zh || cr0.ReZ) {
                            cr0.Zh = false;
                            cr0.ReZ = false;
                            if(this.xs.hasMessages(2)) {
                                this.xs.removeMessages(2);
                            }
                            if(this.xs.hasMessages(3)) {
                                this.xs.removeMessages(3);
                            }
                            this.Au = 0L;
                            this.XX = 0L;
                            this.qla.set(0);
                            this.xE.set(0);
                            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.rds(), 1);
                            this.ReZ(2);
                        }
                        break;
                    }
                    case 509: {
                        goto label_39;
                    }
                }
            }
        label_51:
            if(this.cz == 2) {
                this.ReZ.notify();
            }
        }
        this.JQp.size();
    }

    private void PjT(com.bytedance.sdk.component.cz.PjT.Zh.ReZ.Zh zh0, List list0) {
        if(zh0 != null && zh0.PjT) {
            List list1 = com.bytedance.sdk.component.cz.PjT.Zh.PjT();
            if(list0 != null && list1 != null && list1.size() != 0) {
                for(Object object0: list0) {
                    com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)object0;
                    if(pjT0.JQp() == 1) {
                        com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT(pjT0);
                        com.bytedance.sdk.component.cz.PjT.ReZ.PjT.JQp(pjT0);
                        Iterator iterator1 = list1.iterator();
                        while(iterator1.hasNext()) {
                            iterator1.next();
                        }
                    }
                }
            }
        }
    }

    private void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        this.SM.set(0);
        com.bytedance.sdk.component.cz.PjT.Zh.cr cr0 = com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT;
        if(cr0.Zh) {
            this.cz = 5;
        }
        else if(cr0.ReZ) {
            this.cz = 7;
        }
        else {
            this.cz = 4;
        }
        com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.Ld(), 1);
        this.PjT.PjT(pjT0, this.cz);
        com.bytedance.sdk.component.cz.PjT.ReZ.PjT.XX(pjT0);
    }

    private void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, int v) {
        this.SM.set(0);
        if(v == 0) {
            this.cz = ((com.bytedance.sdk.component.cz.PjT.cr.Zh)pjT0).qj();
            if(this.cz != 6) {
                com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.IJ(), 1);
                this.Zh(pjT0);
            }
        }
        else {
            switch(((com.bytedance.sdk.component.cz.PjT.cr.Zh)pjT0).qj()) {
                case 1: {
                    this.cz = 1;
                    this.Zh(pjT0);
                    return;
                }
                case 2: {
                    this.XX();
                    this.cz = 2;
                    this.Zh(pjT0);
                    break;
                }
            }
        }
    }

    private void PjT(String s) {
        if(this.xs.hasMessages(11)) {
            this.xs.removeMessages(11);
        }
        if(this.fDm.size() != 0) {
            ArrayList arrayList0 = new ArrayList(this.fDm);
            this.fDm.clear();
            this.PjT(arrayList0, false, "before_" + s);
            this.DWo();
            arrayList0.size();
        }
    }

    private void PjT(List list0) {
        if(list0.size() != 0) {
            com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT(list0, this.JQp.size());
            if(list0.size() <= 1 && !com.bytedance.sdk.component.cz.PjT.ReZ.PjT.ReZ()) {
                com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)list0.get(0);
                if(pjT0 != null) {
                    if(pjT0.JQp() == 1) {
                        this.PjT(list0, "highPriority");
                        return;
                    }
                    if(pjT0.cr() == 0 && pjT0.JQp() == 2) {
                        if(pjT0.Zh() == 3) {
                            this.PjT(list0, "version_v3");
                            return;
                        }
                        this.Zh(list0);
                        return;
                    }
                    switch(pjT0.cr()) {
                        case 1: {
                            this.PjT(list0, "stats");
                            return;
                        }
                        case 2: {
                            this.PjT(list0, "other");
                            break;
                        }
                        case 3: {
                            this.PjT(list0, "adType_v3");
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
                return;
            }
            this.PjT(list0, "batchRead");
            return;
        }
        this.SM();
    }

    private void PjT(List list0, String s) {
        this.PjT(s);
        this.PjT(list0, false, s);
        this.DWo();
    }

    private void PjT(List list0, boolean z, long v) {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 != null) {
            Executor executor0 = jQp0.JQp();
            if(((com.bytedance.sdk.component.cz.PjT.cr.PjT)list0.get(0)).JQp() == 1) {
                executor0 = jQp0.cr();
            }
            if(executor0 == null) {
                return;
            }
            this.xf.incrementAndGet();
            executor0.execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("csj_log_upload") {
                final ReZ cr;

                @Override
                public void run() {
                    int v = ReZ.this.cz;
                    ReZ.this.PjT(list0, z, v, v);
                }
            });
        }
    }

    private void PjT(List list0, boolean z, long v, int v1) {
        com.bytedance.sdk.component.cz.PjT.Zh.ReZ.Zh zh0;
        try {
            com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)list0.get(0);
            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.fA(), 1);
            if(pjT0.cr() == 0) {
                zh0 = Au.JQp().PjT(list0);
                this.PjT(zh0, list0);
                if(zh0 != null) {
                    com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT(list0, zh0.cr);
                }
            }
            else {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: list0) {
                        jSONArray0.put(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0).XX());
                    }
                    jSONObject0.put("stats_list", jSONArray0);
                }
                catch(Exception unused_ex) {
                }
                zh0 = Au.JQp().PjT(jSONObject0);
            }
            this.xf.decrementAndGet();
            this.PjT(z, zh0, list0, v);
        }
        catch(Throwable unused_ex) {
            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.ig(), 1);
            this.xf.decrementAndGet();
        }
    }

    private void PjT(List list0, boolean z, String s) {
        long v = System.currentTimeMillis();
        com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT(list0, this.cz, s);
        com.bytedance.sdk.component.cz.PjT.Zh.ReZ reZ0 = Au.XX().Au();
        this.cr = reZ0;
        if(reZ0 != null) {
            this.Zh(list0, z, v);
            return;
        }
        this.PjT(list0, z, v);
    }

    private void PjT(boolean z, com.bytedance.sdk.component.cz.PjT.Zh.ReZ.Zh zh0, List list0, long v) {
        if(!z && zh0 != null) {
            int v1 = zh0.Zh;
            int v2 = -2;
            if(zh0.JQp) {
                v1 = -1;
            }
            else if(v1 < 0) {
                v1 = -2;
            }
            if(v1 == 510 || v1 == 0x1FF) {
                v1 = -2;
            }
            if(zh0.PjT || (v1 < 500 || v1 >= 509) && v1 <= 0x201) {
                v2 = v1;
            }
            if(list0 != null) {
                list0.size();
                this.xf.get();
            }
            this.PjT(v2, list0, v);
        }
    }

    public void PjT(int v, long v1) {
        if(this.xs == null) {
            return;
        }
        Message message0 = Message.obtain();
        message0.what = v;
        if(v == 2) {
            int v2 = this.qla.incrementAndGet();
            this.xs.sendMessageDelayed(message0, ((long)((v2 - 1) % 4 + 1)) * v1);
            return;
        }
        if(v == 3) {
            int v3 = this.xE.incrementAndGet();
            this.xs.sendMessageDelayed(message0, ((long)((v3 - 1) % 4 + 1)) * v1);
        }
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, boolean z) {
        if(pjT0 == null) {
            return;
        }
        pjT0.cr();
        if(z) {
            if(this.xs != null) {
                ArrayList arrayList0 = new ArrayList(1);
                arrayList0.add(pjT0);
                this.PjT(arrayList0, true, "ignore_result_dispatch");
            }
            return;
        }
        this.JQp.add(pjT0);
        this.JQp(2);
    }

    public void PjT(boolean z) {
        this.Zh = z;
    }

    public boolean PjT() {
        return this.Zh;
    }

    public boolean PjT(int v, boolean z) {
        JQp jQp0 = Au.XX().xE();
        return jQp0 == null || !jQp0.PjT(Au.XX().cz()) ? false : this.PjT.PjT(v, z);
    }

    private void ReZ() {
        this.cr();
        com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.qZS(), 1);
        this.ReZ(1);
    }

    public void ReZ(int v) {
        try {
            if(v == 6 || this.PjT(v, com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.Zh)) {
                com.bytedance.sdk.component.cz.PjT.cr.Zh zh0 = new com.bytedance.sdk.component.cz.PjT.cr.Zh();
                zh0.Zh(v);
                this.JQp.add(zh0);
                this.JQp(3);
            }
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    private void SM() {
        try {
            if(this.JQp.size() == 0 && this.xs.hasMessages(11) && this.PjT()) {
                this.PjT(false);
            }
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
    }

    private void XX() {
        if(this.JQp.size() >= 100) {
            for(int v = 0; v < 100; ++v) {
                com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)this.JQp.poll();
                if(!(pjT0 instanceof com.bytedance.sdk.component.cz.PjT.cr.Zh) && pjT0 != null) {
                    this.PjT(pjT0);
                }
            }
        }
    }

    private void Zh() {
        long v = Au.XX().ub();
        if(v <= 0L) {
            return;
        }
        this.PjT.PjT(0x7FFFFFFF, v);
    }

    public static void Zh(int v) {
        ReZ.ltE = v;
    }

    private void Zh(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        int v = 0;
        if(com.bytedance.sdk.component.cz.PjT.ReZ.PjT.Zh() && Au.XX().PjT()) {
            return;
        }
        do {
            boolean z = this.PjT(this.cz, com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.Zh);
            com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT(z, this.cz, pjT0);
            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.xs(), 1);
            if(z) {
                List list0 = this.PjT.PjT(this.cz, -1, null);
                if(list0 == null) {
                    this.SM();
                }
                else {
                    list0.size();
                    this.PjT(list0);
                }
            }
            else {
                this.SM();
            }
            ++v;
        }
        while(z && v <= 6);
    }

    private void Zh(List list0) {
        this.fDm.addAll(list0);
        this.fDm.size();
        JQp jQp0 = Au.XX().xE();
        if(jQp0 != null && jQp0.xf() != null) {
            ReZ.ub = jQp0.xf().Zh();
        }
        if(this.fDm.size() >= ReZ.ub) {
            if(this.xs.hasMessages(11)) {
                this.xs.removeMessages(11);
            }
            ArrayList arrayList0 = new ArrayList(this.fDm);
            this.fDm.clear();
            this.PjT(arrayList0, false, "max_size_dispatch");
            this.DWo();
            return;
        }
        if(this.JQp.size() == 0) {
            this.PjT(false);
            if(this.xs.hasMessages(11)) {
                this.xs.removeMessages(11);
            }
            if(this.xs.hasMessages(1)) {
                this.xs.removeMessages(1);
            }
            long v = jQp0 == null || jQp0.xf() == null ? ((long)ReZ.ltE) : jQp0.xf().PjT();
            this.xs.sendEmptyMessageDelayed(11, v);
            return;
        }
        this.fDm.size();
    }

    private void Zh(List list0, boolean z, long v) {
        this.xf.incrementAndGet();
        com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.fA(), 1);
        try {
            HashMap hashMap0 = new HashMap();
            for(Object object0: list0) {
                com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)object0;
                int v1 = pjT0 == null ? 0 : pjT0.DWo();
                if(hashMap0.get(v1) == null) {
                    hashMap0.put(v1, new ArrayList());
                }
                ((List)hashMap0.get(v1)).add(pjT0);
            }
            for(Object object1: hashMap0.keySet()) {
                Integer integer0 = (Integer)object1;
                if(((int)integer0) != 0 && Au.XX().ReZ() != null && Au.XX().ReZ().get(integer0) != null) {
                    ((com.bytedance.sdk.component.cz.PjT.Zh.ReZ)Au.XX().ReZ().get(integer0)).PjT(list0, new com.bytedance.sdk.component.cz.PjT.Zh.Zh() {
                        final ReZ ReZ;

                        @Override  // com.bytedance.sdk.component.cz.PjT.Zh.Zh
                        public void PjT(List list0) {
                            try {
                                ReZ.this.xf.decrementAndGet();
                                if(list0 != null && list0.size() != 0) {
                                    int v = list0.size();
                                    for(int v1 = 0; v1 < v; ++v1) {
                                        com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT)list0.get(v1);
                                        if(pjT0 != null) {
                                            ReZ.this.PjT(z, pjT0.PjT(), pjT0.Zh(), v);
                                        }
                                    }
                                }
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                    });
                }
                else {
                    this.cr.PjT(list0, new com.bytedance.sdk.component.cz.PjT.Zh.Zh() {
                        final ReZ ReZ;

                        @Override  // com.bytedance.sdk.component.cz.PjT.Zh.Zh
                        public void PjT(List list0) {
                            try {
                                ReZ.this.xf.decrementAndGet();
                                if(list0 != null && list0.size() != 0) {
                                    int v = list0.size();
                                    for(int v1 = 0; v1 < v; ++v1) {
                                        com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT)list0.get(v1);
                                        if(pjT0 != null) {
                                            ReZ.this.PjT(z, pjT0.PjT(), pjT0.Zh(), v);
                                        }
                                    }
                                }
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                    });
                }
            }
        }
        catch(Exception unused_ex) {
            com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.ig(), 1);
            this.xf.decrementAndGet();
        }
    }

    private void cr() {
        if(!this.isAlive()) {
            com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.cr();
            return;
        }
        if(!this.PjT()) {
            this.ReZ(6);
        }
    }

    // 去混淆评级： 低(20)
    private boolean cr(int v) {
        return v >= 4 && this.xf.get() == 0 && (!com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.Zh && !com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.ReZ);
    }

    private void cz() {
        com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.Sks(), 1);
        this.PjT(false);
        com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.ReZ();
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        try {
            switch(message0.what) {
                case 1: {
                    com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.SM(), 1);
                    this.Zh();
                    this.PjT(true);
                    this.JQp();
                    return true;
                }
                case 2: 
                case 3: {
                    this.ReZ();
                    return true;
                }
                case 11: {
                    ArrayList arrayList0 = new ArrayList(this.fDm);
                    this.fDm.clear();
                    this.PjT(arrayList0, false, "timeout_dispatch");
                    this.DWo();
                    return true;
                }
                default: {
                    return true;
                }
            }
        }
        catch(Throwable unused_ex) {
            return true;
        }
    }

    @Override  // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.xs = new Handler(this.getLooper(), this);
        com.bytedance.sdk.component.cz.PjT.Zh.cr.PjT.PjT(this.xs);
        this.xs.sendEmptyMessage(1);
    }
}

