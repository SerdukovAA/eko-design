package com.eco_design.RKO.beans.prInd;

import com.eco_design.RKO.beans.InfoSource;
import com.eco_design.RKO.beans.PrimaryIndicator;

/**
 * Created by serdukovaa on 01.06.2015.
 */
public class PDKwater extends PrimaryIndicator {

    public PDKwater(double val, InfoSource inf){
        super("ПДКв (ОДУ,ОБУВ), мг/л",3);
        setValue(val, inf);
     }

    @Override
    public int returnBall(double val) {

        if (val<0.01){
            return 1;
        }else if(val>=0.01&&val<=0.1){
            return 2;
        }else if(val>0.1&&val<=1.0){
            return 3;
        }else if(val>1.0){
            return 4;
        }else{
            throw new IllegalArgumentException("Переданное значение первичного показателя не может быть использовано для нахождения балла");
        }
    }
}
