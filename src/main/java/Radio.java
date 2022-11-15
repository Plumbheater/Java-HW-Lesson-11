public class Radio {
    private int amountStation = 10;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int numberStation = minNumberStation;
    private int nextStation = numberStation + 1;
    private int prevStation = numberStation - 1;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int setVolume = minVolume;
    private int plusVolume = setVolume + 1;
    private int minusVolume = setVolume - 1;

    public Radio(int amountStation, int minNumberStation, int maxNumberStation, int nextStation, int prevStation) {
        this.amountStation = amountStation;
        this.minNumberStation = minNumberStation;
        this.maxNumberStation = maxNumberStation;
        if (maxNumberStation >= amountStation) {
            this.maxNumberStation = this.amountStation - 1;
        }
        this.numberStation = minNumberStation;
        if (nextStation >= this.maxNumberStation) {
            this.nextStation = 0;
        } else {
            this.nextStation = nextStation + 1;
        }
        if (prevStation <= minNumberStation) {
            this.prevStation = this.maxNumberStation;
        } else {
            this.prevStation = prevStation - 1;
        }
    }
    public Radio(int nextStation, int prevStation) {

        if (nextStation >= this.maxNumberStation) {
            this.nextStation = 0;
        } else {
            this.nextStation = nextStation + 1;
        }
        if (prevStation <= this.minNumberStation) {
            this.prevStation = this.maxNumberStation;
        } else {
            this.prevStation = prevStation - 1;
        }
    }


    public Radio(int maxVolume, int minVolume, int plusVolume, int minusVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.setVolume = minVolume;
        if (plusVolume >= this.maxVolume) {
            this.plusVolume = this.maxVolume;
        } else {
            this.plusVolume = plusVolume + 1;
        }
        if (minusVolume <= this.minVolume) {
            this.minusVolume = this.minVolume;
        } else {
            this.minusVolume = minusVolume - 1;
        }

    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getNextStation() {
        return nextStation;
    }

    public int getPrevStation() {
        return prevStation;
    }

//================================================================================================================

    public int getSetVolume() {
        return setVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getPlusVolume() {
        return plusVolume;
    }

    public int getMinusVolume() {
        return minusVolume;
    }


}


