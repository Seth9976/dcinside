package io.realm.internal.android;

import android.util.Base64;
import io.realm.exceptions.RealmException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o3.h;

public class c {
    private static Pattern a;
    private static Pattern b;
    private static ParsePosition c;

    static {
        c.a = Pattern.compile("/Date\\((\\d*)(?:[+-]\\d*)?\\)/");
        c.b = Pattern.compile("-?\\d+");
        c.c = new ParsePosition(0);
    }

    public static byte[] a(String s) {
        return s == null || s.length() == 0 ? new byte[0] : Base64.decode(s, 0);
    }

    @h
    public static Date b(String s) {
        if(s != null && s.length() != 0) {
            Matcher matcher0 = c.a.matcher(s);
            if(matcher0.find()) {
                return new Date(Long.parseLong(matcher0.group(1)));
            }
            if(c.b.matcher(s).matches()) {
                try {
                    return new Date(Long.parseLong(s));
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new RealmException(numberFormatException0.getMessage(), numberFormatException0);
                }
            }
            try {
                c.c.setIndex(0);
                return b.c(s, c.c);
            }
            catch(ParseException parseException0) {
                throw new RealmException(parseException0.getMessage(), parseException0);
            }
        }
        return null;
    }
}

