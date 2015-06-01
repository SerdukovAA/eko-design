package com.eco_design.RKO.beans.prInd;

import com.eco_design.RKO.beans.InfoSource;
import com.eco_design.RKO.beans.PrimaryIndicator;

/**
 * Created by serdukovaa on 01.06.2015.
 */
public class PDKground extends PrimaryIndicator {

    public PDKground(double val, InfoSource inf){
        super("ПДКп*(ОДК**),мг/кг",1);
        setValue(val, inf);
    }




    @Override
    public int returnBall(double val) {

        if (val<1.0){
            return 1;
        }else if(val>=1.0&&val<=10.0){
            return 2;
        }else if(val>10.0&&val<=100.0){
            return 3;
        }else if(val>100.0){
            return 4;
        }else{
            throw new IllegalArgumentException("Переданное значение первичного показателя не может быть использовано для нахождения балла");
        }
    }
}
