package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub() {
        // Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        // When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        // Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testAverageTemperatureWithStub() {
        // Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        // When
        double averageTemperature = weatherForecast.calculateAverageTemperature();
        // Then
        Assertions.assertEquals(25.56, averageTemperature);
    }
    @Test
    void testMedianTemperatureWithStub() {
        // Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        // When
        double medianTemperature = weatherForecast.calculateMedianTemperature();
        // Then
        Assertions.assertEquals(25.5, medianTemperature);
    }
}
