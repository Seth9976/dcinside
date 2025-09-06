package com.bytedance.sdk.component.cz.PjT.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Zh extends PjT {
    private final cr PjT;
    private final Queue ReZ;
    private final ReZ Zh;

    public Zh() {
        ConcurrentLinkedQueue concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
        this.ReZ = concurrentLinkedQueue0;
        this.PjT = new cz(concurrentLinkedQueue0);
        this.Zh = new ReZ();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.cr
    public List PjT(int v, int v1, List list0) {
        synchronized(this) {
            List list1 = this.PjT.PjT(v, v1, list0);
            if(list1 == null || list1.size() == 0) {
                ArrayList arrayList1 = new ArrayList(this.ReZ);
                if(list0 != null && !list0.isEmpty()) {
                    arrayList1.addAll(list0);
                }
                List list3 = this.Zh.PjT(v, v1, arrayList1);
                if(list3 != null && list3.size() != 0) {
                    HashMap hashMap1 = new HashMap();
                    for(Object object5: list3) {
                        hashMap1.put(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object5).ReZ(), ((com.bytedance.sdk.component.cz.PjT.cr.PjT)object5));
                    }
                    if(arrayList1.size() != 0) {
                        for(Object object6: arrayList1) {
                            String s = (String)object6;
                            if(hashMap1.get(s) != null) {
                                hashMap1.remove(s);
                            }
                        }
                    }
                    list3.clear();
                    for(Object object7: hashMap1.keySet()) {
                        list3.add(hashMap1.get(((String)object7)));
                    }
                }
                list1 = list3;
            }
            else if(v == 1 || v == 2) {
                com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)list1.get(0);
                List list2 = this.Zh.Zh(pjT0, list1.size());
                if(list2 != null && list2.size() != 0) {
                    HashMap hashMap0 = new HashMap();
                    for(Object object0: list2) {
                        hashMap0.put(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0).ReZ(), ((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0));
                    }
                    ArrayList arrayList0 = new ArrayList(this.ReZ);
                    Iterator iterator1 = list2.iterator();
                label_16:
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        com.bytedance.sdk.component.cz.PjT.cr.PjT pjT1 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)object1;
                        Iterator iterator2 = arrayList0.iterator();
                        do {
                            if(!iterator2.hasNext()) {
                                continue label_16;
                            }
                            Object object2 = iterator2.next();
                        }
                        while(!TextUtils.equals(pjT1.ReZ(), ((String)object2)));
                        hashMap0.remove(pjT1.ReZ());
                    }
                    for(Object object3: list1) {
                        hashMap0.put(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object3).ReZ(), ((com.bytedance.sdk.component.cz.PjT.cr.PjT)object3));
                    }
                    list1.clear();
                    for(Object object4: hashMap0.keySet()) {
                        list1.add(hashMap0.get(((String)object4)));
                    }
                    list2.clear();
                }
            }
            if(list1 != null && !list1.isEmpty()) {
                for(Object object8: list1) {
                    String s1 = ((com.bytedance.sdk.component.cz.PjT.cr.PjT)object8).ReZ();
                    this.ReZ.offer(s1);
                }
                return list1;
            }
            return new ArrayList();
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.cr
    public void PjT(int v, long v1) {
        this.Zh.PjT(v, v1);
        this.PjT.PjT(v, v1);
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.cr
    public void PjT(int v, List list0) {
        synchronized(this) {
            for(Object object0: list0) {
                String s = ((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0).ReZ();
                this.ReZ.remove(s);
            }
            cr cr0 = this.PjT;
            if(cr0 != null) {
                cr0.PjT(v, list0);
            }
            ReZ reZ0 = this.Zh;
            if(reZ0 != null) {
                reZ0.PjT(v, list0);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.cr
    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, int v) {
        synchronized(this) {
            if(v != 5 && Au.XX().xE().PjT(Au.XX().cz())) {
                cr cr0 = this.PjT;
                if(cr0 != null && pjT0 != null) {
                    cr0.PjT(pjT0, v);
                }
            }
            ReZ reZ0 = this.Zh;
            if(reZ0 != null && pjT0 != null) {
                reZ0.PjT(pjT0, v);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.cr
    public boolean PjT(int v, boolean z) {
        synchronized(this) {
            if(this.PjT.PjT(v, z)) {
                com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.ZX(), 1);
                return true;
            }
            if((v == 1 || v == 2) && this.Zh.PjT(v, z)) {
                com.bytedance.sdk.component.cz.PjT.ReZ.Zh.PjT(com.bytedance.sdk.component.cz.PjT.Zh.cr.cr.Jo(), 1);
                return true;
            }
            return false;
        }
    }
}

