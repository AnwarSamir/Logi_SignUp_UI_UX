package com.asitrack.loginresisterui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.FoldingCube;

public class SignUpActivity extends BaseActivity {


    Toolbar toolbar;
    EditText email, password, name;
    CheckBox checkBox;
    ImageButton signup;
    Button signin;
    FrameLayout frameLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        name = (EditText) findViewById(R.id.name);

        checkBox = (CheckBox) findViewById(R.id.checkbox);

        signup = (ImageButton) findViewById(R.id.signup);

        signin = (Button) findViewById(R.id.signin);
        frameLayout = findViewById(R.id.fram);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


    }

    public void SignUp(View view) {
        ProgressBar progressBar = findViewById(R.id.spin_kit);
        progressBar.setVisibility(View.VISIBLE);
        frameLayout.setBackground(getResources().getDrawable(R.drawable.frambackground));
        FoldingCube doubleBounce = new FoldingCube();
        progressBar.setIndeterminateDrawable(doubleBounce);

    }
}