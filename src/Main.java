public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte integerByte = 100;
        short integerShort = 10000;
        int integerInt = 1000000;
        long integerLong = -10000000L;
        float pointFloat = 3.1415926F;
        double pointDouble = 3.1415926535897932;
        System.out.println("Задание 1");
        System.out.println("Значение переменной integerByte с типом целочисленный равно " + integerByte);
        System.out.println("Значение переменной integerShort с типом целочисленный равно " + integerShort);
        System.out.println("Значение переменной integerInt с типом целочисленный равно " + integerInt);
        System.out.println("Значение переменной integerLong с типом целочисленный равно " + integerLong);
        System.out.println("Значение переменной pointFloat с типом плавающей точки равно " + pointFloat);
        System.out.println("Значение переменной pointDouble с типом плавающей точки равно " + pointDouble);
        // Задание 2
        float pointFloatOne = 27.12F;
        long integerLongOne = 987678965549L;
        float pointFloatTwo = 2.786F;
        short integerShortOne = 569;
        short integerShortTwo = -159;
        short integerShortThree = 27897;
        byte integerByteOne = 67;
        System.out.println("Задание 2");
        System.out.println(pointFloatOne + " - тип float");
        System.out.println(integerLongOne + " - тип long");
        System.out.println(pointFloatTwo + " - тип float");
        System.out.println(integerShortOne + " - тип short");
        System.out.println(integerShortTwo + " - тип short");
        System.out.println(integerShortThree + " - тип short");
        System.out.println(integerByteOne + " - тип byte");
        // Задание 3
        byte classOneStudents = 23;
        byte classTwoStudents = 27;
        byte classThreeStudents = 30;
        int allClassStudents = classOneStudents + classTwoStudents + classThreeStudents;
        short allPaper = 480;
        int onePaperStudent = allPaper / allClassStudents;
        System.out.println("Задание 3");
        System.out.println("На каждого ученика рассчитано " + onePaperStudent + " листов бумаги");
        // Задание 4
        byte bottleMachine = 16;
        byte timeMachine = 2;
        int bottleMinute = bottleMachine / timeMachine;
        short twentyMinutes = (short) (bottleMinute * 20);
        int oneDay = bottleMinute * 1440;
        int threeDay = oneDay * 3;
        int oneMonth = oneDay * 30;
        System.out.println("Задание 4");
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");
        // Задание 5
        byte allPaint = 120;
        byte oneClassroomWhite = 2;
        byte oneClassroomBrown = 4;
        byte oneClassroomAllPaint = (byte) (oneClassroomWhite + oneClassroomBrown);
        byte classroomAll = (byte) (allPaint / oneClassroomAllPaint);
        byte whitePaintAll = (byte) (classroomAll * oneClassroomWhite);
        byte brownPaintAll = (byte) (classroomAll * oneClassroomBrown);
        System.out.println("Задание 5");
        System.out.println("В школе, где " + classroomAll + " классов, нужно " + whitePaintAll + " банок белой краски и " + brownPaintAll + " банок коричневой краски");
        // Задание 6
        byte oneBananaWeight = 80;
        byte oneMilkWeight = 105;
        byte oneIceCreamWeight = 100;
        byte oneEggsWeight  = 70;
        short quantityBanana = 5;
        short quantityMilk = 200;
        short quantityIceCream = 2;
        short quantityEggs = 4;
        int oneBreakfastWeight = (oneBananaWeight * quantityBanana) + (oneMilkWeight * (quantityMilk / 100)) + (oneIceCreamWeight * quantityIceCream) + (oneEggsWeight * quantityEggs);
        float breakfastWeightKg = (float) (oneBreakfastWeight / 1000.00);
        System.out.println("Задание 6");
        System.out.println("Вес завтрака в граммах = " + oneBreakfastWeight + ", а вес в кг. = " + breakfastWeightKg);
        // Задание 7
        byte sportKg = 7;
        short sportGram = (short) (sportKg * 1000);
        short day250Gram = (short) 250;
        short day500Gram = (short) 500;
        short if250GramDay = (short) (sportGram / day250Gram);
        short if500GramDay = (short) (sportGram / day500Gram);
        short daysAverage = (short) ((if250GramDay + if500GramDay) / 2);
        System.out.println("Задание 7");
        System.out.println(if250GramDay + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(if500GramDay + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("Необхлдимо " + daysAverage + " дней в среднем, чтобы добиться результата похудения");
        // Задание 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int year = 12;
        int salaryMashaYear = (salaryMasha * year);
        int salaryDenisYear = (salaryDenis * year);
        int salaryKristinaYear = (salaryKristina * year);
        float salaryMashaYearNew = (float) (salaryMashaYear  * 1.1);
        float salaryDenisYearNew = (float) (salaryDenisYear * 1.1);
        float salaryKristinaYearNew = (float) (salaryKristinaYear * 1.1);
        float differenceMasha = (salaryMashaYearNew % salaryMashaYear);
        float differenceDenis = (salaryDenisYearNew % salaryDenisYear);
        float differenceKristina = (salaryKristinaYearNew % salaryKristinaYear);
        System.out.println("Задание 8");
        System.out.println("Маша теперь получает " + salaryMashaYearNew / year + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisYearNew / year + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaYearNew / year + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");

    }
}