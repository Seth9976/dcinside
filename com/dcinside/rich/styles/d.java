package com.dcinside.rich.styles;

import android.text.Editable;
import android.text.Layout.Alignment;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.AlignmentSpan;
import android.view.View;
import android.widget.ImageView;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.RichToolbar;
import com.dcinside.rich.e;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRichAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RichAlignment.kt\ncom/dcinside/rich/styles/RichAlignment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n1855#3,2:127\n*S KotlinDebug\n*F\n+ 1 RichAlignment.kt\ncom/dcinside/rich/styles/RichAlignment\n*L\n29#1:127,2\n*E\n"})
public final class d extends a {
    @l
    private final Layout.Alignment h;

    public d(@l RichToolbar richToolbar0, @l ImageView imageView0, @l Layout.Alignment layout$Alignment0) {
        L.p(richToolbar0, "toolbar");
        L.p(imageView0, "imageView");
        L.p(layout$Alignment0, "alignment");
        super(richToolbar0, imageView0);
        this.h = layout$Alignment0;
        this.d(imageView0);
    }

    @Override  // com.dcinside.rich.styles.b
    public void a(@l Editable editable0, int v, int v1, boolean z) {
        L.p(editable0, "editable");
        AlignmentSpan[] arr_alignmentSpan = (AlignmentSpan[])editable0.getSpans(v, v1, AlignmentSpan.class);
        if(arr_alignmentSpan != null && arr_alignmentSpan.length != 0) {
            Layout.Alignment layout$Alignment0 = arr_alignmentSpan[0].getAlignment();
            if(this.h != layout$Alignment0) {
                return;
            }
            if(v1 <= v) {
                int v3 = editable0.getSpanStart(arr_alignmentSpan[0]);
                int v4 = editable0.getSpanEnd(arr_alignmentSpan[0]);
                if(v3 >= v4) {
                    editable0.removeSpan(arr_alignmentSpan[0]);
                    if(v3 > 0) {
                        editable0.delete(v3 - 1, v4);
                    }
                }
            }
            else if(editable0.charAt(v1 - 1) == 10) {
                AlignmentSpan alignmentSpan0 = arr_alignmentSpan[arr_alignmentSpan.length - 1];
                int v2 = editable0.getSpanStart(alignmentSpan0);
                if(v1 > v2) {
                    editable0.removeSpan(alignmentSpan0);
                    L.m(alignmentSpan0);
                    this.h(editable0, alignmentSpan0, v2, v1 - 1, 18);
                }
                this.m(this.h);
            }
        }
    }

    @Override  // com.dcinside.rich.styles.b
    public void d(@l ImageView imageView0) {
        L.p(imageView0, "imageView");
        imageView0.setOnClickListener((View view0) -> {
            int v6;
            L.p(this, "this$0");
            RichEditText richEditText0 = this.b();
            if(richEditText0 == null) {
                return;
            }
            Integer integer0 = null;
            int[] arr_v = e.a(richEditText0);
            L.m(arr_v);
            Integer integer1 = kotlin.collections.l.mn(arr_v);
            if(integer1 != null) {
                if(integer1.intValue() < 0) {
                    integer1 = null;
                }
                if(integer1 != null) {
                    int v = (int)integer1;
                    Integer integer2 = kotlin.collections.l.Ok(arr_v);
                    if(integer2 != null) {
                        if(integer2.intValue() >= 0) {
                            integer0 = integer2;
                        }
                        if(integer0 != null) {
                            Iterator iterator0 = new kotlin.ranges.l(v, ((int)integer0)).iterator();
                            while(iterator0.hasNext()) {
                                int v1 = ((T)iterator0).b();
                                int v2 = e.e(richEditText0, v1);
                                int v3 = e.d(richEditText0, v1);
                                Editable editable0 = richEditText0.getEditableText();
                                AlignmentSpan.Standard[] arr_alignmentSpan$Standard = (AlignmentSpan.Standard[])editable0.getSpans(v2, v3, AlignmentSpan.Standard.class);
                                if(arr_alignmentSpan$Standard != null) {
                                    int v4 = arr_alignmentSpan$Standard.length;
                                    for(int v5 = 0; v5 < v4; ++v5) {
                                        editable0.removeSpan(arr_alignmentSpan$Standard[v5]);
                                    }
                                }
                                if(v2 == v3) {
                                    editable0.insert(v2, "​");
                                    v6 = e.d(richEditText0, v1);
                                }
                                else {
                                    v6 = v3;
                                }
                                L.m(editable0);
                                this.h(editable0, new AlignmentSpan.Standard(this.h), v2, v6, 18);
                            }
                            this.c();
                        }
                    }
                }
            }
        });
    }

    @Override  // com.dcinside.rich.styles.b
    public boolean isChecked() {
        return false;
    }

    private final void m(Layout.Alignment layout$Alignment0) {
        RichEditText richEditText0 = this.b();
        if(richEditText0 == null) {
            return;
        }
        Editable editable0 = richEditText0.getText();
        if(editable0 == null) {
            return;
        }
        int[] arr_v = e.a(richEditText0);
        L.m(arr_v);
        Integer integer0 = kotlin.collections.l.mn(arr_v);
        if(integer0 != null) {
            if(integer0.intValue() < 0) {
                integer0 = null;
            }
            if(integer0 != null) {
                int v = (int)integer0;
                int v1 = e.e(richEditText0, v);
                if(v1 <= -1) {
                    return;
                }
                editable0.insert(v1, "​");
                int v2 = e.e(richEditText0, v);
                if(v2 <= -1) {
                    return;
                }
                int v3 = e.d(richEditText0, v);
                if(v3 < 1) {
                    return;
                }
                if(editable0.charAt(v3 - 1) == 10) {
                    --v3;
                }
                this.h(editable0, new AlignmentSpan.Standard(layout$Alignment0), v2, v3, 18);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void n(d d0, View view0) [...]

    @Override  // com.dcinside.rich.styles.b
    public void setChecked(boolean z) {
    }
}

