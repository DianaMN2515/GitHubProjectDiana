public class FirstProject {
    public static void main(String[] args) {
        double []temperature={56,36,76,94.5,57,72.3};
        double tempHi=0;
        for (int i=0; i<temperature.length; i++){
            if(tempHi<temperature[i]){
                tempHi=temperature[i];
            }
        }
        System.out.println("The highest temperature is " + tempHi);

        double []temperatures={56,36,76,94.5,27,72.3};
        double tempLow=56;
        for (int i=0; i<temperatures.length; i++){
            if (tempLow>temperatures[i]){
                tempLow=temperatures[i];
            }
        }
        System.out.println("The lowest temperature is " + tempLow);

    }

}

