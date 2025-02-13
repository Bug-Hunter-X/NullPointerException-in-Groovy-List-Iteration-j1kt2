```groovy
def myMethod(List<Integer> numbers) {
    numbers?.each { number ->
        if (number != null) {
            if (number % 2 == 0) {
                println "Even number: $number"
            } else {
                println "Odd number: $number"
            }
        } else {
            println "Null value encountered"
        }
    }
}

myMethod([1, 2, null, 4, 5])
```