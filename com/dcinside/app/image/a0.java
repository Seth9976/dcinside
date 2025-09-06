package com.dcinside.app.image;

import com.dcinside.app.model.PostImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageViewerListWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerListWrapper.kt\ncom/dcinside/app/image/ImageViewerApiListWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1557#2:41\n1628#2,3:42\n*S KotlinDebug\n*F\n+ 1 ImageViewerListWrapper.kt\ncom/dcinside/app/image/ImageViewerApiListWrapper\n*L\n15#1:41\n15#1:42,3\n*E\n"})
public final class a0 implements e0 {
    @l
    private final List a;

    public a0(@l List list0) {
        L.p(list0, "items");
        super();
        ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(new Z(((PostImage)object0)));
        }
        this.a = arrayList0;
    }

    @Override  // com.dcinside.app.image.e0
    @l
    public d0 get(int v) {
        return (d0)this.a.get(v);
    }

    @Override  // com.dcinside.app.image.e0
    public int getCount() {
        return this.a.size();
    }
}

