/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String CYCLE_MEASUREMENT = "00002a5b-0000-1000-8000-00805f9b34fb";
    public static String FOOTPOD_MEASUREMENT = "00002a53-0000-1000-8000-00805f9b34fb";
    public static String FITNESS_MEASUREMENT = "0000ff02-0000-1000-8000-00805f9b34fb";
    public static String SPORT_WATCH_MEASUREMENT = "0000ff07-0000-1000-8000-00805f9b34fb";
    public static String SPORT_WATCH_WRITE = "0000ff09-0000-1000-8000-00805f9b34fb";
    public static String CYCLING_COMPUTER_MEASUREMENT = "0000ff0c-0000-1000-8000-00805f9b34fb";
    public static String BATTERY_MEASUREMENT = "00002a19-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("00001816-0000-1000-8000-00805f9b34fb", "Cycling Service");
        attributes.put("00001814-0000-1000-8000-00805f9b34fb", "Foot pod Service");
        attributes.put("0000ff01-0000-1000-8000-00805f9b34fb", "Fitness Service");
        attributes.put("0000ff06-0000-1000-8000-00805f9b34fb", "Sport Watch Service");
        attributes.put("0000ff0b-0000-1000-8000-00805f9b34fb", "Cycling Computer Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Device Battery");
        attributes.put(CYCLE_MEASUREMENT, "Cycling Measurement");
        attributes.put(FOOTPOD_MEASUREMENT, "FootPod Measurement");
        attributes.put(FITNESS_MEASUREMENT, "Fitness Measurement");
        attributes.put(SPORT_WATCH_MEASUREMENT, "Sport Watch Measurement");
        attributes.put(SPORT_WATCH_WRITE, "Sport Watch Write");
        attributes.put(CYCLING_COMPUTER_MEASUREMENT, "Cycling Computer Measurement");
        attributes.put(BATTERY_MEASUREMENT, "Battery Measurement");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
