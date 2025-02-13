```groovy
def myMethod(List<Integer> numbers) {
    numbers.each { number ->
        if (number % 2 == 0) {
            println "Even number: $number"
        } else {
            println "Odd number: $number"
        }
    }
}

myMethod([1, 2, 3, 4, 5])
```