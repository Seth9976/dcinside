package com.fasterxml.jackson.databind.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;

@Deprecated
public class o extends DateFormat {
    private static final long a = 1L;

    public o() {
        this.numberFormat = new DecimalFormat();
        this.calendar = new GregorianCalendar();
    }

    @Override
    public Object clone() {
        return this;
    }

    @Override
    public StringBuffer format(Date date0, StringBuffer stringBuffer0, FieldPosition fieldPosition0) {
        stringBuffer0.append(p.b(date0));
        return stringBuffer0;
    }

    @Override
    public Date parse(String s) throws ParseException {
        return p.g(s, new ParsePosition(0));
    }

    @Override
    public Date parse(String s, ParsePosition parsePosition0) {
        try {
            return p.g(s, parsePosition0);
        }
        catch(ParseException unused_ex) {
            return null;
        }
    }
}

