package com.dcinside.app.internal;

import com.dcinside.app.model.PostModify;
import com.dcinside.app.model.Q;
import com.dcinside.app.response.PostHead;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nModelExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n295#2,2:17\n295#2,2:19\n*S KotlinDebug\n*F\n+ 1 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n12#1:17,2\n15#1:19,2\n*E\n"})
public final class f {
    @m
    public static final PostHead a(@l Q q0) {
        L.p(q0, "<this>");
        List list0 = q0.M0();
        if(list0 != null) {
            for(Object object0: list0) {
                Integer integer0 = q0.L0();
                if(integer0 != null && ((PostHead)object0).i() == ((int)integer0)) {
                    return object0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @m
    public static final PostHead b(@l PostModify postModify0) {
        L.p(postModify0, "<this>");
        List list0 = postModify0.M();
        if(list0 != null) {
            for(Object object0: list0) {
                Integer integer0 = postModify0.L();
                if(integer0 != null && ((PostHead)object0).i() == ((int)integer0)) {
                    return object0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static final boolean c(@m PostHead postHead0) {
        return postHead0 != null && postHead0.i() == 999 && postHead0.l() == 9;
    }
}

