package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n102#1,34:189\n102#1,34:234\n108#1,28:279\n108#1,28:318\n35#2,3:166\n38#2,2:173\n40#2:176\n35#2,3:177\n38#2,2:184\n40#2:187\n35#2,3:223\n38#2,2:230\n40#2:233\n35#2,3:268\n38#2,2:275\n40#2:278\n35#2,3:307\n38#2,2:314\n40#2:317\n35#2,3:346\n38#2,2:353\n40#2:356\n35#2,3:357\n38#2,2:364\n40#2:367\n35#2,3:368\n38#2,2:375\n40#2:378\n33#3,4:169\n38#3:175\n33#3,4:180\n38#3:186\n33#3,4:226\n38#3:232\n33#3,4:271\n38#3:277\n33#3,4:310\n38#3:316\n33#3,4:349\n38#3:355\n33#3,4:360\n38#3:366\n33#3,4:371\n38#3:377\n1#4:188\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:189,34\n71#1:234,34\n80#1:279,28\n87#1:318,28\n49#1:166,3\n49#1:173,2\n49#1:176\n57#1:177,3\n57#1:184,2\n57#1:187\n65#1:223,3\n65#1:230,2\n65#1:233\n71#1:268,3\n71#1:275,2\n71#1:278\n80#1:307,3\n80#1:314,2\n80#1:317\n87#1:346,3\n87#1:353,2\n87#1:356\n135#1:357,3\n135#1:364,2\n135#1:367\n135#1:368,3\n135#1:375,2\n135#1:378\n49#1:169,4\n49#1:175\n57#1:180,4\n57#1:186\n65#1:226,4\n65#1:232\n71#1:271,4\n71#1:277\n80#1:310,4\n80#1:316\n87#1:349,4\n87#1:355\n135#1:360,4\n135#1:366\n135#1:371,4\n135#1:377\n*E\n"})
public final class FontMatcher {
    @l
    public final List a(@l List list0, @l FontWeight fontWeight0, boolean z, @m FontWeight fontWeight1, @m FontWeight fontWeight2) {
        L.p(list0, "<this>");
        L.p(fontWeight0, "fontWeight");
        int v = list0.size();
        FontWeight fontWeight3 = null;
        FontWeight fontWeight4 = null;
        for(int v2 = 0; v2 < v; ++v2) {
            FontWeight fontWeight5 = ((Font)list0.get(v2)).b();
            if((fontWeight1 == null || fontWeight5.v(fontWeight1) >= 0) && (fontWeight2 == null || fontWeight5.v(fontWeight2) <= 0)) {
                if(fontWeight5.v(fontWeight0) >= 0) {
                    if(fontWeight5.v(fontWeight0) <= 0) {
                        fontWeight3 = fontWeight5;
                        fontWeight4 = fontWeight3;
                        break;
                    }
                    else if(fontWeight4 == null || fontWeight5.v(fontWeight4) < 0) {
                        fontWeight4 = fontWeight5;
                    }
                }
                else if(fontWeight3 == null || fontWeight5.v(fontWeight3) > 0) {
                    fontWeight3 = fontWeight5;
                }
            }
        }
        if(!z) {
            if(fontWeight4 != null) {
                fontWeight3 = fontWeight4;
            }
        }
        else if(fontWeight3 == null) {
            fontWeight3 = fontWeight4;
        }
        List list1 = new ArrayList(list0.size());
        int v3 = list0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            Object object0 = list0.get(v1);
            if(L.g(((Font)object0).b(), fontWeight3)) {
                list1.add(object0);
            }
        }
        return list1;
    }

    public static List b(FontMatcher fontMatcher0, List list0, FontWeight fontWeight0, boolean z, FontWeight fontWeight1, FontWeight fontWeight2, int v, Object object0) {
        FontWeight fontWeight3 = null;
        if((v & 4) != 0) {
            fontWeight1 = null;
        }
        if((v & 8) != 0) {
            fontWeight2 = null;
        }
        L.p(list0, "<this>");
        L.p(fontWeight0, "fontWeight");
        int v1 = list0.size();
        FontWeight fontWeight4 = null;
        for(int v3 = 0; v3 < v1; ++v3) {
            FontWeight fontWeight5 = ((Font)list0.get(v3)).b();
            if((fontWeight1 == null || fontWeight5.v(fontWeight1) >= 0) && (fontWeight2 == null || fontWeight5.v(fontWeight2) <= 0)) {
                if(fontWeight5.v(fontWeight0) >= 0) {
                    if(fontWeight5.v(fontWeight0) <= 0) {
                        fontWeight3 = fontWeight5;
                        fontWeight4 = fontWeight3;
                        break;
                    }
                    else if(fontWeight4 == null || fontWeight5.v(fontWeight4) < 0) {
                        fontWeight4 = fontWeight5;
                    }
                }
                else if(fontWeight3 == null || fontWeight5.v(fontWeight3) > 0) {
                    fontWeight3 = fontWeight5;
                }
            }
        }
        if(!z) {
            if(fontWeight4 != null) {
                fontWeight3 = fontWeight4;
            }
        }
        else if(fontWeight3 == null) {
            fontWeight3 = fontWeight4;
        }
        List list1 = new ArrayList(list0.size());
        int v4 = list0.size();
        for(int v2 = 0; v2 < v4; ++v2) {
            Object object1 = list0.get(v2);
            if(L.g(((Font)object1).b(), fontWeight3)) {
                list1.add(object1);
            }
        }
        return list1;
    }

    @l
    public final List c(@l FontFamily fontFamily0, @l FontWeight fontWeight0, int v) {
        L.p(fontFamily0, "fontFamily");
        L.p(fontWeight0, "fontWeight");
        if(!(fontFamily0 instanceof FontListFontFamily)) {
            throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
        }
        return this.d(((FontListFontFamily)fontFamily0), fontWeight0, v);
    }

    @l
    public final List d(@l FontListFontFamily fontListFontFamily0, @l FontWeight fontWeight0, int v) {
        L.p(fontListFontFamily0, "fontFamily");
        L.p(fontWeight0, "fontWeight");
        return this.e(fontListFontFamily0.o(), fontWeight0, v);
    }

    @l
    public final List e(@l List list0, @l FontWeight fontWeight0, int v) {
        List list2;
        L.p(list0, "fontList");
        L.p(fontWeight0, "fontWeight");
        List list1 = new ArrayList(list0.size());
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object0 = list0.get(v3);
            if(L.g(((Font)object0).b(), fontWeight0) && FontStyle.f(((Font)object0).d(), v)) {
                list1.add(object0);
            }
        }
        if(!list1.isEmpty()) {
            return list1;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v4 = list0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Object object1 = list0.get(v5);
            if(FontStyle.f(((Font)object1).d(), v)) {
                arrayList0.add(object1);
            }
        }
        if(!arrayList0.isEmpty()) {
            list0 = arrayList0;
        }
        Companion fontWeight$Companion0 = FontWeight.b;
        FontWeight fontWeight1 = null;
        if(fontWeight0.v(fontWeight$Companion0.z()) < 0) {
            int v6 = list0.size();
            FontWeight fontWeight2 = null;
            int v7 = 0;
            while(v7 < v6) {
                FontWeight fontWeight3 = ((Font)list0.get(v7)).b();
                if(fontWeight3.v(fontWeight0) >= 0) {
                    if(fontWeight3.v(fontWeight0) <= 0) {
                        goto label_42;
                    }
                    else if(fontWeight2 == null || fontWeight3.v(fontWeight2) < 0) {
                        fontWeight2 = fontWeight3;
                    }
                }
                else if(fontWeight1 == null || fontWeight3.v(fontWeight1) > 0) {
                    fontWeight1 = fontWeight3;
                }
                ++v7;
                continue;
            label_42:
                fontWeight2 = fontWeight3;
                fontWeight1 = fontWeight2;
                if(true) {
                    break;
                }
            }
            if(fontWeight1 != null) {
                fontWeight2 = fontWeight1;
            }
            list2 = new ArrayList(list0.size());
            int v8 = list0.size();
            while(v2 < v8) {
                Object object2 = list0.get(v2);
                if(L.g(((Font)object2).b(), fontWeight2)) {
                    list2.add(object2);
                }
                ++v2;
            }
            return list2;
        }
        if(fontWeight0.v(fontWeight$Companion0.B()) > 0) {
            int v9 = list0.size();
            FontWeight fontWeight4 = null;
            int v10 = 0;
            while(v10 < v9) {
                FontWeight fontWeight5 = ((Font)list0.get(v10)).b();
                if(fontWeight5.v(fontWeight0) >= 0) {
                    if(fontWeight5.v(fontWeight0) <= 0) {
                        goto label_71;
                    }
                    else if(fontWeight4 == null || fontWeight5.v(fontWeight4) < 0) {
                        fontWeight4 = fontWeight5;
                    }
                }
                else if(fontWeight1 == null || fontWeight5.v(fontWeight1) > 0) {
                    fontWeight1 = fontWeight5;
                }
                ++v10;
                continue;
            label_71:
                fontWeight4 = fontWeight5;
                fontWeight1 = fontWeight4;
                if(true) {
                    break;
                }
            }
            if(fontWeight4 == null) {
                fontWeight4 = fontWeight1;
            }
            list2 = new ArrayList(list0.size());
            int v11 = list0.size();
            while(v2 < v11) {
                Object object3 = list0.get(v2);
                if(L.g(((Font)object3).b(), fontWeight4)) {
                    list2.add(object3);
                }
                ++v2;
            }
            return list2;
        }
        FontWeight fontWeight6 = fontWeight$Companion0.B();
        int v12 = list0.size();
        FontWeight fontWeight7 = null;
        FontWeight fontWeight8 = null;
        for(int v13 = 0; v13 < v12; ++v13) {
            FontWeight fontWeight9 = ((Font)list0.get(v13)).b();
            if(fontWeight6 == null || fontWeight9.v(fontWeight6) <= 0) {
                if(fontWeight9.v(fontWeight0) >= 0) {
                    if(fontWeight9.v(fontWeight0) <= 0) {
                        fontWeight7 = fontWeight9;
                        fontWeight8 = fontWeight7;
                        break;
                    }
                    else if(fontWeight8 == null || fontWeight9.v(fontWeight8) < 0) {
                        fontWeight8 = fontWeight9;
                    }
                }
                else if(fontWeight7 == null || fontWeight9.v(fontWeight7) > 0) {
                    fontWeight7 = fontWeight9;
                }
            }
        }
        if(fontWeight8 != null) {
            fontWeight7 = fontWeight8;
        }
        ArrayList arrayList1 = new ArrayList(list0.size());
        int v14 = list0.size();
        for(int v15 = 0; v15 < v14; ++v15) {
            Object object4 = list0.get(v15);
            if(L.g(((Font)object4).b(), fontWeight7)) {
                arrayList1.add(object4);
            }
        }
        if(arrayList1.isEmpty()) {
            FontWeight fontWeight10 = FontWeight.b.B();
            int v16 = list0.size();
            FontWeight fontWeight11 = null;
            for(int v17 = 0; v17 < v16; ++v17) {
                FontWeight fontWeight12 = ((Font)list0.get(v17)).b();
                if(fontWeight10 == null || fontWeight12.v(fontWeight10) >= 0) {
                    if(fontWeight12.v(fontWeight0) >= 0) {
                        if(fontWeight12.v(fontWeight0) <= 0) {
                            fontWeight1 = fontWeight12;
                            fontWeight11 = fontWeight1;
                            break;
                        }
                        else if(fontWeight11 == null || fontWeight12.v(fontWeight11) < 0) {
                            fontWeight11 = fontWeight12;
                        }
                    }
                    else if(fontWeight1 == null || fontWeight12.v(fontWeight1) > 0) {
                        fontWeight1 = fontWeight12;
                    }
                }
            }
            if(fontWeight11 != null) {
                fontWeight1 = fontWeight11;
            }
            list2 = new ArrayList(list0.size());
            int v18 = list0.size();
            while(v2 < v18) {
                Object object5 = list0.get(v2);
                if(L.g(((Font)object5).b(), fontWeight1)) {
                    list2.add(object5);
                }
                ++v2;
            }
            return list2;
        }
        return arrayList1;
    }
}

