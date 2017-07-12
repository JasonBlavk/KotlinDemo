package codelab.com.kotlindemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import codelab.com.kotlindemo.R;

/**
 * Created by WhiteTec on 2017/6/30.
 */

public class ButterActivity extends Activity {

    @BindView(R.id.etname)
    EditText etname;
    @BindView(R.id.etpassword)
    EditText etpassword;
    @BindView(R.id.btlogin)
    Button btlogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        ButterKnife.bind(this);
    }
}
