package Lesson5.online;

import Lesson5.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.03.2021
 */

public class Lesson05 {

    public static void main(String[] args) {

//        Hero hero = new Hero();
        Paladin paladin = new Paladin("Paladin", 300, 10, 5, 30);
        Archer archer = new Archer("Archer", 100, 20, 10, 5);
        Mage mage = new Mage("Mage", 50, 100, 50, 1);
        Titan titan = new Titan("Titan", 1000, 250, 500, 300, 10000);
        Paladin paladinNext = new Paladin("PaladinNext",300, 10, 5, 30, 650);

//        hero.speak();
//        paladinNext.damage();
//        paladinNext.speak();
//        paladinNext.healSelf();
//        System.out.println("Health out hero " + paladinNext.getName() + " is " + paladinNext.getHealth());
//
//        paladinNext.stableBlock(400);
//        System.out.println("Health out hero " + paladinNext.getName() + " is " + paladinNext.getHealth());

//        Hero[] army = {paladin, archer, mage, titan, paladinNext};
//        for (int i = 0; i < army.length; i++) {
//            army[i].damage();
////            army[i].speak();
////            army[i].healSelf();
////            army[i].jump(); //
//
//            if (army[i] instanceof Titan) {
////                Paladin tmpPaladin = (Paladin) army[i];
////                tmpPaladin.stableBlock(100);
//                ((Titan)army[i]).stableBlock(100); //T / P
//            }
//        }
//        paladin.damage();
//        archer.damage();
//        mage.damage();
//        titan.damage();
//        paladinNext.damage();
//        titan.speak();
//        mage.speak();

//        titan.stableBlock(100);
//        System.out.println("Health out hero " + titan.getName() + " is " + titan.getHealth());
        int abc = 5;
        String tmp = "Hello";
        Hero hero = mage;

        Object[] array = new Object[3];
        array[0] = abc;
        array[1] = tmp;
        array[2] = hero;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer) {
                System.out.println(((Integer) array[i]).floatValue());
            }
        }
    }
}

/**
 1. ?????????????? ???????????? ????????????, ????????????, ?????????? ?? ?????? ?? ?????????????????????????? ???? ???????????? ????????????????.

 2. ???????????????? ?????????? ?????????????????? ????????????????: ????????????, ??????????, ?????????????????????????? ??????????????????????.
 ?? ???????????????? ?????????????????? ?????????????? ???????????? ???????????????????? ????????????????, ???????????????????? ?????? ??????????
 ?????????????????????? (?????? ???????? ?? ????????????????), ?????? ???????????? (?????? ??????????????).

 3. ?? ?????????????? ?????????????????? ???????? ?????????????????????? ???? ????????????????
 (??????: ?????? 200 ??., ???????????? 500 ??., ???????????? 1500 ??., ?????????? 5 ??.,;
 ????????????: ?????? 2 ??., ???????????? 0.5 ??., ???????????? 3 ??., ?????????? 0.2 ??. ;
 ????????????????: ?????? ?? ?????????? ???? ?????????? ??????????????, ???????????? 10 ??., ???????????? 100 ??.).

 4. ?????? ?????????????? ?????????????????? ?????????????????? ???????? ???? ???????? ????????????????,
 ?????? ???????????? ???????????????? ??????????????????.
 (????????????????, dog1.run(150); -> ??????????????????: '?????????? ????????????????!')

 5. * ???????????????? ???????????????? ?????????????? ?? ????????????????????????.
 ???? ???????? ?? ?????????? ???????????? ?????????????????????? ???? ?????? ?????????? ???????? 400 ??., ?? ???????????? 600 ??.

 **/
