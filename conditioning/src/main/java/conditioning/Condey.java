package conditioning;

public class Condey {
    private boolean on;
    private String name;
    private int currentTemp = 22;
    private int minTemp = 10;
    private int maxTemp = 25;

    public Condey() { }

    public Condey(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void decreaseTemp() {
        if (currentTemp == minTemp) {
            return;
        }
       currentTemp = currentTemp - 1;
    }

    public void increaseTemp() {
        if (currentTemp == maxTemp) {
            return;
        }
        currentTemp = currentTemp + 1;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

}
