package com.e4a.runtime.components;

import android.view.View;
import com.e4a.runtime.annotations.SimpleEvent;
import com.e4a.runtime.annotations.SimpleFunction;
import com.e4a.runtime.annotations.SimpleObject;
import com.e4a.runtime.annotations.SimpleProperty;

@SimpleObject
/* loaded from: classes.dex */
public interface VisibleComponent extends Component {
    @SimpleProperty
    /* renamed from: 列  reason: contains not printable characters */
    int mo99();

    @SimpleProperty(initializer = "-1", type = SimpleProperty.o50AA3137616141C520637BE6BC610880B98D1D2FA1)
    /* renamed from: 列  reason: contains not printable characters */
    void mo100(int i);

    @SimpleFunction
    /* renamed from: 到顶层  reason: contains not printable characters */
    void mo101();

    @SimpleFunction
    /* renamed from: 刷新  reason: contains not printable characters */
    void mo102();

    @SimpleFunction
    /* renamed from: 取宽度  reason: contains not printable characters */
    int mo103();

    @SimpleFunction
    /* renamed from: 取高度  reason: contains not printable characters */
    int mo104();

    @SimpleProperty(initializer = "True", type = SimpleProperty.o50AA3137616141C520637BE6BC610381A2841F2BBD)
    /* renamed from: 可停留焦点  reason: contains not printable characters */
    void mo105(boolean z);

    @SimpleProperty
    /* renamed from: 可停留焦点  reason: contains not printable characters */
    boolean mo106();

    @SimpleProperty(initializer = "True", type = SimpleProperty.o50AA3137616141C520637BE6BC610381A2841F2BBD)
    /* renamed from: 可用  reason: contains not printable characters */
    void mo107(boolean z);

    @SimpleProperty
    /* renamed from: 可用  reason: contains not printable characters */
    boolean mo108();

    @SimpleProperty(initializer = "True", type = SimpleProperty.o50AA3137616141C520637BE6BC610381A2841F2BBD)
    /* renamed from: 可视  reason: contains not printable characters */
    void mo109(boolean z);

    @SimpleProperty
    /* renamed from: 可视  reason: contains not printable characters */
    boolean mo110();

    @SimpleEvent
    /* renamed from: 失去焦点  reason: contains not printable characters */
    void mo111();

    @SimpleProperty
    /* renamed from: 宽度  reason: contains not printable characters */
    int mo112();

    @SimpleProperty
    /* renamed from: 宽度  reason: contains not printable characters */
    void mo113(int i);

    @SimpleProperty
    /* renamed from: 左边  reason: contains not printable characters */
    int mo114();

    @SimpleProperty
    /* renamed from: 左边  reason: contains not printable characters */
    void mo115(int i);

    @SimpleFunction
    /* renamed from: 开启特效  reason: contains not printable characters */
    void mo116(int i, int i2, boolean z);

    @SimpleEvent
    /* renamed from: 开启特效完毕  reason: contains not printable characters */
    void mo117();

    @SimpleFunction
    /* renamed from: 旋转特效  reason: contains not printable characters */
    void mo118(float f, float f2, int i, boolean z);

    @SimpleFunction
    /* renamed from: 清除焦点  reason: contains not printable characters */
    void mo119();

    @SimpleProperty
    /* renamed from: 父组件  reason: contains not printable characters */
    void mo120(InterfaceC0020 interfaceC0020);

    @SimpleFunction
    /* renamed from: 电视机关闭特效  reason: contains not printable characters */
    void mo121();

    @SimpleFunction
    /* renamed from: 监听绘制  reason: contains not printable characters */
    void mo122();

    @SimpleFunction
    /* renamed from: 移动  reason: contains not printable characters */
    void mo123(int i, int i2, int i3, int i4);

    @SimpleFunction
    /* renamed from: 移动特效  reason: contains not printable characters */
    void mo124(int i, int i2, int i3, int i4, int i5, boolean z);

    @SimpleEvent
    /* renamed from: 移动特效完毕  reason: contains not printable characters */
    void mo125();

    @SimpleFunction
    /* renamed from: 绑定弹出菜单  reason: contains not printable characters */
    void mo126();

    @SimpleEvent
    /* renamed from: 绘制完毕  reason: contains not printable characters */
    void mo127(int i, int i2);

    @SimpleFunction
    /* renamed from: 置特效重复模式  reason: contains not printable characters */
    void mo128(int i, int i2);

    @SimpleProperty
    /* renamed from: 背景颜色  reason: contains not printable characters */
    int mo129();

    @SimpleProperty(type = SimpleProperty.o50AA3137616141C520637BE6BC610281A18708)
    /* renamed from: 背景颜色  reason: contains not printable characters */
    void mo130(int i);

    @SimpleFunction
    /* renamed from: 获取焦点  reason: contains not printable characters */
    void mo131();

    @SimpleEvent
    /* renamed from: 获得焦点  reason: contains not printable characters */
    void mo132();

    @SimpleProperty
    /* renamed from: 行  reason: contains not printable characters */
    int mo133();

    @SimpleProperty(initializer = "-1", type = SimpleProperty.o50AA3137616141C520637BE6BC610880B98D1D2FA1)
    /* renamed from: 行  reason: contains not printable characters */
    void mo134(int i);

    @SimpleFunction
    /* renamed from: 销毁  reason: contains not printable characters */
    View mo135();

    @SimpleProperty
    /* renamed from: 顶边  reason: contains not printable characters */
    int mo136();

    @SimpleProperty
    /* renamed from: 顶边  reason: contains not printable characters */
    void mo137(int i);

    @SimpleProperty
    /* renamed from: 高度  reason: contains not printable characters */
    int mo138();

    /* renamed from: 高度  reason: contains not printable characters */
    void mo139(int i);
}