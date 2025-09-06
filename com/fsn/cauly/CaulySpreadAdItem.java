package com.fsn.cauly;

import java.util.ArrayList;

public class CaulySpreadAdItem {
    public ArrayList adViewItem;
    public String data;
    public int height;
    public String id;
    public String link;
    public String spread_type;
    public String title;
    public int width;

    public CaulySpreadAdItem(String s, String s1, String s2, String s3) {
        this.title = s1;
        this.data = s2;
        this.link = s3;
        this.id = s;
        ArrayList arrayList0 = CaulySpreadUtil.instance().g(s2);
        this.adViewItem = arrayList0;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                CaulySpreadViewItem caulySpreadViewItem0 = (CaulySpreadViewItem)object0;
                if("frame".equalsIgnoreCase(caulySpreadViewItem0.name)) {
                    this.width = caulySpreadViewItem0.width;
                    this.height = caulySpreadViewItem0.height;
                    this.spread_type = caulySpreadViewItem0.type;
                }
            }
        }
    }
}

