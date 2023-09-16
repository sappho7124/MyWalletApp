package com.ManuelPedraa.mywalleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView rvListAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
        rvListAccount = findViewById(R.id.rv_account);
        AccountAdapter myAdaptader = new AccountAdapter(listAccountRV);
        rvListAccount.setAdapter(myAdaptader);
        rvListAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }
    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia","Cuenta Corriente",10213321.38,"https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
        Account myAccount2 = new Account("Daviviendo","Cuenta Ahorros",21871278.24,"https://pbs.twimg.com/profile_images/1002552048620134400/qZ1XCo_9_400x400.jpg");
        Account myAccount3 = new Account("Bogota","Tarjeta Credito",72168213.92,"https://seeklogo.com/images/B/Banco_de_Bogota-logo-609A0072EA-seeklogo.com.png");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}