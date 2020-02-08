package org.ohmstheresistance.mastermindmvp.activities.mainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import org.ohmstheresistance.mastermindmvp.R;
import org.ohmstheresistance.mastermindmvp.activities.mastermindgame.MastermindGameActivity;
import org.ohmstheresistance.mastermindmvp.databinding.MainPageActivityBinding;

public class MainPageActivity extends AppCompatActivity implements MainPageContract.MastermindView {

    private MainPagePresenter mainPagePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainPageActivityBinding mainPageActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_page_activity);
        mainPagePresenter = new MainPagePresenter(this);
        mainPageActivityBinding.setPresenter(mainPagePresenter);
    }

    @Override
    public void showMastermindGame() {

        Intent navigationIntent = new Intent(MainPageActivity.this, MastermindGameActivity.class);
        startActivity(navigationIntent);
        overridePendingTransition(0, 0);

       // Toast.makeText(this, "Entered Mastermind Game!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showMasterMindInstructions() {

        Toast.makeText(this, "Displaying Mastermind Game Instructions!", Toast.LENGTH_LONG).show();

    }
}
