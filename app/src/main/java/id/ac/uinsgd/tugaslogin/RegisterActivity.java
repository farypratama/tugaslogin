package id.ac.uinsgd.tugaslogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText txtnama,txtusername,txtemail,txtpassword;
    String nama,username,email,password;
    Button btn_register,btn_batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtnama=(EditText)findViewById(R.id.txt_nama);
        txtusername=(EditText)findViewById(R.id.txt_username);
        txtemail=(EditText)findViewById(R.id.txt_email);
        txtpassword=(EditText)findViewById(R.id.txt_password);
        btn_register=(Button)findViewById(R.id.btn_register);
        btn_batal=(Button)findViewById(R.id.btn_batal);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nama=txtnama.getText().toString();
                username=txtusername.getText().toString();
                email=txtemail.getText().toString();
                password=txtpassword.getText().toString();
                if((username.equals(""))||(password.equals(""))||(email.equals(""))||(nama.equals("")))
                {
                    Toast.makeText(RegisterActivity.this, "Tidak boleh ada yang kosong", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(RegisterActivity.this,
                            "Nama = "+nama+
                                    "\nEmail = "+email+
                                    "\nUsername = "+username+
                                    "\nPassword = "+password
                            , Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                }


            }
        });

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });
    }
}
