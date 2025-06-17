package com.example

class MathUtil {
    // A simple utility method
    int getRandomNumber() {
        return Math.abs(new Random().nextInt() % 100)
    }
}
