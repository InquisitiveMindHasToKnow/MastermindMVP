package org.ohmstheresistance.mastermindmvp.activities.instructions;

import android.view.View;

public class MastermindInstructionsContract {

    interface MastermindInstructionsView{

        void playNow();

        void dismissDialog();
    }

    interface MastermindInstructionPresenter{

        void handleInstructionsPlayNowClick(View view);

        void handleInstructionsGotItClick(View view);
    }
}
