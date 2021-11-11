package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 32;
    }
//Описание курицы RussianHen должно соответствовать формату
// "getDescription() родительского класса + Моя страна - Russia. Я несу N яиц в месяц.", где N - число яиц в месяц (возвращаемое методом getCountOfEggsPerMonth). Например: Я - курица. Моя страна - Russia. Я несу 5 яиц в месяц.
    @Override
    public String getDescription() {
        return (super.getDescription() +" Моя страна - " + Country.RUSSIA + ". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
