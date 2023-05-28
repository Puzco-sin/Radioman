public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void next() {
        int target = currentStation + 1;
        if (target > 9) {
            target = 0;
        }
        setCurrentStation(target);
    }

    public void previous() {
        int target = currentStation - 1;
        if (target < 0) {
            target = 9;
        }
        setCurrentStation(target);
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
    }
    public void degreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
