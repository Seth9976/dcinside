package com.bytedance.adsdk.PjT.Zh.JQp;

import com.bytedance.adsdk.PjT.Zh.Zh.PjT.Au;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.JQp;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.SM;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.cr;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.cz;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.fDm;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.gK;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.ltE;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.qj;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.ub;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.xf;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT.xs;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.ReZ;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Zh {
    private static PjT PjT(PjT pjT0, PjT pjT1, PjT pjT2) {
        PjT pjT3;
        switch(((ReZ)pjT1.PjT())) {
            case 1: {
                pjT3 = new qj();
                break;
            }
            case 2: {
                pjT3 = new gK();
                break;
            }
            case 3: {
                pjT3 = new com.bytedance.adsdk.PjT.Zh.Zh.PjT.PjT();
                break;
            }
            case 4: {
                pjT3 = new xs();
                break;
            }
            case 5: {
                pjT3 = new xf();
                break;
            }
            case 6: {
                pjT3 = new cr();
                break;
            }
            case 7: {
                pjT3 = new fDm();
                break;
            }
            case 8: {
                pjT3 = new cz();
                break;
            }
            case 9: {
                pjT3 = new SM();
                break;
            }
            case 10: {
                pjT3 = new JQp();
                break;
            }
            case 11: {
                pjT3 = new Au();
                break;
            }
            case 12: {
                pjT3 = new com.bytedance.adsdk.PjT.Zh.Zh.PjT.Zh();
                break;
            }
            case 13: {
                pjT3 = new com.bytedance.adsdk.PjT.Zh.Zh.PjT.ReZ();
                break;
            }
            default: {
                throw new UnsupportedOperationException(pjT1.PjT().toString());
            }
        }
        ((ub)pjT3).PjT(pjT0);
        ((ub)pjT3).Zh(pjT2);
        return pjT3;
    }

    public static PjT PjT(List list0, String s, int v) {
        Zh.ReZ(list0, s, v);
        Deque deque0 = Zh.PjT(Zh.Zh(list0, s, v));
        if(deque0.size() != 1) {
            throw new IllegalStateException();
        }
        return (PjT)deque0.getFirst();
    }

    private static Deque PjT(Deque deque0) {
        Deque deque1 = new LinkedList();
        for(Object object0: deque0) {
            PjT pjT0 = (PjT)object0;
            if(!deque1.isEmpty() && ((PjT)deque1.peekLast()).PjT() == ReZ.Zh) {
                deque1.pollLast();
                PjT pjT1 = (PjT)deque1.pollLast();
                if(((PjT)deque1.pollLast()).PjT() != ReZ.PjT) {
                    throw new IllegalStateException();
                }
                PjT pjT2 = (PjT)deque1.pollLast();
                ltE ltE0 = new ltE();
                ltE0.PjT(pjT2);
                ltE0.Zh(pjT1);
                ltE0.ReZ(pjT0);
                deque1.addLast(ltE0);
            }
            else {
                deque1.addLast(pjT0);
            }
        }
        return deque1;
    }

    public static boolean PjT(Object object0) {
        if(object0 == null) {
            return false;
        }
        return !(object0 instanceof Boolean) || ((Boolean)object0).booleanValue() ? !(object0 instanceof Number) || ((Number)object0).floatValue() >= 0.0f : false;
    }

    private static void ReZ(List list0, String s, int v) {
        for(Object object0: list0) {
            if(com.bytedance.adsdk.PjT.Zh.cr.cr.PjT(((PjT)object0).PjT())) {
                throw new IllegalArgumentException(s.substring(0, v));
            }
            if(false) {
                break;
            }
        }
    }

    private static Deque Zh(List list0, String s, int v) {
        Deque deque0 = new LinkedList(list0);
        int v1 = 5;
        while(v1 > 0) {
            LinkedList linkedList0 = new LinkedList();
            for(Object object0: deque0) {
                PjT pjT0 = (PjT)object0;
                if(!linkedList0.isEmpty() && ReZ.PjT(((PjT)linkedList0.peekLast()).PjT()) && ((ReZ)((PjT)linkedList0.peekLast()).PjT()).Zh() == v1) {
                    PjT pjT1 = (PjT)linkedList0.pollLast();
                    PjT pjT2 = (PjT)linkedList0.pollLast();
                    if(ReZ.PjT(pjT2.PjT()) || ReZ.PjT(pjT0.PjT())) {
                        throw new IllegalArgumentException(s.substring(0, v));
                    }
                    linkedList0.addLast(Zh.PjT(pjT2, pjT1, pjT0));
                }
                else {
                    linkedList0.addLast(pjT0);
                }
            }
            --v1;
            deque0 = linkedList0;
        }
        return deque0;
    }
}

