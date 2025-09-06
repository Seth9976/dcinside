package com.dcinside.app.write.menu.ai.lora;

import com.dcinside.app.write.menu.ai.type.LoraModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.j;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class d {
    @s0({"SMAP\nFindLoraIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindLoraIn.kt\ncom/dcinside/app/write/menu/ai/lora/FindLoraIn$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,80:1\n1#2:81\n1557#3:82\n1628#3,3:83\n774#3:86\n865#3,2:87\n37#4,2:89\n*S KotlinDebug\n*F\n+ 1 FindLoraIn.kt\ncom/dcinside/app/write/menu/ai/lora/FindLoraIn$Companion\n*L\n60#1:82\n60#1:83,3\n61#1:86\n61#1:87,2\n75#1:89,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final d a(@l String s, @l LoraModel[] arr_loraModel) {
            static final class com.dcinside.app.write.menu.ai.lora.d.a.a extends N implements Function1 {
                public static final com.dcinside.app.write.menu.ai.lora.d.a.a e;

                static {
                    com.dcinside.app.write.menu.ai.lora.d.a.a.e = new com.dcinside.app.write.menu.ai.lora.d.a.a();
                }

                com.dcinside.app.write.menu.ai.lora.d.a.a() {
                    super(1);
                }

                @l
                public final CharSequence b(@l String s) {
                    L.p(s, "it");
                    return s + ",?";
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.b(((String)object0));
                }
            }

            Double double0;
            L.p(s, "prompts");
            L.p(arr_loraModel, "loraList");
            HashMap hashMap0 = new HashMap();
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_loraModel.length; ++v) {
                LoraModel loraModel0 = arr_loraModel[v];
                String s1 = loraModel0.g();
                if(s1 != null) {
                    hashMap0.put(s1, loraModel0);
                    arrayList0.add("\\<lora\\:(" + loraModel0.g() + ")(?:\\:([\\d].*?))?\\>,?");
                }
            }
            String s2 = u.m3(arrayList0, "|", null, null, 0, null, null, 62, null);
            if(!hashMap0.isEmpty() && s2.length() != 0) {
                Pattern pattern0 = Pattern.compile(s2);
                ArrayList arrayList1 = new ArrayList();
                Matcher matcher0 = pattern0.matcher(s);
                StringBuffer stringBuffer0 = new StringBuffer();
                while(matcher0.find()) {
                    int v1 = matcher0.groupCount();
                    j j0 = s.B1(s.W1(1, v1), 2);
                    int v2 = j0.g();
                    int v3 = j0.h();
                    int v4 = j0.i();
                    if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
                        while(true) {
                            String s3 = matcher0.group(v2);
                            if(s3 == null) {
                                if(v2 == v3) {
                                    break;
                                }
                                else {
                                    v2 += v4;
                                    continue;
                                }
                            }
                            LoraModel loraModel1 = (LoraModel)hashMap0.remove(s3);
                            if(loraModel1 == null) {
                                break;
                            }
                            if(v2 + 1 < v1) {
                                String s4 = matcher0.group(v2 + 1);
                                if(s4 == null) {
                                    double0 = null;
                                }
                                else {
                                    if(s4.length() <= 0) {
                                        s4 = null;
                                    }
                                    if(s4 != null) {
                                        double0 = v.L0(s4);
                                    }
                                }
                                if(double0 != null) {
                                    String s5 = String.format("%.1f", Arrays.copyOf(new Object[]{double0}, 1));
                                    L.o(s5, "format(...)");
                                    loraModel1.o(s5);
                                }
                            }
                            arrayList1.add(loraModel1);
                            break;
                        }
                    }
                    matcher0.appendReplacement(stringBuffer0, "");
                }
                matcher0.appendTail(stringBuffer0);
                String s6 = v.G5(stringBuffer0).toString();
                for(Object object0: arrayList1) {
                    String s7 = ((LoraModel)object0).a();
                    if(s7 != null) {
                        String s8 = s7.length() <= 0 ? null : s7;
                        if(s8 != null) {
                            Iterable iterable0 = v.U4(s8, new char[]{','}, false, 0, 6, null);
                            ArrayList arrayList2 = new ArrayList(u.b0(iterable0, 10));
                            for(Object object1: iterable0) {
                                arrayList2.add(v.G5(((String)object1)).toString());
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for(Object object2: arrayList2) {
                                if(((String)object2).length() > 0) {
                                    arrayList3.add(object2);
                                }
                            }
                            String s9 = u.m3(arrayList3, "|", null, null, 0, null, com.dcinside.app.write.menu.ai.lora.d.a.a.e, 30, null);
                            if(s9.length() <= 0) {
                                s9 = null;
                            }
                            if(s9 != null) {
                                Matcher matcher1 = Pattern.compile(s9).matcher(s6);
                                stringBuffer0.setLength(0);
                                while(matcher1.find()) {
                                    matcher1.appendReplacement(stringBuffer0, "");
                                }
                                matcher1.appendTail(stringBuffer0);
                                s6 = v.G5(stringBuffer0).toString();
                            }
                        }
                    }
                }
                return new d(s6, ((LoraModel[])arrayList1.toArray(new LoraModel[0])), null);
            }
            return null;
        }
    }

    @l
    private final String a;
    @l
    private final LoraModel[] b;
    @l
    public static final a c;

    static {
        d.c = new a(null);
    }

    private d(String s, LoraModel[] arr_loraModel) {
        this.a = s;
        this.b = arr_loraModel;
    }

    public d(String s, LoraModel[] arr_loraModel, w w0) {
        this(s, arr_loraModel);
    }

    @l
    public final LoraModel[] a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.a;
    }
}

