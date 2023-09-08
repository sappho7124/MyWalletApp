package com.ManuelPedraa.mywalleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
    }
    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia","Cuenta Corriente",10213321.38);
        Account myAccount2 = new Account("Daviviendo","Cuenta Ahorros",21871278.24);
        Account myAccount3 = new Account("Bogota","Tarjeta Credito",72168213.92);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}