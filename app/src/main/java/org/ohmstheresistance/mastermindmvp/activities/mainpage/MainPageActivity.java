package org.ohmstheresistance.mastermindmvp.activities.mainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import org.ohmstheresistance.mastermindmvp.R;
import org.ohmstheresistance.mastermindmvp.activities.instructions.MastermindInstructions;
import org.ohmstheresistance.mastermindmvp.activities.mastermindgame.MastermindGameActivity;
import org.ohmstheresistance.mastermindmvp.databinding.MainPageActivityBinding;

public class MainPageActivity extends AppCompatActivity implements MainPageContract.MainPageView {

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
    }

    @Override
    public void showMasterMindInstructions() {

        MastermindInstructions mastermindInstructions = new MastermindInstructions();
        mastermindInstructions.show(getSupportFragmentManager(), "MastermindInstructionsDialog");

    }
}
