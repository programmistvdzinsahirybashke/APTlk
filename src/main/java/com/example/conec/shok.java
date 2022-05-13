

package com.example.conec;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class shok {
    public ScaleTransition ttt;
    public shok(Node node){
        ttt = new ScaleTransition(Duration.millis(555),node );
        ttt.setFromY(1.5);
        ttt.setFromX(1.5);
        ttt.setByY(1);
        ttt.setByX(1);
        ttt.setCycleCount(1690);
        ttt.setAutoReverse(true);
    }
    public void PlayAnima(){
        ttt.playFromStart();
    }


}
