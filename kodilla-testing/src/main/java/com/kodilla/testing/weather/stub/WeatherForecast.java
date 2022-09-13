package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    /*
    public double AverageTemperature(Map<String, Double> temperature) {
        double temporaryValue = 0;
        int counter = 0;
        double result;

        for (Map.Entry<String, Double> temperature1 : temperatures.getTemperatures().entrySet()) {
            temporaryValue += temperature1.getValue();
            counter++;
        }
        result = temporaryValue / counter;
        System.out.println("Średnia tempeatur wynosi -> "+result);
        return result;
    }
    */

    public Double calculateAverageTemperature() {

        double temporaryValue = 0;
        int counter = 0;
        double result;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temporaryValue += temperature.getValue();
            counter++;
        }
        result = temporaryValue / counter;
        return result;
    }
    /*
    public void MedianTemperature(Map<String, Double> temperatures) {

        Collection<Double> temperaturesValue = temperatures.values();
        List<Double> tempValues = new ArrayList<>(temperaturesValue);
        Collections.sort(tempValues);
        int n = tempValues.size();
        int median;
        double result;

        if (n % 2 == 1) {
            median = ((n + 1) / 2);
            System.out.println("Mediana temperatur wynosi -> "+ tempValues.get(median - 1));

        } else {
            median = ((n + 1) / 2);
            result = ((tempValues.get(median - 1) + tempValues.get(median)) / 2);
            System.out.println("Mediana temperatur wynosi -> " + result);
        }
    }
    */
    public Double calculateMedianTemperature() {
        Map<String, Double> resultMap = new HashMap<>(temperatures.getTemperatures());
        Collection<Double> temperaturesValue = resultMap.values();
        List<Double> tempValues = new ArrayList<>(temperaturesValue);
        Collections.sort(tempValues);
        int n = tempValues.size();
        int median;
        double result;

        if (n % 2 == 1) {
            median = (((n + 1) / 2))-1;
            result = tempValues.get(median);
            System.out.println("Mediana temperatur wynosi -> "+ tempValues.get(median));

        } else {
            median = ((n + 1) / 2);
            result = ((tempValues.get(median - 1) + tempValues.get(median)) / 2);
            System.out.println("Mediana temperatur wynosi --> " + result);
        }
        return result;
    }
    }

