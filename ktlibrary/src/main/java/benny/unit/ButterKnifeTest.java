package benny.unit;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import codelab.com.mylibrary.R;
import codelab.com.mylibrary.R2;

/**
 * Created by WhiteTec on 2017/6/30.
 */

public class ButterKnifeTest extends Activity {

    @BindView(R2.id.etname)
    EditText etname;
    @BindView(R2.id.etpassword)
    EditText etpassword;
    @BindView(R2.id.btlogin)
    Button btlogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        ButterKnife.bind(this);
    }

}
