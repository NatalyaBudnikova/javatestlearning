package conditioning;

import lombok.*;

@Getter @Setter
public class Radio {
    private boolean on;
    private int station;
    private int minStation = 0;
    private int maxStation = 9;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int station, int volume, boolean on) {
        this.station = station;
        this.volume = volume;
        this.on = on;
    }

    public void setStation(int station) {
        if (station >= minStation && station <= maxStation) {
            this.station = station;
        }
    }

    public void next() {
        if (station == maxStation) {
            station = minStation;
            return;
        }
        station++;
    }

    public void previous() {
        if (station == minStation) {
            station = maxStation;
            return;
        }
        station--;
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            return;
        }
        volume++;
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            return;
        }
        volume--;
    }
}
