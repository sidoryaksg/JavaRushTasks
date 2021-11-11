package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() +" Моя страна - " + Country.UKRAINE + ". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.");
    }

    //Описание курицы UkrainianHen должно соответствовать формату "getDescription() родительского класса + Моя страна - Ukraine. Я несу N яиц в месяц.", где N - число яиц в месяц (возвращаемое методом getCountOfEggsPerMonth). Например: Я - курица. Моя страна - Ukraine. Я несу 5 яиц в месяц.
}
