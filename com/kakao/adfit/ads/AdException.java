package com.kakao.adfit.ads;

public final class AdException extends Exception {
    private final AdError a;

    public AdException(AdError adError0, String s) {
        super(s);
        this.a = adError0;
    }

    public AdError a() {
        return this.a;
    }

    @Override
    public void printStackTrace() {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = this.getMessage();
        if(s != null) {
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
        AdError adError0 = this.a;
        if(adError0 != null) {
            stringBuilder0.append(adError0);
        }
        return stringBuilder0.toString();
    }
}

