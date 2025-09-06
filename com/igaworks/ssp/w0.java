package com.igaworks.ssp;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;

public class w0 {
    private Node a;

    public w0(Node node0) {
        this.a = node0;
    }

    public G a(Context context0) {
        G g0 = null;
        try {
            List list0 = F0.d(this.a, "Companion");
            for(int v = 0; true; ++v) {
                if(v >= list0.size()) {
                    return g0;
                }
                Node node0 = (Node)list0.get(v);
                if(node0 != null) {
                    G g1 = new G();
                    if(F0.b(node0, "width") != null) {
                        g1.f(((int)F0.b(node0, "width")));
                    }
                    if(F0.b(node0, "height") != null) {
                        g1.e(((int)F0.b(node0, "height")));
                    }
                    if(F0.b(node0, "assetWidth") != null) {
                        g1.b(((int)F0.b(node0, "assetWidth")));
                    }
                    if(F0.b(node0, "assetHeight") != null) {
                        g1.a(((int)F0.b(node0, "assetHeight")));
                    }
                    if(F0.b(node0, "expandedWidth") != null) {
                        g1.d(((int)F0.b(node0, "expandedWidth")));
                    }
                    if(F0.b(node0, "expandedHeight") != null) {
                        g1.c(((int)F0.b(node0, "expandedHeight")));
                    }
                    g1.c(F0.a(F0.c(node0, "StaticResource")));
                    g1.b(F0.a(F0.c(node0, "HTMLResource")));
                    g1.d(F0.a(F0.c(node0, "iFrameResource")));
                    g1.a(F0.a(F0.c(node0, "CompanionClickThrough")));
                    ArrayList arrayList0 = new ArrayList();
                    List list1 = F0.d(node0, "CompanionClickTracking");
                    if(list1 != null) {
                        for(Object object0: list1) {
                            arrayList0.add(F0.a(((Node)object0)));
                        }
                        g1.a(arrayList0);
                    }
                    if(g0 == null || ((double)A0.a(J.c(context0), J.b(context0), g1.f(), g1.c())) <= ((double)A0.a(J.c(context0), J.b(context0), g0.f(), g0.c()))) {
                        g0 = g1;
                    }
                }
            }
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        return g0;
    }

    public List a(String s) {
        List list0 = new ArrayList();
        Node node0 = F0.c(this.a, "TrackingEvents");
        if(node0 != null) {
            List list1 = F0.b(node0, "Tracking", "event", Collections.singletonList(s));
            if(list1 != null) {
                for(Object object0: list1) {
                    list0.add(F0.a(((Node)object0)));
                }
                return list0;
            }
        }
        return null;
    }
}

