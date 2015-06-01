package com.eco_design.RKO.beans.prInd;

import com.eco_design.RKO.beans.InfoSource;
import com.eco_design.RKO.beans.PrimaryIndicator;

/**
 * Created by serdukovaa on 01.06.2015.
 */
public class DangerClassGround extends PrimaryIndicator {

    public DangerClassGround(double val, InfoSource inf){
        super("Класс опасности в почве",2);
        setValue(val, inf);
    }

    @Override
    public int returnBall(double val) {

     if (val==1.0){
         return 1;
     }else if(val==2.0){
         return 2;
     }else if(val==3.0){
         return 3;
     }else if(val==-1){ //значение -1 соответствует - "не установлен"
         return 4;
     }else{
         throw new IllegalArgumentException("Переданное значение первичного показателя не может быть использовано для нахождения балла");
     }

    }
}
