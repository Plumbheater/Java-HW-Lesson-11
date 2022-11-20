public class Radio {


    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int amountOfStations = 10;
    private int currentStation = minNumberStation;
    private int nextStation = 1;
    private int prevStation = 9;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int setVolume = minVolume;
    private int plusVolume = setVolume + 1;
    private int minusVolume = setVolume - 1;

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

    public Radio() {

    }

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
        if (this.amountOfStations < 1) {
            amountOfStations = 1;
        }
        this.maxNumberStation = amountOfStations - 1;
        this.minNumberStation = amountOfStations - this.maxNumberStation - 1;

    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation >= this.maxNumberStation) {
            this.currentStation = this.maxNumberStation;
        }
        if (currentStation <= this.minNumberStation) {
            this.currentStation = this.minNumberStation;
        }
        if (currentStation >= maxNumberStation) {
            nextStation = minNumberStation;

        }
        if (currentStation <= minNumberStation) {
            prevStation = maxNumberStation;

        }
    }


    public int getAmountOfStations() {
        if (this.currentStation >= this.maxNumberStation) {
            this.nextStation = this.minNumberStation;
        } else {
            this.nextStation = this.currentStation + 1;
        }
        if (this.currentStation <= this.minNumberStation) {
            this.prevStation = this.maxNumberStation;
        } else {
            this.prevStation = this.currentStation - 1;
        }
        return amountOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getNextStation() {
        this.nextStation = this.getCurrentStation() +1;
        this.setCurrentStation(nextStation);
        return nextStation;
    }

    public int getPrevStation() {
        this.prevStation = this.getCurrentStation() -1;
        this.setCurrentStation(prevStation);
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


