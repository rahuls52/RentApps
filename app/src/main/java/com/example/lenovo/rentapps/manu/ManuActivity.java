package com.example.lenovo.rentapps.manu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.rentapps.R;
import com.example.lenovo.rentapps.register.OwnerActivity;
import com.example.lenovo.rentapps.register.TenantActivity;

import androidx.appcompat.app.AppCompatActivity;

public class ManuActivity extends AppCompatActivity {


    Button tenant;
    //TextView success;
    Button owner;

    public void init(){
        owner =  findViewById(R.id.owner);

        owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(ManuActivity.this,OwnerActivity.class);
                startActivity(toy);
            }
        });
        tenant = findViewById(R.id.tenant);
        tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent roy = new Intent(ManuActivity.this,TenantActivity.class);
                startActivity(roy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu);


        init();
    }
}
