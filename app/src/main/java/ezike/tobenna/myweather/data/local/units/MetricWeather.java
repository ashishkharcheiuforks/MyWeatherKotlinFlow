package ezike.tobenna.myweather.data.local.units;

import androidx.room.ColumnInfo;

public class MetricWeather implements UnitSpecificWeather {

    @ColumnInfo(name = "tempC")
    private double temperature;
    @ColumnInfo(name = "condition_text")
    private String conditionText;
    @ColumnInfo(name = "condition_icon")
    private String conditionIconUrl;
    @ColumnInfo(name = "windKph")
    private double windSpeed;
    @ColumnInfo(name = "precipMm")
    private double precipitationVolume;
    @ColumnInfo(name = "feelslikeC")
    private double feelsLikeTemperature;
    @ColumnInfo(name = "visKm")
    private double visibilityDistance;

    public MetricWeather(double temperature, String conditionText, String conditionIconUrl, double windSpeed,
                         double precipitationVolume, double feelsLikeTemperature, double visibilityDistance) {
        this.temperature = temperature;
        this.conditionText = conditionText;
        this.conditionIconUrl = conditionIconUrl;
        this.windSpeed = windSpeed;
        this.precipitationVolume = precipitationVolume;
        this.feelsLikeTemperature = feelsLikeTemperature;
        this.visibilityDistance = visibilityDistance;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    @Override
    public String getConditionIconUrl() {
        return conditionIconUrl;
    }

    public void setConditionIconUrl(String conditionIconUrl) {
        this.conditionIconUrl = conditionIconUrl;
    }

    @Override
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public double getPrecipitationVolume() {
        return precipitationVolume;
    }

    public void setPrecipitationVolume(double precipitationVolume) {
        this.precipitationVolume = precipitationVolume;
    }

    @Override
    public double getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public void setFeelsLikeTemperature(double feelsLikeTemperature) {
        this.feelsLikeTemperature = feelsLikeTemperature;
    }

    @Override
    public double getVisibilityDistance() {
        return visibilityDistance;
    }

    public void setVisibilityDistance(double visibilityDistance) {
        this.visibilityDistance = visibilityDistance;
    }
}