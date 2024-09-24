package com.e4a.runtime.components;

import com.e4a.runtime.annotations.SimpleObject;
import com.e4a.runtime.annotations.SimpleProperty;

@SimpleObject
/* loaded from: classes.dex */
public interface TextComponent extends VisibleComponent {
    @SimpleProperty
    int FontTypeface();

    @SimpleProperty(initializer = "0", type = SimpleProperty.o50AA3137616141C520637BE6BC611597BD8D1C2BB0C5)
    void FontTypeface(int i);

    @SimpleProperty
    /* renamed from: 内容  reason: contains not printable characters */
    String mo83();

    @SimpleProperty(initializer = "\"\"", type = SimpleProperty.o50AA3137616141C520637BE6BC61129ABF81142D)
    /* renamed from: 内容  reason: contains not printable characters */
    void mo84(String str);

    @SimpleProperty
    /* renamed from: 字体大小  reason: contains not printable characters */
    float mo85();

    @SimpleProperty(initializer = "9.09", type = SimpleProperty.o50AA3137616141C520637BE6BC611287A38F162F)
    /* renamed from: 字体大小  reason: contains not printable characters */
    void mo86(float f);

    @SimpleProperty
    /* renamed from: 字体颜色  reason: contains not printable characters */
    int mo87();

    @SimpleProperty(initializer = "-16777216", type = SimpleProperty.o50AA3137616141C520637BE6BC610281A18708)
    /* renamed from: 字体颜色  reason: contains not printable characters */
    void mo88(int i);

    @SimpleProperty
    /* renamed from: 对齐方式  reason: contains not printable characters */
    int mo89();

    @SimpleProperty(initializer = "0", type = SimpleProperty.o50AA3137616141C520637BE6BC61158BB59C103FA0D408F4D22E2FBC3031B4)
    /* renamed from: 对齐方式  reason: contains not printable characters */
    void mo90(int i);

    @SimpleProperty(initializer = "False", type = SimpleProperty.o50AA3137616141C520637BE6BC610381A2841F2BBD)
    /* renamed from: 斜体  reason: contains not printable characters */
    void mo91(boolean z);

    @SimpleProperty
    /* renamed from: 斜体  reason: contains not printable characters */
    boolean mo92();

    @SimpleProperty
    /* renamed from: 标题  reason: contains not printable characters */
    String mo93();

    @SimpleProperty(initializer = "\"\"", type = SimpleProperty.o50AA3137616141C520637BE6BC61129ABF81142D)
    /* renamed from: 标题  reason: contains not printable characters */
    void mo94(String str);

    @SimpleProperty(initializer = "False", type = SimpleProperty.o50AA3137616141C520637BE6BC610381A2841F2BBD)
    /* renamed from: 粗体  reason: contains not printable characters */
    void mo95(boolean z);

    @SimpleProperty
    /* renamed from: 粗体  reason: contains not printable characters */
    boolean mo96();

    @SimpleProperty
    /* renamed from: 透明度  reason: contains not printable characters */
    int mo97();

    @SimpleProperty(initializer = "255", type = SimpleProperty.o50AA3137616141C520637BE6BC610880B98D1D2FA1)
    /* renamed from: 透明度  reason: contains not printable characters */
    void mo98(int i);
}