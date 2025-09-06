package com.fsn.cauly;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Map;

public class CaulyNativeAdHelper {
    private static int a = 0x493854;
    static Map b;
    static Map c;
    static CaulyNativeAdHelper d;

    static {
    }

    public void add(Context context0, ViewGroup viewGroup0, int v, CaulyNativeAdView caulyNativeAdView0) {
        Map map0 = CaulyNativeAdHelper.b;
        if(map0 != null) {
            if(!map0.containsKey(viewGroup0)) {
                HashMap hashMap0 = new HashMap();
                CaulyNativeAdHelper.b.put(viewGroup0, hashMap0);
                HashMap hashMap1 = new HashMap();
                CaulyNativeAdHelper.c.put(viewGroup0, hashMap1);
            }
            if(context0 != null) {
                RelativeLayout relativeLayout0 = new RelativeLayout(context0);
                relativeLayout0.setId(CaulyNativeAdHelper.a);
                ((HashMap)CaulyNativeAdHelper.c.get(viewGroup0)).put(v, relativeLayout0);
                HashMap hashMap2 = (HashMap)CaulyNativeAdHelper.b.get(viewGroup0);
                if(hashMap2.containsKey(v)) {
                    ((CaulyNativeAdView)hashMap2.get(v)).destroy();
                }
                hashMap2.put(v, caulyNativeAdView0);
            }
        }
    }

    public void destroy() {
        Map map0 = CaulyNativeAdHelper.b;
        if(map0 != null) {
            for(Object object0: map0.keySet()) {
                HashMap hashMap0 = (HashMap)CaulyNativeAdHelper.b.get(((ViewGroup)object0));
                if(hashMap0 != null) {
                    for(Object object1: hashMap0.keySet()) {
                        CaulyNativeAdView caulyNativeAdView0 = (CaulyNativeAdView)hashMap0.get(((Integer)object1));
                        if(caulyNativeAdView0 != null) {
                            caulyNativeAdView0.destroy();
                        }
                    }
                }
            }
            CaulyNativeAdHelper.b.clear();
        }
        Map map1 = CaulyNativeAdHelper.c;
        if(map1 != null) {
            map1.clear();
        }
    }

    public static CaulyNativeAdHelper getInstance() {
        if(CaulyNativeAdHelper.d == null) {
            CaulyNativeAdHelper.d = new CaulyNativeAdHelper();
            CaulyNativeAdHelper.b = new HashMap();
            CaulyNativeAdHelper.c = new HashMap();
        }
        return CaulyNativeAdHelper.d;
    }

    public int getSize(ViewGroup viewGroup0) {
        return CaulyNativeAdHelper.b == null || !CaulyNativeAdHelper.b.containsKey(viewGroup0) ? 0 : ((HashMap)CaulyNativeAdHelper.b.get(viewGroup0)).size();
    }

    public View getView(ViewGroup viewGroup0, int v, View view0) {
        if(CaulyNativeAdHelper.b != null && CaulyNativeAdHelper.b.containsKey(viewGroup0)) {
            HashMap hashMap0 = (HashMap)CaulyNativeAdHelper.b.get(viewGroup0);
            HashMap hashMap1 = (HashMap)CaulyNativeAdHelper.c.get(viewGroup0);
            if(hashMap0 != null && hashMap1 != null) {
                View view1 = (RelativeLayout)hashMap1.get(v);
                if(hashMap0.containsKey(v) && !((CaulyNativeAdView)hashMap0.get(v)).d) {
                    ((CaulyNativeAdView)hashMap0.get(v)).attachToView(((ViewGroup)view1));
                }
                return view1;
            }
        }
        return null;
    }

    public void init() {
        Map map0 = CaulyNativeAdHelper.b;
        if(map0 != null) {
            map0.clear();
        }
        Map map1 = CaulyNativeAdHelper.c;
        if(map1 != null) {
            map1.clear();
        }
    }

    public boolean isAdPosition(ViewGroup viewGroup0, int v) {
        if(CaulyNativeAdHelper.b != null && CaulyNativeAdHelper.b.containsKey(viewGroup0)) {
            HashMap hashMap0 = (HashMap)CaulyNativeAdHelper.b.get(viewGroup0);
            return hashMap0 != null && hashMap0.containsKey(v);
        }
        return false;
    }

    public void remove(ViewGroup viewGroup0, int v) {
        Map map0 = CaulyNativeAdHelper.b;
        if(map0 != null) {
            HashMap hashMap0 = (HashMap)map0.get(viewGroup0);
            if(hashMap0 != null) {
                CaulyNativeAdView caulyNativeAdView0 = (CaulyNativeAdView)hashMap0.remove(v);
                if(caulyNativeAdView0 != null) {
                    caulyNativeAdView0.destroy();
                }
            }
        }
        Map map1 = CaulyNativeAdHelper.c;
        if(map1 != null) {
            HashMap hashMap1 = (HashMap)map1.get(viewGroup0);
            if(hashMap1 != null) {
                hashMap1.remove(v);
            }
        }
    }

    public void removeAll(ViewGroup viewGroup0) {
        Map map0 = CaulyNativeAdHelper.b;
        if(map0 != null) {
            HashMap hashMap0 = (HashMap)map0.get(viewGroup0);
            if(hashMap0 != null) {
                for(Object object0: hashMap0.keySet()) {
                    CaulyNativeAdView caulyNativeAdView0 = (CaulyNativeAdView)hashMap0.get(((Integer)object0));
                    if(caulyNativeAdView0 != null) {
                        caulyNativeAdView0.destroy();
                    }
                }
                hashMap0.clear();
            }
        }
        Map map1 = CaulyNativeAdHelper.c;
        if(map1 != null) {
            HashMap hashMap1 = (HashMap)map1.get(viewGroup0);
            if(hashMap1 != null) {
                hashMap1.clear();
            }
        }
    }
}

