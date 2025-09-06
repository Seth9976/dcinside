package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver.OnWindowFocusChangeListener;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.Qf;
import java.util.List;

public class Zd {
    public interface Zh {
        void PjT();

        void PjT(View arg1, boolean arg2);

        void PjT(boolean arg1);

        void Zh();
    }

    public static void PjT(ViewGroup viewGroup0, boolean z, int v, Zh zd$Zh0, List list0) {
        class PjT implements ViewTreeObserver.OnGlobalLayoutListener {
            View PjT;
            final ViewGroup Zh;

            PjT(ViewGroup viewGroup0) {
                this.PjT = null;
            }

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    Zh zd$Zh0 = (Zh)this.Zh.getTag(0x1F000045);
                    if(this.PjT != null) {
                        Rect rect0 = new Rect();
                        this.PjT.getGlobalVisibleRect(rect0);
                        Rect rect1 = new Rect();
                        this.Zh.getGlobalVisibleRect(rect1);
                        if(rect0.contains(rect1)) {
                            if(zd$Zh0 != null) {
                                zd$Zh0.PjT(this.Zh, false);
                            }
                            this.Zh.setTag(0x1F000043, Boolean.FALSE);
                            return;
                        }
                        if(zd$Zh0 != null) {
                            zd$Zh0.PjT(this.Zh, true);
                        }
                        this.Zh.setTag(0x1F000043, Boolean.TRUE);
                        return;
                    }
                    Integer integer0 = (Integer)this.Zh.getTag(0x1F000046);
                    Zd.Zh(this.Zh, zd$Zh0, integer0);
                    return;
                }
                catch(Exception exception0) {
                }
                ApmHelper.reportCustomError(("onGlobalLayout exception " + this.Zh.getTag(0x1F000045)), "ViewUtils", exception0);
            }
        }

        viewGroup0.setTag(0x1F000045, zd$Zh0);
        viewGroup0.setTag(0x1F000046, v);
        if(viewGroup0.getTag(0x1F000044) == Boolean.TRUE) {
            return;
        }
        PjT zd$PjT0 = new PjT(viewGroup0);
        if(list0 != null && list0.size() > 0) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ((ViewGroup)list0.get(v1)).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
                    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
                    public void onChildViewAdded(View view0, View view1) {
                        zd$PjT0.PjT = view1;
                    }

                    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
                    public void onChildViewRemoved(View view0, View view1) {
                        zd$PjT0.PjT = null;
                    }
                });
            }
        }
        viewGroup0.getViewTreeObserver().addOnGlobalLayoutListener(zd$PjT0);
        if(z) {
            com.bytedance.sdk.openadsdk.utils.Zd.2 zd$20 = new ViewTreeObserver.OnScrollChangedListener() {
                @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        Zh zd$Zh0 = (Zh)viewGroup0.getTag(0x1F000045);
                        Integer integer0 = (Integer)viewGroup0.getTag(0x1F000046);
                        Zd.Zh(viewGroup0, zd$Zh0, integer0);
                    }
                    catch(Exception exception0) {
                        ApmHelper.reportCustomError(("onScrollChanged exception " + viewGroup0.getTag(0x1F000045)), "ViewUtils", exception0);
                    }
                }
            };
            viewGroup0.getViewTreeObserver().addOnScrollChangedListener(zd$20);
        }
        com.bytedance.sdk.openadsdk.utils.Zd.3 zd$30 = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override  // android.view.ViewTreeObserver$OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                try {
                    Zh zd$Zh0 = (Zh)viewGroup0.getTag(0x1F000045);
                    if(zd$Zh0 != null) {
                        zd$Zh0.PjT(z);
                        Integer integer0 = (Integer)viewGroup0.getTag(0x1F000046);
                        Zd.Zh(viewGroup0, zd$Zh0, integer0);
                    }
                }
                catch(Exception exception0) {
                    ApmHelper.reportCustomError(("onWindowFocusChanged exception " + viewGroup0.getTag(0x1F000045)), "ViewUtils", exception0);
                }
            }
        };
        viewGroup0.getViewTreeObserver().addOnWindowFocusChangeListener(zd$30);
        viewGroup0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                Zh zd$Zh0 = (Zh)viewGroup0.getTag(0x1F000045);
                if(zd$Zh0 != null) {
                    zd$Zh0.PjT();
                }
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                Zh zd$Zh0 = (Zh)viewGroup0.getTag(0x1F000045);
                if(zd$Zh0 != null) {
                    zd$Zh0.Zh();
                }
            }
        });
        viewGroup0.setTag(0x1F000044, Boolean.TRUE);
    }

    private static boolean PjT(View view0, int v) {
        return Qf.PjT(view0, 20, v);
    }

    private static void Zh(View view0, Zh zd$Zh0, Integer integer0) {
        if(zd$Zh0 == null) {
            return;
        }
        if(integer0 == null) {
            integer0 = 0;
        }
        zd$Zh0.PjT(view0, Zd.PjT(view0, ((int)integer0)));
    }
}

