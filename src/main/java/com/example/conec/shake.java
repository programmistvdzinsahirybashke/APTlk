package com.example.conec;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class shake {
    public TranslateTransition tt;
    public shake(Node node){
        tt = new TranslateTransition(Duration.millis(30),node );
        tt.setFromX(0f);
        tt.setByX(10f);
        tt.setCycleCount(16);
        tt.setAutoReverse(true);
    }
    public void PlayAnim(){
        tt.playFromStart();
    }


}
