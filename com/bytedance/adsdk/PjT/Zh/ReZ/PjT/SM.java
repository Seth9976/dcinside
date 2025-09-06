package com.bytedance.adsdk.PjT.Zh.ReZ.PjT;

import com.bytedance.adsdk.PjT.Zh.ReZ.PjT;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.DWo;
import com.bytedance.adsdk.PjT.Zh.cr.Zh;
import com.bytedance.adsdk.PjT.Zh.cr.cr;
import java.util.Deque;
import java.util.LinkedList;

public class SM extends cz {
    @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cz
    public int PjT(String s, int v, Deque deque0, PjT pjT0) {
        com.bytedance.adsdk.PjT.Zh.Zh.PjT pjT1;
        if(41 != this.PjT(v, s)) {
            return pjT0.PjT(s, v, deque0);
        }
        LinkedList linkedList0 = new LinkedList();
        while(true) {
            pjT1 = (com.bytedance.adsdk.PjT.Zh.Zh.PjT)deque0.pollFirst();
            if(pjT1 == null || pjT1.PjT() == Zh.PjT || pjT1.PjT() == cr.PjT) {
                break;
            }
            linkedList0.addFirst(pjT1);
        }
        if(pjT1 == null) {
            throw new IllegalArgumentException(s.substring(0, v));
        }
        if(pjT1.PjT() == Zh.PjT) {
            LinkedList linkedList1 = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for(Object object0: linkedList0) {
                com.bytedance.adsdk.PjT.Zh.Zh.PjT pjT2 = (com.bytedance.adsdk.PjT.Zh.Zh.PjT)object0;
                if(pjT2.PjT() == cr.JQp) {
                    linkedList1.add(com.bytedance.adsdk.PjT.Zh.JQp.Zh.PjT(linkedList2, s, v));
                    linkedList2.clear();
                }
                else {
                    linkedList2.addLast(pjT2);
                }
            }
            if(!linkedList2.isEmpty()) {
                linkedList1.add(com.bytedance.adsdk.PjT.Zh.JQp.Zh.PjT(linkedList2, s, v));
            }
            ((DWo)pjT1).PjT(((com.bytedance.adsdk.PjT.Zh.Zh.PjT[])linkedList1.toArray(new com.bytedance.adsdk.PjT.Zh.Zh.PjT[linkedList1.size()])));
            deque0.push(((DWo)pjT1));
            return v + 1;
        }
        deque0.push(com.bytedance.adsdk.PjT.Zh.JQp.Zh.PjT(linkedList0, s, v));
        return v + 1;
    }
}

