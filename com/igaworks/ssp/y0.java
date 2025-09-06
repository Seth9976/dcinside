package com.igaworks.ssp;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;

public class y0 {
    private Node a;

    public y0(Node node0) {
        this.a = node0;
    }

    private List a() {
        try {
            List list0 = new ArrayList();
            Node node0 = F0.c(this.a, "TrackingEvents");
            if(node0 != null) {
                List list1 = F0.b(node0, "Tracking", "event", Collections.singletonList("progress"));
                if(list1 != null) {
                    for(Object object0: list1) {
                        Node node1 = (Node)object0;
                        String s = F0.a(node1, "offset");
                        if(s != null) {
                            String s1 = s.trim();
                            if(A0.c(s1)) {
                                list0.add(new v0(A0.e(s1), F0.a(node1)));
                            }
                        }
                    }
                    return list0;
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }

    private List a(String s) {
        try {
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
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }

    private void a(List list0, List list1, float f) {
        if(list1 != null) {
            try {
                for(Object object0: list1) {
                    z0 z00 = new z0(f, ((String)object0));
                    if(list0 != null) {
                        list0.add(z00);
                    }
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    private void a(List list0, List list1, long v) {
        if(list1 != null) {
            try {
                for(Object object0: list1) {
                    list0.add(new v0(v, ((String)object0)));
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    public B0 a(B0 b00) {
        try {
            ArrayList arrayList0 = new ArrayList();
            this.a(arrayList0, this.a("firstQuartile"), 0.25f);
            this.a(arrayList0, this.a("midpoint"), 0.5f);
            this.a(arrayList0, this.a("thirdQuartile"), 0.75f);
            arrayList0.addAll(this.d());
            b00.j(arrayList0);
            ArrayList arrayList1 = new ArrayList();
            this.a(arrayList1, this.a("creativeView"), 0L);
            this.a(arrayList1, this.a("start"), 0L);
            arrayList1.addAll(this.a());
            b00.a(arrayList1);
            b00.i(this.a("pause"));
            b00.k(this.a("resume"));
            b00.f(this.a("complete"));
            b00.c(this.a("close"));
            b00.l(this.a("skip"));
        }
        catch(Exception unused_ex) {
        }
        return b00;
    }

    public X a(Context context0) {
        X x0 = null;
        try {
            Node node0 = F0.c(this.a, "MediaFiles");
            if(node0 != null) {
                List list0 = F0.d(node0, "MediaFile");
                for(int v = 0; v < list0.size(); ++v) {
                    Node node1 = (Node)list0.get(v);
                    if(node1 != null) {
                        String s = F0.a(node1, "type");
                        if(s.contains("video/mp4") || s.contains("video/3gpp")) {
                            X x1 = new X();
                            x1.a(F0.a(node1, "delivery"));
                            x1.c(F0.a(node1, "type"));
                            if(F0.b(node1, "width") != null) {
                                x1.e(((int)F0.b(node1, "width")));
                            }
                            if(F0.b(node1, "height") != null) {
                                x1.b(((int)F0.b(node1, "height")));
                            }
                            if(F0.b(node1, "bitrate") != null) {
                                x1.a(((int)F0.b(node1, "bitrate")));
                            }
                            if(F0.b(node1, "minBitrate") != null) {
                                x1.d(((int)F0.b(node1, "minBitrate")));
                            }
                            if(F0.b(node1, "maxBitrate") != null) {
                                x1.c(((int)F0.b(node1, "maxBitrate")));
                            }
                            x1.b(F0.a(node1));
                            if(x0 == null) {
                                x0 = x1;
                            }
                            else {
                                float f = A0.a(J.c(context0), J.b(context0), x1.e(), x1.c());
                                float f1 = A0.a(J.c(context0), J.b(context0), x0.e(), x0.c());
                                if(f < f1) {
                                    x0 = x1;
                                }
                                else if(f == f1) {
                                    float f2 = A0.a(x1.a());
                                    float f3 = A0.a(x0.a());
                                    if(f2 < f3) {
                                        x0 = x1;
                                    }
                                    else if(f2 == f3 && x1.a() >= x0.a()) {
                                        x0 = x1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return x0;
    }

    public String b() {
        try {
            List list0 = F0.d(this.a, "Duration");
            return list0 == null || list0.size() <= 0 ? null : F0.a(((Node)list0.get(0)));
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public O c() {
        try {
            Node node0 = F0.c(this.a, "Icons");
            if(node0 != null) {
                Node node1 = F0.c(node0, "Icon");
                if(node1 != null) {
                    O o0 = new O();
                    if(F0.b(node1, "width") != null) {
                        o0.b(((int)F0.b(node1, "width")));
                    }
                    if(F0.b(node1, "height") != null) {
                        o0.a(((int)F0.b(node1, "height")));
                    }
                    if(F0.a(node1, "xPosition") != null) {
                        o0.e(F0.a(node1, "xPosition"));
                    }
                    if(F0.a(node1, "yPosition") != null) {
                        o0.f(F0.a(node1, "yPosition"));
                    }
                    if(F0.a(node1, "duration") != null) {
                        o0.b(F0.a(node1, "duration"));
                    }
                    o0.c(F0.a(node1, "offset"));
                    o0.d(F0.a(F0.c(node1, "StaticResource")));
                    Node node2 = F0.c(node1, "IconClicks");
                    if(node2 != null) {
                        o0.a(F0.a(F0.c(node2, "IconClickThrough")));
                        List list0 = F0.d(node2, "IconClickTracking");
                        if(list0 != null) {
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object0: list0) {
                                arrayList0.add(F0.a(((Node)object0)));
                            }
                            o0.a(arrayList0);
                        }
                    }
                    ArrayList arrayList1 = new ArrayList();
                    List list1 = F0.d(node1, "IconViewTracking");
                    if(list1 != null) {
                        for(Object object1: list1) {
                            arrayList1.add(F0.a(((Node)object1)));
                        }
                        o0.b(arrayList1);
                    }
                    return o0;
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }

    private List d() {
        try {
            List list0 = new ArrayList();
            Node node0 = F0.c(this.a, "TrackingEvents");
            if(node0 != null) {
                List list1 = F0.b(node0, "Tracking", "event", Collections.singletonList("progress"));
                if(list1 != null) {
                    for(Object object0: list1) {
                        Node node1 = (Node)object0;
                        String s = F0.a(node1, "offset");
                        if(s != null) {
                            String s1 = s.trim();
                            if(A0.b(s1)) {
                                list0.add(new z0(A0.d(s1), F0.a(node1)));
                            }
                        }
                    }
                    return list0;
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }

    public String e() {
        try {
            return F0.a(this.a, "skipoffset");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public String f() {
        try {
            Node node0 = F0.c(this.a, "VideoClicks");
            return node0 == null ? null : F0.a(F0.c(node0, "ClickThrough"));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
    }

    public List g() {
        try {
            List list0 = new ArrayList();
            Node node0 = F0.c(this.a, "VideoClicks");
            if(node0 != null) {
                List list1 = F0.d(node0, "ClickTracking");
                if(list1 != null) {
                    for(Object object0: list1) {
                        list0.add(F0.a(((Node)object0)));
                    }
                    return list0;
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }

    public List h() {
        try {
            List list0 = new ArrayList();
            Node node0 = F0.c(this.a, "VideoClicks");
            if(node0 != null) {
                List list1 = F0.d(node0, "CustomClick");
                if(list1 != null) {
                    for(Object object0: list1) {
                        list0.add(F0.a(((Node)object0)));
                    }
                    return list0;
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }
}

