package com.igaworks.ssp;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

public class x0 {
    private Node a;
    private y0 b;
    private w0 c;

    public x0(Node node0) {
        this.a = node0;
    }

    public w0 a() {
        Node node0 = F0.c(this.a, "Creatives");
        if(node0 == null) {
            return null;
        }
        List list0 = F0.d(node0, "Creative");
        if(list0 == null) {
            return null;
        }
        for(int v = 0; v < list0.size(); ++v) {
            Node node1 = F0.c(((Node)list0.get(v)), "CompanionAds");
            if(node1 != null) {
                w0 w00 = new w0(node1);
                this.c = w00;
                return w00;
            }
        }
        return null;
    }

    public List b() {
        try {
            List list0 = F0.d(this.a, "Error");
            List list1 = new ArrayList();
            if(list0 != null) {
                for(Object object0: list0) {
                    String s = F0.a(((Node)object0));
                    if(!TextUtils.isEmpty(s)) {
                        list1.add(s);
                    }
                }
            }
            return list1;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public List c() {
        try {
            List list0 = F0.d(this.a, "Impression");
            List list1 = new ArrayList();
            for(Object object0: list0) {
                String s = F0.a(((Node)object0));
                if(!TextUtils.isEmpty(s)) {
                    list1.add(s);
                }
            }
            return list1;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public y0 d() {
        Node node0 = F0.c(this.a, "Creatives");
        if(node0 == null) {
            return null;
        }
        List list0 = F0.d(node0, "Creative");
        if(list0 == null) {
            return null;
        }
        for(int v = 0; v < list0.size(); ++v) {
            Node node1 = F0.c(((Node)list0.get(v)), "Linear");
            if(node1 != null) {
                y0 y00 = new y0(node1);
                this.b = y00;
                return y00;
            }
        }
        return null;
    }
}

