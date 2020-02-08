package org.ohmstheresistance.mastermindmvp.activities.instructions;

public class MastermindInstructionsContract {

    interface MastermindInstructionsView{

        void playNow();

        void dismissDialog();
    }

    interface MastermindInstructionPresenter{

        void handleInstructionsPlayNowClick();

        void handleInstructionsGotItClick();
    }
}
