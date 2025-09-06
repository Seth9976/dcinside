package com.fsn.cauly.blackdragoncore;

import android.content.Context;
import android.text.TextUtils;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.k;
import com.fsn.cauly.Y.s0;
import com.fsn.cauly.blackdragoncore.utils.j;
import com.fsn.cauly.blackdragoncore.utils.l;
import com.fsn.cauly.blackdragoncore.utils.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class a implements com.fsn.cauly.Y.s0.a {
    static a a;

    public static a a() {
        if(a.a == null) {
            a.a = new a();
        }
        return a.a;
    }

    public long a(Context context0) {
        return j.a(context0, "APT_CHECK_TIME", 0L);
    }

    public Map a(Context context0, JSONObject jSONObject0) {
        Map map0 = new HashMap();
        try {
            if(jSONObject0.has("apt_info")) {
                JSONObject jSONObject1 = jSONObject0.getJSONObject("apt_info");
                String s = this.b("delconds", jSONObject1, "");
                HashMap hashMap0 = new HashMap();
                String s1 = this.b("apt_serial", jSONObject1, "");
                if(!TextUtils.isEmpty(s1)) {
                    this.a(context0, s1);
                }
                if(jSONObject1.has("upconds")) {
                    JSONArray jSONArray0 = jSONObject1.getJSONArray("upconds");
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject2 = (JSONObject)jSONArray0.get(v);
                        String s2 = this.b("apt_cond", jSONObject2, "");
                        String s3 = this.b("id", jSONObject2, "");
                        String s4 = this.b("cond_type", jSONObject2, "");
                        String s5 = this.b("act", jSONObject2, "");
                        if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3)) {
                            if(!"plain".equalsIgnoreCase(s4)) {
                                s2 = o.a(this.b("cond_type", jSONObject2, ""), true);
                            }
                            hashMap0.put(s3, s2);
                        }
                        if(!TextUtils.isEmpty(s5) && "1".equals(s5)) {
                            map0.put(s3, s2);
                        }
                    }
                    this.a(context0, s, hashMap0);
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return map0;
    }

    public Map a(Context context0, Document document0) {
        NodeList nodeList1;
        Node node0;
        String s = "";
        HashMap hashMap0 = new HashMap();
        Map map0 = new HashMap();
        try {
            NodeList nodeList0 = document0.getElementsByTagName("apt_info");
            if(nodeList0 != null && nodeList0.getLength() > 0) {
                node0 = nodeList0.item(0);
                nodeList1 = node0.getChildNodes();
                if(nodeList1 != null && nodeList1.getLength() > 0) {
                    goto label_8;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        this.a(context0, s, hashMap0);
        return map0;
    label_8:
        String s1 = "";
        try {
            for(int v = 0; v < nodeList1.getLength(); ++v) {
                Node node1 = nodeList1.item(v);
                if("delconds".equalsIgnoreCase(node1.getNodeName())) {
                    s1 = l.a(node1);
                }
                else if("upconds".equalsIgnoreCase(node1.getNodeName())) {
                    String s2 = l.a(node0, "upconds", "apt_serial");
                    if(!TextUtils.isEmpty(s2)) {
                        this.a(context0, s2);
                    }
                    NodeList nodeList2 = node1.getChildNodes();
                    if(nodeList2 != null && nodeList2.getLength() > 0) {
                        for(int v1 = 0; v1 < nodeList2.getLength(); ++v1) {
                            Node node2 = nodeList2.item(v1);
                            String s3 = null;
                            String s4 = node2.getAttributes() == null || node2.getAttributes().getNamedItem("id") == null ? null : node2.getAttributes().getNamedItem("id").getNodeValue();
                            String s5 = node2.getAttributes() == null || node2.getAttributes().getNamedItem("cond_type") == null ? "" : node2.getAttributes().getNamedItem("cond_type").getNodeValue();
                            if(node2.getAttributes() != null && node2.getAttributes().getNamedItem("act") != null) {
                                s3 = node2.getAttributes().getNamedItem("act").getNodeValue();
                            }
                            if(!TextUtils.isEmpty(s4)) {
                                String s6 = "plain".equalsIgnoreCase(s5) ? l.a(node2) : o.a(l.a(node2), true);
                                hashMap0.put(s4, "" + s6);
                                if(!TextUtils.isEmpty(s3) && "1".equals(s3)) {
                                    map0.put(s4, s6);
                                }
                            }
                        }
                    }
                }
            }
        label_38:
            s = s1;
        }
        catch(Exception unused_ex) {
            goto label_38;
        }
        this.a(context0, s, hashMap0);
        return map0;
    }

    public void a(Context context0, long v) {
        j.b(context0, "APT_CHECK_TIME_LIMIT", v);
    }

    public void a(Context context0, String s) {
        j.b(context0, "APT_SERIAL", "" + s);
    }

    public void a(Context context0, String s, Map map0) {
        try {
            Map map1 = this.g(context0);
            Map map2 = this.c(context0);
            Iterator iterator0 = map0.keySet().iterator();
            d.a().c(context0);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                String s2 = (String)map0.get(s1);
                map1.put(s1, s2);
                if(d.a().d(context0, s2)) {
                    map2.put(s1, s2);
                }
                else {
                    map2.remove(s1);
                }
            }
            if(!TextUtils.isEmpty(s)) {
                String[] arr_s = s.split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    String s3 = arr_s[v];
                    map1.remove(s3);
                    map2.remove(s3);
                }
            }
            this.a(context0, map2);
            this.b(context0, map1);
        }
        catch(Exception unused_ex) {
        }
    }

    public void a(Context context0, Map map0) {
        j.a(context0, "APT_INSTLLED_MAP", map0);
    }

    public void a(Context context0, Map map0, String s) {
        if(context0 != null && map0 != null) {
            try {
                if(map0.size() > 0) {
                    String s1 = "";
                    String s2 = "";
                    for(Object object0: map0.keySet()) {
                        String s3 = (String)object0;
                        String s4 = (String)map0.get(s3);
                        if(TextUtils.isEmpty(s4)) {
                        }
                        else if(d.a().d(context0, s4)) {
                            s1 = s1 + s3 + ":";
                        }
                        else {
                            s2 = s2 + s3 + ":";
                        }
                    }
                    k.a(context0, s1, s2, s);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void a(i0 i00) {
        this.b(i00.b, true);
        com.fsn.cauly.Y.a a0 = new com.fsn.cauly.Y.a(i00);
        a0.a(this);
        a0.execute();
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        this.c(s00);
    }

    public boolean a(Context context0, boolean z) {
        if(TextUtils.isEmpty(this.f(context0)) && !this.e(context0)) {
            return true;
        }
        if(z) {
            return false;
        }
        if(System.currentTimeMillis() - this.a(context0) > this.b(context0) * 60000L) {
            this.b(context0, false);
            return true;
        }
        this.e(context0);
        return false;
    }

    public long b(Context context0) {
        return j.a(context0, "APT_CHECK_TIME_LIMIT", 604800000L);
    }

    // 去混淆评级： 低(20)
    String b(String s, JSONObject jSONObject0, String s1) {
        return !jSONObject0.has(s) || TextUtils.isEmpty(jSONObject0.getString(s)) ? s1 : jSONObject0.getString(s);
    }

    public void b(Context context0, Map map0) {
        j.a(context0, "APT_TOTAL_COND_MAP", map0);
    }

    public void b(Context context0, boolean z) {
        j.b(context0, "APT_RUNNING", z);
    }

    private void c(s0 s00) {
        try {
            Context context0 = ((com.fsn.cauly.Y.a)s00).i().b;
            this.b(context0, false);
            if(((com.fsn.cauly.Y.a)s00).getErrorCode() == 0) {
                switch(((com.fsn.cauly.Y.a)s00).l()) {
                    case 0: 
                    case 200: {
                        if(context0 != null) {
                            a.a().h(context0);
                            a.a().a(context0, ((long)((com.fsn.cauly.Y.a)s00).k()));
                            a.a().a(context0, ((com.fsn.cauly.Y.a)s00).j());
                        }
                        break;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public Map c(Context context0) {
        return j.c(context0, "APT_INSTLLED_MAP");
    }

    public String d(Context context0) {
        String s = "";
        for(Object object0: j.c(context0, "APT_INSTLLED_MAP").keySet()) {
            s = s + ((String)object0) + ":";
        }
        return s;
    }

    public boolean e(Context context0) {
        return j.a(context0, "APT_RUNNING", false);
    }

    public String f(Context context0) {
        return j.a(context0, "APT_SERIAL", "");
    }

    public Map g(Context context0) {
        return j.c(context0, "APT_TOTAL_COND_MAP");
    }

    public void h(Context context0) {
        j.b(context0, "APT_CHECK_TIME", System.currentTimeMillis());
    }
}

