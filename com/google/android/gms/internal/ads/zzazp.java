package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import o3.j;

@j
public final class zzazp {
    public static int zza(String s) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes("UTF-8");
            return MurmurHash3.murmurhash3_x86_32(arr_b, 0, arr_b.length, 0);
        }
        catch(UnsupportedEncodingException unused_ex) {
            arr_b = s.getBytes();
            return MurmurHash3.murmurhash3_x86_32(arr_b, 0, arr_b.length, 0);
        }
    }

    @Nullable
    public static String[] zzb(@Nullable String s, boolean z) {
        if(s == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        char[] arr_c = s.toCharArray();
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(v < s.length()) {
            int v3 = Character.codePointAt(arr_c, v);
            int v4 = Character.charCount(v3);
            if(Character.isLetter(v3)) {
                Character.UnicodeBlock character$UnicodeBlock0 = Character.UnicodeBlock.of(v3);
                if(character$UnicodeBlock0.equals(Character.UnicodeBlock.BOPOMOFO) || character$UnicodeBlock0.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || character$UnicodeBlock0.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || character$UnicodeBlock0.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || character$UnicodeBlock0.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || character$UnicodeBlock0.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || character$UnicodeBlock0.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || character$UnicodeBlock0.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || character$UnicodeBlock0.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || character$UnicodeBlock0.equals(Character.UnicodeBlock.HANGUL_JAMO) || character$UnicodeBlock0.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || character$UnicodeBlock0.equals(Character.UnicodeBlock.HIRAGANA) || character$UnicodeBlock0.equals(Character.UnicodeBlock.KATAKANA) || character$UnicodeBlock0.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || v3 >= 0xFF66 && v3 <= 0xFF9D || v3 >= 0xFFA1 && v3 <= 0xFFDC) {
                    if(v1 != 0) {
                        arrayList0.add(new String(arr_c, v2, v - v2));
                    }
                    arrayList0.add(new String(arr_c, v, v4));
                    v1 = 0;
                }
            }
            else {
                if(Character.isLetterOrDigit(v3) || Character.getType(v3) == 6 || Character.getType(v3) == 8) {
                    if(1 != v1) {
                        v2 = v;
                    }
                }
                else if(!z || Character.charCount(v3) != 1 || Character.toChars(v3)[0] != 39) {
                    if(v1 != 0) {
                        arrayList0.add(new String(arr_c, v2, v - v2));
                    }
                    v1 = 0;
                    goto label_30;
                }
                else if(1 != v1) {
                    v2 = v;
                }
                v1 = 1;
            }
        label_30:
            v += v4;
        }
        if(v1 != 0) {
            arrayList0.add(new String(arr_c, v2, v - v2));
        }
        return (String[])arrayList0.toArray(new String[arrayList0.size()]);
    }
}

