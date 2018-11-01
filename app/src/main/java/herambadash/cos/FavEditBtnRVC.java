package herambadash.cos;

import android.widget.CheckBox;

public class FavEditBtnRVC {

    private String coinname;
    private CheckBox chk;

    public FavEditBtnRVC(String coinname, CheckBox chk) {
        this.coinname = coinname;
        this.chk = chk;
    }

    public String getCoinname() {
        return coinname;
    }

    public void setCoinname(String coinname) {
        this.coinname = coinname;
    }

    public CheckBox getChk() {
        return chk;
    }

    public void setChk(CheckBox chk) {
        this.chk = chk;
    }
}
