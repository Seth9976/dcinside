package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.s0;
import y4.l;

@Stable
@s0({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,229:1\n151#2,3:230\n33#2,4:233\n154#2:237\n151#2,3:238\n33#2,4:241\n154#2,2:245\n38#2:247\n156#2:248\n155#2:249\n38#2:250\n156#2:251\n151#2,3:252\n33#2,4:255\n154#2:259\n151#2,3:260\n33#2,4:263\n154#2,2:267\n38#2:269\n156#2:270\n155#2:271\n38#2:272\n156#2:273\n151#2,3:274\n33#2,4:277\n154#2:281\n151#2,3:282\n33#2,4:285\n154#2,2:289\n38#2:291\n156#2:292\n155#2:293\n38#2:294\n156#2:295\n151#2,3:296\n33#2,4:299\n154#2:303\n151#2,3:304\n33#2,4:307\n154#2,2:311\n38#2:313\n156#2:314\n155#2:315\n38#2:316\n156#2:317\n*S KotlinDebug\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n*L\n112#1:230,3\n112#1:233,4\n112#1:237\n113#1:238,3\n113#1:241,4\n113#1:245,2\n113#1:247\n113#1:248\n112#1:249\n112#1:250\n112#1:251\n137#1:252,3\n137#1:255,4\n137#1:259\n138#1:260,3\n138#1:263,4\n138#1:267,2\n138#1:269\n138#1:270\n137#1:271\n137#1:272\n137#1:273\n161#1:274,3\n161#1:277,4\n161#1:281\n162#1:282,3\n162#1:285,4\n162#1:289,2\n162#1:291\n162#1:292\n161#1:293\n161#1:294\n161#1:295\n185#1:296,3\n185#1:299,4\n185#1:303\n186#1:304,3\n186#1:307,4\n186#1:311,2\n186#1:313\n186#1:314\n185#1:315\n185#1:316\n185#1:317\n*E\n"})
public interface MultiContentMeasurePolicy {
    @l
    MeasureResult a(@l MeasureScope arg1, @l List arg2, long arg3);

    int b(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int c(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int d(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);

    int e(@l IntrinsicMeasureScope arg1, @l List arg2, int arg3);
}

