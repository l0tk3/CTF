package ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.File;
import java.io.IOException;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oo0oO0oo00o00O0oOo0O0ooO0oOoo00oOOoO0oO0oooOO0o00O0oOOooOooOo.ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oOOo0OOOOoooOoOO0oo00oOOO0ooOoO0o.ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.oOo0Ooooo0OooOo0ooOo00o00o00o0OOOooo0OOoo00oO0oooOoOo00Oo0O0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.oOo0Ooooo0OooOo0ooOo00o00o00o0OOOooo0OOoo00oO0oooOoOo00Oo0O0ooO0OoOOOoOoOo0Oo00oOOooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoOoo00OOoO0ooO0ooooo0o0oooOoOOOooo0oO0oOOOOoOoo0Oo0oOOo0OoOoOO0Oo0oO0o00oO0oOOO0oooOoOoOooO0oo00o00;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOooo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOo0ooOooOoOOoOOoo0Oo0OOOooOOOO0ooOo0OOooO0oo0Oo0OOoOOoo;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.relatedio;

/* compiled from: 编辑框Impl.java */
/* loaded from: classes.dex */
public class oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO extends ooOOoOoo00OOoO0ooO0ooooo0o0oooOoOOOooo0oO0oOOOOoOoo0Oo0oOOo0OoOoOO0Oo0oO0o00oO0oOOO0oooOoOoOooO0oo00o00 implements oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo, View.OnClickListener {
    private int o49960E1250676CEC1A;
    private String o62991D0C43417AE911536BDB985924;
    private int o62991D0C43417AE911536BDB985924FC;
    private float o66971013575A6FF9;
    private String o68911013;
    private Handler o6DB01F09405F70EE;
    private boolean oB00BC8CF;
    private int oB436B49A;
    private oOo0Ooooo0OooOo0ooOo00o00o00o0OOOooo0OOoo00oO0oooOoOo00Oo0O0ooO0OoOOOoOoOo0Oo00oOOooO oBC18B29AE2C4;
    private boolean oC639CFA9;
    private int oCB0FAC9A;

