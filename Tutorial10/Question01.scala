object Question01 extends App {

    def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    val sumFahrenheit = fahrenheitTemperatures.reduce(_ + _)
    val averageFahrenheit = sumFahrenheit / fahrenheitTemperatures.length
    averageFahrenheit
    }

    val inputTemperatures  = List(0.0, 10.0, 20.0, 30.0)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
}