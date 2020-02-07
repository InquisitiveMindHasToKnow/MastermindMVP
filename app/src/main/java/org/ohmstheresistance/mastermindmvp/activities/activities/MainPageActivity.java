package org.ohmstheresistance.mastermindmvp.activities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.ohmstheresistance.mastermindmvp.R;
import org.ohmstheresistance.mastermindmvp.activities.contract.MainContract;

public class MainPageActivity extends AppCompatActivity implements MainContract.MastermindView {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page_activity);

        mainPresenter = new MainPresenter(this);
    }
}