    public oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO(ooOooo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOo0ooOooOoOOoOOoo0Oo0OOOooOOOO0ooOo0OOooO0oo0Oo0OOoOOoo container) {
        super(container);
        this.o68911013 = "";
        this.o62991D0C43417AE911536BDB985924 = "";
        this.o62991D0C43417AE911536BDB985924FC = -1;
        this.o66971013575A6FF9 = 9.0f;
        this.oB00BC8CF = false;
        this.oB436B49A = 0;
        this.oC639CFA9 = false;
        this.o6DB01F09405F70EE = new Handler() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.3
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                if (msg.what == 123) {
                    String o749D0613 = msg.getData().getString("text");
                    oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oOo0oOoooOooOOoOoO0OoOOooo00oOOo0Oo0OOooOOooOOo0OOo0OOOOOooo0(o749D0613);
                    if (oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oB00BC8CF) {
                        oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oBC18B29AE2C4.oOo0oOoooOooOOoOoO0OoOOooo00oOOo0Oo0OOooOOooOOo0OOo0OOOOOooo0(oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oCB0FAC9A, o749D0613);
                    }
                }
            }
        };
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoO0o00ooooooOoOoooO0ooO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo
    protected View createView() {
        EditText o76911B10 = new EditText(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext());
        o76911B10.setFocusable(true);
        o76911B10.addTextChangedListener(new TextWatcher() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oB436B49A < 6) {
                    oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oB436B49A++;
                    return;
                }
                Bundle o628D10034856 = new Bundle();
                o628D10034856.putString("text", s.toString());
                Message o6D8B19 = new Message();
                o6D8B19.setData(o628D10034856);
                o6D8B19.what = 123;
                oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.o6DB01F09405F70EE.sendMessage(o6D8B19);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        o76911B10.setOnKeyListener(new View.OnKeyListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == 0) {
                    ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 o739017024857 = new ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00(false);
                    oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oOoOO0ooOoOo0OoOoooOoooOOOOOO0oo0OO0oOooo00oO0O0o(keyCode, o739017024857);
                    oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oC639CFA9 = o739017024857.get();
                    return oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oC639CFA9;
                } else if (event.getAction() == 1 && keyCode == 66) {
                    return oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.this.oC639CFA9;
                } else {
                    return false;
                }
            }
        });
        return o76911B10;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOo0oOoooOooOOoOoO0OoOOooo00oOOo0Oo0OOooOOooOOo0OOo0OOOOOooo0(String str) {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "内容被改变", str);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOO0ooOoOo0OoOoooOoooOOOOOO0oo0OO0oOooo00oO0O0o(int keycode, ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 shield) {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "按下某键", Integer.valueOf(keycode), shield);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOooO0oo0OoOOooo00o0OOOOo00o0OOo0OOoOOoOOOoO0OoOOooOOoOo0Ooo(int id) {
        View o76911B10 = getView();
        o76911B10.setId(id);
        this.oCB0FAC9A = id;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public int oOo0o0OoOOo00Oooo00o0OOOOo00o0OOo0OOoOOoOOOoO0OoOOooOOoOo0Ooo() {
        View o76911B10 = getView();
        return o76911B10.getId();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOO0oO0oOoOOo0o0OOo0OO0OOOOOOOO0oooOooo00oO0ooO(oOo0Ooooo0OooOo0ooOo00o00o00o0OOOooo0OOoo00oO0oooOoOo00Oo0O0o listener) {
        this.oBC18B29AE2C4 = (oOo0Ooooo0OooOo0ooOo00o00o00o0OOOooo0OOoo00oO0oooOoOo00Oo0O0ooO0OoOOOoOoOo0Oo00oOOooO) listener;
        this.oB00BC8CF = true;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOOo0oooo0OOoOooOo00Oooo00oOOo0Oo0OOooO0ooo0o00Oo0oOoOo0O0oOOOo0Oo0ooOooOooOOOo0O0o() {
        View o76911B10 = getView();
        o76911B10.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        oOoOooooOooo0Oo0OoOOo0ooOo00OO0Oo0oOo();
        if (this.oB00BC8CF) {
            this.oBC18B29AE2C4.oOoOooooOooo0Oo0OoOOo0ooOo00OO0Oo0oOo(this.oCB0FAC9A);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOooooOooo0Oo0OoOOo0ooOo00OO0Oo0oOo() {
        ooOooOOo0OOOOoooOoOO0oo00oOOO0oo0oo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooOOOoOoo0oo0.ooO0oOoo00oooO0oOOooooo0ooOooOOoOoo0oo0ooO0OO0oOooo0OoooOoooooOoo0oOOoo0Oo0OOOo(this, "被单击", new Object[0]);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public int oOo0OoooooOo0OoOoO0o0OOo0o00oo0o0OOOOOOoOO0ooOooo() {
        return this.o49960E1250676CEC1A;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOo0OoooooOo0OoOoO0o0OOo0o00oo0o0OOOOOOoOO0ooOooo(int method) {
        EditText o76911B10 = (EditText) getView();
        this.o49960E1250676CEC1A = method;
        switch (method) {
            case 1:
                o76911B10.setInputType(1);
                return;
            case 2:
                o76911B10.setInputType(3);
                return;
            case 3:
                o76911B10.setInputType(0);
                return;
            case 4:
                o76911B10.setInputType(131073);
                return;
            default:
                return;
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOooO0oo0OoOOo0o0Oo0Oo0oOO0oOoOOOoo0OOoooooo0OO0OoOoOOo0OOoo(boolean singleline) {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setSingleLine(!singleline);
        o76911B10.invalidate();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOooO0oo0OoOOoOoOOOoOoO0OOOOO0Oo0oOoOOoooooo0OO0OoOoOOo0OOoo() {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setImeOptions(3);
        o76911B10.setInputType(1);
        o76911B10.invalidate();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOo0OO0ooOOo0OoOoOoOOoo00OOOOOOOOoo0oOOoOOoo0oo0oOo0o0Oo00OO0() {
        EditText o76911B10 = (EditText) getView();
        InputMethodManager o699513 = (InputMethodManager) ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().getSystemService("input_method");
        o699513.showSoftInput(o76911B10, 0);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOoooOO0ooO0Oo0Oo0OoOOO0OOOOOOOOoo0oOOoOOoo0oo0oOo0o0Oo00OO0() {
        EditText o76911B10 = (EditText) getView();
        InputMethodManager o699513 = (InputMethodManager) ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().getSystemService("input_method");
        o699513.hideSoftInputFromWindow(o76911B10.getApplicationWindowToken(), 0);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOo0OO0ooOOo0OoOoOoOOoo00o00OOoOOooooOoooOoo0ooO0() {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setCursorVisible(true);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOoooOO0ooO0Oo0Oo0OoOOO0o00OOoOOooooOoooOoo0ooO0() {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setCursorVisible(false);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public int oOo0o0OoOOo00Oo0o0oo0OoOOo00oOOOOoo00OOoOoOooOo0oOooo00OO0oOo() {
        EditText o76911B10 = (EditText) getView();
        return o76911B10.getSelectionStart();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOooO0oo0OoOOo0o0oo0OoOOo00oOOOOoo00OOoOoOooOo0oOooo00OO0oOo(int location) {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setSelection(location);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOoooooOOo00Oooo0OOoOo0oOOOOooOO0o0oOoooOoooOooO(int start, int stop) {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setSelection(start, stop);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOo0o0OoOOoo0OooOO0Oo0oO0() {
        EditText o76911B10 = (EditText) getView();
        o76911B10.selectAll();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOOo0ooOOoOOoOoO0o0OOo0OOOOooOO0o0oOoooOoooOooO(String text) {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setText(o76911B10.getText().toString() + text);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOooOoooOOoOoOoO0o0OOo0OOOOooOO0o0oOoooOoooOooO(int location, String text) {
        EditText o76911B10 = (EditText) getView();
        Editable o659C1713455179F9 = o76911B10.getText();
        o659C1713455179F9.insert(location, text);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOo0o00oOooO0Oo0OOoo00OooOOOOooOO0o0oOoooOoooOooO(int start, int stop) {
        EditText o76911B10 = (EditText) getView();
        Editable o659C1713455179F9 = o76911B10.getText();
        o659C1713455179F9.delete(start, stop);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOOo0ooOOoOOooOooOoOOO0o00o0oo00OO0OOoOoOoOOo0OOo0OOOo0Oo00(String html) {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setText(Html.fromHtml(html));
        o76911B10.invalidate();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOOo0ooOOoOOooOooOoOOO0o00o0oo00OO0OOoOoOoOOo0OOo0OOOo0Oo00oooO0o(String html) {
        EditText o76911B10 = (EditText) getView();
        Html.ImageGetter o69951F00417470E80B5250 = new Html.ImageGetter() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooooOOOo0OO0oooO0oOO0oOOOoO.4
            @Override // android.text.Html.ImageGetter
            public Drawable getDrawable(String source) {
                int o699C = Integer.parseInt(source);
                Drawable o64 = ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().getResources().getDrawable(o699C);
                o64.setBounds(0, 0, o64.getIntrinsicWidth(), o64.getIntrinsicHeight());
                return o64;
            }
        };
        o76911B10.setText(Html.fromHtml(html, o69951F00417470E80B5250, null));
        o76911B10.invalidate();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOooO0oo0OoOOooo00o00oOoo00oO0OOooo0OOoo0OooOO0oOo0OOOOOoOOo(String imagePath, int i, int i2, int i3) {
        EditText o76911B10 = (EditText) getView();
        Drawable o648A1F10455179F9 = GetDrawable(imagePath);
        o648A1F10455179F9.setBounds(0, 0, i, i2);
        o76911B10.setCompoundDrawables(o648A1F10455179F9, null, null, null);
        o76911B10.setCompoundDrawablePadding(i3);
        o76911B10.invalidate();
    }

    private Drawable GetDrawable(String imagePath) {
        if (imagePath.length() <= 0) {
            return null;
        }
        if (imagePath.startsWith("/")) {
            File o66 = new File(imagePath);
            if (!o66.exists()) {
                return null;
            }
            Drawable o648A1F10455179F9 = Drawable.createFromPath(imagePath);
            return o648A1F10455179F9;
        }
        try {
            Drawable o648A1F10455179F92 = Drawable.createFromStream(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().getResources().getAssets().open(imagePath), imagePath);
            return o648A1F10455179F92;
        } catch (IOException e) {
            return null;
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOooO0oo0OoOOoOooOo0OoO0OOOOOOo0OOOoOo0oOOoOOo00OoOO0oo00oOOOO0oo0oO0oo0oo0O0oo00oOO(int color) {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setHintTextColor(color);
        o76911B10.invalidate();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public String oOo0Oo0oooo00OoOoOoOOoo00OO0oOoOO0oO0OOoOoooo0OOO() {
        return this.o68911013;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOo0Oo0oooo00OoOoOoOOoo00OO0oOoOO0oO0OOoOoooo0OOO(String newhint) {
        this.o68911013 = newhint;
        EditText o76911B10 = (EditText) getView();
        o76911B10.setHint(this.o68911013);
        o76911B10.invalidate();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public String oOoOooooOoOoOOo0O0oOOoo0oOOOo00o0OOO0OOooo0oo0O0o() {
        return this.o62991D0C43417AE911536BDB985924;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOooooOoOoOOo0O0oOOoo0oOOOo00o0OOO0OOooo0oo0O0o(String imagePath) {
        this.o62991D0C43417AE911536BDB985924 = imagePath;
        Drawable o648A1F10455179F9 = null;
        if (imagePath.length() > 0) {
            if (imagePath.startsWith("/")) {
                File o66 = new File(imagePath);
                if (o66.exists()) {
                    o648A1F10455179F9 = Drawable.createFromPath(imagePath);
                }
            } else {
                try {
                    o648A1F10455179F9 = Drawable.createFromStream(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().getResources().getAssets().open(imagePath), imagePath);
                } catch (IOException e) {
                }
            }
            View o76911B10 = getView();
            o76911B10.setBackgroundDrawable(o648A1F10455179F9);
            o76911B10.invalidate();
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public int oOoOooooOoOoOOo0O0oOOoo0oOOOo00o0OOO0OOooo0oo0O0ooOoOOo() {
        return this.o62991D0C43417AE911536BDB985924FC;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOoOooooOoOoOOo0O0oOOoo0oOOOo00o0OOO0OOooo0oo0O0ooOoOOo(int id) {
        this.o62991D0C43417AE911536BDB985924FC = id;
        View o76911B10 = getView();
        o76911B10.setBackgroundResource(id);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoOoo00OOoO0ooO0ooooo0o0oooOoOOOooo0oO0oOOOOoOoo0Oo0oOOo0OoOoOO0Oo0oO0o00oO0oOOO0oooOoOoOooO0oo00o00, ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoOoo00OOoO0ooO0ooooo0oO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo
    public float oOOoo0oooOOOOOoOooOo0OooOo00O0oOo0O0oOo0oOOoo0OOo() {
        return this.o66971013575A6FF9;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOoOoo00OOoO0ooO0ooooo0o0oooOoOOOooo0oO0oOOOOoOoo0Oo0oOOo0OoOoOO0Oo0oO0o00oO0oOOO0oooOoOoOooO0oo00o00, ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooOOoOoo00OOoO0ooO0ooooo0oO0o0ooOOOo0o0oo0OOOOOo0oooO0ooOOo00oOoo0oOOoo0Oo0OOOo
    public void oOOoo0oooOOOOOoOooOo0OooOo00O0oOo0O0oOo0oOOoo0OOo(float size) {
        EditText o76911B10 = (EditText) getView();
        if (relatedio.oOo0Ooooo0OO0Oo0o00o00oO0OO0oo0OOOo0oOOoOO0oOOoO0OooOo0o00ooo()) {
            o76911B10.setTextSize(0, relatedio.oOOoo0ooOOooOOo0oOOOOoOo0OO0oo0OOOoOOOOoo00o0oo00Oo0OoOOo0oOoOO0ooOoooo0o(size));
        } else {
            o76911B10.setTextSize(size);
        }
        this.o66971013575A6FF9 = size;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOoo0oooOOo0Oo0o0OOo0OO0OO0oO0OOooO0Oo0ooOoOoOooOoOoo0OOoooO(String name) {
        Typeface o74810E02;
        EditText o76911B10 = (EditText) getView();
        if (name.startsWith("/")) {
            o74810E02 = Typeface.createFromFile(name);
        } else {
            o74810E02 = Typeface.createFromAsset(ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().getAssets(), name);
        }
        o76911B10.setTypeface(o74810E02);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0Ooo.oOoOooooooo0OOo0ooOOo0Oooo00OoOOo0ooo
    public void oOOooO0oo0OoOOooOOOOoOo0oo00o0OOOoo0oOooOoOo0oOo0(float mult) {
        EditText o76911B10 = (EditText) getView();
        o76911B10.setLineSpacing(0.0f, mult);
    }
}