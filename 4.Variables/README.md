Certainly! Here's an enhanced version of the `README.md` with improved formatting and styling:

````markdown
# Java Variable Exercise

## Description

This exercise covers various aspects of Java variables including primitives, strings, dates, lists, and maps. Each section includes a description of the task along with a corresponding Java program to demonstrate the functionality.

## Primitives

### Description

In this section, we declare variables for each primitive data type in Java and print out their values. Additionally, we check the minimum and maximum values for the `long` type.

### Code

```java
public class Main {
    public static void main(String[] args) {
        // Primitives
        int myInt = 10;
        long myLong = 100L;
        double myDouble = 5.5;
        float myFloat = 2.3f;
        boolean myBoolean = true;
        byte myByte = 127;
        short myShort = 32000;
        char myChar = 'A';

        System.out.println("Integer: " + myInt);
        System.out.println("Long min: " + Long.MIN_VALUE);
        System.out.println("Long max: " + Long.MAX_VALUE);
        System.out.println("Double: " + myDouble);
        System.out.println("Float: " + myFloat);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Char: " + myChar);
    }
}
```
````

## Strings

### Description

Here, we create a sample sentence as a `String`, manipulate it by replacing a word, splitting it into an array of words, and then print out various properties such as length and specific word.

### Code

```java
public class Main {
    public static void main(String[] args) {
        // Strings
        String sentence = "This is a sample sentence.";
        System.out.println("Sentence length: " + sentence.length());
        sentence = sentence.replace("sample", "different");
        System.out.println("Modified sentence: " + sentence);
        String[] words = sentence.split(" ");
        System.out.println("Array of words: ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Fourth word: " + words[3]);
    }
}
```

## Dates

### Description

We utilize the `LocalDate` class from Java's date and time API to get the current date and print it out. Additionally, we extract the month from the date.

### Code

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Dates
        LocalDate now = LocalDate.now();
        System.out.println("Current date: " + now);
        System.out.println("Month: " + now.getMonth());
    }
}
```

## Lists

### Description

An `ArrayList` of `Integer` type is created, filled with random numbers, sorted using the `Collections` utility class, and then printed out to display the sorted order.

### Code

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lists
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);
    }
}
```

## Maps

### Description

A `HashMap` is used to simulate an address book where names are keys and addresses are values. We print out the address book, its size, and retrieve an address for a specific name.

### Code

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Maps
        Map<String, String> addressBook = new HashMap<>();
        addressBook.put("Alice", "123 Main St");
        addressBook.put("Bob", "456 Elm St");
        addressBook.put("Charlie", "789 Oak St");
        System.out.println("Address book: " + addressBook);
        System.out.println("Size of address book: " + addressBook.size());
        String address = addressBook.get("Bob");
        System.out.println("Bob's address: " + address);
    }
}
```

## How to Run

To run each Java program, you can compile them using `javac` and then execute the generated bytecode using `java`. For example:

```bash
javac Main.java
java Main
```

```

```
